package Tarea5b;
import java.util.Scanner;

public class Tarea5b_23 {
	public static void main(String[] args) {
		//VARIABLES
		String sabor;
		String nata;
		String tipoChocolate = "";
		boolean siNata = false;
		String nombre;
		boolean siNombre = false;
		String elegirNombre = "";
		double precio = 0;

		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige el sabor: manzana, fresa o chocolate.");
		sabor = sc.nextLine();
		if (sabor.equalsIgnoreCase("chocolate")) {
			System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco)");
			tipoChocolate = sc.nextLine();
		}
		System.out.println("¿Quiere nata? (si o no)");
		nata = sc.nextLine();
		if (nata.equalsIgnoreCase("si")) {
			siNata = true;
			precio += 2.50;
		}
		System.out.println("¿Quiere ponerle un nombre? (si o no)");
		nombre = sc.nextLine();
		if (nombre.equalsIgnoreCase("si")) {
			System.out.println("Elige el nombre:");
			elegirNombre = sc.nextLine();
			siNombre = true;
			precio += 2.75;
		}
		
		System.out.println("---------------------------------------------");
		
		switch (sabor.toLowerCase()) {
			case "manzana":
				precio += 18;
				System.out.println("Tarta de manzana: 18,00€.");
				if (siNata) {
					System.out.println("Con nata: 2,50€.");
				}
				if (siNombre) {
					System.out.println("Con nombre (" + elegirNombre + "): 2,75€.");
				}
				System.out.println("Total: " + precio + "€.");
				break;
			case "fresa":
				precio += 16;
				System.out.println("Tarta de fresa: 16,00€.");
				if (siNata) {
					System.out.println("Con nata: 2,50€.");
				}
				if (siNombre) {
					System.out.println("Con nombre (" + elegirNombre + "): 2,75€.");
				}
				System.out.println("Total: " + precio + "€.");
				break;
			case "chocolate":
				if (tipoChocolate.equalsIgnoreCase("negro")) {
					precio += 14;
				}	else if (tipoChocolate.equalsIgnoreCase("blanco")) {
						precio += 15;
					}	else {
							System.out.println("Sabor de chocolate no válido.");
							sc.close();
							return;
						}
				if (tipoChocolate.equalsIgnoreCase("negro")) {
					System.out.println("Tarta de chocolate " + tipoChocolate + ": 14,00€.");
				}	else {
						System.out.println("Tarta de chocolate " + tipoChocolate + ": 15,00€.");
				}
				if (siNata) {
					System.out.println("Con nata: 2,50€.");
				}
				if (siNombre) {
					System.out.println("Con nombre (" + elegirNombre + "): 2,75€.");
				}
				System.out.println("Total: " + precio + "€.");
				break;
			default:
				System.out.println("Introduzca un sabor válido.");
		}
		sc.close();
	}
}