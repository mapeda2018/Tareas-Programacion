package Tarea8b;
import java.util.Scanner;

public class Tarea8b_9 {
	public static void main(String[] args) {
		//VARIABLES
		int combinacion = 3974;
		int intentos = 3;
		int contrasena;
		
		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("Tienes que adivinar la contraseaña de 4 dígitos de la caja fuerte.");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Introduce la contraseña:");
		contrasena = sc.nextInt();
        while (intentos >= 0) {
            if (contrasena != combinacion) {
        		System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("Contraseña incorrecta. Introduce otra:");
                if (intentos > 0) contrasena = sc.nextInt();
                intentos--;
            } else {
                System.out.println("Contraseña correcta.");
                sc.close();
                return;
            }
        }
        sc.close();
    }
}