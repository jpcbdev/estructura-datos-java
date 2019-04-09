package cola.enlazada;

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
            nodo = new NodoDoble (dato);
            this.inicio = nodo;
            this.fin = nodo;
        } else {
            // Se instancia el nodo y se asigna su siguiente
            nodo = new NodoDoble(dato,this.inicio,null);
            
            // Se mueve el puntero de inicio
            this.inicio = nodo;
            
            // Se enlaza el puntero anterior con el inicio
            this.inicio.getSiguiente().setAnterior(this.inicio);
            
        }
    }

    public String imprimirDesdeInicio() {
        String datos = "Recorrido hacia el final: \n";
        if (!this.listaVacia()) {
            NodoDoble nodo = this.inicio;
            while (nodo != null) {
                datos += " > " + nodo.getDato();
                nodo = nodo.getSiguiente();
            }
        }
        return datos;

    }

    public String imprimirDesdeFin() {
        String datos = "Recorrido hacia el inicio: \n";

        if (!this.listaVacia()) {
            NodoDoble nodo = fin;
            while (nodo != null) {
                datos += " > " + nodo.getDato();
                nodo = nodo.getAnterior();
            }
        }
        return datos;

    }
}
