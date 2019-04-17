public class Principal {

    /**
     * T101-CREAR UN METODO LLAMADO INVERTIR(...) QUE INVIERTA EL ARRAY DE ENTEROS RECIBIDO COMO PARAMETRO
     * SIN CREAR UNA COPIA DEL ARRAY EN OTRO OBJETO ARRAY. MOSTRAR EL ARRAY SIN INVERTIR E INVERTIDO POR PANTALLA
     */

    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6};
        invertir(numeros);
        for (int e: numeros) {
            System.out.print(e);
        }
    }

    private static void invertir(int[] numeros){
        assert numeros != null : "Error: el array de entrada no puede ser nulo";

        if (numeros.length <=1)
            return;

        for(int i = 0, j = numeros.length-1; i <= j; i++,j--){
            int aux = numeros[i];
            numeros[i]=numeros[j];
            numeros[j]=aux;
        }
    }

}
