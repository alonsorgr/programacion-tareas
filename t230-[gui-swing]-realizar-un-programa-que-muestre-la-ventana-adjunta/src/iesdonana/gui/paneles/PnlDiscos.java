package iesdonana.gui.paneles;

import iesdonana.gui.modelos.MdlDisco;
import iesdonana.gui.renderizadores.RenDisco;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PnlDiscos extends JPanel {
    private JList<MdlDisco> listaDiscos;

    public PnlDiscos() {
        listaDiscos = iniciarLista();
        setPropiedades();
    }

    private void setPropiedades() {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder());

        JLabel etiqueta = new JLabel("Volúmenes montados");
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        add(etiqueta, BorderLayout.NORTH);
        setBackground(Color.decode("#2C2833"));

        JScrollPane barraDesplazamiento = new JScrollPane(listaDiscos);
        barraDesplazamiento.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        barraDesplazamiento.setPreferredSize(new Dimension(300, 300));
        add(barraDesplazamiento, BorderLayout.CENTER);

        add(etiqueta, BorderLayout.NORTH);
        add(barraDesplazamiento, BorderLayout.CENTER);
        add(new PnlLicencia(), BorderLayout.SOUTH);

    }

    private JList<MdlDisco> iniciarLista() {
        DefaultListModel<MdlDisco> modelo = new DefaultListModel<>();
        File[] discos = File.listRoots();
        if (discos != null && discos.length > 0)
            for (File discosDisponibles : discos)
                modelo.addElement(new MdlDisco(discosDisponibles.toString(),
                        ((discosDisponibles.getFreeSpace() / 1024) / 1024) / 1024 +
                                " GB", "img-hard-drive.png"));
        JList<MdlDisco> lista = new JList<>(modelo);
        lista.setBorder(BorderFactory.createEmptyBorder());
        lista.setCellRenderer(new RenDisco());
        return lista;
    }
}
