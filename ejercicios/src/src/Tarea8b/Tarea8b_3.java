package Tarea8b;
import java.util.Scanner;

public class Tarea8b_3 {
	public static void main(String[] args) {
		//VARIABLES
		int max;
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cuantos número de la serie de Fibonacci quieres saber:");
		max = sc.nextInt();
		if (max < 0) {
			System.out.println("Error. Introduce un valor positivo.");
			sc.close();
		}
		while (max > 0) {
			System.out.print(num1 + " | ");
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			max--;
		}
		sc.close();
    }
}