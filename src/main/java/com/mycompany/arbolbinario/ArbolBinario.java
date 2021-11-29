package com.mycompany.arbolbinario;

/**
 *
 * @author Luis Eduardo Alvarado Celano
 * Carnet: 0900-20-7376
 * Ing. en Sistemas
 */
public class ArbolBinario {
    NodoArbol raiz;
    
    public ArbolBinario() {
        this.raiz = null;
    }
    
    //Método para insertar un nodo en el árbol
    public void agregarNodo(int d, String nom) {
        NodoArbol nuevo = new NodoArbol(d, nom);
        if(raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol aux = raiz;
            NodoArbol padre;
            while(true) {
                padre = aux;
                if(d<aux.dato) {
                    aux = aux.hijoIzquierdo;
                    if(aux==null) {
                      padre.hijoIzquierdo = nuevo;  
                      return;
                    }
                } else {
                    aux = aux.hijoDerecho;
                    if(aux==null) {
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    //Metodo para saber cuando el arbol esta vacio
    public boolean isEmpty() {
        return raiz==null;
    }
    
    //Metodo para recorrer el arbol InOrden
    public void inOrden(NodoArbol r) {
        if(r!=null){
            inOrden(r.hijoIzquierdo);
            System.out.println(r.toString());
            inOrden(r.hijoDerecho);
        }
    }
}
