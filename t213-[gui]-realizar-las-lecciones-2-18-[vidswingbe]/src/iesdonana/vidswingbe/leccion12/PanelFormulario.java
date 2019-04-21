package iesdonana.vidswingbe.leccion12;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelFormulario extends JPanel {
    private JLabel nombre;
    private JLabel ocupacion;
    private JTextField textoNombre;
    private JTextField textoOcupacion;
    private JButton botonOk;

    public PanelFormulario() {
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        nombre = new JLabel("Nombre:");
        ocupacion = new JLabel("Ocupación:");
        textoNombre = new JTextField(10);
        textoOcupacion = new JTextField(10);
        botonOk = new JButton("OK");

        Border bordeInterior = BorderFactory.createTitledBorder("Añadir persona");
        Border bordeExterior = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(bordeInterior, bordeExterior));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(nombre, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(textoNombre, gc);

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(ocupacion, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(textoOcupacion, gc);

        gc.weightx = 1;
        gc.weighty = 1.0;

        gc.gridx = 1;
        gc.gridy = 2;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(botonOk, gc);
    }
}
