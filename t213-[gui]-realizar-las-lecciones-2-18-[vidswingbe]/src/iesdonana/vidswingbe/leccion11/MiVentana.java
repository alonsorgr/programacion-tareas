package iesdonana.vidswingbe.leccion11;

import iesdonana.vidswingbe.leccion10.BarraHerramientas;
import iesdonana.vidswingbe.leccion10.PanelFormulario;
import iesdonana.vidswingbe.leccion10.PanelTexto;
import iesdonana.vidswingbe.leccion10.ReceptorCadena;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {
    private iesdonana.vidswingbe.leccion10.PanelTexto areaTexto;
    private iesdonana.vidswingbe.leccion10.BarraHerramientas barraHerramientas;
    private iesdonana.vidswingbe.leccion10.PanelFormulario panelFormulario;

    public MiVentana()
            throws HeadlessException {
        super("Ventana");

        // Inecesario, ya que por defecto, JFrame tiene ese gestor de contenido por defecto
        // setLayout(new BorderLayout());

        areaTexto = new PanelTexto();
        barraHerramientas = new BarraHerramientas();
        panelFormulario = new PanelFormulario();

        barraHerramientas.setReceptorCadena(new ReceptorCadena() {
            @Override
            public void textoEmitido(String texto) {
                areaTexto.agregarTexto(texto);
            }
        });


        add(panelFormulario, BorderLayout.WEST);
        add(barraHerramientas, BorderLayout.NORTH);
        add(areaTexto, BorderLayout.CENTER);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
