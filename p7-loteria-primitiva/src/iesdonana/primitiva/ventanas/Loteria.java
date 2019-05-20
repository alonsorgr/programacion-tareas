package iesdonana.primitiva.ventanas;

import iesdonana.primitiva.modelos.Combinacion;
import iesdonana.primitiva.renderizadores.IntemCombinacion;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import static iesdonana.primitiva.utiles.Constantes.RUTA_IMAGENES;

public class Loteria extends JFrame {
    private JList<Combinacion> listaCombinaciones;
    private JList<Combinacion> listaPremiados;
    private DefaultListModel modeloBoleto;
    private JButton btnAgregar;
    private JButton btnEliminar;
    private JButton btnComprobar;
    private JButton btnSorteo;

    public Loteria(String title)
            throws HeadlessException {
        super(title);
        setJMenuBar(barraMenu());
        modeloBoleto = new DefaultListModel();
        listaCombinaciones = new JList();
        listaPremiados = new JList();
        listaCombinaciones.setCellRenderer(new IntemCombinacion());
        add(panelLogo(), BorderLayout.NORTH);
        add(panelCombinaciones(), BorderLayout.WEST);
        add(panelPremiados(), BorderLayout.EAST);
        add(panelBotonSorteo(), BorderLayout.SOUTH);
        listaCombinaciones.setModel(modeloBoleto);

        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                generarBoleto();
            }
        });

        btnEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modeloBoleto.removeElement(listaCombinaciones.getSelectedValue());
            }
        });

        btnSorteo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                generarSorteo();
            }
        });
        setPropiedades();
    }

    private void generarBoleto() {
        new Boleto(this);
    }
    private void generarSorteo() {
        String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        new Sorteo(this, String.format("Sorteo para el dia %s", fecha));
    }

    public void agregarCombinacion(Combinacion combinacion) {
        modeloBoleto.addElement(combinacion);
    }

    private void setPropiedades() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(490, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
    }

    private JMenuBar barraMenu() {
        JMenuBar barra = new JMenuBar();
        barra.setPreferredSize(new Dimension(getPreferredSize().width, 25));
        barra.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));
        JMenu menu = new JMenu("Archivo");
        menu.setMnemonic(KeyEvent.VK_A);

        JMenuItem agregarBoleto = new JMenuItem("Agregar boleto");
        agregarBoleto.setMnemonic(KeyEvent.VK_B);

        agregarBoleto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                generarBoleto();
            }
        });
        menu.add(agregarBoleto);
        barra.add(menu);
        return barra;
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

    private JPanel panelCombinaciones() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panelTitulo = new JPanel();
        panelTitulo.setPreferredSize(new Dimension(250, 50));
        Border bordeTitulo = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
        Border margenTitulo = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panelTitulo.setBorder(BorderFactory.createCompoundBorder(margenTitulo, bordeTitulo));
        JLabel titulo = new JLabel("BOLETOS");
        panelTitulo.add(titulo);

        JPanel panelLista = new JPanel(new BorderLayout());
        panelLista.setPreferredSize(new Dimension(250, getPreferredSize().height));
        Border bordeLista = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
        Border margenLista = BorderFactory.createEmptyBorder(0, 10, 5, 10);
        panelLista.setBorder(BorderFactory.createCompoundBorder(margenLista, bordeLista));
        JScrollPane barraDesplazamiento = new JScrollPane(listaCombinaciones);
        barraDesplazamiento.setBorder(BorderFactory.createEmptyBorder());
        panelLista.add(barraDesplazamiento, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBotones.setPreferredSize(new Dimension(250, 32));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        btnAgregar = new JButton();
        btnAgregar.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));
        btnAgregar.setOpaque(false);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + "btn-agregar.png")));
        btnAgregar.setPreferredSize(new Dimension(16, 16));
        panelBotones.add(btnAgregar);

        btnEliminar = new JButton();
        btnEliminar.setOpaque(false);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + "btn-eliminar.png")));
        btnEliminar.setPreferredSize(new Dimension(16, 16));
        btnEliminar.setBorder(BorderFactory.createEmptyBorder());
        panelBotones.add(btnEliminar);

        panel.add(panelTitulo, BorderLayout.NORTH);
        panel.add(panelLista, BorderLayout.CENTER);
        panel.add(panelBotones, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel panelPremiados() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panelTitulo = new JPanel();
        panelTitulo.setPreferredSize(new Dimension(250, 50));
        Border bordeTitulo = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
        Border margenTitulo = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        panelTitulo.setBorder(BorderFactory.createCompoundBorder(margenTitulo, bordeTitulo));
        JLabel titulo = new JLabel("BOLETOS PREMIADOS");
        panelTitulo.add(titulo);

        JPanel panelLista = new JPanel(new BorderLayout());
        panelLista.setPreferredSize(new Dimension(250, getPreferredSize().height));
        Border bordeLista = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
        Border margenLista = BorderFactory.createEmptyBorder(0, 10, 5, 10);
        panelLista.setBorder(BorderFactory.createCompoundBorder(margenLista, bordeLista));
        JScrollPane barraDesplazamiento = new JScrollPane(listaPremiados);
        barraDesplazamiento.setBorder(BorderFactory.createEmptyBorder());
        panelLista.add(barraDesplazamiento, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBotones.setPreferredSize(new Dimension(250, 32));
        panel.add(panelTitulo, BorderLayout.NORTH);
        panel.add(panelLista, BorderLayout.CENTER);
        panel.add(panelBotones, BorderLayout.SOUTH);
        return panel;
    }

    private JPanel panelBotonSorteo() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
        panel.setPreferredSize(new Dimension(getPreferredSize().width, 50));
        btnSorteo = new JButton("Ejecutar sorteo");
        panel.add(btnSorteo);
        return panel;
    }
}
