package Tarea5b;
import java.util.Scanner;

public class Tarea5b_12 {
	public static void main(String[] args) {
		//VARIABLES
		boolean ordenar = true;
		int num1;
		int num2;
		int num3;
		int mayor = 0;
		int medio = 0;
		int menor = 0;
		
		//VARIABLES
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Introduzca el tercer número:");
		num3 = sc.nextInt();
		while (ordenar == true) {
		    if (num3 > num1 && num3 > num2) {                               //SI 3 ES MAYOR
		        mayor = num3;
		        if (num1 < num2) {
		            medio = num2;
		            menor = num1;
		        }	else {
		            	medio = num1;
		            	menor = num2;
		        	}
		        	ordenar = false;
		    }	else if (num2 > num1 && num2 > num3) {						//SI 2 ES MAYOR
		        	mayor = num2;
		        	if (num3 < num1) {
		        		medio = num1;
		        		menor = num3;
		        	}	else {
		            		medio = num3;
		            		menor = num1;
		        		}
		        	ordenar = false;
		    }	else if (num1 > num2 && num1 > num3) {						//SI 1 ES MAYOR
	        		mayor = num1;
	        		if (num2 < num3) {
	        			medio = num3;
	        			menor = num2;
	        		}	else {
	            			medio = num2;
	            			menor = num3;
	        			}
	        	ordenar = false;
		    }  	else {
		    		System.out.println("Introduce números distintos.");
		    		sc.close();
		    		ordenar = false;
		    		return;
		    	}
		}
		sc.close();
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("El orden es:");
		System.out.println("Mayor: " + mayor);
		System.out.println("Medio: " + medio);
		System.out.println("Menor: " + menor);
	}
}