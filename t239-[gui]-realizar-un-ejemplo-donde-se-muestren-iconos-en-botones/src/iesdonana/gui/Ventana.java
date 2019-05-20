package iesdonana.gui;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public static final String RUTA_IMAGENES = "/iesdonana/gui/recursos/";
    private JButton boton;

    public Ventana(String title)
            throws HeadlessException {
        super(title);
        System.out.println(RUTA_IMAGENES);
        boton = new JButton();
        boton.setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + "ok.png")));
        add(boton, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setPreferredSize(new Dimension(100,100));
        pack();
        setVisible(true);
    }
}
