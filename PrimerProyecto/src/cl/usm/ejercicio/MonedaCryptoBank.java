package cl.usm.ejercicio;

import java.time.LocalDate;

public class MonedaCryptoBank {
	private int codMoneda;
	private String tipoMoneda;
	private LocalDate fechaCreacionMoneda;
	
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
	public LocalDate getFechaCreacionMoneda() {
		return fechaCreacionMoneda;
	}
	public void setFechaCreacionMoneda(LocalDate fechaCreacionMoneda) {
		this.fechaCreacionMoneda = fechaCreacionMoneda;
	}
	
	public MonedaCryptoBank(int codMoneda, String tipoMoneda, LocalDate fechaCreacionMoneda) {
		this.codMoneda = codMoneda;
		this.tipoMoneda = tipoMoneda;
		this.fechaCreacionMoneda = fechaCreacionMoneda;
	}
	
	public void obtenerMonedaCryptoBank() {
		System.out.println("Moneda: " + getCodMoneda());
		System.out.println("Tipo: " + getTipoMoneda());
		System.out.println("Fecha de Creación: " + getFechaCreacionMoneda());
		
	}
}
