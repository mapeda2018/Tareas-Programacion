package martes06;
import java.util.Scanner;

public class Area_triangulo {
	public static void main(String[] args) {
		float altura = 1;
		float base = 1;
		//ALTURA
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura del triangulo en cm (LA DECIMAL SE PONE CON ',')");
		altura = sc.nextFloat();
		//BASE
		System.out.println("Introduce la base del triangulo en cm (LA DECIMAL SE PONE CON ',')");
		base = sc.nextFloat();
		//ÁREA
		float calc_base = (base * altura) / 2;
		System.out.println("El área del triangulo es " + calc_base + "cm²");
		sc.close();
	}
}