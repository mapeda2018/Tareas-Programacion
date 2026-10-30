package Tarea5b;
import java.util.Scanner;

public class Tarea5b_7 {
    public static void main(String[] args) {
    	//VARIABLES
        int num1;
        int num2;
        int num3;
        double media;
        String calificacion = null;
        
        //EJERCICIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número (SOBRE 10):");
        num1 = sc.nextInt();
        if (num1 > 10) {
        	System.out.println("Error.");
        	sc.close();
        	return;
        }
        System.out.println("Introduce el segundo número (SOBRE 10):");
        num2 = sc.nextInt();
        if (num2 > 10) {
        	System.out.println("Error.");
        	sc.close();
        	return;
        }
        System.out.println("Introduce el tercer número (SOBRE 10):");
        num3 = sc.nextInt();
        if (num3 > 10) {
        	System.out.println("Error.");
        	sc.close();
        	return;
        }
        media = (double)(num1 + num2 + num3) / 3;
        if (media >= 0 && media < 5) {
            calificacion = "suspenso";
        } 	else if (media >= 5 && media < 6) {
            	calificacion = "aprobado";
        	} 	else if (media >= 6 && media < 7) {
        			calificacion = "bien";
        		} 	else if (media >= 7 && media < 9) {
        				calificacion = "notable";
        			} 	else if (media >= 9 && media <= 10) {
        					calificacion = "sobresaliente";
        				} 	else {
        						System.out.println("Nota incorrecta");
        					}
        System.out.println("La media de las notas es " + media + " , un " + calificacion + ".");
        sc.close();
    }
}