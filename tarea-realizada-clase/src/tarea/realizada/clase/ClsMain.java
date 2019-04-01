/*
 * #2 Tarea corregida en clase hospital espana
 */
package tarea.realizada.clase;

import javax.swing.JOptionPane;

/**
 *
 * @author jpcbdev
 */
public class ClsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClsCola hospital = new ClsCola();
        int menu = 0;

        try {

            do {
                menu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione: "
                        + "\n1 - Ingreso de pacientes"
                        + "\n2 - Lista de pacientes"
                        + "\n3 - Pacientes en rojo"
                        + "\n4 - Procesar paciente"
                        + "\n5 - Salir"));

                switch (menu) {
                    case 1: {
                        String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente");
                        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cedula del paciente");
                        String sintoma = JOptionPane.showInputDialog(null, "Ingrese el sintoma paciente");
                        int pioridad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la pioridad del paciente: "
                                + "\n1 - Verde"
                                + "\n2 - Amarillo"
                                + "\n3 - Rojo"));
                        if (pioridad > 3 || pioridad < 0) {
                            pioridad = 1;
                        }
                        hospital.insertar(nombre, cedula, sintoma, pioridad);
                        break;
                    }

                    case 2: {
                        hospital.imprimirPacientes();
                        break;
                    }
                    case 3: {
                        hospital.imprimirRojos();
                        break;
                    }
                    case 4: {
                        hospital.procesarPaciente();
                        break;
                    }
                }
            } while (menu > 0 && menu < 5);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }

}
