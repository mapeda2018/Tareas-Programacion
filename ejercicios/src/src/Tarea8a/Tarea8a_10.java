package Tarea8a;

import java.util.Scanner;

public class Tarea8a_10 {
	public static void main(String[] args) {
		// VARIABLES
		int numero;
		int multiplicador = 1;
		int resultado;
		int limite = 10;

		// EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entre 1-10:");
		while (limite > 0) {
			numero = sc.nextInt();
			if (numero > 10 || numero < 1) {
				System.out.println("-------------------------------------------");
				System.out.println("Error. Introduce un número entre 1-10:");
			} else {
				while (multiplicador <= 10) {
					System.out.println("Múltiplos:");
					resultado = numero * multiplicador;
					System.out.println(numero + " x " + multiplicador + " = " + resultado);
					multiplicador++;
				}
				limite = 0;
			}
		}
		sc.close();
	}
}