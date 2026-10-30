package Tarea5b;
import java.util.Scanner;

public class Tarea5b_21 {
	public static void main(String[] args) {
		// VARIABLES
		int cargo;
		double sueldo = 0;
		int diasViaje;
		double dieta;
		int estadoCivil;
		double sueldoNeto;
		double irpf;
		double retencion;

		// EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Programador Junior");
		System.out.println("2 - Programador Senior");
		System.out.println("3 - Jefe de proyecto");
		System.out.println("Introduzca el cargo del empleado (1-3):");
		cargo = sc.nextInt();
		switch (cargo) {
			case 1:
				sueldo = 950;
				break;
			case 2:
				sueldo = 1200;
				break;
			case 3:
				sueldo = 1600;
				break;
			default:
				System.out.println("Introduzca una de las opciones válidas:");
				sc.close();
				return;
		}
		System.out.println("------------------------------------------------------------------------");
		System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
		diasViaje = sc.nextInt();
		dieta = diasViaje * 30;
		System.out.println("------------------------------------------------------------------------");
		System.out.println("1 - Soltero");
		System.out.println("2 - Casado");
		System.out.println("Introduzca su estado civil (1-2):");
		estadoCivil = sc.nextInt();
		switch (estadoCivil) {
			case 1:
				irpf = 0.25;
				break;
			case 2:
				irpf = 0.20;
				break;
			default:
				System.out.println("Introduzca una de las opciones válidas.");
				sc.close();
				return;
		}
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("Sueldo base: %.2f€%n", sueldo);
		if (diasViaje == 1) {
			System.out.printf("Dietas (%d día): %.2f€%n", diasViaje, dieta);
		}	else if (diasViaje >= 0) {
				System.out.printf("Dietas (%d días): %.2f€%n", diasViaje, dieta);
			}	else {
					System.out.println("Error. Introduce un valor válido.");
					sc.close();
					return;
				}
		System.out.println("------------------------------------------------------------------------");
		retencion = (sueldo * irpf);
		sueldo = sueldo + dieta;
		System.out.printf("Sueldo bruto: %.2f€%n", sueldo);
		irpf *= 100;
		System.out.printf("Retención IRPF (%.0f%%): %.2f€%n", irpf, retencion);
		System.out.println("------------------------------------------------------------------------");
		sueldoNeto = sueldo - retencion;
		System.out.printf("Sueldo neto: %.2f€%n", sueldoNeto);
		sc.close();
	}
}