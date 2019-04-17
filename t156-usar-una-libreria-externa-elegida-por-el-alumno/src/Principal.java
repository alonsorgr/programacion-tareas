import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

/**
 * T156-USAR UNA LIBRERIA EXTERNA ELEGIDA POR EL ALUMNO.
 * REALIZAR UN PROYECTO DE EJEMPLO DONDE SE USEN CLASES DE ESA LIBRERIA
 */

public class Principal {

    public static void main(String[] args) {

        DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();

        Terminal terminal = null;
        try {
            terminal = defaultTerminalFactory.createTerminal();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            terminal.putCharacter('H');
            terminal.putCharacter('O');
            terminal.putCharacter('L');
            terminal.putCharacter('A');
            terminal.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
