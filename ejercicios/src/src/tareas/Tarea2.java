package tareas;
import java.util.Scanner;

public class Tarea2 {
	public static void main(String[] args) {
		//TAREA 1 Y 2
		float num1 = 8.23f;
		float num2 = 4.12f;
		//TAREA 3
		int dividendo;
		int divisor;
		//TAREA 4
		int millas;
		int conversionMetros;
		//TAREA 5
		float gradoFahrenheit;
		float gradoCentigrado;
		
		//TAREA 1 Y 2
		//MULTIPLICACIÓN PREFIJADA
		System.out.println("El producto de ambos números es: " + num1 * num2);
		//DIVISIÓN PREFIJADA
		System.out.println("La división de ambos números e: " + num1 / num2);
		
		System.out.println("-------------------------------------------------------------------");
		
		//TAREA 3
		//DIVIDENDO A ELEGIR
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dividendo:");
		dividendo = sc.nextInt();
		//DIVISOR A ELEGIR
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Introduce el divisor:");
		divisor = sc2.nextInt();
		int resultado = dividendo / divisor;
		System.out.println("El resultado de la división es: " + resultado);
		
		System.out.println("-------------------------------------------------------------------");
		
		//TAREA 4
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Introduce las millas:");
		millas = sc3.nextInt();
		conversionMetros = millas + 1609;
		System.out.println(millas + " milla/s son " + conversionMetros + " metro/s");
		
		System.out.println("-------------------------------------------------------------------");
		
		//TAREA 5
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Introduce la temperatura (en °C):");
		gradoCentigrado = sc4.nextFloat();
		gradoFahrenheit = ((gradoCentigrado * 9) / 5) + 32;
		System.out.println(gradoCentigrado + " grado/s son " + gradoFahrenheit + " grados Fahrenheit");		
	}
}
