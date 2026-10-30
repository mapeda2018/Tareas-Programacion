package Tarea8a;
import java.util.Scanner;

public class Tarea8a_2 {
	public static void main(String[] args) {
		//VARIABLES
		int alumno = 0;
		int numAlumnos = 0;
		boolean edad = true;
		int suma = 0;
		int media = 0;
		double resultado;
		int mayorEdad = 0;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		while (edad) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Introduce las edades de los alumnos (NO PUEDE TENER 0 AÑOS):");
			alumno = sc.nextInt();
			if (alumno == 0) {
				System.out.println("Error. El alumno no puede tener 0 años.");
				continue;
			}
			if (alumno < 0) {
				edad = false;
				break;
			}
			suma += alumno;
			media++;
			numAlumnos++;
			if (alumno >= 18) {
				mayorEdad++;
			}
		}
		
		System.out.println("----------------------------------------------------------------------");
		if (numAlumnos == 1) {
			System.out.println("Al ser un solo alumno no se puede hacer una suma, pero su edad es " + suma);
		}	else {
				System.out.println("La suma de sus edades es " + suma);
			}

		if (numAlumnos == 1) {
			System.out.println("Se ha introducido la edad de " + numAlumnos + " alumno.");
			if (mayorEdad == 1) {
				System.out.println("El alumno es mayor de edad.");
			}
		}	else {
				System.out.println("Se ha introducido la edad de " + numAlumnos + " alumnos.");
				System.out.println(mayorEdad + " son mayores de edad.");
			}
		resultado = (double) suma / media;
		System.out.printf("La media de las edades es: %.2f.", resultado);
		sc.close();
	}
}