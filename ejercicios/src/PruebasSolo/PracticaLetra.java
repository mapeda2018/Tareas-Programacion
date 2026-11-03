package PruebasSolo;
import java.util.Scanner;

public class PracticaLetra {
    public static void main(String[] args) {
    	//VARIABLES
    	int i;
    	int j;
    	
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
        	for (j = 0; j < 5; j++) {
        		System.out.println("*");
        	}
        	System.out.println("");
        }
        sc.close();
    }
}