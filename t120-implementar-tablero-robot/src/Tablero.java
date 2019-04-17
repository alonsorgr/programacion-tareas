import java.util.Arrays;

public class Tablero {
    private Robot[] robots;

    public Tablero(int aforo) {
        robots = new Robot[aforo];
    }

    public boolean colocar(Robot r) {
        assert r != null : "Error: el robot a colocar no puede ser nulo";
        for (int i = 0; i < robots.length; i++) {
            if (robots[i] == null) {
                robots[i] = r;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tablero{" +
                "robots=" + Arrays.toString(robots) +
                '}';
    }
}
