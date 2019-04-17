public class Principal {

    public static void main(String[] args) {
        System.out.println(esVocal3('B'));
    }

    public static boolean esVocal1(char c){
        c = Character.toUpperCase(c);
        if (c == 'A')
            return true;
        else if (c == 'E')
            return true;
        else if(c == 'I')
            return true;
        else if (c == 'O')
            return true;
        else if (c == 'U')
            return true;
        else
            return false;
    }

    public static boolean esVocal2(char c){
        switch (c) {
            case 'A':
                return true;
            case 'E':
                return true;
            case 'I':
                return true;
            case 'O':
                return true;
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public static boolean esVocal3(char c){
        String vocales = "AEIOU";
        boolean correcto = false;
        for(int i = 0; i <= vocales.length(); i++) {
            return correcto = vocales.indexOf(c) >=0;
        }
        return correcto;
    }
}
