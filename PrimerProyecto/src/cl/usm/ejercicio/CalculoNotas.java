package cl.usm.ejercicio;

import java.util.Scanner;

public class CalculoNotas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int alumnos = 5;
		int notas = 3;
		double curso[][] = new double[alumnos][notas];
		
		// Ingreso de notas por cada alumno
		for (int i = 0; i < alumnos; i++) {
			for (int j = 0; j < notas; j++) {
				System.out.print("Ingrese " + (j + 1) + "ª nota del " + (i + 1) + "º alumno: ");
				double nota = teclado.nextDouble();				
				curso[i][j] = nota;				
			}
		}
		
		teclado.close();
		
		// Obtención de Promedio por cada alumno
		
		for (int i = 0; i < alumnos; i++) {
			double sumaNotas = 0;
			double promedioNotas = 0;
			for (int j = 0; j < notas; j++) {
				sumaNotas += curso[i][j];
			}
			promedioNotas = sumaNotas / notas;
			System.out.println("El " + (i + 1) + "º alumno obtuvo como nota final: " + promedioNotas);
		}

	}

}
