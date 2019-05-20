package iesdonana.primitiva;

import iesdonana.primitiva.ventanas.Loteria;

import javax.swing.*;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Loteria("Loterías y apuestas del Estado - La Primitiva");
            }
        });
    }
}
