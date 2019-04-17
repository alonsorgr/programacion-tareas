
/**
 * Clase Bola - Implementación.
 *
 * @author (Alonso)
 * @version (0.4)
 */
public class Bola
{
   // ATRIBUTOS
   private boolean colocada = false;
   private int numero;                  // {>=1} {autoic} {unique}
   private TipoColor color;             // {Not Null}
   private static int contador = 0;     // {>=0}
   
   // CONSTRUCTOR
   public Bola(TipoColor color)
   {
       incContador();
       setNumero(contador);
       setColor(color);
       colocada= false;
   }
   
   // MUTADORES DE ATRIBUTOS
   public void setColocada(boolean colocada) // Establece si una bola está colocada o no.
   {
        this.colocada = colocada;
   }
   
   public void setNumero(int numero) // Establece un número para la bola.
   {   assert numero >=1 : "Error: el numero de la bola debe ser igual o mayor de 1";
       this.numero = numero;
   }
   
   private void setColor(TipoColor color) // Establece un color para la bola.
   {   assert color != null : "El color de la bola no puede ser nulo";
       this.color = color;
   }
   
   private void incContador() // Incrementa el contador al crear bolas nuevas.
   {
       contador++;
   }
   
   // ACCESORES DE ATRIBUTOS
   public boolean getColocada(){ // Devuelve si una bola está colocada o no.
        return this.colocada;
   }
   
   // OBJECT TO STRING
   public String toString()
   {
       String str = !getColocada()? "colocada" : "sin colocar";
       return "Bola con número: "+numero+" y color "+color+" "+str+" en la urna";
   }
}


