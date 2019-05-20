package iesdonana.gui;

import javax.swing.*;

import java.awt.*;

import static iesdonana.gui.Constantes.RUTA_IMAGENES;

public class Boton extends JButton {
    private static final String COLOR_FONDO = "#EEEEEE";
    public Boton(String icono) {
        setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + icono)));
        setBackground(Color.decode(COLOR_FONDO));
        setPreferredSize(new Dimension(32   , 32));
        setBorder(BorderFactory.createEmptyBorder(20,0,20,0));
    }
}
