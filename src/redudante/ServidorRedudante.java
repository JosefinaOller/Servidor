package redudante;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import interfaces.I_Registro;
import monitoreo.ErroresServerRedudante;
import monitoreo.MonitoreoServerRedudante;
import original.Servidor;

public class ServidorRedudante implements I_Registro {
	
private ArrayList <String> listaUsuarios=null;
private int activo=0;
	
	public ServidorRedudante() {
		super();
		this.listaUsuarios = new ArrayList<String>();
	}

	public void recibirEmpleado0() {
		 new Thread() {
	            public void run() {
	                try {
	                    ServerSocket serverEmpleado = new ServerSocket(1430); //serverSocket de empleado con el box 0
	                    while (true) {

	                        Socket socketEmpleado= serverEmpleado.accept();
	                                                             
	                        PrintWriter outEmpleado = new PrintWriter(socketEmpleado.getOutputStream(), true);	                      
	                        BufferedReader inEmpleado = new BufferedReader(new InputStreamReader(socketEmpleado.getInputStream()));
	                        String empleado=null; 
	                            
	                        empleado=inEmpleado.readLine();
	                        int box=Integer.parseInt(empleado);
	                        if(listaUsuarios.size()==0) { //no hay clientes esperando
	            	        	outEmpleado.println(0);
	            	        	
	            	        }
	            	        else {
	            	        	outEmpleado.println(primerUsuario());
	            	        	
	            	        	enviarTelevisor(box,primerUsuario()); //le mando el box
	            	        	eliminarUsuario();
	            	        }                        	
	                       
	                        
	                    }
                                                                                                                                                                                            

	                } catch (Exception e) {
	                	//JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                    //System.out.println("1.SERVIDOR");
	                    e.printStackTrace();
	                    
	                }
	        
	            }

				
	        }.start();
	}
	
	public void recibirEmpleado1()  {
		 new Thread() {
	            public void run() {
	                try {
	                	
	                    ServerSocket serverEmpleado = new ServerSocket(1431); //serverSocket de empleado con el box 1
	                   
	                    while (true) {

	                        Socket socketEmpleado= serverEmpleado.accept();
	                  
	                        
	                        
	                        PrintWriter outEmpleado = new PrintWriter(socketEmpleado.getOutputStream(), true);	                      
	                        BufferedReader inEmpleado = new BufferedReader(new InputStreamReader(socketEmpleado.getInputStream()));
	                        
	                        
	                        
	                        String empleado=null; 
	                            
	                        empleado=inEmpleado.readLine();
	                        int box=Integer.parseInt(empleado);
	                        
	                      
	                        
	                        if(listaUsuarios.size()==0) { //no hay clientes esperando
	            	        	outEmpleado.println(0);
	            	        	
	            	        }
	            	        else {
	            	        	outEmpleado.println(primerUsuario());
	            	        	
	            	        	enviarTelevisor(box,primerUsuario()); //le mando el box
	            	        	eliminarUsuario();
	            	        }                        	
	                       
	                        
	                    }
                                                                                                                                                                                           

	                } catch (Exception e) {
	                	//JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                    //System.out.println("1.SERVIDOR");
	                    e.printStackTrace();
	                    
	                }
	        
	            }

				
	        }.start();
	}
	
	public void recibirEmpleado2() {
		 new Thread() {
	            public void run() {
	                try {
	                	
	                    ServerSocket serverEmpleado = new ServerSocket(1432); //serverSocket de empleado con el box 2
	                   
	                    while (true) {

	                        Socket socketEmpleado= serverEmpleado.accept();
	                  
	                        
	                        
	                        PrintWriter outEmpleado = new PrintWriter(socketEmpleado.getOutputStream(), true);	                      
	                        BufferedReader inEmpleado = new BufferedReader(new InputStreamReader(socketEmpleado.getInputStream()));
	                        
	                        
	                        
	                        String empleado=null; 
	                            
	                        empleado=inEmpleado.readLine();
	                        int box=Integer.parseInt(empleado);
	                        
	                      
	                        
	                        if(listaUsuarios.size()==0) { //no hay clientes esperando
	            	        	outEmpleado.println(0);
	            	        	
	            	        }
	            	        else {
	            	        	outEmpleado.println(primerUsuario());
	            	        	
	            	        	enviarTelevisor(box,primerUsuario()); //le mando el box
	            	        	eliminarUsuario();
	            	        }                        	
	                       
	                        
	                    }
                                                                                                                                                                                           

	                } catch (Exception e) {
	                	//JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                    //System.out.println("1.SERVIDOR");
	                    e.printStackTrace();
	                    
	                }
	        
	            }

				
	        }.start();
	}
	
	public void recibirEmpleado3()  {
		 new Thread() {
	            public void run() {
	                try {
	                	
	                    ServerSocket serverEmpleado = new ServerSocket(1433); //serverSocket de empleado con el box 3
	                   
	                    while (true) {

	                        Socket socketEmpleado= serverEmpleado.accept();
	                  
	                        
	                        
	                        PrintWriter outEmpleado = new PrintWriter(socketEmpleado.getOutputStream(), true);	                      
	                        BufferedReader inEmpleado = new BufferedReader(new InputStreamReader(socketEmpleado.getInputStream()));
	                        
	                        
	                        
	                        String empleado=null; 
	                            
	                        empleado=inEmpleado.readLine();
	                        int box=Integer.parseInt(empleado);
	                        
	                      
	                        
	                        if(listaUsuarios.size()==0) { //no hay clientes esperando
	            	        	outEmpleado.println(0);
	            	        	
	            	        }
	            	        else {
	            	        	outEmpleado.println(primerUsuario());
	            	        	
	            	        	enviarTelevisor(box,primerUsuario()); //le mando el box
	            	        	eliminarUsuario();
	            	        }                        	
	                       
	                        
	                    }
                                                                                                                                                                                           

	                } catch (Exception e) {
	                	//JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                    //System.out.println("1.SERVIDOR");
	                    e.printStackTrace();
	                    
	                }
	        
	            }

				
	        }.start();
	}
	
