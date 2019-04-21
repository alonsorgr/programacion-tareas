package iesdonana.vidswingbe.leccion05;

import javax.swing.*;

/**
 * LECCIÓN 5: COMPONENTES PERSONALIZADOS
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
