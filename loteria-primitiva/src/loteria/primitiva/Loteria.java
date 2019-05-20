package loteria.primitiva;

import javax.swing.*;
import java.awt.*;

public class Loteria extends JFrame {

    public Loteria(String title)
            throws HeadlessException {
        super(title);

        setPropiedades();
    }

    private void setPropiedades() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(490, 500));
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
    }
}


