package iesdonana.gui;

import javax.swing.*;

/**
 * T217-[GUI] CREAR UN PROGRAMA DONDE SE USEN 3 RECEPTORES DE EVENTOS DISTINTOS PARA EL MISMO COMPONTENTE
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
