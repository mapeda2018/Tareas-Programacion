package tareasenclase;
import java.util.Scanner;

public class L_con_bucle {
    public static void main(String[] args) {
        int elegirh = 0;
        int elegirb = 0;        
        System.out.println("Elige la altura de la letra");
        Scanner sc = new Scanner(System.in);
        elegirh = sc.nextInt();  
        System.out.println("Elige la base de la letra");
        elegirb = sc.nextInt();     
        for (int i = 1; i < elegirh; i++) {
            System.out.print("* ");
            for (int j = 2; j <= elegirb; j++) {
                System.out.print("' ");
            }
            System.out.println();
        }
        for (int j = 1; j <= elegirb; j++) {
            System.out.print("* ");
        }      
        System.out.println(); 
        sc.close();
    }
}