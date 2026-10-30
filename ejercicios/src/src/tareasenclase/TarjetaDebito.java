package tareasenclase;
import java.util.Scanner;

public class TarjetaDebito {
    public static void main(String[] args) {
    	//VARIABLES
        double saldo = 500.00;
        int contrasenaCorrecta = 1234;
        int elegirContrasena;
        int intentos = 3;
        boolean accede = false;
        double ingreso;
        int opcion;
        double retiro;
        
        //EJERCICIO
        Scanner sc = new Scanner(System.in);
        while (intentos > 0 && !accede) {
        	System.out.println("Introduzca su PIN secreto: ");
            elegirContrasena = sc.nextInt();          
            if (elegirContrasena == contrasenaCorrecta) {
            	accede = true;
            }	else {
                	intentos--;
                	if (intentos > 0) {
                		System.out.println("PIN incorrecto. Le quedan " + intentos + " intentos.");
                	}	else {
                			System.out.println("PIN incorrecto. Ha agotado todos los intentos. Acceso bloqueado.");
                		}
            	}
        }
        System.out.println("-------------------------------------------------------------------------------------------");
        if (accede) {
            System.out.println("Seleccione la acción:");
            System.out.println("1 - Ingresar efectivo");
            System.out.println("2 - Retirar efectivo");
            opcion = sc.nextInt();   
            System.out.println("-------------------------------------------------------------------------------------------");   
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el importe a ingresar (€): ");
                    ingreso = sc.nextDouble();
                    if (ingreso > 0) {
                        saldo += ingreso;
                    } 	else {
                        	System.out.println("El importe a ingresar debe ser mayor que cero.");
                    	}
                    break;                  
                case 2:
                    System.out.println("Introduzca el importe a retirar (€): ");
                    retiro = sc.nextDouble();
                    if (retiro > 0) {
                        if (retiro <= saldo) {
                            saldo -= retiro;
                        } 	else {
                        		System.out.println("Error. Saldo insuficiente para realizar la operación.");
                        	}
                    } 	else {
                        	System.out.println("El importe a retirar debe ser mayor que cero.");
                    	}
                    break;      
                default:
                    System.out.println("Error. La opción seleccionada no es válida.");
                    break;
            }
            System.out.println("-------------------------------------------------------------------------------------------");  
            System.out.printf("Saldo disponible actual: %.2f €\n", saldo);
        }
        sc.close();
    }
}