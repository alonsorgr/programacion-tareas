package iesdonana.vidswingbe.leccion10;

import javax.swing.*;

/**
 * LECCIÓN 10: AJUSTES DE BORDES
 */
public class Principal {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MiVentana();
            }
        });
    }
}
