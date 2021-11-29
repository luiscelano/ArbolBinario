package com.mycompany.arbolbinario;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Eduardo Alvarado Celano
 * Carnet: 0900-20-7376
 * Ing. en Sistemas
 */
public class Main {
    
    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "1. Agregar un Nodo\n"
                        +"2. Recorrer el arbol InOrden\n"
                        +"3. Salir\n"
                        +"Elige una opción...", "Árboles Binarios", JOptionPane.QUESTION_MESSAGE));
                switch(opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el número del nodo...","Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del nodo...", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if(!arbolito.isEmpty()) {
                            arbolito.inOrden(arbolito.raiz);
                        } else{
                            JOptionPane.showMessageDialog(null, "El arbol está vacio", "Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Aplicación finalizada!", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta!", "Error", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }while(opcion!=3);
    }
}
