package iesdonana.vidswingbe.leccion09;

import javax.swing.*;
import java.awt.*;

public class PanelTexto extends JPanel {
    private JTextArea areaTexto;

    public PanelTexto() {
        areaTexto = new JTextArea();
        // Se establece BorderLayout porque por defecto es un FlowLayout
        setLayout(new BorderLayout());
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
    }

    public void agregarTexto(String texto) {
        areaTexto.append(texto);
    }
}
