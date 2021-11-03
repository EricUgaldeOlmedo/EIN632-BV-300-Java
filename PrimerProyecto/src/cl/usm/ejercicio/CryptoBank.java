package cl.usm.ejercicio;
import java.time.LocalDate;

public class CryptoBank {

	public CryptoBank() {
		
	}

	public static void main(String[] args) {
		ClienteCryptoBank cli1 = new ClienteCryptoBank(0, null, null, null);
		ClienteCryptoBank cli2 = new ClienteCryptoBank(1, "17.106.767-7", "Eric Ugalde Olmedo", "ericugaldeolmedo@gmail.com");
		
		cli1.obtenerClienteCryptoBank();
		cli1.obtenerClienteCryptoBankBilletera();

		cli2.obtenerClienteCryptoBank();
		cli2.obtenerClienteCryptoBankBilletera();
		cli2.setBilletera(new BilleteraCryptoBank(1, 20000, new MonedaCryptoBank(1, "BitCoin", LocalDate.now())));
		cli2.obtenerClienteCryptoBank();
		cli2.obtenerClienteCryptoBankBilletera();		
	}

}
