package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana extends JFrame {
    private JTextArea areaTexto;

    public Ventana(String title)
            throws HeadlessException {
        super(title);
        inicializar();
        areaTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                JOptionPane.showMessageDialog
                        (null, "Ha escrito la tecla " + e.getKeyChar());
            }
        });
        setPropiedades();
    }

    private void inicializar() {
        areaTexto = new JTextArea();
        add(areaTexto);
    }
    private void setPropiedades() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setPreferredSize(new Dimension(200, 30));
        pack();
        setVisible(true);
    }

}
