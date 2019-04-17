public class Principal {

    public static void main(String[] args) {
        // 14 - ADIVINANZA
        /*Adivinanza a = new Adivinanza(1, 10, 3);
        a.jugar();*/

        // 15 - SEMAFORO
        /*Semaforo s = new Semaforo();
        System.out.println(s);
        s.cambiar();
        System.out.println(s);
        s.cambiar();
        System.out.println(s);
        s.cambiar();
        System.out.println(s);
        s.cambiar();*/

        //Cifraca c = new Cifraca(9);
        //System.out.println(c.toString());
        //Numeraco n = new Numeraco(new Cifraca(3), new Cifraca(5), new Cifraca(9));
        Numeraco n = new Numeraco(new Cifraca(9), new Cifraca(2), new Cifraca(3));
        System.out.print(n.toString());

        //primos(3,20);
    }

    private static int contar(String subCadena, String cadena, String maldita) {
        assert subCadena != null : "Error: la subCadena de entrada no puede ser nula";
        assert cadena != null : "Error: la cadena de entrada no puede ser nula";
        assert maldita != null : "Error: la cadena maldita de entrada no puede ser nula";

        if (!(cadena.contains(maldita)))
            return 0;

        if (cadena.length() < subCadena.length())
            return 0;

        int veces = 0;
        String trozo = "";
        String trozoMaldito = "";

        for (int i = 0; i <= cadena.length() - subCadena.length() ; i++) {
            trozoMaldito = cadena.substring(i, i + maldita.length());
            if (maldita.equals(trozoMaldito))
                break;

            trozo = cadena.substring(i, i + subCadena.length());
            if (subCadena.equals(trozo))
                veces++;
        }
        return veces;
    }

    private static boolean esPrimo(int n) {
        return n % 2 != 0;
    }

    private static void primos(int a, int b) {
        for (int i = a; i <= b ; i++) {
            if (esPrimo(i))
                if (i != a)
                    System.out.print("," + i);
                else
                    System.out.print(i);
        }
    }

}
