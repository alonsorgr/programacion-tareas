package iesdonana.vidswingbe.leccion07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiVentana extends JFrame {
    private PanelTexto areaTexto;
    private BarraHerramientas barraHerramientas;

    public MiVentana()
            throws HeadlessException {
        super("Ventana");

        // Inecesario, ya que por defecto, JFrame tiene ese gestor de contenido por defecto
        // setLayout(new BorderLayout());

        areaTexto = new PanelTexto();
        barraHerramientas = new BarraHerramientas();

        barraHerramientas.setPanelTexto(areaTexto);


        add(barraHerramientas, BorderLayout.NORTH);
        add(areaTexto, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
