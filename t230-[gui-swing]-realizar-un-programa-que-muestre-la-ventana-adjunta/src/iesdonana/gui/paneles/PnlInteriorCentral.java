package iesdonana.gui.paneles;

import javax.swing.*;
import java.awt.*;

public class PnlInteriorCentral extends JPanel {
    private JProgressBar barraProgreso;
    private JLabel etiquetaTotal;
    private JLabel etiquetaUsado;
    private JLabel etiquetaLibre;

    public PnlInteriorCentral() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(350, 100));
        setBackground(Color.decode("#E3DBD1"));
        setBorder(BorderFactory.createEmptyBorder(10,20,10,10));

        etiquetaTotal = new JLabel("4 TB en total");
        etiquetaUsado = new JLabel("973,85 GB usados");
        etiquetaLibre = new JLabel("3,03 TB libre");
        barraProgreso = new JProgressBar();

        barraProgreso.setPreferredSize(new Dimension(475, 20));
        barraProgreso.setBorder(BorderFactory.createEmptyBorder());
        barraProgreso.setValue(35);

        JPanel panelSuperior = new JPanel(new GridBagLayout());
        panelSuperior.setBackground(Color.decode("#E3DBD1"));
        JPanel panelCentral = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelCentral.setPreferredSize(new Dimension(485, getPreferredSize().height));
        panelCentral.setBackground(Color.decode("#E3DBD1"));
        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(Color.decode("#E3DBD1"));


        GridBagConstraints bagConstraints = new GridBagConstraints();
        panelSuperior.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

        bagConstraints.weightx = 1;
        bagConstraints.weighty = 0.1;

        bagConstraints.gridx = 0;
        bagConstraints.gridy = 0;
        bagConstraints.fill = GridBagConstraints.NONE;
        bagConstraints.insets = new Insets(0,5,0,5);
        bagConstraints.anchor = GridBagConstraints.LINE_START;
        panelSuperior.add(etiquetaTotal, bagConstraints);

        bagConstraints.gridx = 1;
        bagConstraints.gridy = 0;
        bagConstraints.insets = new Insets(0,0,0,0);
        bagConstraints.anchor = GridBagConstraints.CENTER;
        panelSuperior.add(etiquetaUsado, bagConstraints);

        bagConstraints.gridx = 2;
        bagConstraints.gridy = 0;
        bagConstraints.insets = new Insets(0,0,0,0);
        bagConstraints.anchor = GridBagConstraints.LINE_END;
        panelSuperior.add(etiquetaLibre, bagConstraints);

        panelCentral.add(barraProgreso);

        JPanel panelCompuesto = new JPanel(new BorderLayout());
        panelCompuesto.setBackground(Color.decode("#E3DBD1"));
        JLabel etiquetaEstado = new JLabel("Otro: 973,85 GB");
        panelCompuesto.add(etiquetaEstado, BorderLayout.CENTER);
        panelCentral.add(panelCompuesto);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);

    }
}
