package iesdonana.gui;

import javax.swing.*;

/**
 * T218-[GUI] REALIZAR UN EJEMPLO PENSADO POR EL ALUMNO DONDE SE EVITE EL ACOPLAMIENTO ENTRE COMPONENTES USANDO INTERFACES
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
