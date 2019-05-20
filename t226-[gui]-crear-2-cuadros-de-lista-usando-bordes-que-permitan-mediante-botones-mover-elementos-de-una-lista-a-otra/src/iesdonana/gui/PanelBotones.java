package iesdonana.gui;

import javax.swing.*;

public class PanelBotones extends JPanel {
    private JButton actualizar;
    private JButton moverDerecha;
    private JButton moverIzquierda;
    private JButton moverDerechaTodo;
    private JButton moverIzquierdaTodo;

    public PanelBotones() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        actualizar = new Boton("actualizar.png");
        moverDerecha = new Boton("mover-derecha.png");
        moverIzquierda = new Boton("mover-izquierda.png");
        moverDerechaTodo = new Boton("mover-derecha-todo.png");
        moverIzquierdaTodo = new Boton("mover-izquierda-todo.png");
        add(actualizar);
        add(moverDerecha);
        add(moverIzquierda);
        add(moverDerechaTodo);
        add(moverIzquierdaTodo);
    }

    public JButton getActualizar() {
        return actualizar;
    }

    public JButton getMoverDerecha() {
        return moverDerecha;
    }

    public JButton getMoverIzquierda() {
        return moverIzquierda;
    }

    public JButton getMoverDerechaTodo() {
        return moverDerechaTodo;
    }

    public JButton getMoverIzquierdaTodo() {
        return moverIzquierdaTodo;
    }
}
