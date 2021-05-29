package main;

import java.util.ArrayList;

import monitoreo.ErroresServerOriginal;
import monitoreo.ErroresServerRedudante;
import monitoreo.MonitoreoServerOriginal;
import monitoreo.MonitoreoServerRedudante;
import original.Servidor;
import redudante.ServidorRedudante;

public class Main {

	
	
	public static void main(String[] args) {
		Servidor servidorOriginal = new Servidor(null);
		ServidorRedudante servidorRedudante = new ServidorRedudante(null);
		MonitoreoServerOriginal mServerOrginal= new MonitoreoServerOriginal();
		MonitoreoServerRedudante mServerRedudante = new MonitoreoServerRedudante();
		ErroresServerOriginal erroresServerOriginal = new ErroresServerOriginal();
		ErroresServerRedudante erroresServerRedudante = new ErroresServerRedudante();

	}

}
