
/**
 * Clase Urna - Implementación.
 *
 * @author (Alonso)
 * @version (0.4)
 */
public class Urna
{
    // REFERENCIAS
    private Bola bola1;  // <<R>>
    private Bola bola2;  // <<R>>
    private Bola bola3;  // <<R>>

    // CONSTANTES DE CLASE
    public static final int CAPACIDAD = 3;  

    // CONSTRUCTOR
    public Urna(){}

    // MÉTODOS
    public void agregar(Bola bola) // Agrega una bola a la urna.
    {
        assert bola != null : "Error: La bola ya está en la urna";
        assert !estaLlena(): "Error: La urna está llena";
        assert !bola.getColocada() : "Error: La bola está colocada";
        // assert !estaColocada(bola) : "La bola ya está colocada en esta urna";
        if (bola1 == null)
        {
            bola1=bola;
        } 
        else if (bola2 == null)
        {
            bola2=bola;
        }
        else if (bola3 == null)
        {
            bola3=bola;
        }
        else
        {
            System.err.println("Error: La urna está llena. No se pueden agregar más bolas");
            System.exit(1);
        }
        bola.setColocada(true);
    }

    private boolean estaColocada(Bola bola)
    {
        return bola==bola1 || bola==bola2 || bola==bola3;
    }

    public Bola extraer() // Extrae una bola de la urna.
    {
        assert !estaVacia(): "Error: No hay bolas que extraer";
        int n = (int)((Math.random() * getCapacidad() + 1));
        Bola r = null;
        if (n == 1 && bola1 != null)
        {
            r = bola1;
            bola1=null;
            r.setColocada(false);
            return r;
        }
        else if (n == 2 && bola2 != null)
        {
            r = bola2;
            bola2=null;
            r.setColocada(false);
            return r;
        }
        else if (n == 3 && bola3 != null)
        {
            r = bola3;
            bola3=null;
            r.setColocada(false);
            return r;
        }
        else 
            System.out.println("Error: No es posibble extraer la bola porque la urna está vacía");
        return r;
    }

    public boolean estaVacia() // Comprueba si la urna está vacia.
    {
        return bola1 == null && bola2 == null && bola3 == null;
    }    

    
    

    public boolean estaLlena() // Comprueba si la urna está llena.
    {
        return bola1 != null && bola2 != null && bola3 != null;
    }

    // ACCESORES DE ATRIBUTOS
    public int getCapacidad() // Devuelve la capacidad total de la urna.
    {
        return CAPACIDAD;
    }

    public int numBolas()
    {
        return ((bola1!=null)?1:0) + ((bola2!=null)?2:0) + ((bola1!=null)?3:0);
    }

    public void vaciar()
    {
        assert !estaVacia(): "Error: La urna ya está vacía";
        if (bola1 != null) 
        {
            bola1 = null;
        }
        else
        {
            System.out.println("La bola :"+bola1+" no está en la urna");
        }

        if (bola2 != null) 
        {
            bola2 = null;
        }
        else
        {
            System.out.println("La bola :"+bola2+" no está en la urna");
        }

        if (bola3 != null) 
        {
            bola3 = null;
        }
        else
        {
            System.out.println("La bola :"+bola3+" no está en la urna");
        }
    }

    // OBJECT TO STRING
    public String toString()
    {
        return "Soy una urna con la capacidad de bolas: "+CAPACIDAD;
    }
}
