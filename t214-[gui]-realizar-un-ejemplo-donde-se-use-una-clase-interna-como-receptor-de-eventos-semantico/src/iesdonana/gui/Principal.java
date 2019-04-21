package iesdonana.gui;

import javax.swing.*;

/**
 * T214-[GUI] REALIZAR UN EJEMPLO DONDE SE USE UNA CLASE INTERNA COMO RECEPTOR DE EVENTOS SEMANTICO
 *
 * CLASE INTERNA ANONIMA
 *
 * CLASE INTERNA NO ANONIMA
 *
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
