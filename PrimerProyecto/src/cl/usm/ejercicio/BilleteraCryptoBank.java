package cl.usm.ejercicio;

public class BilleteraCryptoBank {
	private int codBilletera;
	private double saldoBilletera;
	private MonedaCryptoBank moneda;
	
	public int getCodBilletera() {
		return codBilletera;
	}
	
	public void setCodBilletera(int codBilletera) {
		this.codBilletera = codBilletera;
	}
	
	public double getSaldoBilletera() {
		return saldoBilletera;
	}
	
	public void setSaldoBilletera(double saldoBilletera) {
		this.saldoBilletera = saldoBilletera;
	}
	
	public MonedaCryptoBank getMoneda() {
		return moneda;
	}
	
	public void setMoneda(MonedaCryptoBank moneda) {
		this.moneda = moneda;
	}
	
	public BilleteraCryptoBank(int codBilletera, double saldoBilletera, MonedaCryptoBank moneda) {
		this.codBilletera = codBilletera;
		this.saldoBilletera = saldoBilletera;
		this.moneda = moneda;
	}
	
	public void obtenerBilleteraCryptoBank() {
		System.out.println("Billetera: " + getCodBilletera());
		System.out.println("Saldo: " + getSaldoBilletera());
		System.out.println("Moneda: " + getMoneda().getTipoMoneda());
		this.moneda.obtenerMonedaCryptoBank();
	}
}
