package iesdonana.vidswingbe.leccion08;

import javax.swing.*;

/**
 * LECCIÓN 8: RECEPTORES Y EVENTOS - USANDO INTERFACES PARA SEPARAR COMPONENTES
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
