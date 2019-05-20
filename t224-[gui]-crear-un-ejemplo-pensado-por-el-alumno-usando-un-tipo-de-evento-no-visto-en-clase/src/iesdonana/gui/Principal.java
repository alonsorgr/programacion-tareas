package iesdonana.gui;

import javax.swing.*;

/**
 * T224-[GUI] CREAR UN EJEMPLO PENSADO POR EL ALUMNO USANDO UN TIPO DE EVENTO NO VISTO EN CLASE
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
