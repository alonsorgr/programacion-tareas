package iesdonana.gui;

import iesdonana.gui.ventanas.Ventana;

import javax.swing.*;

public class Principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana("Administrador de discos");
            }
        });
    }
}
