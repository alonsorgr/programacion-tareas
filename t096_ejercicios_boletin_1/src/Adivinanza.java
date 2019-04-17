import java.util.Scanner;

public class Adivinanza {

    private int minNum;       // El minimo no puede ser mayor al maximo
    private int maxNum;       // El maximo no pùede ser mayor que el minimo

    private int numero;
    private int intentos;           // >=1

    public Adivinanza(int minNum, int maxNum,int intentos) {
        this.minNum = minNum;
        setMaxNum(maxNum);
        numero = (int) ((Math.random() * this.maxNum) + this.minNum);
        setIntentos(intentos);
    }

    private void setMaxNum(int maxNum) {
        assert maxNum > minNum : "Error: el maximo debe ser mayor al mínimo";
        this.maxNum = maxNum;
    }

    private void setIntentos(int intentos) {
        assert intentos >= 1 : String.format("Error: los intentos deben ser mayor o igual a (%d)", intentos);
        this.intentos = intentos;
    }

    private int leerNumero() {
        System.out.printf("Seleccione un numero entre %d y %d: ", minNum, maxNum);
        return new Scanner(System.in).nextInt();
    }

    public void jugar() {

        boolean correcto = false;
        int contador = 0;
        int max = intentos;

        do {
            int num = leerNumero();
            if (contador == intentos -1) {
                System.out.printf("HAS PERDIDO TODAS LAS OPORTUNIDADES\nFIN\nSOLUCIÓN: (%d)", numero);
                break;
            } else {

                if (num == numero) {
                    System.out.println("¡LO ADIVINASTE!");
                    correcto = true;
                } else {
                    --max;
                    String pista = numero >= num ? "es mayor" : "es menor";
                    System.out.printf("RESPUESTA INCORRECTA\nEl número %s - Le quedan (%d) oportunidades", pista, max);
                    contador++;
                }
            }

        } while (!correcto);
    }
}

