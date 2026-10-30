package Tarea5b;
import java.util.Scanner;

public class Tarea5b_2 {
	public static void main(String[] args) {
		//VARIABLES
		int hora;
	
		//EJERCICIO
		Scanner sc = new Scanner(System.in);	
		System.out.println("Introduce la hora (24 HORAS):");
		hora = sc.nextInt();
		if (hora >= 6 && hora <= 12) {
			System.out.println("Buenos días.");
		}		else if (hora >= 13 && hora <= 20) {
					System.out.println("Buenas tardes.");
				}	else if (hora >= 21 && hora < 24 || hora >= 0 && hora <= 5) {
						System.out.println("Buenas noches.");
					}	else {
							System.out.println("Introduce una hora válida");
						}
		sc.close();
	}
}