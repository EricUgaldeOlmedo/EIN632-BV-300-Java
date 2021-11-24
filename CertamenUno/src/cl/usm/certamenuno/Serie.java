package cl.usm.certamenuno;

public class Serie {
	private double valorCuota;
	private double comisionAnual;
	
	public Serie(double valorCuota, double comisionAnual) {
		this.valorCuota = valorCuota;
		this.comisionAnual = comisionAnual;
	}

	public double getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(double valorCuota) {
		this.valorCuota = valorCuota;
	}

	public double getComisionAnual() {
		return comisionAnual;
	}

	public void setComisionAnual(double comisionAnual) {
		this.comisionAnual = comisionAnual;
	}	
}
