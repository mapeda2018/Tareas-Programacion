package tareasenclase;
import java.util.Scanner;

public class Operaciones_basicas4 {
    public static void main(String[] args) {
    	int numero;
    	int positivos = 0;
    	int negativos = 0;
    	int suma = 0;
    	
    	System.out.println("Introduce los números (0 PARA PARAR):");
    	for(;;) {
        	Scanner sc = new Scanner(System.in);
        	numero = sc.nextInt();
    		if (numero == 0) {
    			sc.close();
    			break;
    		}	else if (numero < 0) {	
    				negativos++;
    				suma = suma + numero;
    			}	else if (numero > 0) {
    					positivos++;
    					suma = suma + numero;
    				}
    	}
		System.out.println("Números positivos: " + positivos);
		System.out.println("Números negativos: " + negativos);
		System.out.println("La suma de los números es: " + suma);
    }
}