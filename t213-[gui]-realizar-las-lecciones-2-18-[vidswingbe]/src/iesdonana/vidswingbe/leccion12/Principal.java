package iesdonana.vidswingbe.leccion12;


import javax.swing.*;

/**
 * LECCIÓN 12: DISPOSICIÓN DE CONTROLES CON GRIDBAGLAYOUT
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
