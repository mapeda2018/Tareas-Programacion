package Tarea5b;
import java.util.Scanner;

public class Tarea5b_3 {
    public static void main(String[] args) {
    	//VARIABLES
        int numDia;
        
        //EJERCICIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número del 1 al 7 para recibir el respectivo día de la semana:");
        numDia = sc.nextInt();
        if (numDia == 1) {
            System.out.println("Lunes.");
        } 	else if (numDia == 2) {
        		System.out.println("Martes.");
        	} 	else if (numDia == 3) {
        			System.out.println("Miércoles.");
        		} 	else if (numDia == 4) {
        				System.out.println("Jueves.");
        			} 	else if (numDia == 5) {
        					System.out.println("Viernes.");
        						}	else if (numDia == 6) {
        								System.out.println("Sábado.");
        							} 	else if (numDia == 7) {
        									System.out.println("Domingo.");
        								} 	else {
        										System.out.println("Introduce un número de día válido.");
        									}
        sc.close();
    }
}