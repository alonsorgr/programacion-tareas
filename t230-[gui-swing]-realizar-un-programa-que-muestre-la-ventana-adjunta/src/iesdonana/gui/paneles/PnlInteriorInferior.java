package iesdonana.gui.paneles;

import javax.swing.*;
import java.awt.*;

public class PnlInteriorInferior extends JPanel {
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;

    public PnlInteriorInferior() {
        setLayout(new GridLayout(0,1));
        setBorder(BorderFactory.createEmptyBorder(0,20,0,0));
        setBackground(Color.decode("#E3DBD1"));
        checkBox1 = new JCheckBox("Guardar hora de último acceso");
        checkBox2 = new JCheckBox("Permitir indexación de contenido destacado");
        checkBox3 = new JCheckBox("Montar solo en modo lectura");
        checkBox4 = new JCheckBox("No montar de forma automática");

        checkBox1.setBackground(Color.decode("#E3DBD1"));
        checkBox2.setBackground(Color.decode("#E3DBD1"));
        checkBox3.setBackground(Color.decode("#E3DBD1"));
        checkBox4.setBackground(Color.decode("#E3DBD1"));

        checkBox1.setSelected(true);

        add(checkBox1);
        add(checkBox2);
        add(checkBox3);
        add(checkBox4);
    }
}
