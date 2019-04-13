package com.mycompany.cola.enlazada;

import javax.swing.JOptionPane;

public class ListaDoble {

    private NodoDoble inicio, fin;

    public ListaDoble() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean listaVacia() {
        boolean vacia = false;
        if (inicio == null && fin == null) {
            vacia = true;
        } else {
            vacia = false;
        }
        return vacia;
    }

    public void agregarAlFinal(int dato) {
        NodoDoble nodo;
        if (listaVacia()) {
            nodo = new NodoDoble(dato);
            this.inicio = nodo;
            this.fin = nodo;
        } else {
            // Inserta el nodo al final
            nodo = new NodoDoble(dato, null, this.fin);
            // Desplaza el puntero            
            this.fin = nodo;
            // Terminamos de enlazar el ultimo nodo
            this.fin.getAnterior().setSiguiente(this.fin);
        }
        JOptionPane.showMessageDialog(null, "Dato insertado");
    }

    public void agregarAlInicio(int dato) {

        NodoDoble nodo;

        if (listaVacia()) {
            nodo = new NodoDoble(dato);
            this.inicio = nodo;
            this.fin = nodo;
        } else {
            // Se instancia el nodo y se asigna su siguiente
            nodo = new NodoDoble(dato, this.inicio, null);

            // Se mueve el puntero de inicio
            this.inicio = nodo;

            // Se enlaza el puntero anterior con el inicio
            this.inicio.getSiguiente().setAnterior(this.inicio);

        }
    }

    public void sacarAlInicio() {
        if (listaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            // Si mas nodos despues de este
            if (this.inicio.getSiguiente() != null) {
                this.inicio = this.inicio.getSiguiente();
                this.inicio.setAnterior(null);
            } else {
                // Quiere decir que es el ultimo
                this.inicio = null;
                this.fin = null;
            }
            JOptionPane.showMessageDialog(null, "El dato en le primer lugar fue extraido correctamente");
        }
    }

    public void sacarAlFinal() {
        if (listaVacia()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        } else {
            // Si mas nodos despues de este
            if (this.fin.getAnterior() != null) {
                this.fin = this.fin.getAnterior();
                this.fin.setSiguiente(null);
            } else {
                // Quiere decir que es el ultimo
                this.inicio = null;
                this.fin = null;
            }
            JOptionPane.showMessageDialog(null, "El dato del final fue extraido correctamente");
        }
    }

    public void sacarEspecifico(int num) {

        if (!listaVacia()) {
            // En caso de que solo haya un nodo con el mismo dato a eliminar
            if (this.inicio == this.fin && this.inicio.getDato() == num) {
                this.inicio = null;
                this.fin = null;
                JOptionPane.showMessageDialog(null, "Dato: " + num + "Eliminado correctamente");
            } else {
                // Si hay mas de un nodo y el dato esta al principio
                if (this.inicio.getDato() == num) {
                    sacarAlInicio();
                }
                // Si hay mas de 1 nodo pero el dato a eliminar no esta en el inicion ni en el final
                else {
                    NodoDoble anterior, temporal;
                    temporal = this.inicio.getSiguiente();
                    anterior = this.inicio;
                    while (temporal != null && temporal.getDato() != num) {
                        anterior = anterior.getSiguiente();
                        temporal = temporal.getSiguiente();
                    }
                    if (temporal != null) {
                        anterior.setSiguiente(temporal.getSiguiente());
                        if (temporal == this.fin) {
                            this.fin = anterior;
                            JOptionPane.showMessageDialog(null, "Dato: " + num + "Eliminado correctamente");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay nodos con este dato");

                    }

                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
    }

    public void imprimirDesdeInicio() {
        if (!this.listaVacia()) {
            String datos = "Recorrido hacia el final: \n";

            NodoDoble nodo = this.inicio;
            while (nodo != null) {
                datos += " > " + nodo.getDato();
                nodo = nodo.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, datos);

        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");

        }

    }

    public void imprimirDesdeFin() {

        if (!this.listaVacia()) {
            String datos = "Recorrido hacia el inicio: \n";
            NodoDoble nodo = fin;
            while (nodo != null) {
                datos += " > " + nodo.getDato();
                nodo = nodo.getAnterior();
            }
            JOptionPane.showMessageDialog(null, datos);

        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacia");

        }

    }
}
