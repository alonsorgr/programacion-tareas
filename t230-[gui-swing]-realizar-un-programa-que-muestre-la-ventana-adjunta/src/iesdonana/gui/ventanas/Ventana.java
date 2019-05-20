package iesdonana.gui.ventanas;

import iesdonana.gui.botones.BtnRegistro;
import iesdonana.gui.paneles.PnlHerramientas;
import iesdonana.gui.paneles.PnlDiscos;
import iesdonana.gui.paneles.PnlInformacion;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private BtnRegistro btnRegistro;


    public Ventana(String title)
            throws HeadlessException {
        super(title);
        setPanelSuperior();
        setPanelLateral();

        JPanel panelCentral = new JPanel(new FlowLayout(FlowLayout.LEFT, 0,0));
        panelCentral.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panelCentral.setBackground(Color.decode("#E3DBD1"));
        panelCentral.add(new PnlInformacion());
        add(panelCentral, BorderLayout.CENTER);

        setPropiedades();
    }

    private void setPanelSuperior() {
        JPanel panelSuperior = new JPanel(new BorderLayout());
        panelSuperior.setBorder(BorderFactory.createEmptyBorder());

        JPanel panelSuperiorRegistro = new JPanel(new FlowLayout(FlowLayout.LEFT, 0,0));
        panelSuperiorRegistro.setBorder(BorderFactory.createEmptyBorder());
        panelSuperiorRegistro.add(new BtnRegistro());

        JPanel panelSuperiorHerramientas = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panelSuperiorHerramientas.setBorder(BorderFactory.createEmptyBorder());
        panelSuperiorHerramientas.add(new PnlHerramientas());

        panelSuperior.add(panelSuperiorRegistro, BorderLayout.WEST);
        panelSuperior.add(panelSuperiorHerramientas, BorderLayout.CENTER);

        add(panelSuperior, BorderLayout.NORTH);
    }

    private void setPanelLateral() {
        JPanel panelLateral = new JPanel(new BorderLayout());
        panelLateral.setBorder(BorderFactory.createEmptyBorder());
        panelLateral.add(new PnlDiscos(), BorderLayout.CENTER);
        add(panelLateral, BorderLayout.WEST);
    }

    private void setPropiedades() {
        btnRegistro = new BtnRegistro();
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width  - getSize().width) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(850, 550));
        pack();
        setVisible(true);
    }
}
