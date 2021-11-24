package cl.usm.certamenuno;

import java.util.Random;

public class Fondo {
	private String nombreFondo;
	private String riesgoFondo;
	private Serie serieAPV;
	private Serie serieT;
	private Double[] cuotasAPV;
	private Double[] cuotasT;
	
	public Fondo(String nombreFondo, String riesgoFondo, Serie serieAPV, Serie serieT) {
		this.nombreFondo = nombreFondo;
		this.riesgoFondo = riesgoFondo;
		this.serieAPV = serieAPV;
		this.serieT = serieT;
		this.cuotasAPV = new Double[12];
		this.cuotasT = new Double[12];
	}

	public String getNombreFondo() {
		return nombreFondo;
	}

	public void setNombreFondo(String nombreFondo) {
		this.nombreFondo = nombreFondo;
	}

	public String getRiesgoFondo() {
		return riesgoFondo;
	}

	public void setRiesgoFondo(String riesgoFondo) {
		this.riesgoFondo = riesgoFondo;
	}

	public Serie getSerieAPV() {
		return serieAPV;
	}

	public void setSerieAPV(Serie serieAPV) {
		this.serieAPV = serieAPV;
	}

	public Serie getSerieT() {
		return serieT;
	}

	public void setSerieT(Serie serieT) {
		this.serieT = serieT;
	}

	public Double[] getCuotasAPV() {
		return cuotasAPV;
	}

	public void setCuotasAPV(Double[] cuotasAPV) {
		this.cuotasAPV = cuotasAPV;
	}
	
	public Double[] getCuotasT() {
		return cuotasT;
	}

	public void setCuotasT(Double[] cuotasT) {
		this.cuotasT = cuotasT;
	}
	
	// Se usa el parametro de forma que se llame al metodo calcular cuotas excepto tipo T en el fondo Trump
	public void calcularCuotas(String tipoCuota) {
		if (tipoCuota == "APV") {
			this.calcularCuotasAPV(this.serieAPV);
		}
		else if (tipoCuota == "T") {
			this.calcularCuotasT(this.serieT);
		}
		else {
			System.out.println("Serie no existe");
		}
		
	}
	
	// Para reutilizar el metodo anterior pero solo para los con tipo APV
	// Podria integrarse otro random entre 0 y 1, para hacer que la rentabilidad pudiera ser negativa
	public void calcularCuotasAPV(Serie tipoSerie) {
		this.cuotasAPV[0] = tipoSerie.getValorCuota();
		for (int i = 1; i < 12; i++) {
			Random rd = new Random();
			double rentabilidad = rd.nextInt(999);
			rentabilidad /= 100000;			
			this.cuotasAPV[i] = this.cuotasAPV[i - 1] + this.cuotasAPV[i - 1] * rentabilidad;
		}
	}
	
	// Basandose en el metodo calcular cuotas, este solo agrega las cuotas al atributo que corresponde a las T
	// Podria integrarse otro random entre 0 y 1, para hacer que la rentabilidad pudiera ser negativa
	public void calcularCuotasT(Serie tipoSerie) {
		this.cuotasT[0] = tipoSerie.getValorCuota();
		for (int i = 1; i < 12; i++) {
			Random rd = new Random();
			double rentabilidad = rd.nextInt(999);
			rentabilidad /= 100000;			
			getCuotasT()[i] = getCuotasT()[i - 1] + getCuotasT()[i - 1] * rentabilidad;
		}
	}
	
	// Para calcular la comisión de cada fondo y al mismo tiempo, que pueda ser usado por tipo de serie, razón de porque usa el tipo de cuota por separado
	public void calcularComision(String tipoCuota) {
		if (tipoCuota == "T") {
			double totalCuotas = getCuotasT()[0];
			for (int i = 1; i < 12; i++) {
				totalCuotas += getCuotasT()[i] - getCuotasT()[i - 1];
			}
			double comision = totalCuotas * getSerieT().getComisionAnual();
			System.out.println("Comisión anual correspondiente al Fondo " + getNombreFondo() + " en Serie T, es de: " + comision);
		}
		else {
			System.out.println("No corresponde comisión para este tipo de Serie");			
		}
	}
	
