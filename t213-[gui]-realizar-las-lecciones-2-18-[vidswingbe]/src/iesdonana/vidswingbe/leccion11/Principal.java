package iesdonana.vidswingbe.leccion11;

import iesdonana.vidswingbe.leccion10.MiVentana;

import javax.swing.*;

/**
 * LECCIÓN 11: TEXT FIELD Y LABELS
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
