
package lab1;


public class Vuelo {

    private int numVuelo;
    private String origen;
    private String destino;
    private String fechaSalida;
    private int capacidad;
    private int numAsientosQueFaltan;
    private double precioOriginal;

    public Vuelo(int numVuelo, String origen, String destino, String fechaSalida, int capacidad, double precioOriginal) {
        if (destino.equals(origen) == true) {
            throw new IllegalArgumentException("destino y origen es lo mismo");
        }
        this.numVuelo = numVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.capacidad = capacidad;
        this.numAsientosQueFaltan = capacidad;
        this.precioOriginal = precioOriginal;
    }

    public boolean reservaDeAsiento() {
        if (numAsientosQueFaltan > 0) {
            numAsientosQueFaltan = numAsientosQueFaltan - 1;
            return true;

        }
        return false;
    }

    public double getPrecio() {
        return this.precioOriginal;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public String getHoraDeSalida() {
        return this.fechaSalida;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public int getNumSitiosQueFaltan() {
        return numAsientosQueFaltan;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setPrecio(double precioOriginal) {
        this.precioOriginal = precioOriginal;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setHoraDeSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public void setNumSitiosQueFaltan(int numAsientosQueFaltan) {
        this.numAsientosQueFaltan = numAsientosQueFaltan;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        String a = "Vuelo:  " + numVuelo;
        String b = "," + origen + " a " + destino;
        String c = "," + fechaSalida;
        String d = ", Precio Original: " + precioOriginal + "$";
        return a + b + c + d;
    }

}
