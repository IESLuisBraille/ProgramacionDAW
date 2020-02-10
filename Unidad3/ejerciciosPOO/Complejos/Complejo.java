package numeros;

public class Complejo {
	double real, imag;

    public Complejo() {
        real=0.0;
        imag=0.0;
    }

    public Complejo(double real, double imag) {
        this.real=real;
        this.imag=imag;
    }

    public double consulta_Real(){
        return real;
    }

    public double consulta_Imag(){
        return imag;
    }

    public void cambia_Real(double real){
        this.real=real;
    }

    public void cambia_Imag(double imag){
        this.imag=imag;
    }

    public String toString() {
        return " " + real + " + " +imag + "i";
    }

   
    public void sumar(Complejo b){
        this.real+=b.real;
        this.imag+=b.imag;
    }


}
