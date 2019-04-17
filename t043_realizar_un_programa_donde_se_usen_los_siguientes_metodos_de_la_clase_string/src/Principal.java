public class Principal {

    public static void main(String[] args) {
	    StringUtil su = new StringUtil("Alo");
        System.out.println(su.extraerCaracter(0));
        System.out.println(su.estaCaracterEnCadena('A'));
        System.out.println(su.extraerCadena(0,3));
        System.out.println(su.charACadena('A'));
        System.out.println(su.esIgual("Alonso"));
        System.out.println(su.enMayusculas());
        System.out.println(su.enMinusculas());


        /*compareTo de String compara las cadenas por su longitud
        la resta: this.length() - otraCadena.length()
        Si la resta es devuelve un entero positivo es que la cadena (this) es mayor, si es igual o menor, la resta
        devolverá un entero negativo o 0.
        Menor longitud (precede)
        Mayor longitud (sucede)*/
        System.out.println(su.longitudMayorQue("Alons"));
    }
}
