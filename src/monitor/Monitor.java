package monitor;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import interfaces.I_Registro;
import original.Servidor;
import redudante.ServidorRedudante;


public class Monitor {

	private ArrayList <String> registroDeUsuarios;
	private Servidor servidorOriginal;
	private ServidorRedudante servidorRedudante;
	

	public Monitor() {
		super();
		this.registroDeUsuarios = new ArrayList<String>();
	}

	private void llamoServidorOriginal() throws Exception {
		this.servidorOriginal= new Servidor(registroDeUsuarios);
		servidorOriginal.recibirEmpleado0();
		servidorOriginal.recibirEmpleado1();
		servidorOriginal.recibirEmpleado2();
		servidorOriginal.recibirEmpleado3();
		servidorOriginal.recibirEmpleado4();
		servidorOriginal.recibirTotem0();
		servidorOriginal.recibirTotem1();
		servidorOriginal.recibirTotem2();
	}
	

	private void llamoOtroServidor() throws Exception {
		this.servidorRedudante=new ServidorRedudante(registroDeUsuarios);
		servidorRedudante.recibirEmpleado0();
		servidorRedudante.recibirEmpleado1();
		servidorRedudante.recibirEmpleado2();
		servidorRedudante.recibirEmpleado3();
		servidorRedudante.recibirEmpleado4();
		servidorRedudante.recibirTotem0();
		servidorRedudante.recibirTotem1();
		servidorRedudante.recibirTotem2();
		
	}

	public static void main(String[] args) {
		Monitor m= new Monitor();
		try {
			m.llamoServidorOriginal();
		} catch (Exception e) {
			try {
				m.llamoOtroServidor();
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null,"ERROR, NO SE PUDO CONECTAR EN NINGUN PUERTO, POR FAVOR CERRA Y ABRE DE NUEVO", "ERROR", JOptionPane.WARNING_MESSAGE);
			}
		}
	
}

}
