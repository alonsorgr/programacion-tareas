public class Principal {

    public static void main(String[] args) {
        char[] caracteres1 = {'A', 'B','C', 'D', 'E'};
        char[] caracteres2 = {'A', 'B','C', 'D', 'E', 'F'};
        //System.out.println(buscarDicotomica(caracteres1,'W'));
        System.out.println(buscarDicotomica(caracteres1,'A'));
        //System.out.println(buscarDicotomica(caracteres2,'G'));
        //System.out.println(buscarDicotomica(caracteres2,'D'));
    }

    private static boolean buscarDicotomica(char[] caracteres, char valorBuscado) {
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = caracteres.length -1;
        int mitad = 0;
        while (izquierda<=derecha && !encontrado)
        {
            mitad = (izquierda + derecha) / 2;
            if (caracteres[mitad] == valorBuscado)
                encontrado = true;
            else if (caracteres[mitad] > valorBuscado)
                derecha = mitad - 1;
            else
                izquierda = mitad + 1;
        }
        return encontrado;
    }

}
