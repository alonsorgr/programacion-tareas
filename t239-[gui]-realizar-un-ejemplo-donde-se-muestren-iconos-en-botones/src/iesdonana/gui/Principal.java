package iesdonana.gui;

import javax.swing.*;

/**
 * T239-[GUI] REALIZAR UN EJEMPLO DONDE SE MUESTREN ICONOS EN BOTONES.
 */
public class Principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana("Principal");
            }
        });
    }
}
