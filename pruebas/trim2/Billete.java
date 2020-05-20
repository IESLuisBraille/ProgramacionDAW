package lab1;

public class Billete {

    private Vuelo vuelo;
    private Pasajero pasajero;
    private double precio;
    private int num;
    private static int cont = 0;

    public Billete(Vuelo vuelo, Pasajero pasajero, double precio) {
        this.cont++;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.precio = precio;
        this.num = cont;

    }

    @Override
    public String toString() {
        String a = pasajero.getNombre() + ", Vuelo " + vuelo.getNumVuelo();
        String b = ", " + vuelo.getOrigen() + " a " + vuelo.getDestino();
        String c = ", " + vuelo.getHoraDeSalida();
        String d = ", precio original: " + vuelo.getPrecio() + "$";
        String e = ", precio billete : " + precio + "$";
        return a + b + c + d + e;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
    public void setVuelo(Vuelo vuelo) {
        this.vuelo=vuelo;
    }
     public Pasajero getPasajero() {
        return pasajero;
    }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero=pasajero;
    }
     public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio=precio;
    }
     public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num=num;
    }
    public int getConteo() {
        return cont;
    }
    public void setConteo(int cont) {
        this.cont=cont;
    }
    
    
}
