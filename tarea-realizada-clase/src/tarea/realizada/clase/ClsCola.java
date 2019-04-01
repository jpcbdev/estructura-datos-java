package tarea.realizada.clase;

import javax.swing.JOptionPane;

/**
 *
 * @author jpcbdev
 */
public class ClsCola {

    private ClsPaciente primero, ultimo;

    public ClsCola() {
        this.primero = null;
        this.ultimo = null;
    }

    public void insertar(String nom, String ced, String sint, int pior) {
        ClsPaciente paciente = new ClsPaciente(nom, ced, sint, pior);
        paciente.setSiguiente(null);
        if (primero == null) {
            this.primero = paciente;
            this.ultimo = paciente;
        } else {
            this.ultimo.setSiguiente(paciente);
            this.ultimo = this.ultimo.getSiguiente();
        }

    }

    public void procesarPaciente() {
        if (primero == null) {
            JOptionPane.showMessageDialog(null, "No hay pacientes");
        } else {
            JOptionPane.showMessageDialog(null, "Atendiendo a: \n" + this.primero.toString());
            
        }
    }

    public void imprimirRojos() {
        ClsPaciente paciente = primero;
        String rojo;

        if (primero == null) {
            JOptionPane.showMessageDialog(null, "No hay pacientes");
        } else {
            while (paciente != null) {
                if (paciente.getPioridad() == 3) {
                    rojo = paciente.getNombre()
                            + "\n" + paciente.getCedula()
                            + "\n" + paciente.getSintoma()
                            + "\n" + paciente.getPioridad();
                    JOptionPane.showMessageDialog(null,
                            rojo);
                }
                paciente = paciente.getSiguiente();
            }
        }
    }

    public void imprimirPacientes() {
        ClsPaciente paciente = primero;

        if (primero == null) {
            JOptionPane.showMessageDialog(null, "No hay pacientes");
        } else {
            while (paciente != null) {
                JOptionPane.showMessageDialog(null, paciente.toString());
                paciente = paciente.getSiguiente();
            }
        }
    }
}
