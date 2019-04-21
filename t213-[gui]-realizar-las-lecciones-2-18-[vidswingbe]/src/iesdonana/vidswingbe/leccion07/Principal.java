package iesdonana.vidswingbe.leccion07;

import javax.swing.*;

/**
 * LECCIÓN 7: COMUNICACIÓN ENTRE COMPONENTES
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
