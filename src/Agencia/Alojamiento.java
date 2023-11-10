package Agencia;

public class Alojamiento extends PaqueteViaje{

    public int cantidadEstrellas;
    public String checkIn;
    public String checkOut;
    public String nombreHotel;
    public String tipoHabitacion;

    public Alojamiento() {
    }

    public Alojamiento(int cantidadEstrellas, String checkIn, String checkOut, String nombreHotel, String tipoHabitacion) {
        this.cantidadEstrellas = cantidadEstrellas;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.nombreHotel = nombreHotel;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getCantidadEstrellas() {
        return cantidadEstrellas;
    }

    public void setCantidadEstrellas(int cantidadEstrellas) {
        this.cantidadEstrellas = cantidadEstrellas;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public void bienvenida(){
        System.out.println("Bienvenidos a:"+nombreHotel);
    }
}
