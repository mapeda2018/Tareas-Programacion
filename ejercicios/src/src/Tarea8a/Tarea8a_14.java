package Tarea8a;
import java.util.Scanner;

public class Tarea8a_14 {
	public static void main(String[] args) {
		//VARIABLES
		int n;
		int direccion;
		int j;
		int i;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para hacer un triángulo rectángulo:");
		n = sc.nextInt();
		System.out.println("Elige si lo quieres con la punta arriba o abajo (1 - arriba, 2 - abajo)");
		direccion = sc.nextInt();
		switch (direccion) {
			case 1:
				for (i = 1; i <= n; i++) {
					for (j = 1; j <= i; j++) {
						System.out.print("* ");
		            }
		            System.out.println();
				}
				break;
			case 2:
				for (i = n; i >= 1; i--) {
					for (j = 1; j <= i; j++) {
						System.out.print("* ");
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