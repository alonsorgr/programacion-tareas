package iesdonana.vidswingbe.leccion11;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelFormulario extends JPanel {
    private JLabel nombre;
    private JLabel ocopacion;
    private JTextField textoNombre;
    private JTextField textoOcupacion;
    private JButton botonOk;

    public PanelFormulario() {
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);

        nombre = new JLabel("Nombre:");
        ocopacion = new JLabel("Ocupación:");
        textoNombre = new JTextField(10);
        textoOcupacion = new JTextField(10);
        botonOk = new JButton("OK");

        Border bordeInterior = BorderFactory.createTitledBorder("Añadir persona");
        Border bordeExterior = BorderFactory.createEmptyBorder(5,5,5,5);
        setBorder(BorderFactory.createCompoundBorder(bordeInterior, bordeExterior));
    }
}
