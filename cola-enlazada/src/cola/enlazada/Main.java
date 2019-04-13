package com.mycompany.cola.enlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author jpcbdev
 */
public class Main {

    public static void main(String[] args) {

        try {
            ListaDoble lista = new ListaDoble();
            int menu = 0;

            do {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Manejo de lista doble \n Menu de opciones: "
                        + "\n1 - Agregar un valor al final"
                        + "\n2 - Agregar valor al inicio"
                        + "\n3 - Recorrer lista de inicio a fin"
                        + "\n4 - Recorrer lista de fin a inicio"
                        + "\n5 - Sacar dato del inicio"
                        + "\n6 - Sacar dato especifico"
                        + "\n9 - Salir"));
                switch (menu) {
                    case 1: {
                        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dato numerico"));
                        lista.agregarAlFinal(dato);
                        break;
                    }
                    case 2: {
                        int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dato numerico"));
                        lista.agregarAlInicio(dato);
                        break;
                    }
                    case 3: {
                        lista.imprimirDesdeInicio();
                        break;
                    }
                    case 4: {
                        lista.imprimirDesdeFin();
                        break;
                    }
                    case 5: {
                        lista.sacarAlInicio();
                        break;
                    }
                    case 6: {
                        if (!lista.listaVacia()) {
                            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese elnumero que contiene el nodo que desea eliminar"));
                            lista.sacarEspecifico(num);
                        } else {
                            JOptionPane.showMessageDialog(null, "La lista esta vacia");

                        }

                        break;
                    }
                    case 9: {
                        System.exit(0);
                        break;
                    }
                }
            } while (menu > 0 && menu < 9);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

}
































