package iesdonana.vidswingbe.leccion07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraHerramientas extends JPanel implements ActionListener {
    private JButton botonHola;
    private JButton botonAdios;
    private PanelTexto panelTexto;

    public BarraHerramientas() {

        botonHola = new JButton("Hola");
        botonAdios = new JButton("Adiós");

        botonHola.addActionListener(this);
        botonAdios.addActionListener(this);

        // Aunque por defecto JPanel tiene por defecto FlowLayout, se lo establecemos para indicar la orientación
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(botonHola);
        add(botonAdios);
    }

    public void setPanelTexto(PanelTexto panelTexto) {
        this.panelTexto = panelTexto;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton boton = (JButton) actionEvent.getSource();

        if (boton == botonHola)
            panelTexto.agregarTexto("Hola\n");
        else if (boton == botonAdios)
            panelTexto.agregarTexto("Adiós\n");
        else
            throw new UnsupportedOperationException("Error: widget no implementado");

    }
}
