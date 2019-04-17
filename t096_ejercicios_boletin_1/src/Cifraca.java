public class Cifraca {

    private String linea1;
    private String linea2;
    private String linea3;
    private String linea4;
    private String linea5;

    private static final char CUADRADO = 0x25A0;

    public Cifraca(int numero) {
        setCifraca(numero);
    }

    public String getLinea1() {
        return linea1;
    }

    public String getLinea2() {
        return linea2;
    }

    public String getLinea3() {
        return linea3;
    }

    public String getLinea4() {
        return linea4;
    }

    public String getLinea5() {
        return linea5;
    }

    private void setCifraca(int numero) {
        assert numero >= 0 && numero <= 9 :
                String.format("Error: el numero (%d) debe estar en el rango de 0 y 9", numero);
        String c = String.valueOf(CUADRADO);

        switch (numero) {
            case 0:
                linea1 = c + " " + c + " " + c + " " + c;
                linea2 = c + " " + " " + " " + " " + " " + c;
                linea3 = c + " " + " " + " " + " " + " " + c;
                linea4 = c + " " + " " + " " + " " + " " + c;
                linea5 = c + " " + c + " " + c + " " + c;
                break;
            case 1:
                linea1 = " " + c + " " + c + " " + " " + " ";
                linea2 = " " + " " + " " + c + " " + " " + " ";
                linea3 = " " + " " + " " + c + " " + " " + " ";
                linea4 = " " + " " + " " + c + " " + " " + " ";
                linea5 = " " + " " + " " + c + " " + " " + " ";
                break;
            case 2:
                linea1 = c + " " + c + " " + c + " " + c;
                linea2 = " " + " " + " " + " " + " " + " " + c;
                linea3 = c + " " + c + " " + c + " " + c;
                linea4 = c + " " + " " + " " + " " + " " + " ";
                linea5 = c + " " + c + " " + c + " " + c;
                break;
            case 3:
                linea1 = c + " " + c + " " + c + " " + c;
                linea2 = " " + " " + " " + " " + " " + " " + c;
                linea3 = c + " " + c + " " + c + " " + c;
                linea4 = " " + " " + " " + " " + " " + " " + c;
                linea5 = c + " " + c + " " + c + " " + c;
                break;
            case 4:
                linea1 = c + " " + " " + " " + " " + " " + c;
                linea2 = c + " " + " " + " " + " " + " " + c;
                linea3 = c + " " + c + " " + c + " " + c;
                linea4 = " " + " " + " " + " " + " " + " " + c;
                linea5 = " " + " " + " " + " " + " " + " " + c;
                break;
            case 5:
                linea1 = c + " " + c + " " + c + " " + c;
                linea2 = c + " " + " " + " " + " " + " " + " ";
                linea3 = c + " " + c + " " + c + " " + c;
                linea4 = " " + " " + " " + " " + " " + " " + c;
                linea5 = c + " " + c + " " + c+ " " + c;
                break;
            case 6:
                linea1 = c + " " + c + " " + c + " " + c;
                linea2 = c + " " + " " + " " + " " + " " + " ";
                linea3 = c + " " + c + " " + c + " " + c;
                linea4 = c + " " + " " + " " + " " + " " + c;
                linea5 = c + " " + c + " " + c+ " " + c;
                break;
            case 7:
                linea1 = c + " " + c + " " + c + " " + c;
                linea2 = " " + " " + " " + " " + " " + c + " ";
                linea3 = " " + " " + " " + " " + c + " " + " ";
                linea4 = " " + " " + " " + c + " " + " " + " ";
                linea5 = " " + " " + c + " " + " " + " " + " ";
                break;
            case 8:
                linea1 = c + " " + c + " " + c + " " + c;
                linea2 = c + " " + " " + " " + " " + " " + c;
                linea3 = c + " " + c + " " + c + " " + c;
                linea4 = c + " " + " " + " " + " " + " " + c;
                linea5 = c + " " + c + " " + c + " " + c;
                break;
            case 9:
                linea1 = c + " " + c + " " + c + " " + c;
                linea2 = c + " " + " " + " " + " " + " " + c;
                linea3 = c + " " + c + " " + c + " " + c;
                linea4 = " " + " " + " " + " " + " " + " " + c;
                linea5 = c + " " + c + " " + c + " " + c;
                break;
            default:
                assert false : "Error: Cifra no encontrada";
        }
    }


    @Override
    public String toString() {
        return linea1 + "\n" +
               linea2 + "\n" +
               linea3 + "\n" +
               linea4 + "\n" +
               linea5 + "\n";
    }
}