	public void recibirEmpleado4()  {
		 new Thread() {
	            public void run() {
	                try {
	                	
	                    ServerSocket serverEmpleado = new ServerSocket(1434); //serverSocket de empleado con el box 4
	                   
	                    while (true) {

	                        Socket socketEmpleado= serverEmpleado.accept();
	                  
	                        
	                        
	                        PrintWriter outEmpleado = new PrintWriter(socketEmpleado.getOutputStream(), true);	                      
	                        BufferedReader inEmpleado = new BufferedReader(new InputStreamReader(socketEmpleado.getInputStream()));
	                        
	                        
	                        
	                        String empleado=null; 
	                            
	                        empleado=inEmpleado.readLine();
	                        int box=Integer.parseInt(empleado);
	                        if(listaUsuarios.size()==0) { //no hay clientes esperando
	            	        	outEmpleado.println(0);
	            	        	
	            	        }
	            	        else {
	            	        	outEmpleado.println(primerUsuario());
	            	        	enviarTelevisor(box,primerUsuario()); //le mando el box
	            	        	eliminarUsuario();
	            	        
	            	        }                        	
	                       
	                        
	                    }
                                                                                                                                                                                           

	                } catch (Exception e) {
	                	//JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                    //System.out.println("1.SERVIDOR");
	                    e.printStackTrace();
	                    
	                }
	        
	            }

				
	        }.start();
	}
	
	
	public void enviarTelevisor(int box, String documento)  {
		 try {
        	
			Socket socketTelevisor = new Socket(InetAddress.getLocalHost().getHostAddress(),1435);
            
			PrintWriter outTelevisor = new PrintWriter(socketTelevisor.getOutputStream(), true);         

       	outTelevisor.println(box + documento); //le mando el box y dni
       	
	        socketTelevisor.close();
	        outTelevisor.close();

        } catch (Exception e) {
        	//JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1. Televisor - Servidor", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
           // System.out.println("1.SERVIDOR");
            e.printStackTrace();
            
        }
	}
	
	
	public void recibirTotem0()  {
		 new Thread() {
	            public void run() {
	                try {
	                	
	                    ServerSocket serverTotem= new ServerSocket(1440); //serverSocket de totem

	                    while (true) {

	                        Socket socketTotem = serverTotem.accept();
	                        System.out.println("Escuchando a Totem..");
	                        BufferedReader inTotem = new BufferedReader(new InputStreamReader(socketTotem.getInputStream()));	                        
	                        String msg = inTotem.readLine();
	                        String documento=msg;
	                        agregarUsuario(documento);
	                    }
                      
	                } catch (Exception e) {
	                	JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                    //System.out.println("1.SERVIDOR");
	                    //e.printStackTrace();
	                    
	                }
	        
	            }
				
	        }.start();
	}
	
	public void recibirTotem1()  {
		 new Thread() {
	            public void run() {
	                try {
	                	
	                    ServerSocket serverTotem= new ServerSocket(1441); //serverSocket de totem

	                    while (true) {

	                        Socket socketTotem = serverTotem.accept();
	                        BufferedReader inTotem = new BufferedReader(new InputStreamReader(socketTotem.getInputStream()));	                        
	                        String msg = inTotem.readLine();
	                        String documento=msg;
	                        agregarUsuario(documento);
	                    }
                     
	                } catch (Exception e) {
	                	//JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                   // System.out.println("1.SERVIDOR");
	                    e.printStackTrace();
	                    
	                }
	        
	            }

				
	        }.start();
	}
	
	public void recibirTotem2() {
		 new Thread() {
	            public void run() {
	                try {
	                	
	                    ServerSocket serverTotem= new ServerSocket(1442); //serverSocket de totem

	                    while (true) {

	                        Socket socketTotem = serverTotem.accept();
	                        BufferedReader inTotem = new BufferedReader(new InputStreamReader(socketTotem.getInputStream()));	                        
	                        String msg = inTotem.readLine();
	                        String documento=msg;
	                        agregarUsuario(documento);
	                    }
                     
	                } catch (Exception e) {
	                	//JOptionPane.showMessageDialog(null,"ERROR COMUNICACION 1.SERVIDOR", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
	                    //System.out.println("1.SERVIDOR");
	                    e.printStackTrace();
	                    
	                }
	            }	
	        }.start();
	}
	public void agregarUsuario(String documento) {
		this.listaUsuarios.add(documento);
		
	}

	public ArrayList<String> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(ArrayList<String> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	@Override
	public void eliminarUsuario() {
		this.listaUsuarios.remove(0);
		
	}

	@Override
	public String primerUsuario() {
		return this.listaUsuarios.get(0);
	}

	public void activar() {
			if(activo==0) {
				recibirEmpleado0();
				recibirEmpleado1();
				recibirEmpleado2();
				recibirEmpleado3();
				recibirEmpleado4();
				recibirTotem0();
				recibirTotem1();
				recibirTotem2();
				activo=1;
			}
			
		
	}
	
	public static void main(String[] args) {
		ServidorRedudante s= new ServidorRedudante();
		MonitoreoServerRedudante m= new MonitoreoServerRedudante();
		ErroresServerRedudante e= new ErroresServerRedudante();
		s.activar();
	}
	
}
