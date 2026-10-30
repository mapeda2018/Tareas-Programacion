package tareasenclase;
import java.util.Scanner;

public class Operaciones_basicas3 {
    public static void main(String[] args) {
    	int numMax;
    	int pares = 0;
    	int impares = 0;
    	
    	System.out.println("Introduce el número máximo a llegar:");
    	Scanner sc = new Scanner(System.in);
    	numMax = sc.nextInt();
		for (int i = 1; i <= numMax; i++) {
			if ((i%2) == 0) {
				System.out.println(i + " -> par");
				pares++;
			}	else {
					System.out.println(i + " -> impar");
					impares++;
				}
		}
		System.out.println("Números pares: " + pares);
		System.out.println("Números impares:" + impares);	
		sc.close();
    }
}