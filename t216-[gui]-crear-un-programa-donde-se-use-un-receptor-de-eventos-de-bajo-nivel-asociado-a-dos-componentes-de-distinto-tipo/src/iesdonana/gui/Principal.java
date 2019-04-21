package iesdonana.gui;

import javax.swing.*;

/**
 * T216-[GUI] CREAR UN PROGRAMA DONDE SE USE UN RECEPTOR DE EVENTOS
 * DE BAJO NIVEL ASOCIADO A DOS COMPONENTES DE DISTINTO TIPO
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
