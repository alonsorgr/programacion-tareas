
public class Robot {

    private static final String ORIENTACIONES = "NESO";
    private static final String GENERACIONES = "ABM";
    private static int contador = 0;                        // {AUTOINCREMENTO}
    private int numero;                                     // {>=1}
    private int distancia;                                  // {>=0}
    private char generacion;                                // {A,B,M}
    private char orientacion;                               // {N,E,S,O}
    private String alias;                                   // {NO NULO, NO VACIO, NO MODIFICABLE}

    public Robot(String alias, char generacion) {
        setAlias(alias);
        setGeneracion(generacion);
        setOrientacion(orientacionAleatoria());
        setNumero(++contador);
    }

    private void setNumero(int numero) {
        assert numero >=0 : String.format("Error: El número %d debe ser mayor o igual que cero", numero);
        this.numero = numero;
    }
    private void setDistancia(int distancia) {
        assert distancia >=1 : String.format("Error: El número %d debe ser mayor o igual que uno", distancia);
        this.distancia = distancia;
    }

    private void setGeneracion(char generacion) {
        assert GENERACIONES.indexOf(generacion) >= 0  :
                String.format("Error: Carácter %c no válido. La generación debe ser {%s}", generacion, GENERACIONES);
        this.generacion = generacion;
    }

    private void setOrientacion(char orientacion) {
        assert ORIENTACIONES.indexOf(orientacion) >= 0 :
                String.format("Error: Carácter %c no válido. La orientación debe ser {%s}", orientacion, ORIENTACIONES);
        this.orientacion = orientacion;
    }

    private void setAlias(String alias) {
        assert alias != null : String.format("Error: El alias es alias", alias);
        assert !alias.isEmpty() : "Error: el alias no puede estar vacío";
        this.alias = alias;
    }

    public String codigo() {
        return Character.toString(generacion) + numero;
    }

    public void saludar(String mensaje) {
        System.out.println(String.format("%s, soy un robot y me llamo %s%s", mensaje, codigo(), alias));
    }

    public void girar(){
        setOrientacion(ORIENTACIONES.charAt(
                (ORIENTACIONES.indexOf(orientacion) + 1) % ORIENTACIONES.length()));
    }

    public void avanzar(int distancia) {
        setDistancia(this.distancia += distancia);
    }

    public char  orientacionAleatoria() {
        int numeroAleatorio = (int)(Math.random() * ORIENTACIONES.length());
        return ORIENTACIONES.charAt(numeroAleatorio);
    }

    @Override
    public String toString() {
        return String.format(
                "Hola soy el Robot %s, y estoy orientado al %c, y en mi vida llevo recorrido %d metros en total",
                alias, orientacion, distancia);
    }
}
