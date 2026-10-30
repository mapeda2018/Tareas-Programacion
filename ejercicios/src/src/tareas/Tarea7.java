package tareas;
import java.util.Scanner;

public class Tarea7 {
	public static void main(String[] args) {
		//VARIABLES
		int a;
		int cambio;
		int b;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer número a intercambiar (A):");
		a = sc.nextInt();
		System.out.println("Introduzca el segundo número a intercambiar (B):");
		b = sc.nextInt();
		cambio = a;
		a = b;
		b = cambio;
		System.out.println("A vale " + a + " y B vale " + b);
		sc.close();
	}
}