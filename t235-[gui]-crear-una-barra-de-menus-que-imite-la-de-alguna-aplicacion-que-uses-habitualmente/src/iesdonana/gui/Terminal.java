package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Terminal extends JFrame {

    public Terminal(String title)
            throws HeadlessException {
        super(title);
        JTextArea texto = new JTextArea();
        texto.append("alonso@calse ~ $ ");
        add(texto, BorderLayout.CENTER);
        setPropiedades();
    }

    private void setPropiedades() {
        setJMenuBar(barraMenu());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(600, 400));
        pack();
        setVisible(true);
    }

    // setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.SHIFT_MASK));

    private JMenuBar barraMenu() {
        JMenuBar barra = new JMenuBar();
        barra.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        JMenu archivo = new JMenu("Archivo");
        archivo.setToolTipText("Menú de opciones generales");
        barra.add(archivo);
        archivo.setMnemonic(KeyEvent.VK_A);

        JMenuItem pestanaNueva = new JMenuItem("Pestaña nueva");
        JMenuItem ventanaNueva = new JMenuItem("Ventana nueva");
        pestanaNueva.setMnemonic(KeyEvent.VK_P);
        ventanaNueva.setMnemonic(KeyEvent.VK_N);
        archivo.add(pestanaNueva);
        archivo.add(ventanaNueva);
        archivo.addSeparator();
        JMenuItem cerrarPestana = new JMenuItem("Cerrar pestaña");
        JMenuItem cerrarVentana = new JMenuItem("Cerrar ventana");
        cerrarPestana.setMnemonic(KeyEvent.VK_E);
        cerrarVentana.setMnemonic(KeyEvent.VK_V);
        cerrarPestana.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, KeyEvent.SHIFT_MASK));
        cerrarVentana.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.SHIFT_MASK));
        archivo.add(cerrarPestana);
        archivo.add(cerrarVentana);

        JMenu editar = new JMenu("Editar");
        editar.setToolTipText("Menú editar");
        editar.setMnemonic(KeyEvent.VK_E);
        barra.add(editar);

        JMenuItem copiar = new JMenuItem("Copiar");
        copiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
        editar.add(copiar);
        JMenuItem copiarHtml = new JMenuItem("Copiar como HTML");
        editar.add(copiarHtml);
        JMenuItem pegar = new JMenuItem("Pegar");
        pegar.setMnemonic(KeyEvent.VK_P);
        pegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
        editar.add(pegar);
        editar.addSeparator();
        JMenuItem seleccionarTodo = new JMenuItem("Seleccionar todo");
        seleccionarTodo.setMnemonic(KeyEvent.VK_T);
        editar.add(seleccionarTodo);
        editar.addSeparator();
        JMenuItem preferencias = new JMenuItem("Preferencias");
        preferencias.setMnemonic(KeyEvent.VK_R);
        editar.add(preferencias);

        JMenu ver = new JMenu("Ver");
        ver.setToolTipText("Menú ver");
        ver.setMnemonic(KeyEvent.VK_V);
        barra.add(ver);

        JCheckBoxMenuItem mostrarMenu = new JCheckBoxMenuItem("Mostrar Menú");
        mostrarMenu.setMnemonic(KeyEvent.VK_M);
        ver.add(mostrarMenu);
        JCheckBoxMenuItem pantallaCompleta = new JCheckBoxMenuItem("Pantalla completa");
        pantallaCompleta.setMnemonic(KeyEvent.VK_C);
        pantallaCompleta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, KeyEvent.CTRL_MASK));
        ver.add(pantallaCompleta);
        ver.addSeparator();
        JMenuItem ampliar = new JMenuItem("Ampliar");
        ampliar.setMnemonic(KeyEvent.VK_A);
        ampliar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, KeyEvent.CTRL_MASK));
        ver.add(ampliar);
        JMenuItem normal = new JMenuItem("Tamaño normal");
        normal.setMnemonic(KeyEvent.VK_N);
        normal.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, KeyEvent.CTRL_MASK));
        ver.add(normal);
        JMenuItem reducir = new JMenuItem("Reducir");
        reducir.setMnemonic(KeyEvent.VK_R);
        reducir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, KeyEvent.CTRL_MASK));
        ver.add(reducir);

        JMenu buscar = new JMenu("Buscar");
        buscar.setToolTipText("Busque en la aplicación");
        buscar.setMnemonic(KeyEvent.VK_B);
        barra.add(buscar);

        JMenuItem buscarItem = new JMenuItem("Buscar...");
        buscarItem.setMnemonic(KeyEvent.VK_B);
        buscarItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_MASK));
        buscar.add(buscarItem);

        JMenuItem buscarSiguiente = new JMenuItem("Buscar siguiente");
        buscarSiguiente.setMnemonic(KeyEvent.VK_B);
        buscarSiguiente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
        buscar.add(buscarSiguiente);

        JMenuItem buscarAnterior = new JMenuItem("Buscar anterior");
        buscarAnterior.setMnemonic(KeyEvent.VK_B);
        buscarAnterior.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
        buscar.add(buscarAnterior);

        JMenuItem quitarResaltado = new JMenuItem("Quitar resaltado");
        quitarResaltado.setMnemonic(KeyEvent.VK_Q);
        quitarResaltado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, KeyEvent.CTRL_MASK));
        buscar.add(quitarResaltado);

        JMenu terminal = new JMenu("Terminal");
        terminal.setToolTipText("Opciones de la terminal");
        terminal.setMnemonic(KeyEvent.VK_T);
        barra.add(terminal);

        JMenu ayuda = new JMenu("Ayuda");
        ayuda.setToolTipText("Ayuda para el usuario");
        ayuda.setMnemonic(KeyEvent.VK_H);
        barra.add(ayuda);

        JMenuItem contenido = new JMenuItem("Ver contenido");
        ayuda.add(contenido);
        JMenuItem acerca = new JMenuItem("Acerca de");
        ayuda.add(acerca);
        return barra;
    }
}
