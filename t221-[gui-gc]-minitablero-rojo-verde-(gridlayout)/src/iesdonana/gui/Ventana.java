package iesdonana.gui;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private Casilla[] casillas;

    public Ventana(String title) throws HeadlessException {
        super(title);
        casillas = new Casilla[9];
        GridLayout rejilla = new GridLayout(3,3);
        setLayout(rejilla);
        for (int i = 0; i < casillas.length; i++)
            add(new Casilla());

        setBounds(500, 250, 500, 500);
        setPreferredSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
