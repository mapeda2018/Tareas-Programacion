package Tarea5b;
import java.util.Scanner;

public class Tarea5b_8 {
	public static void main(String[] args) {
		//VARIABLES
		double a;
		double b;
		double c;
		double discriminante;
		double raiz;
		double dividendo1;
		double dividendo2;
		double x1;
		double x2;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 'a' en la ecuación (ax2 + bx + c = 0):");
		a = sc.nextDouble();
		if (a == 0) {
			System.out.println("Error. 'a' no puede ser 0.");
			sc.close();
			return;
		}
		System.out.println("Introduce 'b' en la ecuación (ax2 + bx + c = 0):");
		b = sc.nextDouble();
		System.out.println("Introduce 'c' en la ecuación (ax2 + bx + c = 0):");
		c = sc.nextDouble();
		discriminante = ((b * b) - (4 * a * c));
		if (discriminante < 0) {
			System.out.println("Error. La raíz no puede ser negativa.");
			sc.close();
			return;
		}
		raiz = Math.sqrt(discriminante);
		dividendo1 = -b + raiz;
		dividendo2 = -b - raiz;
		if (dividendo1 == 0 || dividendo2 == 0) {
			System.out.println("X es igual a 0");
			sc.close();
			return;
		}
		x1 = dividendo1 / (2 * a);
		x2 = dividendo2 / (2 * a);
		System.out.println("x1 es igual a " + x1);
		System.out.println("x2 es igual a " + x2);
		sc.close();
	}
}