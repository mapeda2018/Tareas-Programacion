package tareas;
import java.util.Scanner;

public class Tarea5 {
	public static void main(String[] args) {
		//VARIABLES EJERCICIO 1
		int num;
		//VARIABLES EJERCICIO 2
		int num12;
		//VARIABLES EJERCICIO 3
		int numTipo;
		//VARIABLES EJERCICIO 4
		int num1;
		int num2;
		int par = 0;
		//VARIABLES EJERCICIO 5
		long numLargo1;
		long numLargo2;
		long numLargo3;
		//VARIABLES EJERCICIO 6
		double g = 9.8;
		double tiempo;
		double velocidad;
		
		//EJERCICIO 1
		System.out.println("POSITIVO O NEGATIVO");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número (POSITIVO o NEGATIVO):");
		num = sc.nextInt();
		if (num < 0) {
			System.out.println("El número es negativo.");
		}	else if (num > 0) {
				System.out.println("El número es positivo.");
			}	else {
				System.out.println("0, neutro.");
				}
		
		System.out.println("---------------------------------------------------------");
		
		//EJERCICIO 2
		System.out.println("INTRODUCIR EL NÚMERO INDICADO");
		
		System.out.println("Introduce el número 12:");
		num12 = sc.nextInt();
		if (num12 == 12) {
			System.out.println("Bien hecho.");
		}	else {
				System.out.println("Incorrecto.");
			}
		
		System.out.println("---------------------------------------------------------");
		
		//EJERCICIO 3
		System.out.println("PAR O IMPAR");
		
		System.out.println("Introduce un número:");
		numTipo = sc.nextInt();
		if (numTipo % 2 == 0) {
			System.out.println("El número es par.");
		}	else {
				System.out.println("El número es impar.");
			}
		
		System.out.println("---------------------------------------------------------");
		
		//EJERCICIO 4
		System.out.println("CALCULAR CUÁLES SON PAR");
		
		System.out.println("Introduce el primer número (ENTERO):");
		num1 = sc.nextInt();
		if (num1 % 2 == 0) {
			par++;
		}
		System.out.println("Introduce el segundo número (ENTERO):");
		num2 = sc.nextInt();
		if (num2 % 2 == 0) {
			par++;
		}
		if (par == 1) {
			System.out.println("De los números introducidos 1 es par.");
		}	else if (par == 2) {
				System.out.println("De los números introducidos los 2 eran pares.");
			}	else {
					System.out.println("De los números introducidos ninguno era par.");
				}
		
		System.out.println("---------------------------------------------------------");
		
		//EJERCICIO 5
		System.out.println("MAYOR NÚMERO DE LOS TRES");
		
		System.out.println("Introduce el primer número:");
		numLargo1 = sc.nextLong();
		System.out.println("Introduce el segundo número:");
		numLargo2 = sc.nextLong();
		System.out.println("Introduce el tercer número:");
		numLargo3 = sc.nextLong();
		if (numLargo1 > numLargo2 && numLargo1 > numLargo3) {
			System.out.println("El número más grande es el primero, " + numLargo1 + ".");
		}	else if (numLargo2 > numLargo1 && numLargo2 > numLargo3) {
				System.out.println("El número más grande es el segundo, " + numLargo2 + ".");
			}	else {
					System.out.println("El número más grande es el tercero, " + numLargo3 + ".");
				}
		
		System.out.println("---------------------------------------------------------");
		
		//EJERCICIO 6
		System.out.println("CALCULA LA VELOCIDAD");
		
		System.out.println("Introduce el tiempo (EN SEGUNDOS):");
		tiempo = sc.nextDouble();
		if (tiempo <= 0) {
			System.out.println("Tiempo incorrecto.");
		}	else {
				velocidad = g * tiempo;
				System.out.println("La velocidad final es " + velocidad + " m/s.");
			}
			
		sc.close();
	}
}