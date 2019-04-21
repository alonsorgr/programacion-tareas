package iesdonana.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraHerramientas extends JPanel implements ActionListener {
    private JTextField entradaTexto;
    private JButton boton;
    private Receptor receptor;

    public BarraHerramientas() {
        entradaTexto = new JTextField(20);
        boton = new JButton("Visualizar valor de propiedad del sistema");
        boton.addActionListener(this);
        add(entradaTexto);
        add(boton);
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton btn = (JButton) actionEvent.getSource();

        if (btn == null)
            throw new NullPointerException("Error: el botón es nulo");

        receptor.copiarTexto(System.getProperty(entradaTexto.getText()));
    }
}
