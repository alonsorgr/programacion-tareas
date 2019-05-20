package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 * T220-[GUI, GC] ANIDADOS (BORDERLAYOUT, FLOWLAYOUT)
 *
 * REALIZAR UN EJEMPLO EN EL QUE SE USEN ESOS DOS GESTORES DE COLOCACION EN COMPONENTES ANIDADOS
 *
 */
public class Ventana extends JFrame {

    private JButton boton1;
    private JButton boton2;
    private JTextArea areaTexto;

    public Ventana(String title) throws HeadlessException {
        super(title);

        boton1 = new JButton("Saludar");
        boton2 = new JButton("Despedir");
        areaTexto = new JTextArea();

        JPanel panelNorte = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panelCentro = new JPanel(new FlowLayout(FlowLayout.LEFT));


        panelNorte.add(boton1);
        panelNorte.add(boton2);
        panelCentro.add(areaTexto);

        boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append("Hola!!!!\n");
            }
        });

        boton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append("Hasta luego!!!!\n");
            }
        });

        panelCentro.setBorder(BorderFactory.createEtchedBorder());

        add(panelNorte, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);

        setBounds(500, 250, 500, 500);
        setPreferredSize(new Dimension(500, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
