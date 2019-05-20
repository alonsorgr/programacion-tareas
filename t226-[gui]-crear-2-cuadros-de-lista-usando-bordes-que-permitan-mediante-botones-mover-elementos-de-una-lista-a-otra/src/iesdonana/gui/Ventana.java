package iesdonana.gui;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;

public class Ventana extends JFrame {
    private ListaTitulo derecha;
    private ListaTitulo izquierda;
    private PanelBotones botones;

    public Ventana(String title)
            throws HeadlessException {
        super(title);

        botones = new PanelBotones();
        derecha = new ListaTitulo("Alumnos/as candidatos/as:");
        izquierda = new ListaTitulo("Alumnos/as seleccionados/as:");
        JPanel panelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelTitulo.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panelTitulo.setBackground(Color.GRAY);
        JLabel etiquetaTitulo = new JLabel("Alumnos/as a evaluar");
        panelTitulo.add(etiquetaTitulo);
        add(panelTitulo, BorderLayout.NORTH);

        JPanel contenido = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contenido.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        contenido.add(derecha, BorderLayout.WEST);
        contenido.add(botones, BorderLayout.CENTER);
        contenido.add(izquierda, BorderLayout.EAST);
        add(contenido, BorderLayout.CENTER);

        mover();

        setPropiedades();
    }

    private void setPropiedades() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(675, 375));
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
    }

    private void mover() {
        DefaultListModel modelDerecha = new DefaultListModel();
        DefaultListModel modelIzquierda = new DefaultListModel();
        derecha.getLista().setModel(modelDerecha);
        izquierda.getLista().setModel(modelIzquierda);

        modelDerecha.addElement("Alonso García");
        modelDerecha.addElement("Enrique Cuevas");
        modelDerecha.addElement("José María Saborido");
        modelDerecha.addElement("Florido");

        botones.getActualizar().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                derecha.getLista().updateUI();
                izquierda.getLista().updateUI();
            }
        });

        botones.getMoverDerecha().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (derecha.getLista().getSelectedValue() != null) {
                    modelIzquierda.addElement(derecha.getLista().getSelectedValue());
                    modelDerecha.removeElement(derecha.getLista().getSelectedValue());
                }
            }
        });

        botones.getMoverIzquierda().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (izquierda.getLista().getSelectedValue() != null) {
                    modelDerecha.addElement(izquierda.getLista().getSelectedValue());
                    modelIzquierda.removeElement(izquierda.getLista().getSelectedValue());
                }
            }
        });

        botones.getMoverIzquierdaTodo().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (int i = 0; i < modelIzquierda.getSize(); i++) {
                    modelDerecha.addElement(modelIzquierda.getElementAt(i));
                }
                modelIzquierda.removeAllElements();
            }
        });

        botones.getMoverDerechaTodo().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (int i = 0; i < modelDerecha.getSize(); i++) {
                    modelIzquierda.addElement(modelDerecha.getElementAt(i));
                }
                modelDerecha.removeAllElements();
            }
        });

    }
}
