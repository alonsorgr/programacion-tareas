package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana extends JFrame {

    public Ventana(String title)
            throws HeadlessException {
        super(title);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent arg0) {
                dispose();
                System.gc();
            }

        });

        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(500,500));
        setResizable(false);
        pack();
        setVisible(true);
    }
}
