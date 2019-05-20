package iesdonana.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Casilla extends JButton {
    private Color color;

    public Casilla() {
        this.color = Color.RED;
        setBackground(color);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (color == Color.RED) {
                    setBackground(Color.GREEN);
                    color = Color.GREEN;
                }
                else {
                    setBackground(Color.RED);
                    color = Color.RED;
                }
            }
        });
    }
}
