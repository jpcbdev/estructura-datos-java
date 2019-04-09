package app;

import javax.swing.JOptionPane;

public class Cola {
    Cliente primero;
    Cliente ultimo;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
    }

    public void retirarEfectivo(String tar, double mon, byte rec) {
        try {
            Cliente cliente = new Cliente(tar, mon, rec);
            cliente.setSiguiente(null);
            if (this.primero == null) {
                this.primero = cliente;
                this.ultimo = cliente;
            } else {
                this.ultimo.setSiguiente(cliente);
                this.ultimo = this.ultimo.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Se retiro dinero exitosamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al retirar dinero");
        }

    }

    public double mayorRetiro() {
        double mayor = 0;
        if (primero == null) {
            JOptionPane.showMessageDialog(null, "No hay retiros");
        } else {
            Cliente temporal = this.primero;
            while (temporal != null) {
                if (temporal.getMonto() > mayor) {
                    mayor = temporal.getMonto();
                }
                temporal = temporal.getSiguiente();
            }
        }
        return mayor;
    }

    public double menorRetiro() {
        double menor = mayorRetiro();
        if (primero == null) {
            JOptionPane.showMessageDialog(null, "No hay retiros");
        } else {
            Cliente temporal = this.primero;

            while (temporal != null) {
                if (temporal.getMonto() < menor) {
                    menor = temporal.getMonto();
                }
                temporal = temporal.getSiguiente();
            }
        }
        return menor;
    }

    public void conRecibo() {

        if (primero == null) {
            JOptionPane.showMessageDialog(null, "No hay retiros");
        } else {
            Cliente temporal = this.primero;
            String clientes = "";

            while (temporal != null) {
                if (temporal.getRecibo() == 1) {
                    clientes += "Cliente: " + "\nNumero tarjeta: " + temporal.getTargeta() + "\nMonto retirado: "
                            + temporal.getMonto() + "\n";
                }
                temporal = temporal.getSiguiente();
            }
            if (clientes != "") {
                JOptionPane.showMessageDialog(null, clientes);
            }
        }
    }

    public void sinRetiro() {

        if (primero == null) {
            JOptionPane.showMessageDialog(null, "No hay retiros");
        } else {
            Cliente temporal = this.primero;
            String clientes = "";

            while (temporal != null) {
                if (temporal.getMonto() == 0) {
                    clientes += "Cliente: " + "\nNumero tarjeta: " + temporal.getTargeta() + "\nMonto retirado: "
                            + temporal.getMonto() + "\n";
                }
                temporal = temporal.getSiguiente();
            }
            if (clientes != "") {
                JOptionPane.showMessageDialog(null, clientes);
            }
        }

    }

}