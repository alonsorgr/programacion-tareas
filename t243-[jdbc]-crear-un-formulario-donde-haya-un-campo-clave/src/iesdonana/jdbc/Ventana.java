package iesdonana.jdbc;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(String title)
            throws HeadlessException {
        super(title);
        setPropiedades();
    }

    private void setPropiedades() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setPreferredSize(new Dimension(600, 500));
        pack();
        setVisible(true);
    }

    private void conectar() {

    }
}
