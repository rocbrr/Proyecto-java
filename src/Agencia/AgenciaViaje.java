package Agencia;

public class AgenciaViaje {
    protected String domicilio;
    protected String nombre;
    protected int numeroTelefonoAgencia;

    public AgenciaViaje() {
    }

    public AgenciaViaje(String domicilio, String nombre, int numeroTelefonoAgencia) {
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.numeroTelefonoAgencia = numeroTelefonoAgencia;
    }

    public String getDomicilio() {

        return domicilio;
    }

    public void setDomicilio(String domicilio) {

        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public int getNumeroTelefonoAgencia() {

        return numeroTelefonoAgencia;
    }

    public void setNumeroTelefonoAgencia(int numeroTelefonoAgencia) {
        this.numeroTelefonoAgencia = numeroTelefonoAgencia;
    }
    public void crearCliente(){
        System.out.println("Solicitar datos al cliente");
    }
    public void crearViaje(){
        System.out.println("Ingresar datos del paquete de viaje");
    }
    public void realizarVenta () {
        System.out.println("Confirmar pago");
    }
}
