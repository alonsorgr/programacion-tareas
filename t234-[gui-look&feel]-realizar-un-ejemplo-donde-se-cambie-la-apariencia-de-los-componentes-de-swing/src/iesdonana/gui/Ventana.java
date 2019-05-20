package iesdonana.gui;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public static final String RUTA_IMAGENES = "/iesdonana/gui/recursos/";
    private JButton boton;
    private JCheckBox casilla;
    public Ventana(String title)
            throws HeadlessException {
        super(title);
        System.out.println(RUTA_IMAGENES);
        boton = new JButton("Ligar");
        casilla = new JCheckBox("Es infiel");
        add(boton, BorderLayout.NORTH);
        add(casilla, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setPreferredSize(new Dimension(100,100));
        pack();
        setVisible(true);
    }
}
