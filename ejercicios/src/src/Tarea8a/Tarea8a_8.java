package Tarea8a;
import java.util.Scanner;

public class Tarea8a_8 {
    public static void main(String[] args) {
    	//VARIABLES
    	int numero;
    	int i;
    	int factorial = 1;
        
        //EJERCICIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona un número para calcular su factorial:");
        numero = sc.nextInt();
        for (i = numero; i > 0; i--) {
        	factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        sc.close();
    }
}