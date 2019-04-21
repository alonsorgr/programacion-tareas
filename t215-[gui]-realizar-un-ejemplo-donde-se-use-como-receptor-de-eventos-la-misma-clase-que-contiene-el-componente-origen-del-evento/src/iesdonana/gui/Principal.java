package iesdonana.gui;

import javax.swing.*;

/**
 * T215-[GUI] REALIZAR UN EJEMPLO DONDE SE USE COMO RECEPTOR DE EVENTOS
 * LA MISMA CLASE QUE CONTIENE EL COMPONENTE ORIGEN DEL EVENTO
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
