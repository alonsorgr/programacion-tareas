package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JTextField usuario;
    private JTextField sistema;
    private JButton btnUsuario;
    private JButton btnSistema;




    public Ventana(String title) throws HeadlessException {
        super(title);

        usuario = new JTextField(20);
        sistema = new JTextField(20);
        btnUsuario = new JButton("Mostrar nombre de usuario");
        btnSistema = new JButton("Mostrar nombre del sistema operativo");

        // CLASE INTERNA NO ANONIMA
        Receptor receptorUsuario;
        btnUsuario.addActionListener(receptorUsuario = new Receptor());


        // CLASE INTERNA NO ANONIMA
        btnSistema.addActionListener(new Receptor());

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 0;
        gc.fill = GridBagConstraints.WEST;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(btnUsuario, gc);


        gc.gridx = 1;
        gc.gridy = 0;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(usuario, gc);

        gc.weightx = 1;
        gc.weighty = 0.1;

        gc.gridx = 0;
        gc.gridy = 1;
        gc.insets = new Insets(0,0,0,5);
        gc.anchor = GridBagConstraints.LINE_END;
        add(btnSistema, gc);


        gc.gridx = 1;
        gc.gridy = 1;
        gc.insets = new Insets(0,0,0,0);
        gc.anchor = GridBagConstraints.LINE_START;
        add(sistema, gc);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(600, 200));
        setVisible(true);
    }

    private class Receptor implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            JButton boton = (JButton) e.getSource();

            if (boton != null)
                if (boton == btnUsuario)
                    usuario.setText(System.getProperty("user.name"));
                else if (boton == btnSistema)
                    sistema.setText(System.getProperty("os.name"));
                else
                    throw new UnsupportedOperationException();
        }
    }
}
