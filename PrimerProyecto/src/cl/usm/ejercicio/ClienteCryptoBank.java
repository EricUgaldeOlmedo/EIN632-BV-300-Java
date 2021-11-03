package cl.usm.ejercicio;

public class ClienteCryptoBank {
	private int codCliente;
	private String rutCliente;
	private String nombreCliente;
	private String correoCliente;
	private BilleteraCryptoBank billetera;
		
	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}
	
	public BilleteraCryptoBank getBilletera() {
		return billetera;
	}

	public void setBilletera(BilleteraCryptoBank billetera) {
		this.billetera = billetera;
	}

	public ClienteCryptoBank(int codCliente, String rutCliente, String nombreCliente, String correoCliente) {
		this.codCliente = codCliente;
		this.rutCliente = rutCliente;
		this.nombreCliente = nombreCliente;
		this.correoCliente = correoCliente;
	}
	
	public ClienteCryptoBank(int codCliente, String rutCliente, String nombreCliente, String correoCliente, BilleteraCryptoBank billetera) {
		this.codCliente = codCliente;
		this.rutCliente = rutCliente;
		this.nombreCliente = nombreCliente;
		this.correoCliente = correoCliente;
		this.billetera = billetera;
	}
	
	public void obtenerClienteCryptoBank() {
		System.out.println("Datos del cliente: " + getCodCliente());
		System.out.println("Rut: " + getRutCliente());
		System.out.println("Nombre: " + getNombreCliente());
		System.out.println("Correo: " + getCorreoCliente());		
	}
	
	public void obtenerClienteCryptoBankBilletera() {
		if (this.billetera == null) {
			System.out.println("Cliente no tiene asociada una billetera");
		} else {
			System.out.println("Datos del cliente: " + getCodCliente());
			System.out.println("Rut: " + getRutCliente());
			System.out.println("Nombre: " + getNombreCliente());
			System.out.println("Correo: " + getCorreoCliente());
			this.billetera.obtenerBilleteraCryptoBank();
		}
	}
}
