package Agencia;

public class Cliente extends AgenciaViaje {

    public int cantidadPasajeros;
    public int dni;
    public String domicilioCalle;
    public int domicilioNumeracion;
    public String email;
    public String nombre;
    public int numeroTelefono;

    public Cliente(String nombre) {
    }

    public Cliente(String domicilio, String nombre, int numeroTelefonoAgencia, int cantidadPasajeros, int dni, String domicilioCalle, int domicilioNumeracion, String email, String nombre1, int numeroTelefono) {
        super(domicilio, nombre, numeroTelefonoAgencia);
        this.cantidadPasajeros = cantidadPasajeros;
        this.dni = dni;
        this.domicilioCalle = domicilioCalle;
        this.domicilioNumeracion = domicilioNumeracion;
        this.email = email;
        this.nombre = nombre1;
        this.numeroTelefono = numeroTelefono;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilioCalle() {
        return domicilioCalle;
    }

    public void setDomicilioCalle(String domicilioCalle) {
        this.domicilioCalle = domicilioCalle;
    }

    public int getDomicilioNumeracion() {
        return domicilioNumeracion;
    }

    public void setDomicilioNumeracion(int domicilioNumeracion) {
        this.domicilioNumeracion = domicilioNumeracion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    public void cancelarViaje(){
        if (cantidadPasajeros == 0){
            cancelarViaje();
        }
    }
    public void reservarViaje(){
        if(cantidadPasajeros >0){
            reservarViaje();
        }
    }
}
