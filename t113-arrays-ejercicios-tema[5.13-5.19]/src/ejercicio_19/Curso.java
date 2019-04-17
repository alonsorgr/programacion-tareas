package ejercicio_19;

public class Curso {
    private static String[] nombres;
    private static final int MAXESTUDIANTES = 5;
    private static final int MAXASIGNATURAS = 3;
    private Estudiante[] estudiantes;
    private int[][] notas;

    static {
        nombres = new String[] {"ALONSO", "ENRIQUE", "JUANMA", "FLORIDO"};
    }

    public Curso() {
        inicializarEstudiantes(nombres);
        inicializarNotas();
    }

    private void inicializarEstudiantes(String[] nombres) {
        assert nombres != null : "Error: el array de nombres no puede ser nulo";
        assert nombres.length > 0 : "Error: el array no contiene ningun nombre";
        assert nombres.length <= MAXESTUDIANTES :
                String.format("Error: el maximo de estudiantes es (%d). Introducido: (%d)",
                        MAXESTUDIANTES, nombres.length);
        estudiantes = new Estudiante[nombres.length];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante(nombres[i]);
        }
    }

    private void inicializarNotas() {
        notas = new int[estudiantes.length][MAXASIGNATURAS];
        for (int i = 0; i < notas.length; i++)
            for (int j = 0; j < notas[i].length; j++)
                notas[i][j] = (int) (Math.random() * 13 - 2);
    }

    public int[][] getNotas() {
        return notas;
    }

    public float[] mediasA() {
        float[] medias = new float[notas.length];
        float nota = 0.0f;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++)
                nota = media(notas[i]);
            medias[i] = nota;
        }
        return medias;
    }

    public float media(int[] numeros) {
        assert numeros != null : "Error: el array de entrada no puede ser nulo";
        assert numeros.length >= 2 :
                String.format("Error: (%d) para hacer la media hacen falta dos valores como mínimo", numeros.length);

        float resultado = 0.0f;
        int contador = 0;

        for (int i = 0; i < numeros.length; i++)
            if (numeros[i] >= 0)
                resultado += numeros[i];
            else {
                resultado += 0;
                contador++;
            }

        return resultado / (numeros.length - contador);
    }

    public float[] mediasP(float[] pesos) {
        assert pesos != null : "Error: el array de entrada no puede ser nulo";

        if (pesos.length == 0)
            return new float[0];

        float[] medias = new float[notas.length];
        float nota = 0.0f;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++)
                nota = mediaPonderada(pesos, notas[j]);

            medias[i] = nota;
        }
        return medias;
    }

    private float mediaPonderada(float[] pesos, int[] numeros) {
        assert pesos != null : "Error: El array de entrada no puede ser nulo";
        assert numeros != null : "Error: El array de entrada no puede ser nulo";
        assert pesos.length == numeros.length :
                String.format("Error: longitud diferente {numeros = %d} {pesos = %d}", numeros.length, pesos.length);

        int longitud = numeros.length;

        float sumaPesos = 0;
        int sumaNumeros = 0;

        for (int i = 0; i <= longitud - 1; i++) {
            sumaPesos += numeros[i] * pesos[i];
            sumaNumeros += numeros[i];
        }

        return sumaPesos / sumaNumeros;
    }

    public Estudiante[] suspensos(int veces) {

        int contador = 0;
        for (int i = 0; i < notas.length; i++)
            if (sus(notas[i], veces))
                contador++;

        Estudiante[] suspendidos = new Estudiante[contador];

        for (int i = 0, j = 0; i < notas.length; i++)
            if (sus(notas[i], veces)) {
                suspendidos[j] = estudiantes[i];
                j++;
            }

        return suspendidos;
    }

    private boolean sus(int[] notas, int x) {
        assert notas != null : "Error: el array notas no puede ser nulo";

        if (notas.length == 0)
            return false;

        boolean correcto = false;
        int contador = 0;

        for (int i = 0; i < notas.length; i++)
            if (notas[i] < 5)
                contador++;

        if (contador >= x)
            for (int i = 0; i < notas.length; i++)
                if (notas[i] < 5)
                    correcto = true;

        return correcto;
    }

    public int[][] notasDesigual() {
        int[][] desiguales = new int[estudiantes.length][];

        for (int i = 0; i < desiguales.length; i++)
            desiguales[i] = matriculados(notas[i]);

        return desiguales;
    }

    private int[] matriculados(int[] notas) {
        assert notas != null : "Error: el array notas no puede ser nulo";

        if (notas.length == 0)
            return new int[0];

        int contador = 0;

        for (int i = 0; i < notas.length; i++)
            if (notas[i] >= 0)
                contador++;

        int[] resultado = new int[contador];

        for (int i = 0 , j = 0; i < notas.length; i++)
            if (notas[i] >= 0) {
                resultado[j] = notas[i];
                j++;
            }

        return resultado;
    }
}
