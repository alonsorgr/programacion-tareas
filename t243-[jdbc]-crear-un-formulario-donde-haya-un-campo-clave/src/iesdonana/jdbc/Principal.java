package iesdonana.jdbc;

import javax.swing.*;
import java.sql.SQLException;

/**
 * T243-[JDBC] CREAR UN FORMULARIO DONDE HAYA UN CAMPO CLAVE
 *
 * EL USUARIO INTRODUCIRA EL VALOR DEL CAMPO CLAVE Y EL PROGRAMA REALIZARA UNA BUSQUEDA EN UNA TABLA DE UNA BASE DE DATOS.
 *
 * SE RELLENARAN EL RESTO DE CAMPOS DEL FORMULARIO CON LOS DATOS RECIBIDOS DE LA BASE DE DATOS
 *
 * MOSTRAR UNA VENTANA DE DIALOGO INFORMANDO DE ERROR EN EL CASO DE NO ENCONTRAR EL VALOR CLAVE EN LA BASE DE DATOS.
 *
 * CONTROLAR TODAS LAS EXCEPCIONES QUE SE PUEDAN DAR.
 *
 */


public class Principal {

    private static String usuario = "alicia";
    private static String clave = "Conejo$5";
    private static String BD = "zoo";
    private static String parametros = "?verifyServerCertificate=false&useSSL=true";
    private static String url = "jdbc:mysql://vps612579.ovh.net/"+BD; //+parametros;     // +"?useSSL=false" --> no aconsejado

    public static void main(String[] args) {
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana("Principal");
            }
        });*/

        try (BDUtil.conexion(url, usuario, clave)){

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
