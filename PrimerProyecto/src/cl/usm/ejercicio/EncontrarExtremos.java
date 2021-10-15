package cl.usm.ejercicio;

import java.util.Scanner;

public class EncontrarExtremos {

	/* Programa para encontrar el máximo valor de un arreglo */	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int arreglo[] = new int[10];
		
		// Ingreso repetitivo de los elementos hasta el tamaño del arreglo
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("Ingrese valor del " + (i + 1) + "º número: ");
			arreglo[i] = teclado.nextInt();	
		}
		
		// Mostrar arreglo
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("[" + arreglo[i] + "]");
		}
		
		// Obtención de los registros extremos
		
		int max = arreglo[0];
		int min = arreglo[0];
		int pmax = 0;
		int pmin = 0;
		
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i] > max) {
				max = arreglo[i];
				pmax = i;
			}
			if (arreglo[i] < min) {
				min = arreglo[i];
				pmin = i;
			}
		}
		
		System.out.println("El máximo es el valor: " + max + " y se encuentra en la posición: [" + pmax + "]");
		System.out.println("El mínimo es el valor: " + min + " y se encuentra en la posición: [" + pmin + "]");
	}
}
