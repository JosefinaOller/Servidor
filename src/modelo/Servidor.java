package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Servidor implements Runnable {
	
	private ArrayList <String> listaUsuarios=null;
	
	public Servidor() {
		super();
		this.listaUsuarios = new ArrayList<String>();
		
	}
	
	private void recibirEmpleado() {
		 new Thread() {
	            public void run() {
	                try {
	                	
	                    ServerSocket serverEmpleado = new ServerSocket(1230); //serverSocket de empleado
	                    while (true) {

	                        Socket socketEmpleado = serverEmpleado.accept();
	                        
	                        PrintWriter outEmpleado = new PrintWriter(socketEmpleado.getOutputStream(), true);	                      
	                        BufferedReader inEmpleado = new BufferedReader(new InputStreamReader(socketEmpleado.getInputStream()));

	                        String empleado=null;
	                            
	                        empleado=inEmpleado.readLine();
	                        int box=Integer.parseInt(empleado);
	                        
	                        if(listaUsuarios.size()==0) { //no hay clientes esperando
	            	        	outEmpleado.println(0);
	            	        }
	            	        else {
	            	        	outEmpleado.println(listaUsuarios.get(0));
	            	        	enviarTelevisor(box,listaUsuarios.get(0)); //le mando el box
	            	        	listaUsuarios.remove(0);
	            	        }                        	
	                       
	                        
	                    }
                                                                                                                                                                                             

	                } catch (Exception e) {
	                	JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                    System.out.println("1.SERVIDOR");
	                    e.printStackTrace();
	                    
	                }
	        
	            }

				
	        }.start();
	}
	
	
	public void enviarTelevisor(int box, String documento) {
		 try {
         	
			Socket socketTelevisor = new Socket(InetAddress.getLocalHost().getHostAddress(),1235);
             
 			PrintWriter outTelevisor = new PrintWriter(socketTelevisor.getOutputStream(), true);         

        	outTelevisor.println(box + documento); //le mando el box y dni
        	
 	        socketTelevisor.close();
 	        outTelevisor.close();

         } catch (Exception e) {
         	JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1. Televisor - Servidor", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
             System.out.println("1.SERVIDOR");
             e.printStackTrace();
             
         }
	}
	
	
	private void recibirTotem() {
		 new Thread() {
	            public void run() {
	                try {
	                	
	                    ServerSocket serverTotem= new ServerSocket(1236); //serverSocket de totem

	                    while (true) {

	                        Socket socketTotem = serverTotem.accept();
	                        BufferedReader inTotem = new BufferedReader(new InputStreamReader(socketTotem.getInputStream()));	                        
	                        String msg = inTotem.readLine();
	                        String documento=msg;
	                        agregarUsuario(documento);
	                        System.out.println("Documento agregado: "+ documento);
	                        
	                    }
                       


	                } catch (Exception e) {
	                	JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                    System.out.println("1.SERVIDOR");
	                    e.printStackTrace();
	                    
	                }
	        
	            }

				
	        }.start();
	}
	
	protected void agregarUsuario(String documento) {
		this.listaUsuarios.add(documento);
		
	}



	public ArrayList<String> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<String> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	public static void main(String[] args) {
		Servidor s= new Servidor();
		s.recibirEmpleado();
		s.recibirTotem();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
