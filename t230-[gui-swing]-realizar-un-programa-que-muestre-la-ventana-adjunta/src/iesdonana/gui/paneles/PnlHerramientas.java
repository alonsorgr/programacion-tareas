package iesdonana.gui.paneles;

import iesdonana.gui.botones.BtnAccion;

import javax.swing.*;
import java.awt.*;

public class PnlHerramientas extends JPanel {
    private BtnAccion btnDesmontar;
    private BtnAccion btnVerificar;
    private BtnAccion btnBorrar;

    public PnlHerramientas() {
        setLayout(new GridBagLayout());
        GridBagConstraints bagConstraints = new GridBagConstraints();
        setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
        btnDesmontar = new BtnAccion("Desmontar", "img-expulsar-disco.png");
        btnVerificar = new BtnAccion("Verificar", "img-verificar.png");
        btnBorrar = new BtnAccion("Borrar", "img-borrar.png");

        bagConstraints.weightx = 1;
        bagConstraints.weighty = 0.1;

        bagConstraints.gridx = 0;
        bagConstraints.gridy = 0;
        bagConstraints.fill = GridBagConstraints.NONE;
        bagConstraints.insets = new Insets(0,0,0,5);
        bagConstraints.anchor = GridBagConstraints.LINE_START;
        add(btnDesmontar, bagConstraints);

        bagConstraints.gridx = 1;
        bagConstraints.gridy = 0;
        bagConstraints.insets = new Insets(0,0,0,0);
        bagConstraints.anchor = GridBagConstraints.CENTER;
        add(btnVerificar, bagConstraints);

        bagConstraints.gridx = 2;
        bagConstraints.gridy = 0;
        bagConstraints.insets = new Insets(0,0,0,0);
        bagConstraints.anchor = GridBagConstraints.LINE_END;
        add(btnBorrar, bagConstraints);

        add(btnDesmontar);
        add(btnVerificar);
        add(btnBorrar);
    }
}
