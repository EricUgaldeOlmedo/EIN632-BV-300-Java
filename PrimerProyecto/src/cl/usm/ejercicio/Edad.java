package cl.usm.ejercicio;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		int anhoNacimiento;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese su edad para determinar el año de nacimiento: ");
		int edad = teclado.nextInt();
		anhoNacimiento = 2021 - edad;
		System.out.println("Usted nacio el año: " + anhoNacimiento);		
	}

}
