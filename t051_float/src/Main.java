public class Main {

    // Es necesario escribir 0.1F? Si. porque la rvalue es un double y lvalue es float y por ello hay que poner la F
    // para que el complilador sepa de qué tipo es.

    public static void main(String[] args) {
        float a = 0.1F;


        if (a == 0.1)
            System.out.println("SI");
        else
            System.out.println("NO");
    }

    // Muestra que no ya que está comparando una conversion implicita,
    // por lo que uno de los datos pierde precision y ya no son iguales
}
