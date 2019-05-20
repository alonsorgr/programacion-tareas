package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {
    private JTextArea etiqueta;
    private JButton boton;
    private JSplitPane splitPane;

    public Ventana(String title) throws HeadlessException {
        super(title);

        etiqueta = new JTextArea();
        boton = new JButton("Mostrar texto");
        splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane.add(etiqueta);
        splitPane.add(boton);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(250);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                etiqueta.append("Mastodonte de picha enterrada\n");
            }
        });

        add(splitPane, BorderLayout.CENTER);
        setBounds(500,200,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
