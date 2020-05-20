package lab1;

import java.util.*;
import java.util.Scanner;

public class GestorVuelos implements OperacionesVuelos {

    Vuelo[] vuelos;
    Billete[] billetes;
    int n = 0; // vuelos
    int numBilletes = 0;
    
    public GestorVuelos() {
        vuelos = new Vuelo[10];
        billetes = new Billete[100];

    }

    @Override
	public void crearVuelos() {
        int numVuelo, capacidad;
        double precioOriginal;
        String origen, destino, fechaSalida;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        
        System.out.println("Introduce Número de Vuelo: ");
        numVuelo = sc1.nextInt();
        System.out.println("Introduce origen del Vuelo (p.e. Madrid): ");
        origen = sc2.nextLine();
        System.out.println("Introduce destino del Vuelo (p.e. Barcelona): ");
        destino = sc2.nextLine();
        System.out.println("Introduce horay fecha de salida del vuelo (10:10 01/12/2020): ");
        fechaSalida = sc2.nextLine();
        System.out.println("Introduce capacidad del vuelo (asientos libres): ");
        capacidad = sc1.nextInt();
        System.out.println("Introduce el precio original del vuelo: ");
        precioOriginal = sc3.nextDouble();
        
        Vuelo vuelo = new Vuelo(numVuelo, origen, destino, fechaSalida, capacidad, precioOriginal);
        vuelos[n] = vuelo;
        n++;
        System.out.println("El siguiente vuelo ha sido creado: ");
        System.out.println(vuelo);

    }

    @Override
	public void muestraVuelosDisponibles(String origen, String destino) {
        int tamanyo, asientos;
        boolean flag = true;
        String o, d;
        tamanyo = n;
        for (int i = 0; i < tamanyo; i++) {
            o = vuelos[i].getOrigen();
            d = vuelos[i].getDestino();
            asientos = vuelos[i].getNumSitiosQueFaltan();
            if ((o.equals(origen) == true) && (d.equals(destino) == true) && asientos > 0) {
                if (flag == true) {
                    System.out.println("Listado de vuelos disponibles:");
                    flag = false;
                }
                System.out.println(vuelos[i]);
            }
        }
        if (flag == true) {
            System.out.println("no hay vuelos disponibles");
        }



    }

    @Override
	public Vuelo getVuelo(int numVuelo) {
        int tam = vuelos.length;
        try {
	        for (int i = 0; i < tam; i++) {
	        	
		            if (vuelos[i].getNumVuelo() == numVuelo) {
		                return vuelos[i];
		            }
	        }
        } catch(NullPointerException e) {
    		
    	}
        return null;
    }

    @Override
	public void reservaAsiento(int numVuelo, Pasajero pasajero) {
        int tam = vuelos.length;
        boolean flag = false;
        int indice = 0, asientos;
        
        for (int i = 0; i < tam; i++) {
            if (vuelos[i].getNumVuelo() == numVuelo) {
                flag = true;
                indice = i;
                break;
            }

        }
        
        double precio;
        asientos = vuelos[indice].getNumSitiosQueFaltan();
        if (flag == true && (asientos > 0)) {
            vuelos[indice].reservaDeAsiento();
            precio = pasajero.aplicaDescuento(vuelos[indice].getPrecio());
            Billete billete = new Billete(vuelos[indice], pasajero, precio);
            billetes[numBilletes] = billete;
            numBilletes++;
            System.out.println("Usted ha reservado con éxito un asiento del vuelo " + numVuelo);
            System.out.println("billete: " + billete);



        } else {
            if (flag == true && asientos == 0) {
                System.out.println("El Vuelo " + numVuelo + " "
                		+ "está lleno y no puedes reserver un ticket para este vuelo");

            } else if (flag == false) {
                System.out.println("El Vuelo " + numVuelo + " no existe");
            }
        }

    }

    public static void main(String[] args) {
        OperacionesVuelos gestor = new GestorVuelos();
        Vuelo vuelo;
        Pasajero pasajero;
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String input, destino, origen, nombre;
        int numVuelo, edad, anyos;
        boolean flag = false;

        while (flag != true) {
            System.out.println("Introduzca c si quiere Crear un vuelo");
            System.out.println("Introduzca m si quiere Mostrar todos los vuelos");
            System.out.println("Introduzca i si quiere Saber información de un vuelo");
            System.out.println("Introduzca r si quiere Reservar un asiento");
            System.out.println("Introduzca s si quiere Salir del programa");
            input = scan1.nextLine();
            switch (input) {
                case "c":
                    gestor.crearVuelos();
                    break;
                case "m":
                    System.out.println("Introduza origen del vuelo");
                    origen = scan1.nextLine();
                    System.out.println("Introduzca destino del vuelo");
                    destino = scan1.nextLine();
                    gestor.muestraVuelosDisponibles(origen, destino);
                    break;
                case "i":
                    System.out.println("Introduzca número de vuelo");
                    numVuelo = scan2.nextInt();
                    vuelo = gestor.getVuelo(numVuelo);
                    if (vuelo == null) {
                        System.out.println("El Vuelo " + numVuelo + " no existe");
                    } else {
                        System.out.println("Información para el vuelo: " + numVuelo + ":");
                        System.out.println(vuelo);
                    }
                    break;
                case "r":
                    System.out.println("Si el pasajero no es miembro pulsar n, si el pasajero es miembro pulsar m");
                    input = scan1.nextLine();
                    System.out.println("Introduzca edad del pasajero");
                    edad = scan2.nextInt();
                    System.out.println("Introduzca nombre del pasajero");
                    nombre = scan1.nextLine();
                    System.out.println("Introduzca el número de vuelo");
                    numVuelo = scan2.nextInt();

                    if (input.equals("n") == true) {
                        pasajero = new PasajeroNoSocio(edad, nombre);
                        gestor.reservaAsiento(numVuelo, pasajero);
                    } else if (input.equals("m") == true) {
                        System.out.println("Por cuántos años ha sido miembro el pasajero");
                        anyos = scan2.nextInt();
                        pasajero = new PasajeroSocio(anyos, edad, nombre);
                        gestor.reservaAsiento(numVuelo, pasajero);

                    }
                    break;
                case "s":
                    flag = true;
                    System.out.println("Programa terminado");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;

            }

        }

    }
}