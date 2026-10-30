package tareasenclase;
import java.util.Scanner;

public class Operaciones_basicas2 {
    public static void main(String[] args) {
    	float nota;
 
    	System.out.println("Introduzca su nota:");
    	Scanner sc = new Scanner(System.in);
    	nota = sc.nextFloat();
    	sc.close();
    	
    	if (nota >= 0  &&  nota < 5) {
    		System.out.println("Suspenso");
    	}	else if (nota >= 5  &&  nota < 6) {
    			System.out.println("Aprobado");
    		}	else if (nota >= 6  &&  nota < 7) {
    				System.out.println("Bien");
    			}	else if (nota >= 7  &&  nota < 9) {
    					System.out.println("Notable");
    				}	else if (nota >= 9  &&  nota <= 10) {
    						System.out.println("Sobresaliente");
    					}	else {
    							System.out.println("Nota incorrecta");
    						}
    }
}