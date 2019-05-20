package iesdonana.gui;

import javax.swing.*;

/**
 * T232-[GUI] CREAR UN FORMULARIO CON UN BOTON EN UN PANEL (JPANEL) EN INTELLIJ (GUI FORM) USANDO
 * EL CONSTRUCTOR DE GUI Y COMPROBAR EN EL CODIGO GENERADO
 * (FORM SOURCE) CUAL ES EL GESTOR DE COLOCACION USADO POR DEFECTO
 *
 *
 * GridLayoutManager
 *
 */
public class Principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana();
            }
        });
    }
}
