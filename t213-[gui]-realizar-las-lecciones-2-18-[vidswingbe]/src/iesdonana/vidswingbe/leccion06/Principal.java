package iesdonana.vidswingbe.leccion06;

import javax.swing.*;

/**
 * LECCIÓN 6: BARRA DE HERRAMIENTAS SIMPLES
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
