package lab1;

public class PasajeroNoSocio extends Pasajero {

    public PasajeroNoSocio(int edad, String nombre) {
        super(edad, nombre);
    }

    @Override
    public double aplicaDescuento(double precio) {
        if (edad > 65) {
            precio = (precio *9)/10;
            return precio;
        }
        return precio;
    }

}
