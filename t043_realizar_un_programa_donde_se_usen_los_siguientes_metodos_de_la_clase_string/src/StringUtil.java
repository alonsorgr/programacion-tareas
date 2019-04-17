public class StringUtil {

    private String cadena;              // >= 3, no nulo, no vacio

    public StringUtil(String cadena) {
        setCadena(cadena);
    }

    private void setCadena(String cadena) {
        assert cadena != null : "Error: la cadena introducida tiene valor nulo";
        assert cadena.length() >= 3 :
                String.format("Error: La cadena introducida (%s) no es válida, debe tener una longitud >= 3", cadena);
        assert !cadena.isEmpty() : "Error: La cadena no puede estar vacía";
        this.cadena = cadena;
    }

    public char extraerCaracter(int indice) {
        assert indice >= 0 : String.format("Error: El indice introducido (%d) no es válido, debe ser >= 0", indice);
        return cadena.charAt(indice);
    }

    public boolean estaCaracterEnCadena(char caracter) {
        return cadena.indexOf(caracter) >= 0;
    }

    public String extraerCadena(int inicio, int longitud) {
        assert inicio >= 0 : String.format("Error: El inicio introducido (%d) no es válido, debe ser >= 0", inicio);
        assert longitud <= cadena.length() : String.format("Error: La longitud introducida (%d) no es válido, debe ser >= %d", longitud, cadena.length());
        return cadena.substring(inicio,longitud);
    }

    public String enMayusculas() {
        return cadena.toUpperCase();
    }

    public String enMinusculas() {
        return cadena.toLowerCase();
    }

    public boolean longitudMayorQue(String otraCadena) {
        assert otraCadena != null : "Error: la cadena introducida tiene valor nulo";
        assert otraCadena.length() > 0 :
                String.format("Error: La cadena introducida (%s) no es válida, debe tener una longitud >= 0", cadena);
        assert !cadena.isEmpty() : "Error: La cadena no puede estar vacía";
        return (cadena.compareTo(otraCadena) > 0);
    }

    public String charACadena(char c) {
        return String.valueOf(c);
    }

    public boolean esIgual(String otraCadena) {
        assert otraCadena != null : "Error: la cadena introducida tiene valor nulo";
        assert otraCadena.length() > 0 :
                String.format("Error: La cadena introducida (%s) no es válida, debe tener una longitud >= 0", cadena);
        assert !cadena.isEmpty() : "Error: La cadena no puede estar vacía";
        return cadena.equals(otraCadena);
    }

    @Override
    public String toString() {
        return "StringUtil{" +
                "cadena='" + cadena + '\'' +
                '}';
    }
}
