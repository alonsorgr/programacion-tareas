package iesdonana.vidswingbe.leccion09;

import javax.swing.*;

/**
 * LECCIÓN 9: ESTABLECIENDO TAMAÑO A LOS COMPONENTES
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
