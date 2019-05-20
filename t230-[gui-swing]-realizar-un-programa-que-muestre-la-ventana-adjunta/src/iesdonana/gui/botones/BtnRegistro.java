package iesdonana.gui.botones;

import javax.swing.*;
import java.awt.*;

import static iesdonana.gui.utiles.Constantes.*;


public class BtnRegistro extends JButton {
    private static final String COLOR_FONDO = "#34354E";
    public BtnRegistro() {
        setText("Iniciar sesión");
        Color colorFondo = Color.decode(COLOR_FONDO);
        setBackground(colorFondo);
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setHorizontalAlignment(SwingConstants.LEFT);
        setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + "img-conectar.png")));
        setPreferredSize(new Dimension(300, 60));
    }
}
