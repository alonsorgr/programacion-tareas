package iesdonana.primitiva.componentes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Numero extends JLabel {
    public Numero(String text) {
        super(text);
        //setVerticalTextPosition(SwingConstants.BOTTOM);
        //setHorizontalTextPosition(SwingConstants.CENTER);
        setFont(new Font("Mono", Font.PLAIN, 20));
        Border borde = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
        Border margen = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        setBorder(BorderFactory.createCompoundBorder(margen, borde));
    }
}
