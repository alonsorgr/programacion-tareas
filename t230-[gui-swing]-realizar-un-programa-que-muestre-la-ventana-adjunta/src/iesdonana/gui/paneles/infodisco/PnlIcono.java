package iesdonana.gui.paneles.infodisco;

import javax.swing.*;
import java.awt.*;

import static iesdonana.gui.utiles.Constantes.RUTA_IMAGENES;

public class PnlIcono extends JLabel {
    public PnlIcono() {
        setBackground(Color.decode("#E3DBD1"));
        setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + "img-disco-logo.png")));
    }
}
