package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {
    private JTextArea areaTexto;
    private JTextArea areaMensaje;


    public Ventana(String title) throws HeadlessException {
        super(title);

        areaTexto = new JTextArea();
        areaMensaje = new JTextArea();

        areaTexto.setLineWrap(true);

        areaTexto.addKeyListener(new ReceptorTecla());
        areaTexto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaMensaje.setText("Me han hecho click");
            }
        });

        areaTexto.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                areaMensaje.setText("Tengo el foco");

            }

            @Override
            public void focusLost(FocusEvent focusEvent) {
                areaMensaje.setText("No tengo el foco");
            }
        });

        add(areaTexto, BorderLayout.NORTH);
        add(areaMensaje, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(600, 200));
        setVisible(true);

    }

    public class ReceptorTecla implements KeyListener {

        @Override
        public void keyTyped(KeyEvent keyEvent) {
            areaMensaje.setText("Estoy escribiendo");
        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {
            areaMensaje.setText("Estoy presionando");
        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {
            areaMensaje.setText("Estoy liberando");

        }
    }





}
