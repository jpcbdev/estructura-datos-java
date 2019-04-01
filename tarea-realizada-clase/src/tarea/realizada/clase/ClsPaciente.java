package tarea.realizada.clase;

/**
 *
 * @author jpcbdev
 */
public class ClsPaciente {

    private String nombre;
    private String cedula;
    private String sintoma;
    private int pioridad;
    private ClsPaciente siguiente;

    public ClsPaciente(String nombre, String cedula, String sintoma, int pioridad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sintoma = sintoma;
        this.pioridad = pioridad;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public int getPioridad() {
        return pioridad;
    }

    public void setPioridad(int pioridad) {
        this.pioridad = pioridad;
    }

    public ClsPaciente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(ClsPaciente siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Paciente: " + "\nNombre=" + nombre + "\nCedula=" + cedula + "\nSintoma=" + sintoma + "\nPioridad=" + pioridad;
    }

}
