/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinical;


import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 */

public class ArbolBB {

    private Nodo raiz;
    int num_nodos;
    int alt;

    public ArbolBB() {
        raiz = null;
    }

    public boolean agregar(int dato) {
        Nodo nuevo = new Nodo(dato, null, null);  // dato, Nodo izquierdo, Nodo derecho
        insertar(nuevo, raiz); // Primer dato ingresado, funciona como la raiz
        return true;
    }

    
    
    //Metodo para insertar un dato en el arbol
    public void insertar(Nodo nuevo, Nodo pivote) {
        if (this.raiz == null) { // No hay raiz
            raiz = nuevo; // El dato ingresado se convierte en la raiz
        } else {
            if (nuevo.getDato() <= pivote.getDato()) { // se compara entre el valor de nuevo
                if (pivote.getIzq() == null) {  //Si el pivote no tiene otro nodo
                    pivote.setIzq(nuevo); // Se inserta el nodo nuevo a la izq
                } else {
                    insertar(nuevo, pivote.getIzq()); //LLamada recursiva que vuelve a hacer el 
                }                                       // movimiento del nodo en la izq
            } else {
                if (pivote.getDer() == null) { // se compara el dato de la derecha
                    pivote.setDer(nuevo);       // si esta vacio se declara
                } else {
                    insertar(nuevo, pivote.getDer()); // LLamada recursiva para agregar en la derecha
                }
            }
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    
    
    //Recorrido preorden
    public LinkedList preOrden() {
        LinkedList rec = new LinkedList();  // Linked list (lista enlazada) nos ayuda a guardar los ratos del arbol
        preorden(raiz, rec); //Nodo inicial y la lista donde se guardara.
        return rec;
    }

    public void preorden(Nodo aux, LinkedList recorrido) { 
        if (aux != null) { // si el aux es diferente a null,
            recorrido.add(aux.getDato()); // añadira a la lista la raiz
            preorden(aux.getIzq(), recorrido); //Luego izquierda (llamada recursiva)
            preorden(aux.getDer(), recorrido); //luego derecha (llamada recursiva)
        }
    }
    
    
    
    

    //Recorrido inorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList inOrden() {
        LinkedList rec = new LinkedList();
        inorden(raiz, rec);
        return rec;
    }

    public void inorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            inorden(aux.getIzq(), recorrido); //Inicia en la izquierda
            recorrido.add(aux.getDato()); // luego la raiz
            inorden(aux.getDer(), recorrido); // luego la derecha
        }
    }

    //Recorrido postorden, recibe el nodo a empezar (raiz) y una linkedlist para ir guardando el recorrido
    public LinkedList postOrden() {
        LinkedList rec = new LinkedList();
        postorden(raiz, rec);
        return rec;
    }

    public void postorden(Nodo aux, LinkedList recorrido) {
        if (aux != null) {
            postorden(aux.getIzq(), recorrido); // Primero izquierda
            postorden(aux.getDer(), recorrido); // luego derecha
            recorrido.add(aux.getDato()); //final raiz
        }
    }
    
    
    

    //Metodo para verificar si hay un nodo en el arbol
    public boolean existe(int dato) {
        Nodo aux = raiz;
        while (aux != null) {
            if (dato == aux.getDato()) {
                return true;
            } else if (dato > aux.getDato()) {
                aux = aux.getDer();
            } else {
                aux = aux.getIzq();
            }
        }
        return false;
    }
    
 

    private void altura(Nodo aux, int nivel) {
        if (aux != null) {
            altura(aux.getIzq(), nivel + 1);
            alt = nivel;
            altura(aux.getDer(), nivel + 1);
        }
    }

    //Devuleve la altura del arbol
    public int getAltura() {
        altura(raiz, 1);
        return alt;
    }

    public JPanel getdibujo() {
        return new Arbol_Rep_Grafica(this);
    }
    
}



