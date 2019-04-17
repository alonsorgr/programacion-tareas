
    /*T060-CREAR UN METODO QUE ESTE SOBRECARGADO
    ¿ES POSIBLE SOBRECARGAR CONSTRUCTORES? INDICA UN EJEMPLO
    CON MISMO NUMERO DE PARAMETROS PERO DISTINTO TIPO
    CON DISTINTO NUMERO DE PARAMETROS*/

public class Animal {

    private String alias;
    private int peso;
    private char sexo;
    private boolean esMamifero;

    public Animal(String alias, int peso) {
        this.alias = alias;
        this.peso = peso;
    }

    public Animal(char sexo, boolean esMamifero) {
        this.sexo = sexo;
        this.esMamifero = esMamifero;
    }

    public Animal(String alias) {
        this.alias = alias;
    }

    public Animal(String alias, char sexo) {
        this.alias = alias;
        this.sexo = sexo;
    }
}
