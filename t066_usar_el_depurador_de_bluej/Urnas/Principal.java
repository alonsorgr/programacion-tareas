import java.util.Scanner;
/**
 * Clase Urna - Implementación.
 *
 * @author (Alonso)
 * @version (0.4)
 */
public class Principal
{
    private static Urna u;
    private static Bola b;

    private static Urna urna;
    private static Bola bola;

    private static final String OPCIONES = "01234567";
    private static final String COLORES = "AMARILLO, AZUL, BLANCO, NEGRO, ROJO, VERDE";

    public static void main(String[ ] args) 
    {
        menu();
    }
    
    public static void leerBolas(){
        while (!urna.estaLlena()){
            leerBola();
        }
    }
    public static void menu(){
        char opcion = ' ';
        do {
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("0) SALIR");
            System.out.println("1) CREAR URNA");
            System.out.println("2) CREAR BOLA");
            System.out.println("3) AGREGAR UNA BOLA A LA URNA");
            System.out.println("4) AGREGAR VARIAS BOLAS (GENERADAS AUTOMATICAMENTE) A LA URNA");
            System.out.println("5) EXTRAER VARIAS BOLAS DE URNA DE UN COLOR ESPECIFICADO POR EL USUARIO");
            System.out.println("6) VACIAR URNA");
            System.out.println("7) MOSTRAR URNA");
            System.out.println("----");

            // System.out.println("La opcion elegida es: "+opcion);
            opcion = Entrada.leerOpcion(OPCIONES);
            switch (opcion) {
                case '0': 
                    break;
                case '1':
                    urna = new Urna(); 
                    break;
                case '2': 
                    bola = leerBola();
                    break;
                case '3':
                    urna.agregar(bola);
                    System.out.printf("La bola %s fue agregada a la urna %s\n", bola, urna);
                    break;
                case '4':
                    leerBolas();
                    break;
                case '5':
                case '6':
                case '7':
                    
                    break;
                default:
                    System.out.printf("Error: opción inesperada %c. Opciones posibles: %s\n", opcion, OPCIONES);                
                    System.exit(1); 
            }
        } while (opcion != '0');
    }

    private static Bola leerBola(){
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        // color = color.substring(1, color.length()-1);
        TipoColor tc = null;
        do {
            System.out.println("Introduzca el color de la bola que desea crear ("+COLORES+")");
            String color = sc.nextLine();
            // color = "#"+color+"#";
            // correcto = COLORES.indexOf(color) >= 0;
            switch (color){
                case "AMARILLO" :
                tc = TipoColor.AMARILLO;
                break;
                case "AZUL" :
                tc = TipoColor.AZUL;
                break;
                case "BLANCO" :
                tc = TipoColor.BLANCO;
                break;
                case "NEGRO" :
                tc = TipoColor.NEGRO;
                break;
                case "ROJO" :
                tc = TipoColor.ROJO;
                break;
                case "VERDE" :
                tc = TipoColor.VERDE;
                break;
                default: 
                System.out.println("Error");
                break;

            }
        } while(tc==null); 
        return new Bola(tc);
    }

    
    
    
    
    
    
    


}
