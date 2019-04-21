package iesdonana.vidswingbe.leccion11;

import iesdonana.vidswingbe.leccion10.ReceptorCadena;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraHerramientas extends JPanel implements ActionListener {
    private JButton botonHola;
    private JButton botonAdios;
    private iesdonana.vidswingbe.leccion10.ReceptorCadena receptorCadena;

    public BarraHerramientas() {

        setBorder(BorderFactory.createEtchedBorder());
        botonHola = new JButton("Hola");
        botonAdios = new JButton("Adiós");

        botonHola.addActionListener(this);
        botonAdios.addActionListener(this);

        // Aunque por defecto JPanel tiene por defecto FlowLayout, se lo establecemos para indicar la orientación
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(botonHola);
        add(botonAdios);
    }

    public void setReceptorCadena(ReceptorCadena receptorCadena) {
        this.receptorCadena = receptorCadena;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton boton = (JButton) actionEvent.getSource();

        if (receptorCadena != null)
            if (boton == botonHola)
                receptorCadena.textoEmitido("Hola\n");
            else if (boton == botonAdios) {
                receptorCadena.textoEmitido("Hola\n");
            }
            else
                throw new UnsupportedOperationException("Error: widget no implementado");

    }
}
