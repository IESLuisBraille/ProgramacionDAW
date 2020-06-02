package prog;

/**
 *
 * @author Usuario
 */
public class DevolucionImpuestos {
	private final String numSS;
	private String apellido;
	private final String nombre;
	private String direccion;
	private String ciudad;
	private String provincia;
	private final int cp;
	private final int ingresosAnuales;
	private final String estadoCivil;
	private double responsabilidadFiscal;

	public DevolucionImpuestos(String numSS, String apellido, String nombre, String direccion, String ciudad,
			String estado, int cp, int ingresosAnuales, String estadoCivil) {
		this.numSS = numSS;
		this.apellido = apellido;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.provincia = estado;
		this.cp = cp;
		this.ingresosAnuales = ingresosAnuales;
		this.estadoCivil = estadoCivil.toUpperCase();
		this.setTaxLiability();
	}

	public DevolucionImpuestos(String socialSecurityNumber, String firstName, int zipCode, int annualIncome,
			String maritalStatus) {
		this.numSS = socialSecurityNumber;
		this.nombre = firstName;
		this.cp = zipCode;
		this.ingresosAnuales = annualIncome;
		this.estadoCivil = maritalStatus.toUpperCase();
		this.setTaxLiability();
	}

	private void setTaxLiability() {
		if (ingresosAnuales >= 0 && ingresosAnuales <= 20000) {
			switch (estadoCivil) {
			case "CASADO":
				this.responsabilidadFiscal = ingresosAnuales * 0.14;
				break;
			case "SOLTERO":
				this.responsabilidadFiscal = ingresosAnuales * 0.15;
				break;
			}
		} else if (ingresosAnuales > 20000 && ingresosAnuales <= 50000) {
			switch (estadoCivil) {
			case "CASADO":
				this.responsabilidadFiscal = ingresosAnuales * 0.20;
				break;
			case "SOLTERO":
				this.responsabilidadFiscal = ingresosAnuales * 0.22;
				break;
			}
		} else {
			switch (estadoCivil) {
			case "CASADO":
				this.responsabilidadFiscal = ingresosAnuales * 0.28;
				break;
			case "SOLTERO":
				this.responsabilidadFiscal = ingresosAnuales * 0.30;
				break;
			}

		}
	}

	public void mostrarDatos() {
		System.out.println("Sr/Sra " + nombre + ", su devolución de impuestos es: " + "\n" + "Ingresos anuales: "
				+ ingresosAnuales + "\n" + "pago de impuestos: " + responsabilidadFiscal);
	}
}