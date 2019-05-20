package iesdonana.gui.paneles.infodisco;

import javax.swing.*;
import java.awt.*;

public class PnlEtiquetaDisco extends JPanel {
    private JLabel etiqueta;
    public PnlEtiquetaDisco() {
        setBackground(Color.decode("#E3DBD1"));
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(0,0,10,10));
        etiqueta = new JLabel("UNIDAD RAÍZ");
        add(etiqueta, BorderLayout.WEST);
    }
}
