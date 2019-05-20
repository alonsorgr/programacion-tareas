package iesdonana.primitiva.ventanas;

import iesdonana.primitiva.componentes.Casilla;
import iesdonana.primitiva.modelos.Combinacion;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static iesdonana.primitiva.utiles.Constantes.RUTA_IMAGENES;

public class Boleto extends JDialog {
    private Casilla[] casillas;
    private JButton btnAceptar;
    private Loteria loteria;

    {
        casillas = new Casilla[49];
        for (int i = 0; i < casillas.length; i++)
            casillas[i] = new Casilla(String.valueOf(i+1));

        btnAceptar = new JButton("Aceptar");
    }

    public Boleto(Loteria loteria) {
        setLoteria(loteria);
        add(panelNorte(), BorderLayout.NORTH);
        add(panelCentral(), BorderLayout.CENTER);
        btnAceptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!esCorrecto())
                    JOptionPane.showMessageDialog
                            (null, "Debe elegir 6 numeros.\nNi uno más ni uno menos");
                else {
                    agregarCombinacion();
                    setVisible(false);
                    dispose();
                }
            }
        });
        add(panelSur(), BorderLayout.SOUTH);
        setPropiedades();
    }

    public void setLoteria(Loteria loteria) {
        if (loteria == null)
            throw new NullPointerException("Error: loteria es nulo");
        this.loteria = loteria;
    }

    private void setPropiedades() {
        btnAceptar.setMnemonic(KeyEvent.VK_A);
        setTitle("Rellenar boleto");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        setPreferredSize(new Dimension(260, 400));
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
    }

    private JPanel panelNorte() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panelImagen = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelImagen.setBackground(Color.decode("#FFFFFF"));
        JLabel imagen = new JLabel();
        panelImagen.add(imagen);
        imagen.setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + "logo.jpg")));
        panel.add(panelImagen, BorderLayout.NORTH);
        return panel;
    }

    private JPanel panelCentral() {
        JPanel panel = new JPanel(new BorderLayout());
        Border bordeTexto = BorderFactory.createTitledBorder("Seleccione 6 números");
        Border margen = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        panel.setBorder(BorderFactory.createCompoundBorder(margen, bordeTexto));

        JPanel panelNumeros = new JPanel(new GridLayout(5,10));
        for (int i = 0; i < casillas.length; i++) {
            panelNumeros.add(casillas[i]);
        }
        panel.add(panelNumeros, BorderLayout.CENTER);
        return panel;
    }

    private JPanel panelSur() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(0, 7, 5, 7));
        panel.add(btnAceptar, BorderLayout.CENTER);
        return panel;
    }

    private boolean esCorrecto() {
        boolean correcto = true;
        int contador = 0;
        for (int i = 0; i < casillas.length; i++)
            if (casillas[i].isSelected())
                contador++;
        if (contador != 6)
            correcto = false;
        return correcto;
    }

    private void agregarCombinacion() {
        Combinacion c = new Combinacion();
        for (int i = 0; i < casillas.length; i++) {
            if (casillas[i].isSelected())
                c.agregarNumero(Integer.parseInt(casillas[i].getText()));
        }
        loteria.agregarCombinacion(c);
    }
}
