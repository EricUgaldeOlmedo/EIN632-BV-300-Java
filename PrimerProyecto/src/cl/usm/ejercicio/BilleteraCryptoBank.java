package cl.usm.ejercicio;

public class BilleteraCryptoBank {
	private int codBilletera;
	private ClienteCryptoBank cliente;
	private double saldoBilletera;
	private MonedaCryptoBank moneda;
	
	public int getCodBilletera() {
		return codBilletera;
	}
	
	public void setCodBilletera(int codBilletera) {
		this.codBilletera = codBilletera;
	}
	
	public ClienteCryptoBank getCliente() {
		return cliente;
	}
	
	public void setCliente(ClienteCryptoBank cliente) {
		this.cliente = cliente;
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
	
	public BilleteraCryptoBank(int codBilletera, ClienteCryptoBank cliente, double saldoBilletera, MonedaCryptoBank moneda) {
		this.codBilletera = codBilletera;
		this.cliente = cliente;
		this.saldoBilletera = saldoBilletera;
		this.moneda = moneda;
	}
	
	public void obtenerBilleteraCryptoBank(int codBilletera) {
		System.out.println("Billetera: " + getCodBilletera());
		System.out.println("Cliente: " + getCliente().getRutCliente());
		System.out.println("Saldo: " + getSaldoBilletera());
		System.out.println("Moneda: " + getMoneda().getTipoMoneda());
	}
}
