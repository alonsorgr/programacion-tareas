package iesdonana.gui;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private BarraHerramientas barraHerramientas;
    private JTextArea salida;

    public Ventana(String title) throws HeadlessException {
        super(title);
        barraHerramientas = new BarraHerramientas();
        salida = new JTextArea();
        add(barraHerramientas, BorderLayout.NORTH);

        barraHerramientas.setReceptor(new Receptor() {
            @Override
            public void copiarTexto(String texto) {
                salida.setText(texto);
            }
        });
        add(salida, BorderLayout.CENTER);
        setSize(new Dimension(600,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
