package iesdonana.gui;

import iesdonana.gui.formularios.Ventana;

import javax.swing.*;

/**
 * T228-[GUI] CREAR UN FORMULARIO QUE USE JCOMBOBOX Y JLIST
 *
 * LA LISTA DESPLEGABLE CREADA CON JCOMBOBOX (NO EDITABLE)
 * CONTENDRA VARIOS OBJETOS DE LA CLASE PERSONAJE (ALIAS, ALTURA).
 *
 * CUANDO SE SELECCIONE UN PERSONAJE DEBERAN APARECER EN EL CUADRO DE LISTA (JLIST) TODOS LOS ANIMALES
 * (ID, ALIAS, TIPOANIMAL, COLOR, PESO) QUE PERTENECEN A ESE PERSONAJE.
 *
 * ALIAS ES CLAVE EN PERSONAJE
 * ID ES CLAVE EN ANIMAL
 *
 * SE USARA UN HASHMAP PARA RELACIONAR PERSONAJES Y ANIMALES.
 * LOS MODELOS DE DATOS USADOS PARA LOS CONTROLES DE LISTAS USARAN OBJETOS DE LAS CLASES PERSONAJE Y ANIMAL.
 */
public class Principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana("Principal");
            }
        });
    }
}
