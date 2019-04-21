package iesdonana.vidswingbe.leccion03;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {
    private JButton boton;
    private JTextArea areaTexto;

    public MiVentana()
            throws HeadlessException {
        super("Ventana");

        // Inecesario, ya que por defecto, JFrame tiene ese gestor de contenido por defecto
        // setLayout(new BorderLayout());

        boton = new JButton("Cliqueame");
        areaTexto = new JTextArea();

        add(boton, BorderLayout.SOUTH);
        add(areaTexto, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
