package iesdonana.gui.paneles;

import javax.swing.*;
import java.awt.*;

public class PnlLicencia extends JPanel {
    private JButton botonActivar;
    private JButton botonComprar;

    public PnlLicencia() {
        setPreferredSize(new Dimension(300, 100));
        setBackground(Color.decode("#312B36"));
        setLayout(new BorderLayout());
        JLabel etiqueta = new JLabel("Caduca dentro de 10 días", SwingConstants.CENTER);
        etiqueta.setForeground(Color.decode("#68FEFE"));
        add(etiqueta, BorderLayout.CENTER);

        JPanel botones = new JPanel();
        botones.setBackground(Color.decode("#312B36"));
        botones.setPreferredSize(new Dimension(300, 50));
        botonActivar = new JButton("Activar");
        botonComprar = new JButton("Comprar");
        botonActivar.setBackground(Color.decode("#68FEFE"));
        botonComprar.setBackground(Color.decode("#68FEFE"));
        botones.add(botonActivar);
        botones.add(botonComprar);
        add(botones, BorderLayout.SOUTH);
    }
}

