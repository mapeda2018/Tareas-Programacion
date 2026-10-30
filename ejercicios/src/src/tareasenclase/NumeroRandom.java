package tareasenclase;
import java.util.Scanner;
import java.util.Random;

public class NumeroRandom {
	public static void main(String[] args) {
		//VARIABLES
		int numeroSecreto;
		int elegirNumero;
		int intentos = 10;
		int intentosUsados = 0;
		int numIntentos = 0;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		numeroSecreto = rd.nextInt(51);
		System.out.println("Adivina el número secreto.");
		for (;;) {
			numIntentos = intentos - intentosUsados;
			System.out.println("Te quedan " + numIntentos + " intentos." );
			elegirNumero = sc.nextInt();
			if (elegirNumero == numeroSecreto) {
				System.out.println("Lo has adivinado.");
				sc.close();
				break;
			}	else if (elegirNumero < numeroSecreto) {
					System.out.println("Incorrecto. El número secreto es mayor.");
					System.out.println("--------");
					intentosUsados++;
				}	else {
						System.out.println("--------");
						System.out.println("Incorrecto. El número secreto es menor");
						intentosUsados++;
					}
			if (intentosUsados == intentos) {
				System.out.println("Has llegado al límite de intentos.");
				System.out.println("El número secreto era " + numeroSecreto);
				sc.close();
				break;
			}
		}
	}
}