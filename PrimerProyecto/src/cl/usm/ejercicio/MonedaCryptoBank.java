package cl.usm.ejercicio;

import java.util.Date;

public class MonedaCryptoBank {
	private int codMoneda;
	private String tipoMoneda;
	private Date fechaCreacionMoneda;
	
	public int getCodMoneda() {
		return codMoneda;
	}
	public void setCodMoneda(int codMoneda) {
		this.codMoneda = codMoneda;
	}
	public String getTipoMoneda() {
		return tipoMoneda;
	}
	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	public Date getFechaCreacionMoneda() {
		return fechaCreacionMoneda;
	}
	public void setFechaCreacionMoneda(Date fechaCreacionMoneda) {
		this.fechaCreacionMoneda = fechaCreacionMoneda;
	}
	
	public MonedaCryptoBank(int codMoneda, String tipoMoneda, Date fechaCreacionMoneda) {
		this.codMoneda = codMoneda;
		this.tipoMoneda = tipoMoneda;
		this.fechaCreacionMoneda = fechaCreacionMoneda;
	}
	
	public void obtenerMonedaCryptoBank (int codMoneda) {
		System.out.println("Moneda: " + getCodMoneda());
		System.out.println("Tipo: " + getTipoMoneda());
		System.out.println("Fecha de Creación: " + getFechaCreacionMoneda());
		
	}
}
