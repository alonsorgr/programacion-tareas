package com.iesdonana.excepciones;

import java.util.Scanner;

/**
 * T177-[EXCEPCIONES] CONSULTAR EL CÓDIGO DEL MÉTODO NEXT DE LA CLASE SCANNER
 * DE LA API DE JAVA Y VER QUE EXCEPCIONES PUEDE LANZAR Y DESDE DONDE SE LANZAN
 *
 * BUSCANDO EN WWW.DOCJAR.COM = http://www.docjar.com/html/api/java/util/Scanner.java.html
 * USANDO INTELLIJ NAVEGANDO AL CLICAR HASTA EL CÓDIGO FUENTE DE LA API
 * OBSERVANDO LA PILA DE LLAMADAS AL PRODUCIRSE UNA EXCEPCION
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        sc.next();
    }
}
