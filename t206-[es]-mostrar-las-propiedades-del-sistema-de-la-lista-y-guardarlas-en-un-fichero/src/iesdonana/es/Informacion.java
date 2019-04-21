package iesdonana.es;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Informacion {
    private Map<String, String> descripciones;

    public Informacion() {
        descripciones = new HashMap<>();
        descripciones.put("path.separator", "Separador de ruta (en UNIX)");
        descripciones.put("user.country", "Pais donde se encuentra el usuario");
        descripciones.put("user.dir", "Dirirectorio del usuario");
        descripciones.put("java.runtime.version", "Versión de la máquina virtual de java");
        descripciones.put("line.separator", " Separador de línea (en UNIX)");
        descripciones.put("java.vm.specification.vendor", " java.vm.specification.vendor ");
        descripciones.put("os.name", "Nombre del sistema operativo");
        descripciones.put("java.library.path", " Lista de rutas para buscar al cargar bibliotecas");
        descripciones.put("os.version", "Versión del sistema operativo");
        descripciones.put("user.home", "Directorio home del usuario");
        descripciones.put("file.encoding", "Codificación de caracteres");
        descripciones.put("java.specification.version", "");
        descripciones.put("user.name", "Nombre de usuario");
        descripciones.put("java.vm.specification.version", "Versión de la especificación de la máquina virtual");
        descripciones.put("java.home", "Directorio de instalación de Java");
        descripciones.put("user.language", "Lenguage utilizado por el usuario en el sistema operativo");
        descripciones.put("java.version", "Versión de Java Runtime Environment");
        descripciones.put("java.vendor", "Proveedor de Java Runtime Environment");
        descripciones.put("file.separator", "Separador de archivos (en UNIX)");
    }

    public List<Propiedad> listaPropiedades() {

        List<Propiedad> propiedades = new ArrayList<>();

        Iterator it = descripciones.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            propiedades.add(new Propiedad(entry.getKey().toString(),
                    System.getProperty(entry.getKey().toString()),
                    entry.getValue().toString()));
        }
        Collections.sort(propiedades);
        return propiedades;
    }

    public void imprimir(String destino)
            throws NullPointerException {

        if (destino == null)
            throw new NullPointerException("Error: el destino no puede ser nulo");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
            for (Propiedad p : listaPropiedades())
                bw.write(p.toString() + "\n");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
