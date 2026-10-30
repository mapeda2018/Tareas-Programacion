package Tarea5b;
import java.util.Scanner;

public class Tarea5b_5 {
	public static void main(String[] args) {
		//VARIABLES
		double a;
		double b;
		double x;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 'a' en la ecuación (ax + b = 0):");
		a = sc.nextDouble();
		System.out.println("Introduce 'b' en la ecuación (ax + b = 0):");
		b = sc.nextDouble();
        if (a == 0 && b == 0) {
            System.out.println("Hay infinitas soluciones.");
        	} 	else if (a == 0) {
        			System.out.println("Ninguna solución, 0 = " + b + " es imposible).");
        		} 	else {
        				x = -b / a;
        				System.out.println("X es igual a " + x);
        			}	
		sc.close();
	}
}