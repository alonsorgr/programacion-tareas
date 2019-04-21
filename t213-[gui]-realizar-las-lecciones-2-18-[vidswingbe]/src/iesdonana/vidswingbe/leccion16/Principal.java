package iesdonana.vidswingbe.leccion16;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(
							UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				new MiVentana("Principal");
			}
		});
	}

}
