package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Ventana extends JFrame {
    public static final String RUTA_IMAGENES = "/recursos/";
    private JDialog registro;
    private JLabel imagen;

    public Ventana(String title)
            throws HeadlessException {
        super(title);
        inicializar();
        registro = new DialogoInicioSesion(this, "Iniciar sesión", true);
        ((DialogoInicioSesion) registro).setCuenta(new ICuenta() {
            @Override
            public boolean validar(String usuario, String clave) {
                String usu = "alonso";
                String pas = "250583";
                return (usu.equals(usuario) && pas.equals(clave));
            }
        });
        setJMenuBar(menu());
        setPropiadades();
    }

    private void inicializar() {
        imagen = new JLabel();
        imagen.setIcon(new ImageIcon(getClass().getResource(RUTA_IMAGENES + "marca.png")));
        add(imagen, BorderLayout.CENTER);
    }

    private void setPropiadades() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setPreferredSize(new Dimension(200,250));
        pack();
        setVisible(true);
    }

    private void abrirDialogo() {
        registro.setVisible(true);
    }

    private JMenuBar menu() {
        JMenuBar barra = new JMenuBar();
        JMenu menu = new JMenu("Archivo");
        menu.setMnemonic(KeyEvent.VK_A);
        JMenuItem registro = new JMenuItem("Iniciar sesión");
        registro.setMnemonic(KeyEvent.VK_I);
        JMenuItem salir = new JMenuItem("Salir");
        salir.setMnemonic(KeyEvent.VK_S);

        barra.add(menu);
        menu.add(registro);
        menu.addSeparator();
        menu.add(salir);

        registro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                abrirDialogo();
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(-1);
            }
        });

        return barra;
    }
}
