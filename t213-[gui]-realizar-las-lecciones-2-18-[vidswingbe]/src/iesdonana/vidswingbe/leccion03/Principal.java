package iesdonana.vidswingbe.leccion03;

import javax.swing.*;

/**
 * LECCIÓN 3: AÑADIENDO COMPONENTES
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
