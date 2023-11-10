import Agencia.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AgenciaViaje agencia = new AgenciaViaje("Perú 228, Mendoza", "Belgrano Turismo",24365749 );

                agencia.setNombre("Belgrano Turismo");
                agencia.setNumeroTelefonoAgencia(42365749);
                agencia.setDomicilio("Perú 228, Mendoza");
                Cliente miCliente = new Cliente("Laura Martinez");


                miCliente.setNombre("Laura Martínez");
                miCliente.setCantidadPasajeros(2);
                miCliente.setDni(22564732);
                miCliente.setDomicilioCalle("Bernardo Ortíz");
                miCliente.setDomicilioNumeracion(354);
                miCliente.setEmail("lau.mar@gmail.com");
                miCliente.setNumeroTelefono(4238765);

                PaqueteViaje miPaquete = new PaqueteViaje(15, "2023-12-10", "2023-12-24", true, "México", "Mendoza-Argentina", 70.000);

                miPaquete.setDuracionDias(15);
                miPaquete.setFechaRegreso("2023-12-24");
                miPaquete.setFechaSalida("2023-12-10");
                miPaquete.setIncluirExcursiones(true);
                miPaquete.setLugarDestino("México");
                miPaquete.setLugarOrigen("Mendoza-Argentina");
                miPaquete.setPrecio(70.000);

                Alojamiento miAlojamiento = new Alojamiento(5, "domingo", "domingo", "El mexicano", "suite");

                miAlojamiento.setCantidadEstrellas(5);
                miAlojamiento.setCheckIn("domingo");
                miAlojamiento.setCheckOut("domingo");
                miAlojamiento.setNombreHotel("El mexicano");
                miAlojamiento.setTipoHabitacion("suite");

                Transporte miTransporte = new Transporte("Avion");

                miTransporte.setTipoDeTransporte("Avion");

                Facturacion miFacturacion = new Facturacion("Laura Martínez", "Tarjeta de crédito", 70.000);

                miFacturacion.setMetodoPago("Tarjeta de crédito");
                miFacturacion.setMontoTotal(70.000);

                System.out.println("\nAgencia de viajes:");
                System.out.println(agencia.getNombre());
                System.out.println(agencia.getDomicilio());
                System.out.println("Tel: "+agencia.getNumeroTelefonoAgencia());


                System.out.println("\nDatos del Cliente:");
                System.out.println("Nombre: " + miCliente.getNombre());
                System.out.println("Cantidad de Pasajeros: " + miCliente.getCantidadPasajeros());
                System.out.println("DNI: " + miCliente.getDni());
                System.out.println("Email: " + miCliente.getEmail());

                System.out.println("\nDetalles del Paquete de Viaje:");
                System.out.println("Duración (días): " + miPaquete.getDuracionDias());
                System.out.println("Lugar de Destino: " + miPaquete.getLugarDestino());
                System.out.println("Lugar de Origen: " + miPaquete.getLugarOrigen());
                System.out.println("Precio: $" + miPaquete.getPrecio());

                System.out.println("\nInformación del hospedaje:");
                System.out.println("Nombre del hotel: "+miAlojamiento.getNombreHotel());
                System.out.println(miAlojamiento.getCantidadEstrellas()+" Estrellas");
                System.out.println("Realiza el checkIn el día: "+miAlojamiento.getCheckIn());
                System.out.println("Realiza el checkOut el día: "+miAlojamiento.getCheckOut());
                System.out.println("Tipo de habitación: "+miAlojamiento.getTipoHabitacion());

                System.out.println("\nInformación de la Facturación:");
                System.out.println("Nombre cliente: " +miCliente.getNombre());
                System.out.println("Método de Pago: " + miFacturacion.getMetodoPago());
                System.out.println("Monto Total: $" + miFacturacion.getMontoTotal());

                
            }
        }
