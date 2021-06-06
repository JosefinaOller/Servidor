package monitoreo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

import redudante.ServidorRedudante;

public class ErroresServerRedudante {
	
	private ServidorRedudante servidorRedudante;
	public ErroresServerRedudante() {
		recibirError();
	}
	public void recibirError() {
		new Thread() {
            public void run() {
                try {
                    ServerSocket server = new ServerSocket(5000); //serverSocket de ServidorRedudante desde el monitor
                    while (true) {

                        Socket socket= server.accept();
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String aviso=null; 
                        aviso=in.readLine();
                        if(aviso.equals("activar")) {
                        	System.out.println("Activando el servidor redundante...");
                        	activar();
                        }

                    }
                                                                                                                                                                                         

                } catch (Exception e) {
                	e.printStackTrace();
                    
                }
        
            }
	
        }.start();
	}

	protected void activar() {
		servidorRedudante.activar();
		
	}

}
