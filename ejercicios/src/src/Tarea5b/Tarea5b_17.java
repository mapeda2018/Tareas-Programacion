package Tarea5b;
import java.util.Scanner;

public class Tarea5b_17 {
	public static void main(String[] args) {
		//VARIABLES
		int numero;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		while (numero >= 10) {
			numero /= 10;
		}
		System.out.println("La primera cifra es: " + numero);
		sc.close();
	}
}