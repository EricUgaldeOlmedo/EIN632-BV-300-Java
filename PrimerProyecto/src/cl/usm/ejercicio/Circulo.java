package cl.usm.ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese el radio del circulo: ");
		try {
			double radio = scan.nextDouble();
			double area, perimetro;
			area = Math.PI * Math.pow(radio,  2);
			perimetro = 2 * Math.PI * radio;
			System.out.println("El área del circulo es: " + area);
			System.out.println("El perimetro del circulo es: " + perimetro);
		}
		catch (InputMismatchException e) {
			System.out.println("No se pueden ingresar caracteres no númericos");
		}		
	}
}
