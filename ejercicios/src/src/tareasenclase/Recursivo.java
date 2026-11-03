package src.tareasenclase;
import java.util.Scanner;

public class Recursivo {
	public static void contar(int num) {
		//VARIABLES
		
		
		//EJERCICIO
		if (num == 0) {
			System.out.println("DESPEGUE");
		}	else {
				System.out.println(num);
				contar(num - 1);
			}
	}
    public static void main(String[] args) {
    	//VARIABLES
    	int num = 10;
    	
    	//EJERCICIO
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Introduce un número:");
    	num = sc.nextInt();
    	contar(num);
    	sc.close();
    }
}