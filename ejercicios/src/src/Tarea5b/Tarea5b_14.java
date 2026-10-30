package Tarea5b;

import java.util.Scanner;

public class Tarea5b_14 {
	public static void main(String[] args) {
		// VARIABLES
		int i;
		int j;
		char chr;
		int tamano;
		int direccion;

		// EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el caracter con el que hacer la pirámide:");
		chr = sc.next().charAt(0);
		System.out.println("Elige el tamaño de la pirámide:");
		tamano = sc.nextInt();
		System.out.println("Elige si lo quieres con la punta arriba o abajo (1 - arriba, 2 - abajo)");
		direccion = sc.nextInt();
		switch (direccion) {
			case 1:
				for (i = 1; i <= tamano; i++) {
					for(j = tamano; j <= 1 - i; j++) {
						System.out.print("-");
					}
					for (j = 1; j <= (2 * i) - 1; j++) {
						System.out.print(chr);
					}
					System.out.println();
				}
				break;
			case 2:
				for (i = tamano; i >= 1; i--) {
					for (j = 1; j <= tamano - i; j++) {
						System.out.print("-");
					}
					for (j = 1; j <= (2 * i) - 1; j++) {
						System.out.print(chr);
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("Opción no válida.");
				break;
		}
		sc.close();
	}
}