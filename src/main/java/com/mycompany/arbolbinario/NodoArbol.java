package com.mycompany.arbolbinario;

/**
 *
 * @author Luis Eduardo Alvarado Celano
 * Carnet: 0900-20-7376
 * Ing. en Sistemas
 */
public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hijoIzquierdo, hijoDerecho;
    
    //Constructor
    public NodoArbol(int d, String nom) {
        this.dato = d;
        this.nombre = nom;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }
    
    @Override
    public String toString() {
        return String.format("%s su dato es %2d", nombre, dato);
    }
}
