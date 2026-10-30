package tareas;
import java.util.Scanner;
import java.time.LocalTime;

public class Tarea4 {
	public static void main(String[] args) {
		//VARIABLES EJERCICIO 1
		short muestramin = -32768;
		short muestramax = 32767;
		//VARIABLES EJERCICIO 2
		int nota1;
		int nota2;
		double media;
		//VARIABLES EJERCICIO 3
		double nota3;
		double nota4;
		double nota5;
		double mediaDecimal;
		//VARIABLES EJERCICIO 4
		double numeroDecimal;
		int numeroEntero;
		
		//EJERCICIO 1
		System.out.println("El valor mínimo del short es " + muestramin + " y el máximo es " + muestramax + ".");
		short muestraminplus = (short)(muestramin - 1);
		short muestramaxplus = (short)(muestramax + 1);
		System.out.println("Si le restamos un dígito (o los que sean) al mínimo resultará en: " + muestraminplus);
		System.out.println("Si le sumamos un dígito (o los que sean) al máximo resultará en: " + muestramaxplus);
		System.out.println("Ambos valores darán una vuelta, invirtiendo el signo.");
		
		System.out.println("------------------------------------------------------------------------");
		
		//EJERCICIO 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera nota (ENTERA):");
		nota1 = sc.nextInt();
		System.out.println("Introduce la segunda nota (ENTERA):");
		nota2= sc.nextInt();
		media = (double)(nota1 + nota2) / 2;
		System.out.println("La media de las notas es " + media);
		
		System.out.println("------------------------------------------------------------------------");
		
		//EJERCICIO 3
		System.out.println("Introduce la primera nota (DECIMAL):");
		nota3 = sc.nextDouble();
		System.out.println("Introduce la segunda nota (DECIMAL):");
		nota4= sc.nextDouble();
		System.out.println("Introduce la tercera nota (DECIMAL):");
		nota5= sc.nextDouble();
		mediaDecimal = (int)(nota3 + nota4 + nota5) / 2;
		System.out.println("La media de las notas decimales en entera es " + mediaDecimal);
		
		System.out.println("------------------------------------------------------------------------");
		
		//EJERCICIO 4
		System.out.println("Introduce el número decimal:");
		numeroDecimal = sc.nextDouble();
		numeroEntero = (int)Math.round(numeroDecimal);
		System.out.println("El número decimal redondeado al entero más cercano es " + numeroEntero);
		
		System.out.println("------------------------------------------------------------------------");
		
		//EJERCICIO 5
		System.out.println("Ahora mismo son las: " + LocalTime.now());
		
		sc.close();
	}
}
