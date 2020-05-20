
package lab1;

public abstract class Pasajero {

    String nombre;
    int edad;

    public Pasajero(int edad, String nombre) {
        this.nombre = nombre;
        this.edad = edad;

    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    abstract public double aplicaDescuento(double pasajero);

}