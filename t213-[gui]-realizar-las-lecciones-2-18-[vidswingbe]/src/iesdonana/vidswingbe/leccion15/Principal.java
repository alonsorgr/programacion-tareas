package iesdonana.vidswingbe.leccion15;

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
