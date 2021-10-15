package cl.usm.ejercicio;

import java.util.Scanner;

public class Contador {

	/* Programa para ingresar 10 enteros, luego sumarlos y su promedio */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int arreglo[] = new int[10];
		int suma = 0;
		double promedio;
		
		// Ingreso repetitivo de los elementos hasta el tamaño del arreglo
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("Ingrese valor del " + (i + 1) + "º número: ");
			arreglo[i] = teclado.nextInt();			
		}
		
		teclado.close();
		
		// Suma de valores y promedio
		for (int i = 0; i < arreglo.length; i++) {
			suma += arreglo[i];			
		}
		
		promedio = suma / arreglo.length;
		
		System.out.println("La suma de los elementos es: " + suma);
		System.out.println("El promedio de los elementos es: " + promedio);		
	}
}
