package iesdonana.gui.paneles;

import javax.swing.*;
import java.awt.*;

public class PnlInformacion extends JPanel {

    public PnlInformacion() {
        setLayout(new BorderLayout());
        setBackground(Color.decode("#E3DBD1"));
        add(new PnlInteriorSuperior(), BorderLayout.NORTH);
        add(new PnlInteriorCentral(), BorderLayout.CENTER);
        add(new PnlInteriorInferior(), BorderLayout.SOUTH);
    }
}
