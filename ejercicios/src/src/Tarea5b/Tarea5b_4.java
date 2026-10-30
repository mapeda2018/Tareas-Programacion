package Tarea5b;
import java.util.Scanner;

public class Tarea5b_4 {
    public static void main(String[] args) {
    	//VARIABLES
        int horasTrabajadas;
        int horasExtras;
        int salarioSemanal;
        
        //EJERCICIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
        horasTrabajadas = sc.nextInt();
        if (horasTrabajadas <= 40) {
            salarioSemanal = horasTrabajadas * 12;
        } 	else {
            	horasExtras = horasTrabajadas - 40;
            	salarioSemanal = (40 * 12) + (horasExtras * 16);
        	}
        System.out.println("El sueldo semanal que le corresponde es de " + salarioSemanal + " euros.");
        sc.close();
    }
}