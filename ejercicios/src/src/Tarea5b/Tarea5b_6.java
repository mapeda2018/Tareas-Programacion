package Tarea5b;
import java.util.Scanner;

public class Tarea5b_6 {
    public static void main(String[] args) {
    	//VARIABLES
        int num1;
        int num2;
        int num3;
        double media;
        
        //EJERCICIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        num2 = sc.nextInt();
        System.out.println("Introduce el tercer número:");
        num3 = sc.nextInt();
        media = (double)(num1 + num2 + num3) / 3;
        System.out.println("La media de las notas es " + media);
        sc.close();
    }
}