package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.URL;

public class Ventana extends JFrame {
    private JTextField textoRecurso;
    private JTextField textoDestino;
    private JButton botonPegar;
    private JButton botonDestino;
    private JButton botonDescargar;
    private JProgressBar barraProgreso;

    {
        textoRecurso = new JTextField();
        textoRecurso.setPreferredSize(new Dimension(400, 26));
        textoDestino = new JTextField();
        textoDestino.setPreferredSize(new Dimension(400, 26));
        botonPegar = new JButton("Pegar enlace");
        botonDestino = new JButton("...");
        botonDescargar = new JButton("Descargar");
        barraProgreso = new JProgressBar();
        barraProgreso.setPreferredSize(new Dimension(400, 26));
    }

    public Ventana(String title)
            throws HeadlessException {
        super(title);
        add(panelSuperior(), BorderLayout.NORTH);
        botonPegar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pegar();
            }
        });

        botonDestino.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                guardar();
            }
        });

        botonDescargar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    descargar(textoRecurso.getText(), textoDestino.getText());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        add(panelCentral(), BorderLayout.CENTER);
        add(panelInferior(), BorderLayout.SOUTH);
        setPropiedades();
    }

    private void setPropiedades() {
        setBounds(500, 200, 540, 140);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(540, 140));
        pack();
        setVisible(true);
    }

    private JPanel panelSuperior() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(textoRecurso);
        panel.add(botonPegar);
        return panel;
    }

    private JPanel panelCentral() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(textoDestino);
        panel.add(botonDestino);
        return panel;
    }

    private JPanel panelInferior() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(barraProgreso);
        panel.add(botonDescargar);
        return panel;
    }

    private void guardar() {
        JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory(new File(destino));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            textoDestino.setText(chooser.getSelectedFile().toString());
        }
    }

    private void descargar(String recurso, String destino)
            throws IOException {

        if (recurso == null)
            throw new NullPointerException("Error: el recurso no puede ser nulo");

        URL url = new URL(recurso);

        InputStream stream = url.openStream();
        BufferedInputStream entrada = new BufferedInputStream(stream);
        BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream(destino));

        byte[] bytes = new byte[1024];

        int contador;

        for (int i = 0; ((contador = entrada.read(bytes)) > 0); i++) {
            salida.write(bytes, 0, contador);
            barraProgreso.setValue(i * 10);
        }
    }

    private void pegar() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        DataFlavor flavor = DataFlavor.stringFlavor;
        if (clipboard.isDataFlavorAvailable(flavor)) {
            try {
                textoRecurso.setText((String) clipboard.getData(flavor));
            } catch (UnsupportedFlavorException | IOException e) {
                System.err.println(e);
            }
        }
    }
}
