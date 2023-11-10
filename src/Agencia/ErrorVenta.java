package Agencia;

import javax.swing.*;

public class ErrorVenta {

    public boolean sobreventa;

    public ErrorVenta() {
    }

    public ErrorVenta(boolean sobreventa) {
        this.sobreventa = sobreventa;
    }

    public boolean isSobreventa() {
        return sobreventa;
    }

    public void setSobreventa(boolean sobreventa) {
        this.sobreventa = sobreventa;
    }
    public void siDevolverDinero(){
        if (sobreventa = false){
            siDevolverDinero();
        }
    }
    public void siReprogramar(){
        if (sobreventa = true){
            siReprogramar();
        }
    }
}
