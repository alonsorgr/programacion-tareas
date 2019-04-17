import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        Matricula[] matriculas = {new Matricula(1, "AAA"),
                                  new Matricula(2, "AAA"),
                                  new Matricula(3, "AAA"),
                                  new Matricula(4, "AAA")};

        for (Coche c: generarCoches(matriculas))
            System.out.println(c);

    }


    private static Coche[] generarCoches(Matricula[] matriculas) {
        assert matriculas != null : "Error: la referencia a matriculas no puede ser nula";
        assert !matriculasConNulo(matriculas) :
                String.format("Error: el array matriculas (%s) contiene nulos", Arrays.toString(matriculas));
        assert !matriculasIguales(matriculas) :
                String.format("Error: el array matriculas (%s) contiene matriculas iguales",
                        Arrays.toString(matriculas));

        Coche[] coches = new Coche[matriculas.length];

        for (int i = 0; i < matriculas.length; i++)
            coches[i] = new Coche(matriculas[i]);

        return coches;
    }

    private static boolean matriculasIguales(Matricula[] matriculas) {
        assert matriculas != null : "Error: el array de entrada no puede ser nulo";

        if (matriculas.length <= 1)
            return false;

        for (int i = 0; i < matriculas.length; i++)
            for (int j = i+1; j < matriculas.length; j++)
                if (matriculas[i].equals(matriculas[j]))
                    return true;

        return false;
    }

    private static boolean matriculasConNulo(Matricula[] matriculas) {
        assert matriculas != null : "Error: el array de entrada no puede ser nulo";

        for (Matricula matricula: matriculas)
            if (matricula == null)
                return true;

        return false;
    }
}
