package cola.enlazada;

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
                        + "\n5 - Salir"));
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
                        JOptionPane.showMessageDialog(null, lista.imprimirDesdeInicio());
                        break;
                    }
                    case 4: {
                        JOptionPane.showMessageDialog(null, lista.imprimirDesdeFin());
                        break;
                    }
                    case 5: {
                        System.exit(0);
                        break;
                    }
                }
            } while (menu > 0 && menu < 5);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

}
