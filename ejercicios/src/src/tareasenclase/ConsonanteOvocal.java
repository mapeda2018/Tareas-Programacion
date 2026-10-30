package tareasenclase;
import java.util.Scanner;

public class ConsonanteOvocal {
	public static void main(String[] args) {
		//VARIABLES EJERCICIO
		char letra;
		String tipo;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce UNA letra:");
		letra = sc.next().charAt(0);
		switch(letra) {
			case 'a' , 'e' , 'i' , 'o' , 'u':
				tipo = "vocal";
				sc.close();
				break;
			default:
				tipo = "consonante";
				sc.close();
				break;
		}
		System.out.println("La letra es " + tipo);
	}
}
