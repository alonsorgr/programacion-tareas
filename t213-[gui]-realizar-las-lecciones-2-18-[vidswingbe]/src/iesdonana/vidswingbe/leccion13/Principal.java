package iesdonana.vidswingbe.leccion13;

import javax.swing.SwingUtilities;

/**
 * LECCIÓN 13: EVENTOS
 */
public class Principal {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new MiVentana("Principal");
			}
		});	
	}

}
