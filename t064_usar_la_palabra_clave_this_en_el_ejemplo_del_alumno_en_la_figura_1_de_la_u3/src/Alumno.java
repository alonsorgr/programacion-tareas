public class Alumno {

    /*
     * ¿QUE OCURRE SI SE REALIZA UNA LLAMADA A OTRO CONSTRUCTOR
     * DESDE UNA SENTENCIA QUE NO SEA LA PRIMERA DEL CODIGO DEL CUERPO DEL CONSTRUCTOR?
    */

    private String alias;
    private String nombre;
    private String ape1;
    private String ape2;

    private int anioNac;


    public Alumno() {
        alias = "";
        nombre = "";
        ape1 = "";
        ape2 = "";
        anioNac=0;
    }

    public Alumno(String alias) {
        this.alias = alias;
    }

    public Alumno(String alias, int anioNac) {
        this.anioNac = anioNac;
        this(alias);
    }

    // Error en tiempo de edición porque el constructor debe ser inicializado en la
    // primera sentencia ya que debe saber el estado de los atributos para inizializar
    // el estado del objeto

    @Override
    public String toString() {
        return "Alumno{" +
                "alias='" + alias + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ape1='" + ape1 + '\'' +
                ", ape2='" + ape2 + '\'' +
                ", anioNac=" + anioNac +
                '}';
    }
}
