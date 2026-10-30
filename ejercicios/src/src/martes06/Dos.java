package martes06;
import java.util.Scanner;

public class Dos {
	public static void main(String[] args) {
		long primerNumero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número por teclado (NO MAYOR A 9223372036854775807).");
		primerNumero = sc.nextLong();
		long segundoNumero;
		System.out.println("Introduce el segundo número por teclado (NO MAYOR A 9223372036854775807).");
		segundoNumero = sc.nextLong();
		System.out.println("La suma de los números introducidos es: " + (primerNumero + segundoNumero)+".");
		if (primerNumero>segundoNumero) {
			System.out.println("El mayor era el primer número; "+ primerNumero+".");
		}	else if (primerNumero<segundoNumero) {
				System.out.println("El mayor era el segundo número; "+ segundoNumero+".");
			}	else {
					System.out.println("Ambos son iguales.");
				}
		sc.close();
	}
}