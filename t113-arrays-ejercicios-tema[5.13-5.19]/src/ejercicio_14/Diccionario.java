package ejercicio_14;

public class Diccionario {
    private static final int MAXPALABRAS = 100;
    private int pos;
    private Palabra[] palabras;

    public Diccionario(int numPalabras) {
        setNumPalabras(numPalabras);
    }

    private void setNumPalabras(int numPalabras) {
        assert numPalabras <= MAXPALABRAS :
                String.format("Error: numero de palabras (%d) incorrecto, el máximo es (%d)",numPalabras, MAXPALABRAS);
        palabras = new Palabra[numPalabras];
    }

    public void agregar(Palabra palabra) {
        assert palabra != null : "Error: el parametro de entrada no puede ser nulo";
        assert !estaRepetida(palabra) : String.format("Error: palabra (%s) repetida", palabra);
        palabras[pos] = palabra;
        ++pos;

    }

    public void eliminar(Palabra palabra) {
        assert palabra != null : "Error: el parametro de entrada no puede ser nulo";

        int posicion = 0;

        for (int i = 0; i < palabras.length; i++)
            if (!esNulo(palabras[i]))
                if (palabras[i].equals(palabra))
                    posicion = i;

        for (int i = posicion; i < palabras.length; i++)
            palabras[i] = palabras[(i + 1) % palabras.length];

        palabras[palabras.length-1] = null;
        pos--;
    }


    public Palabra palabra(int posicion) {
        return palabras[posicion];
    }

    private boolean esNulo(Palabra palabra) {
        return palabra == null;
    }

    private boolean estaRepetida(Palabra palabra) {
        assert palabra != null : "Error: la palabra de entrada no puede ser nula";
        for (int i = 0; i < palabras.length; i++) {
            for (int j = i+1; j < palabras.length; j++) {
                if(!esNulo(palabras[i]))
                    if (palabras[i].equals(palabra))
                        return true;
            }
        }
        return false;
    }

    public void ordenarAscendentemente() {

        int posmin;
        Palabra aux;

        int longitud = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] != null)
                longitud++;
        }
        for (int i = 0; i < longitud - 1; i++) {
            posmin = i;
            for (int j = i + 1; j < longitud; j++)
                if (palabras[i] != null)
                    if (palabras[j].compareTo(palabras[posmin]) < 0)
                        posmin = j;

            aux = palabras[posmin];
            palabras[posmin] = palabras[i];
            palabras[i] = aux;
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < palabras.length; i++) {
            String sep = (i != 0) ? ", " : "";
            resultado += palabras[i] != null ? (sep + palabras[i]) : sep + "vacío";
        }
        return resultado;
    }
}
