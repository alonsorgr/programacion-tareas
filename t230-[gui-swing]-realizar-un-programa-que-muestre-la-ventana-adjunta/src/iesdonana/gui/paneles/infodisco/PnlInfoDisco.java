package iesdonana.gui.paneles.infodisco;

import javax.swing.*;
import java.awt.*;

public class PnlInfoDisco extends JPanel {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    public PnlInfoDisco() {
        setLayout(new GridBagLayout());
        setPreferredSize(new Dimension(350, 100));
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        setBackground(Color.decode("#cdc3b6"));
        GridBagConstraints gc = new GridBagConstraints();

        label1 = new JLabel("Montado:");
        label2 = new JLabel("/");
        label3 = new JLabel("Sistema operativo:");
        label4 = new JLabel("Ubuntu");
        label5 = new JLabel("Sistema de archivos: ");
        label6 = new JLabel("EXT4");
        label7 = new JLabel("Distpositivo:");
        label8 = new JLabel("alonso@casa");

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(label1, gc);

        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(label2, gc);

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 1;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(label3, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(label4, gc);

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 2;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(label5, gc);

        gc.gridx = 1;
        gc.gridy = 2;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(label6, gc);

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 3;
        gc.fill = GridBagConstraints.NONE;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_START;
        add(label7, gc);

        gc.gridx = 1;
        gc.gridy = 3;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(label8, gc);

    }
}
