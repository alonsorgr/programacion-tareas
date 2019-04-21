package iesdonana.vidswingbe.leccion18;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MiVentana("Principal");
			}
		});	
	}

}
