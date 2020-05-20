
package lab1;

public class PasajeroSocio extends Pasajero {

    private int anyosMembresia;

    public PasajeroSocio(int anyosMembresia, int precio, String nombre) {
        super(precio, nombre);
        this.anyosMembresia = anyosMembresia;

    }

    @Override
    public double aplicaDescuento(double precio) {
        if (anyosMembresia > 5) {
            precio = precio / 2;
            return precio;
        } else if (anyosMembresia <= 5 && anyosMembresia > 1) {
            precio = (precio *9)/10;
            return precio;
        }
        return precio;

    }

}