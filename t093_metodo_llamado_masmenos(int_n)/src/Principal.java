public class Principal {

    // T093-METODO LLAMADO MASMENOS(INT N) QUE DEVUELVA COMO TEXTO LA SERIE: 1+2-3+4-5... DESDE 1 HASTA N

    public static void main(String[] args) {
        System.out.println(masMenos(15));
    }

    private static String masMenos(int n) {

        String cadena = "";

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                if (i ==1) {
                    cadena += i;
                } else {
                    cadena += " - " + i;
                }
            else
                cadena+= " + " + i;
        }

        return cadena;
    }
}
