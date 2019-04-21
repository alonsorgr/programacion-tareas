package iesdonana.excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Recibo implements AutoCloseable {
    private List<String> lista;

    public Recibo(String archivo) throws IOException {
        this.lista = lineasFichero(archivo);
    }

    private List<String> lineasFichero(String archivo)
            throws IOException {

        List<String> resultado = new ArrayList<>();
        String linea;

        try (BufferedReader bf = new BufferedReader(new FileReader(archivo))){
            while ((linea = bf.readLine()) != null)
                resultado.add(linea);
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }

        return resultado;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Se está cerrando");
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();

        for (String linea : lista) {
            resultado.append(linea);
            resultado.append(System.lineSeparator());
        }
        return resultado.toString();
    }
}
