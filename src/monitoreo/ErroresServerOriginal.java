package monitoreo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;



public class ErroresServerOriginal {
	
	public ErroresServerOriginal() {
		recibirError();
	}
	
	public void recibirError() {
		new Thread() {
            public void run() {
                try {
                    ServerSocket server = new ServerSocket(2040); //serverSocket de ServidorOriginal desde el monitor
                    while (true) {

                        Socket socket= server.accept();
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String aviso=null; 
                        aviso=in.readLine();
                        if(aviso.equals("fallaServidorR"))
    	                	JOptionPane.showMessageDialog(null,"No funciona el servidor redudante", "Error de conexion", JOptionPane.WARNING_MESSAGE);

                    }
                                                                                                                                                                                         

                } catch (Exception e) {
                	e.printStackTrace();
                    
                }
        
            }
	
        }.start();
	}

}
