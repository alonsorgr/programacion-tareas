public class Principal {

    public static void main(String[] args) {
        Persona padre = new Persona("ALONSO", 'V');
        Persona madre = new Persona("ANA", 'M');
        Persona hijo = new Persona("ALONSO", 'V');
        Persona conyuge = new Persona("PAULA", 'M');
        Persona amigo = new Persona("JUAN", 'V');

        hijo.setPadre(padre);
        hijo.setMadre(madre);
        hijo.setConyuge(conyuge);
        hijo.setAmigo(amigo);

        System.out.println(hijo);
    }
}
