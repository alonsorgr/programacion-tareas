package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private JButton boton;
    private JTextArea texto;

    public Ventana(String title) throws HeadlessException {
        super(title);

        boton = new JButton("Mostrar Texto");
        texto = new JTextArea();
        boton.addActionListener(this);
        add(boton, BorderLayout.NORTH);
        add(texto, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(800, 600));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        texto.append("MASTODONTE !!!!!!\n");
    }
}
