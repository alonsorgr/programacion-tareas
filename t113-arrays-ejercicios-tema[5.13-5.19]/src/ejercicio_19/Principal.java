package ejercicio_19;

public class Principal {
    public static void main(String[] args) {
        String[] nombres = {"ALONSO", "ENRIQUE", "JUANMA", "FLORIDO"};
        float[] pesos = {0.15f, 0.25f, 0.50f, 0.10f};
        Curso curso = new Curso();

        System.out.println();
        System.out.println("ALUMNOS");
        System.out.println();

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("(%d) %s\n", i, nombres[i]);
        }

        System.out.println();
        System.out.println("NOTAS - MEDIA ARITMÉTICA - PONDERADA");
        System.out.println();

        for (int i = 0; i < curso.getNotas().length; i++) {
            for (int j = 0; j < curso.getNotas()[i].length; j++) {
                System.out.printf("Estudiante %d [Nota asignatura %d: %02d] | ",i, j, curso.getNotas()[i][j]);
            }
            System.out.printf("MEDIA ARITMÉTICA: %02f | MEDIA PONDERADA: %02f\n", curso.mediasA()[i], curso.mediasP(pesos)[i]);
        }


        System.out.println();
        System.out.println("ESTUDIANTES CON SUSPENSOS");
        System.out.println();

        for (int i = 0; i < curso.suspensos(0).length; i++) {
            System.out.println("SUSPENSO " + curso.suspensos(0)[i]);
        }

        System.out.println();
        System.out.println("NOTAS DESIGUALES");
        System.out.println();

        int[][] notas = curso.notasDesigual();

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("%02d ",notas[i][j]);
            }
            System.out.println();
        }
    }
}
