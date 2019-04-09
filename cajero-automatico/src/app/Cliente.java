package app;

// Nodo con sus datos respectivos datos
public class Cliente {
    String tarjeta;
    double monto;
    byte recibo;
    Cliente siguiente;

    public Cliente(String tar, double mon, byte rec) {
        this.tarjeta = tar;
        this.monto = mon;
        this.recibo = rec;
        this.siguiente = null;
    }

    public void setTargeta(String tar) {
        this.tarjeta = tar;
    }

    public void setMonto(double mon) {
        this.monto = mon;
    }

    public void setRecibo(byte rec) {
        this.recibo = rec;
    }

    public void setSiguiente(Cliente sig) {
        
        this.siguiente = sig;
    }
    
    public String getTargeta() {
        return this.tarjeta;
    }

    public double getMonto() {
        return this.monto;
    }

    public byte getRecibo() {
        return this.recibo;
    }
    
    public Cliente getSiguiente() {
        return this.siguiente;
    }
}