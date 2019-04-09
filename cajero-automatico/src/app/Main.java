package app;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        Cola cajero = new Cola();

        try {

            int menu = 0;

            do {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opcion: "

                        + "\n1 - Retirar efectivo" + "\n2 - Ver el mayor retiro de dinero"
                        + "\n3 - Ver menor retiro de dinero" + "\n4 - Lista de retiro con recibo"
                        + "\n5 - Lista de clientes que no retiraron efectivo" + "\n6 - Salir"

                ));
                switch (menu) {
                case 1: {
                    String tarjeta = JOptionPane.showInputDialog(null, "Ingrese el numero de tarjeta");
                    double monto = Double
                            .parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto que desea retirar"));
                    byte recibo = Byte.parseByte(JOptionPane.showInputDialog(null, "0: Sin recibo, 1: Con recibo"));

                    if (recibo != 0 && recibo != 1) {
                        recibo = 0;
                    }
                    cajero.retirarEfectivo(tarjeta, monto, recibo);
                    break;
                }
                case 2: {
                    if (cajero.mayorRetiro() > 0) {
                        JOptionPane.showMessageDialog(null,
                                "El mayor retiro de dinero fue de : " + cajero.mayorRetiro());
                    }
                    break;
                }

                case 3: {
                    if (cajero.mayorRetiro() > 0) {
                        JOptionPane.showMessageDialog(null,
                                "El menor retiro de dinero fue de : " + cajero.mayorRetiro());
                    }
                    break;
                }

                case 4: {
                    cajero.conRecibo();
                    break;
                }

                case 5: {
                    cajero.sinRetiro();
                    break;
                }
                }

            } while (menu > 0 && menu < 6);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

}