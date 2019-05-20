package iesdonana.gui.renderizadores;

import iesdonana.gui.modelos.MdlDisco;

import javax.swing.*;
import java.awt.*;

import static iesdonana.gui.utiles.Constantes.RUTA_IMAGENES;

public class RenDisco extends JPanel implements ListCellRenderer<MdlDisco> {

    private JLabel icono = new JLabel();
    private JLabel etiqueta = new JLabel();
    private JLabel capacidad = new JLabel();

    public RenDisco() {
        setLayout(new BorderLayout(5, 5));
        JPanel panelText = new JPanel(new GridLayout(0, 1));
        panelText.add(etiqueta);
        panelText.add(capacidad);
        add(icono, BorderLayout.WEST);
        add(panelText, BorderLayout.CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends MdlDisco> list,
                                                  MdlDisco modeloDisco, int index, boolean isSelected, boolean cellHasFocus) {

        icono.setIcon(new ImageIcon(getClass().getResource(
                RUTA_IMAGENES + modeloDisco.getIcono())));
        etiqueta.setText(modeloDisco.getEtiqueta());
        capacidad.setText(modeloDisco.getCapacidad());
        capacidad.setForeground(Color.blue);

        list.setBackground(Color.decode("#322D3B"));
        list.setForeground(Color.WHITE);

        etiqueta.setOpaque(true);
        capacidad.setOpaque(true);
        icono.setOpaque(true);

        etiqueta.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        capacidad.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        icono.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        capacidad.setForeground(Color.WHITE);
        etiqueta.setForeground(Color.WHITE);
        icono.setForeground(Color.WHITE);

        if (isSelected) {
            etiqueta.setBackground(list.getSelectionBackground());
            capacidad.setBackground(list.getSelectionBackground());
            icono.setBackground(list.getSelectionBackground());
            setBackground(list.getSelectionBackground());
        } else {
            etiqueta.setBackground(list.getBackground());
            capacidad.setBackground(list.getBackground());
            icono.setBackground(list.getBackground());
            setBackground(list.getBackground());
        }
        return this;
    }
}
