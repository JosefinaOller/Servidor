package monitoreo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import original.Servidor;

public class MonitoreoServerOriginal { //para responder al Monitor (ping/echo)
	
	public MonitoreoServerOriginal() {
		echoServerOriginal();
	}
	public void echoServerOriginal() {
		new Thread() {
            public void run() {
                try {
                    ServerSocket server = new ServerSocket(2010); //serverSocket de ServidorOriginal 
                    while (true) {

                        Socket socket= server.accept();
                        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);	
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String aviso=null; 
                        aviso=in.readLine();
                        out.println(aviso); //le respondemos
                        
                    }
                                                                                                                                                                                        
                } catch (Exception e) {
                	e.printStackTrace();
                    
                }
        
            }
	
        }.start();
	}
	

}
