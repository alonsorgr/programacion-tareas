package iesdonana.vidswingbe.leccion09;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {
    private PanelTexto areaTexto;
    private BarraHerramientas barraHerramientas;
    private PanelFormulario panelFormulario;

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
