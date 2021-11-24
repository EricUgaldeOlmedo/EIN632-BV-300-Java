package cl.usm.certamenuno;

public class FondoObama extends Fondo {

	public FondoObama() {
		// Se completan los datos con los entregados en el certamen
		super("Obama", "Conservador", new Serie(1438, 0), new Serie(1100, 0.29));
		super.calcularCuotas("T");
		super.calcularCuotas("APV");
	}
	

}
