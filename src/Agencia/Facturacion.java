package Agencia;

public class Facturacion extends Cliente {

    public String metodoPago;
    public double montoTotal;

    public Facturacion(String nombre) {
        super(nombre);
    }

    public Facturacion(String nombre, String metodoPago, double montoTotal) {
        super(nombre);
        this.metodoPago = metodoPago;
        this.montoTotal = montoTotal;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    public void generarRecibo(){
        if (metodoPago == "tarjeta de credito"){
            generarRecibo();
        }else if (metodoPago == "efectivo"){
            procesarPago();
        }
    }
    public void procesarPago(){
        System.out.println("Pago realizado con éxito");
    }
}
