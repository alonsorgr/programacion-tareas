package iesdonana.gui.botones;

import javax.swing.*;
import java.awt.*;

import static iesdonana.gui.utiles.Constantes.RUTA_IMAGENES;

public class BtnAccion extends JPanel {
    private static final String COLOR_FONDO = "#EEEEEE";
    private JButton boton;
    private JLabel etiqueta;

    public BtnAccion(String titulo, String imagen) {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        boton = new JButton(titulo);
        etiqueta = new JLabel(titulo);
        boton.setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + imagen)));
        boton.setBackground(Color.decode(COLOR_FONDO));
        boton.setPreferredSize(new Dimension(94   , 50));
        boton.setVerticalTextPosition(SwingConstants.BOTTOM);
        boton.setHorizontalTextPosition(SwingConstants.CENTER);
        boton.setBorder(BorderFactory.createEmptyBorder());
        add(boton);
    }
}
