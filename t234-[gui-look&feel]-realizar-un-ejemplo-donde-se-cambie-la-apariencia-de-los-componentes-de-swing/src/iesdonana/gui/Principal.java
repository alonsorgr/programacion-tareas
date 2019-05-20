package iesdonana.gui;

import javax.swing.*;

/**
 * T234-[GUI,LOOK&FEEL] REALIZAR UN EJEMPLO DONDE SE CAMBIE LA APARIENCIA
 * DE LOS COMPONENTES DE SWING USANDO EL TEMA NIMBUS (OPCIONAL)
 */
public class Principal {

    public static void main(String[] args) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana("Principal");
            }
        });
    }
}
