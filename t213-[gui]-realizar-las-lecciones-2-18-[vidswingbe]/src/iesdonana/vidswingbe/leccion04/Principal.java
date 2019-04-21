package iesdonana.vidswingbe.leccion04;

import javax.swing.*;

/**
 * LECCIÓN 4: RESPONDIENDO A LOS CLICKS DEL RATÓN
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
