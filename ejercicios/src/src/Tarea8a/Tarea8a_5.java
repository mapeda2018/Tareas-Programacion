package Tarea8a;
import java.util.Scanner;

public class Tarea8a_5 {
	public static void main(String[] args) {
		//VARIABLES
		int valorMin;
		int valorMax;
		int numero;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor mínimo del rango:");
		valorMin = sc.nextInt();
		System.out.println("Introduce el valor máximo del rango:");
		valorMax = sc.nextInt();
		System.out.println("-------------------------------------------------------------");
		System.out.println("Introduce un número que esté dentro del rango:");
		numero = sc.nextInt();
		do {
			System.out.println("El número no está dentro del rango.");
			System.out.println("-------------------------------------------------------------");
			System.out.println("Vuelve a intentarlo:");
			numero = sc.nextInt();
		}	while(numero < valorMin || numero > valorMax);
		System.out.println("El número introducido está dentro del rango.");
		sc.close();
	}
}