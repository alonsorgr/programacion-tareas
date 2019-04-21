package iesdonana.vidswingbe.leccion06;

import javax.swing.*;
import java.awt.*;

public class BarraHerramientas extends JPanel {
    private JButton botonHola;
    private JButton botonAdios;

    public BarraHerramientas() {

        botonHola = new JButton("Hola");
        botonAdios = new JButton("Adiós");

        // Aunque por defecto JPanel tiene por defecto FlowLayout, se lo establecemos para indicar la orientación
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(botonHola);
        add(botonAdios);
    }
}
