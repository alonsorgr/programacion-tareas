package iesdonana.gui;

import javax.swing.*;
import java.awt.*;

public class Ventana_BKP extends JFrame {
    private static final Color COLOR_TEXTO = Color.decode("#706D9F");
    private JPanel panelTitulo;
    private JPanel panelBoton;
    private JLabel etiquetaUsuario;
    private JTextField textoUsuario;
    private JLabel etiquetaClave;
    private JPasswordField textoClave;
    private JCheckBox mostrarClave;
    private JButton botonAcceder;
    private JLabel enlaceCertificado;
    private JLabel enlaceClave;
    private JLabel etiquetaTitulo;
    private JLabel iconoTitulo;


    public Ventana_BKP(String title)
            throws HeadlessException {
        super(title);
        inicializarComponentes();

        JPanel centro = new JPanel();
        centro.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        centro.setLayout(new BoxLayout(centro, BoxLayout.Y_AXIS));
        centro.add(etiquetaUsuario);
        centro.add(textoUsuario);
        centro.add(etiquetaClave);
        centro.add(textoClave);
        centro.add(mostrarClave);


        add(panelTitulo, BorderLayout.NORTH);
        add(centro, BorderLayout.CENTER);
        setPropiedades();
    }

    private void inicializarComponentes() {
        panelTitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        iconoTitulo = new JLabel();
        iconoTitulo.setIcon(new ImageIcon(getClass().getResource("/iesdonana/gui/imagenes/candado.png")));
        iconoTitulo.setBorder(BorderFactory.createEmptyBorder(5,20,0,0));

        etiquetaTitulo = new JLabel("Acceso a Séneca");
        etiquetaTitulo.setBorder(BorderFactory.createEmptyBorder(5,10,0,0));
        etiquetaTitulo.setFont(new Font("Serif", Font.BOLD, 14));
        etiquetaTitulo.setForeground(COLOR_TEXTO);

        panelTitulo.add(iconoTitulo);
        panelTitulo.add(etiquetaTitulo);

        

        etiquetaUsuario = new JLabel("Nombre usuario");
        etiquetaUsuario.setForeground(COLOR_TEXTO);
        etiquetaUsuario.setBorder(BorderFactory.createEmptyBorder(0,0,5,0));
        etiquetaUsuario.setPreferredSize(new Dimension(200, 20));

        textoUsuario = new JTextField(10);
        textoUsuario.setPreferredSize(new Dimension(300, 20));
        textoUsuario.setMaximumSize(new Dimension(590, 20));

        etiquetaClave = new JLabel("Contraseña");
        etiquetaClave.setForeground(COLOR_TEXTO);
        etiquetaClave.setBorder(BorderFactory.createEmptyBorder(0,0,5,0));
        etiquetaClave.setPreferredSize(new Dimension(200, 20));

        textoClave = new JPasswordField();
        textoClave.setPreferredSize(new Dimension(300, 20));
        textoClave.setMaximumSize(new Dimension(590, 20));

        mostrarClave = new JCheckBox("Mostrar contraseña");
        mostrarClave.setForeground(COLOR_TEXTO);
        mostrarClave.setBorder(BorderFactory.createEmptyBorder(5,0,5,0));
        mostrarClave.setPreferredSize(new Dimension(200, 20));


    }

    private void setPropiedades() {
        setBounds(500, 200, 300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 500));
        pack();
        setVisible(true);
    }
}
