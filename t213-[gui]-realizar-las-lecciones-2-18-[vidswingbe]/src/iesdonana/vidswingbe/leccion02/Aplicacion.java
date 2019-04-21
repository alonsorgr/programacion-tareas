package iesdonana.vidswingbe.leccion02;

/**
 * LECCIÓN 2: APLICACIÓN BÁSICA EN SWING
 */

import javax.swing.*;

public class Aplicacion {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jFrame = new JFrame("Ventana");
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setSize(800, 600);
                jFrame.setVisible(true);
            }
        });
    }
}
