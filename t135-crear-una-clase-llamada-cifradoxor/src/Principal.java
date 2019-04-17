public class Principal {

    public static void main(String[] args) {
        CifradoXOR cifradoCadena = new CifradoXOR("CIFRADO CON CONTRASEÑA CADENA");
        System.out.println(cifradoCadena);
        cifradoCadena.cifrarado("Paco");
        System.out.println(cifradoCadena);
        cifradoCadena.cifrarado("Paco");
        System.out.println(cifradoCadena);


        System.out.println();

        CifradoXOR cifradoEntero = new CifradoXOR("CIFRADO CON CONTRASEÑA DE ENTEROS");
        System.out.println(cifradoEntero);
        cifradoEntero.cifrarado(-10);
        System.out.println(cifradoEntero);
        cifradoEntero.cifrarado(-10);
        System.out.println(cifradoEntero);

        // System.out.println('A' ^ 'A');
    }
}
