package iesdonana.gui;

import javax.swing.*;

/**
 * T221-[GUI,GC] MINITABLERO ROJO-VERDE (GRIDLAYOUT)
 *
 * REALIZAR UN TABLERO DE 3X3 BOTONES ROJOS
 * EL TABLERO ESTA FORMADO POR CASILLAS
 * LAS CASILLAS DEBEN SER BOTONES PERSONALIZADOS
 *
 * AL CLICAR EN UN BOTON CAMBIA DE COLOR (ROJO<-> VERDE)
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
