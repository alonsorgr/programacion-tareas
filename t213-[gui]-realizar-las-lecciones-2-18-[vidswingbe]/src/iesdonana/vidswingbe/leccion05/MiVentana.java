package iesdonana.vidswingbe.leccion05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {
    private JButton boton;
    private PanelTexto areaTexto;

    public MiVentana()
            throws HeadlessException {
        super("Ventana");

        // Inecesario, ya que por defecto, JFrame tiene ese gestor de contenido por defecto
        // setLayout(new BorderLayout());

        boton = new JButton("Cliqueame");
        areaTexto = new PanelTexto();

        // Interface ActionListener > Evento semántico
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                areaTexto.agregarTexto("Hola\n");
            }
        });

        add(boton, BorderLayout.SOUTH);
        add(areaTexto, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
