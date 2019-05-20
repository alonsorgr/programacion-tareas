package iesdonana.primitiva.renderizadores;

import iesdonana.primitiva.modelos.Combinacion;

import javax.swing.*;
import java.awt.*;

public class IntemCombinacion extends JPanel implements ListCellRenderer<Combinacion> {

    private JLabel numero = new JLabel();
    private JLabel reintegro = new JLabel();
    private JLabel complemetario = new JLabel();

    public IntemCombinacion() {
        setLayout(new BorderLayout(5, 5));
        JPanel panelText = new JPanel(new GridLayout(0, 1));
        panelText.add(numero);
        panelText.add(reintegro);
        panelText.add(complemetario);
        add(panelText, BorderLayout.CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Combinacion> list,
                      Combinacion combinacion, int index, boolean isSelected, boolean cellHasFocus) {

        StringBuilder numTexto = new StringBuilder();
        for (int i = 0; i < combinacion.getNumeros().length; i++)
            numTexto.append(combinacion.getNumeros()[i] + " ");
        numero.setText(String.format("Número: %s", numTexto.toString()));

        reintegro.setText(String.format("Reintegro: %d", combinacion.getReintegro()));
        complemetario.setText(String.format("Complementario: %d", combinacion.getComplementario()));


        reintegro.setOpaque(true);
        complemetario.setOpaque(true);
        numero.setOpaque(true);

        reintegro.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        complemetario.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        numero.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        if (isSelected) {
            reintegro.setBackground(list.getSelectionBackground());
            complemetario.setBackground(list.getSelectionBackground());
            numero.setBackground(list.getSelectionBackground());
            setBackground(list.getSelectionBackground());
        } else {
            reintegro.setBackground(list.getBackground());
            complemetario.setBackground(list.getBackground());
            numero.setBackground(list.getBackground());
            setBackground(list.getBackground());
        }
        return this;
    }
}
