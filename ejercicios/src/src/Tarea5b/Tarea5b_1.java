package Tarea5b;
import java.util.Scanner;

public class Tarea5b_1 {
	public static void main(String[] args) {
		//VARIABLES
		String diaDeLaSemana;

		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un día de la semana lectivo:");
		diaDeLaSemana = sc.nextLine();
		if (diaDeLaSemana.equalsIgnoreCase("lunes")) {
			System.out.println("A primera hora hay Programación.");
		}	else if (diaDeLaSemana.equalsIgnoreCase("martes")) {
				System.out.println("A primera hora hay Base de datos.");
			}	else if (diaDeLaSemana.equalsIgnoreCase("miércoles") || diaDeLaSemana.equalsIgnoreCase("miercoles")) {
					System.out.println("A primera hora hay Programación.");
				}	else if (diaDeLaSemana.equalsIgnoreCase("jueves")) {
						System.out.println("A primera hora hay Sistemas informáticos.");
					}	else if (diaDeLaSemana.equalsIgnoreCase("viernes")) {
							System.out.println("A primera hora hay IPE.");
						}	else {
								System.out.println("Error.");
							}
		sc.close();
	}
}