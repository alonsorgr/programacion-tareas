package iesdonana.gui;

/**
 * T208-[GUI] EJECUTAR Y OBSERVAR EL EJEMPLO DE CONVERSION DE TEMPERATURA DE [TUTSWINGORA]
 *
 * https://docs.oracle.com/javase/tutorial/uiswing/examples/learn/index.html
 *
 * MODIFICARLO PARA QUE HAGA UNA CONVERSION DE MONEDA DE EUROS A DOLARES
 */
public class Principal {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CelsiusConverterGUI().setVisible(true);
            }
        });
    }
}
