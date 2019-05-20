package iesdonana.primitiva.componentes;

import javax.swing.*;

public class Casilla extends JCheckBox {

    public Casilla(String text) {
        super(text);
        setVerticalTextPosition(SwingConstants.BOTTOM);
        setHorizontalTextPosition(SwingConstants.CENTER);
    }
}
