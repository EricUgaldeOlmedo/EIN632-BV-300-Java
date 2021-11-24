package cl.usm.certamenuno;

public class FondoReagan extends Fondo {

	public FondoReagan() {
		// Se completan los datos con los entregados en el certamen
		super("Reagan", "Moderado", new Serie(1394, 0), new Serie(1441, 0.49));
		super.calcularCuotas("T");
		super.calcularCuotas("APV");
	}

}