	// Se imprime por completo la información del fondo con sus cuotas, cada valor se separa con tabulaciones para mas orden
	// Aparte, no recuerdo como formatear la impresión de doubles, por lo que quedaron con muchos decimales y no es tan simple como en Python
	public void mostrarInformacionFondo() {
		System.out.println("Informe de Plataforma de Inversiones PHINTUAL");
		System.out.println("Fondo: " + getNombreFondo() + ", Riesgo: " + getRiesgoFondo());
		if (getNombreFondo() == "Trump") {
			System.out.println("Serie APV, Valor Cuota Inicial: " + getSerieAPV().getValorCuota() + ", Comisión Anual: " + getSerieAPV().getComisionAnual());
			System.out.println("1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10 \t 11 \t 12");
			for (int i = 0; i < 12; i++) {
				System.out.print(getCuotasAPV()[i] + " \t");
			}
			System.out.println("");
			System.out.println("La rentablidad anual de la serie es: " + mostrarRentabilidad("APV") + "%");
		}
		else {
			System.out.println("Serie T, Valor Cuota Inicial: " + getSerieT().getValorCuota() + ", Comisión Anual: " + getSerieT().getComisionAnual());
			System.out.println("1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10 \t 11 \t 12");
			for (int i = 0; i < 12; i++) {
				System.out.print(getCuotasT()[i] + " \t");
			}
			System.out.println("");
			System.out.println("La rentablidad anual de la serie es: " + mostrarRentabilidad("T") + "%");
			
			System.out.println("Serie APV, Valor Cuota Inicial: " + getSerieAPV().getValorCuota() + ", Comisión Anual: " + getSerieAPV().getComisionAnual());
			System.out.println("1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10 \t 11 \t 12");
			for (int i = 0; i < 12; i++) {
				System.out.print(getCuotasAPV()[i] + " \t");
			}
			System.out.println("");
			System.out.println("La rentablidad anual de la serie es: " + mostrarRentabilidad("APV") + "%");
		}
	}
	
	// Solo para ocuparlo en el caso de cual es la serie mas rentable, se repite lo mismo que el anterior pero con condicional de tipo de serie
	public void mostrarInformacionSerie(String tipoSerie) {
		System.out.println("Informe de Plataforma de Inversiones PHINTUAL");
		System.out.println("Fondo: " + getNombreFondo() + ", Riesgo: " + getRiesgoFondo());
		if (getNombreFondo() == "Trump") {
			if (tipoSerie == "APV") {
				System.out.println("Serie APV, Valor Cuota Inicial: " + getSerieAPV().getValorCuota() + ", Comisión Anual: " + getSerieAPV().getComisionAnual());
				System.out.println("1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10 \t 11 \t 12");
				for (int i = 0; i < 12; i++) {
					System.out.print(getCuotasAPV()[i] + " \t");
				}
				System.out.println("");
				System.out.println("La rentablidad anual de la serie es: " + mostrarRentabilidad("APV") + "%");
			}
			else {
				System.out.println("No corresponde este tipo de serie con este Fondo");				
			}
		}
		else {
			if (tipoSerie == "T") {
				System.out.println("Serie T, Valor Cuota Inicial: " + getSerieT().getValorCuota() + ", Comisión Anual: " + getSerieT().getComisionAnual());
				System.out.println("1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10 \t 11 \t 12");
				for (int i = 0; i < 12; i++) {
					System.out.print(getCuotasT()[i] + " \t");
				}
				System.out.println("");
				System.out.println("La rentablidad anual de la serie es: " + mostrarRentabilidad("T") + "%");
			}
			else {
				System.out.println("Serie APV, Valor Cuota Inicial: " + getSerieAPV().getValorCuota() + ", Comisión Anual: " + getSerieAPV().getComisionAnual());
				System.out.println("1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8 \t 9 \t 10 \t 11 \t 12");
				for (int i = 0; i < 12; i++) {
					System.out.print(getCuotasAPV()[i] + " \t");
				}
				System.out.println("");
				System.out.println("La rentablidad anual de la serie es: " + mostrarRentabilidad("APV") + "%");	
			}
		}
		
	}
	
	// Método comun para todos, sirve para obtener la rentabilidad del año completo y por tipo de serie ya sea T o APV
	public double mostrarRentabilidad(String tipoSerie) {
		double rentabilidad = 0;
		if (tipoSerie == "T") {
			rentabilidad = 100 * (getCuotasT()[11] - getCuotasT()[0]) / getSerieT().getValorCuota();
			
		}
		else {
			rentabilidad = 100 * (getCuotasAPV()[11] - getCuotasAPV()[0]) / getSerieAPV().getValorCuota();
		}
		return rentabilidad;
	}
}
