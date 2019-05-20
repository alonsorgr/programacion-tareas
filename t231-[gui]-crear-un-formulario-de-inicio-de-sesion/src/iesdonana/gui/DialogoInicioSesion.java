package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DialogoInicioSesion extends JDialog {
    private ICuenta cuenta;
    private JLabel lblUsuario;
    private JTextField txfUsuario;
    private JLabel lblClave;
    private JPasswordField txfClave;
    private JCheckBox chkMostrarClave;
    private JButton btnValidar;
    private JTextArea lblError;

    public DialogoInicioSesion(Frame owner, String title, boolean modal) {
        super(owner, title, modal);
        inicializar();
        chkMostrarClave.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if (itemEvent.getStateChange() == ItemEvent.SELECTED)
                    txfClave.setEchoChar((char) 0);
                else
                    txfClave.setEchoChar('\u2022');
            }
        });
        btnValidar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lblError.setForeground(Color.RED);
                if (!(cuenta.validar(txfUsuario.getText(), txfClave.getText()))) {
                    lblError.setText("La validación del usuario\nno ha sido correcta.\nPor favor, inténtelo de nuevo");
                } else {
                    cerrar();
                }
            }
        });

        add(panelFormulario(), BorderLayout.NORTH);
        add(panelValidacion(), BorderLayout.SOUTH);
        add(panelError(), BorderLayout.CENTER);
        setPropiadades();
    }

    public void setCuenta(ICuenta cuenta) {
        this.cuenta = cuenta;
    }

    private void cerrar() {
        setVisible(false);
        dispose();
    }

    private void inicializar() {
        lblUsuario = new JLabel("Nombre de usuario");
        txfUsuario = new JTextField();
        txfUsuario.setPreferredSize(new Dimension(getPreferredSize().width, 25));

        lblClave = new JLabel("Contraseña");
        txfClave = new JPasswordField();
        txfClave.setPreferredSize(new Dimension(getPreferredSize().width, 25));

        chkMostrarClave = new JCheckBox("Mostrar contraseña");

        btnValidar = new JButton("Iniciar sesión");
        lblError = new JTextArea();
        lblError.setEditable(false);
        lblError.setCursor(null);
        lblError.setOpaque(false);
        lblError.setFocusable(false);
        //lblError.setLineWrap(true);
        lblError.setWrapStyleWord(true);
    }

    private void setPropiadades() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(250,300));
        pack();
        setVisible(false);
    }

    // region GUI

    private JPanel panelFormulario() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(lblUsuario);
        panel.add(txfUsuario);
        panel.add(lblClave);
        panel.add(txfClave);
        panel.add(chkMostrarClave);
        return panel;
    }

    private JPanel panelValidacion() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,5));
        panel.add(btnValidar);
        return panel;
    }

    private JPanel panelError() {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.add(lblError);
        return panel;
    }

    // endregion

}
