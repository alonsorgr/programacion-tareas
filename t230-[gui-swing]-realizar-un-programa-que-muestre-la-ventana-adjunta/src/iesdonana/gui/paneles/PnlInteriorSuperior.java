package iesdonana.gui.paneles;

import iesdonana.gui.paneles.infodisco.PnlDetallesDisco;
import iesdonana.gui.paneles.infodisco.PnlIcono;

import javax.swing.*;
import java.awt.*;

public class PnlInteriorSuperior extends JPanel {
    public PnlInteriorSuperior() {
        setBackground(Color.decode("#E3DBD1"));
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        add(new PnlIcono(), BorderLayout.WEST);
        add(new PnlDetallesDisco(), BorderLayout.CENTER);
    }
}
