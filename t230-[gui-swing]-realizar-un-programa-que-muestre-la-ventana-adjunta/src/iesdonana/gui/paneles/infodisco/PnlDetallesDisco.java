package iesdonana.gui.paneles.infodisco;

import javax.swing.*;
import java.awt.*;

public class PnlDetallesDisco extends JPanel {
    public PnlDetallesDisco() {
        setLayout(new BorderLayout());
        add(new PnlEtiquetaDisco(), BorderLayout.NORTH);
        add(new PnlInfoDisco(), BorderLayout.CENTER);
    }
}
