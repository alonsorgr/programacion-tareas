package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {
    private JButton boton;
    private JLabel etiqueta;
    private JTextArea cajaTexto;

    public Ventana(String title) throws HeadlessException {
        super(title);

        boton = new JButton("Púlsame");
        etiqueta = new JLabel("Púlsame");
        cajaTexto = new JTextArea();

        boton.addMouseListener(new Receptor());
        etiqueta.addMouseListener(new Receptor());

        boton.addMouseListener(new Receptor());

        etiqueta.setHorizontalAlignment(JLabel.CENTER);

        add(boton, BorderLayout.NORTH);
        add(etiqueta, BorderLayout.SOUTH);
        add(cajaTexto, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(600, 200));
        setVisible(true);
    }

    private class Receptor extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            cajaTexto.append("ME HAS PULSADO");
            cajaTexto.append(System.lineSeparator());
        }
    }
}
