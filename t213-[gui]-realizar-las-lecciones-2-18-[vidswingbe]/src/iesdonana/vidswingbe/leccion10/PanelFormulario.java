package iesdonana.vidswingbe.leccion10;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelFormulario extends JPanel {
    public PanelFormulario() {
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        Border bordeInterior = BorderFactory.createTitledBorder("Añadir persona");
        Border bordeExterior = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(bordeInterior, bordeExterior));
    }
}
