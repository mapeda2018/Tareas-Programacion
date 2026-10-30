package Tarea8b;
import java.util.Scanner;

public class Tarea8b_5 {
	public static void main(String[] args) {
		//VARIABLES
		int numero;
		int oremun;
		int digito;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número a dar la vuelta:");
		numero = sc.nextInt();
		while (numero > 0) {
			digito = numero%10;
			oremun = oremun * 10 + digito;
			numero /= 10;
		}
		System.out.println(oremun);
		sc.close();
	}
}