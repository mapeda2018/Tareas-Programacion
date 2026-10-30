package tareas;
import java.util.Scanner;

public class Tarea3 {
	public static void main(String[] args) {
		//EJERCICIO 1
		byte num1;
		byte num2;
		byte sumaNums;
		//EJERCICIO 2
		int num3;
		int num4;
		int difEdad;
		//EJERCICIO 3
		double num5;
		double num6;
		double divNums;
		//EJERCICIO 4
		float millas;
		float metros;
		float convKm;
		
		//EJERCICIO 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número a sumar:");
		num1 = sc.nextByte();
		System.out.println("Introduce el segundo número a sumar:");
		num2 = sc.nextByte();
		sumaNums = (byte)(num1 + num2);
		System.out.println("La suma de los números es: " + sumaNums);
		
		System.out.println("--------------------------------------------------");
		
		//EJERCICIO 2
		Scanner sc2 = new Scanner(System.in);		
		System.out.println("Introzca su año de nacimiento:");
		num3 = sc2.nextInt();
		System.out.println("Introduce el año actual (FECHA, NO EDAD)");
		num4 = sc2.nextInt();
		if (num4 > num3) {
			difEdad = num4 - num3;
			System.out.println("Su edad es: " + difEdad + " año/s");
		}	else if (num3 > num4){
				System.out.println("Error");
			}	else {
					difEdad = 0;
					System.out.println("Su edad es: " + difEdad + " año/s");
			}
		
		System.out.println("--------------------------------------------------");
			
		//EJERCICIO 3
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Introduce el dividendo:");
		num5 = sc3.nextDouble();
		System.out.println("Introduce el divisor:");
		num6 = sc3.nextDouble();
		divNums = num5 / num6;
		System.out.println("El resultado de la división es " + divNums);
		
		System.out.println("--------------------------------------------------");
		
		//EJERCICIO 4
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Introduce las millas:");
		millas = sc4.nextFloat();
		convKm = (float)(millas + 1.609);
		System.out.println(millas + " milla/s son " + convKm + " kilómetro/s");
	}
}