package Tarea5b;
import java.util.Scanner;

public class Tarea5b_16 {
	public static void main(String[] args) {
		//VARIABLES
		int numero;
		int ultimoNumero = 0;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		if (numero < 10) {
			ultimoNumero = numero;
		}
		ultimoNumero = numero%10;
		System.out.println("La última cifra es: " + ultimoNumero);
		sc.close();
	}
}