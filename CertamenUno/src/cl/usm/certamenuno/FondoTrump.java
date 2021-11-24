package cl.usm.certamenuno;

public class FondoTrump extends Fondo {
	public FondoTrump() {
		// Se completan los datos con los entregados en el certamen, para este caso no se asigna serie T ni se calculan las cuotas de ese tipo
		super("Trump", "Arriesgado", new Serie(1770, 0), null);
		super.calcularCuotas("APV");
	}

}
