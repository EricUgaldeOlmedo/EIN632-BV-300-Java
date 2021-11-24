package cl.usm.certamenuno;

public class EXP_171067677 {
	/* Información general:
	 * Nombre: Eric Ugalde Olmedo
	 * Certamen: 1
	 * Fecha: 17-11-2021
	 * Comentarios generales: Debido a que no utilice ingreso de datos por consola, no encontre lógica en usar Try-Catch en ninguna parte del código
	 * 						  en caso que si hubiese, deberia integrarlo por ejemplo para crear nuevos fondos o series, así como en llamadas a los
	 * 						  procedimientos de estos	
	*/
	public static void main(String[] args) {
		// Instancias basicas de los 3 fondos, se muestran por completo todos los datos		
		FondoObama fo = new FondoObama();
		FondoReagan fr = new FondoReagan();
		FondoTrump ft = new FondoTrump();
		fo.mostrarInformacionFondo();
		fr.mostrarInformacionFondo();
		ft.mostrarInformacionFondo();
		
		// Variables comunes a usar para ordenar los calculos de mayor o menor rentabilidad
		
		int posRentMax = 0;		
		int posRentMin = 0;
		double rentMax;
		double rentMin;
		
		// Por demora de trabajo, en vez de crear listas o arreglos de multiniveles solo lo tengo trabajado con posiciones en duro
		
		double[] rentabilidades = new double[5];
		rentabilidades[0] = fo.mostrarRentabilidad("T");
		rentabilidades[1] = fo.mostrarRentabilidad("APV");
		rentabilidades[2] = fr.mostrarRentabilidad("T");
		rentabilidades[3] = fr.mostrarRentabilidad("APV");
		rentabilidades[4] = ft.mostrarRentabilidad("APV");
		
		Fondo[] fondos = new Fondo[5];
		fondos[0] = fo;
		fondos[1] = fo;
		fondos[2] = fr;
		fondos[3] = fr;
		fondos[4] = ft;
		
		String[] series = new String[5];
		series[0] = "T";
		series[1] = "APV";
		series[2] = "T";
		series[3] = "APV";
		series[4] = "APV";
		
		
		// Algoritmo simple de busqueda de max o min basado en rentabilidades
		rentMax = rentabilidades[0];
		for (int i = 0; i < 5; i++) {
			if (rentabilidades[i] > rentMax) {
				rentMax = rentabilidades[i];
				posRentMax = i;
			}
		}
				
		rentMin = rentabilidades[0];
		for (int i = 0; i < 5; i++) {
			if (rentabilidades[i] < rentMin) {
				rentMin = rentabilidades[i];
				posRentMin = i;
			}
		}
		
		System.out.println("Fondo mas Rentable: ");
		fondos[posRentMax].mostrarInformacionSerie(series[posRentMax]);
		System.out.println("Fondo menos Rentable: ");
		fondos[posRentMin].mostrarInformacionSerie(series[posRentMin]);
		
	}

}
