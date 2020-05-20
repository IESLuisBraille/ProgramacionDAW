package lab1;

public interface OperacionesVuelos {

	void crearVuelos();

	void muestraVuelosDisponibles(String origen, String destino);

	Vuelo getVuelo(int numVuelo);

	void reservaAsiento(int numVuelo, Pasajero pasajero);

}