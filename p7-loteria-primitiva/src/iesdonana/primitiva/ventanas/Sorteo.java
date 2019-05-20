package iesdonana.primitiva.ventanas;

import iesdonana.primitiva.componentes.Numero;
import iesdonana.primitiva.modelos.Combinacion;
import iesdonana.primitiva.modelos.Premio;
import iesdonana.primitiva.utiles.Util;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static iesdonana.primitiva.utiles.Constantes.RUTA_IMAGENES;

public class Sorteo extends JDialog {
    private Numero[] numeros;
    private JPanel panelNumeros;
    private JButton btnComprobar;
    private Premio premio;

    {
        numeros = new Numero[6];
    }

    public Sorteo(Loteria loteria, String titulo) {
        super(loteria, titulo);
        generarCombinacion();
        add(panelLogo(), BorderLayout.NORTH);
        add(panelSorteo(), BorderLayout.CENTER);
        add(panelBoton(), BorderLayout.SOUTH);
        setPropiedades();
    }

    private void generarCombinacion() {
        premio = new Premio();
        Util.generarAleatorio(premio.getNumeros(), true);
        premio.setComplementario((int) (Math.random() * 49));
        premio.setReintegro((int) (Math.random() * 49));
    }

    private void setPropiedades() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        setPreferredSize(new Dimension(600, 330));
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    private JPanel panelLogo() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        Border innerBorder = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
        Border outerBorder = BorderFactory.createEmptyBorder(10, 10, 0, 10);
        panel.setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        JLabel label = new JLabel();
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label.setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + "primitiva-logo.png")));
        panel.add(label);
        return panel;
    }

    private JPanel panelSorteo() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(panelAgraciado(), BorderLayout.NORTH);
        panel.add(panelReintegro(), BorderLayout.CENTER);
        panel.add(panelComplementario(), BorderLayout.SOUTH);
        return panel;
    }

    private JPanel panelAgraciado() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("NÚMERO AGRACIADO: ");
        label.setFont(new Font("Mono", Font.PLAIN, 20));
        panel.add(label);
        panel.add(panelNumero());
        return panel;
    }

    private JPanel panelNumero() {
        JPanel superior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelNumeros = new JPanel(new GridLayout(1, 6));
        for (int i = 0; i < numeros.length; i++) {
            panelNumeros.add(numeros[i] = new Numero(String.format("%02d", premio.getNumeros()[i])));
        }
        superior.add(panelNumeros);
        return superior;
    }

    private JPanel panelReintegro() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("REINTEGRO: ");
        label.setFont(new Font("Mono", Font.PLAIN, 20));
        panel.add(label);
        panel.add(pnlReintegro());
        return panel;
    }

    private JPanel pnlReintegro() {
        JPanel superior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel(String.format("%02d", premio.getReintegro()));
        label.setFont(new Font("Mono", Font.PLAIN, 20));
        superior.add(label);
        return superior;
    }

    private JPanel panelComplementario() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("COMPLEMENTARIO: ");
        label.setFont(new Font("Mono", Font.PLAIN, 20));
        panel.add(label);
        panel.add(pnlComplementario());
        return panel;
    }

    private JPanel pnlComplementario() {
        JPanel superior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel(String.format("%02d", premio.getComplementario()));
        label.setFont(new Font("Mono", Font.PLAIN, 20));
        superior.add(label);
        return superior;
    }

    private JPanel panelBoton() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        panel.setPreferredSize(new Dimension(getPreferredSize().width, 50));
        btnComprobar = new JButton("Comprobar premiados");
        panel.add(btnComprobar);
        return panel;
    }
}
