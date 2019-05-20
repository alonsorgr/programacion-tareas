package iesdonana.gui.formularios;

import iesdonana.gui.modelos.Animal;
import iesdonana.gui.modelos.Personaje;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JComboBox<Personaje> listaPersonajes;
    private JList<Animal> listaAnimales;

    public Ventana(String title) throws HeadlessException {
        super(title);

        listaPersonajes = new JComboBox<>();
        listaAnimales = new JList<>();

        add(listaPersonajes, BorderLayout.NORTH);
        add(listaAnimales, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 600));
        pack();
        setVisible(true);
    }

    private void inicializarDatos() {

    }
}
