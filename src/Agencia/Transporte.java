package Agencia;

public class Transporte extends PaqueteViaje{

    public String tipoDeTransporte;

    public Transporte() {
    }

    public Transporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }
    public void siAutobus(){
        if (tipoDeTransporte =="Autobus"){
            siAutobus();
        }
    }
    public void siAvion(){
        if (tipoDeTransporte == "Avion"){
            siAvion();
        }
    }
}
