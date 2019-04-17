public class Principal {

    public static void main(String[] args) {

        Alumno a1 = new Alumno("Alonso", 1983);
        a1.setNombre("Alonso");
        a1.setApellido1("García");
        a1.setApellido2("Raposo");
        a1.setPeso(65);
        System.out.println(a1.getNombreCompleto());
        System.out.println(a1.toString());
    }
}
