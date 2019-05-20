package iesdonana.gui;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana(String title) throws HeadlessException {
        super(title);
        getContentPane().setLayout (new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JTextArea cajaTexto = new JTextArea("Area texto");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;

        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0;
        this.getContentPane().add (cajaTexto, constraints);
        constraints.weighty = 0.0;

        JButton boton1 = new JButton ("BotonColor 1");
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;

        constraints.anchor = GridBagConstraints.NORTH;

        constraints.fill = GridBagConstraints.NONE;
        this.getContentPane().add (boton1, constraints);

        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weighty = 0.0;

        JButton boton2 = new JButton ("BotonColor 2");
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;

        constraints.anchor = GridBagConstraints.NORTH;
        this.getContentPane().add (boton2, constraints);


        BotonColor boton = new BotonColor();
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;

        constraints.anchor = GridBagConstraints.NORTH;
        this.getContentPane().add (boton, constraints);

        MiTexto miTexto = new MiTexto();
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;

        constraints.anchor = GridBagConstraints.ABOVE_BASELINE;
        this.getContentPane().add(miTexto, constraints);

        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.CENTER;

        JButton boton3 = new JButton ("BotonColor 3");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton3, constraints);

        JButton boton4 = new JButton ("BotonColor 4");
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton4, constraints);

        JTextField campoTexto = new JTextField ("Campo texto");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.getContentPane().add (campoTexto, constraints);

        setBounds(500, 250, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500, 500));
        setVisible(true);
    }
}
