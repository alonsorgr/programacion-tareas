package iesdonana.gui;

import javax.swing.*;

/**
 * T227-[GUI] CREAR UN EJEMPLO DONDE SE USE UNA BARRA DE PROGRESO
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
