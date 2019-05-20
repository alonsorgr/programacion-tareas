package iesdonana.gui;

import javax.swing.*;
import java.awt.*;

public class ListaTitulo extends JPanel {

    private JLabel titulo;
    private JList lista;

    public ListaTitulo(String titulo) {
        setTitulo(titulo);
        setLayout(new BorderLayout());
        JPanel panelTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelTitulo.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panelTitulo.add(this.titulo);
        add(panelTitulo, BorderLayout.NORTH);
        lista = new JList();
        setPreferredSize(new Dimension(300, 300));
        lista.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        add(lista, BorderLayout.CENTER);
    }

    public void setTitulo(String titulo) {
        this.titulo = new JLabel(titulo);
    }


    public JList getLista() {
        return lista;
    }
}
