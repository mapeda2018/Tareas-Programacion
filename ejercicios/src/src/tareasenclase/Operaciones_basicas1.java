package tareasenclase;
import java.util.Scanner;

public class Operaciones_basicas1 {
    public static void main(String[] args) {
    	//VARIABLES
    	String nombre;
    	int edad;
    	int horasDormidas;
    	int horasSemana;
    	boolean mayorDeEdad;
    	int edadQueFalta = 1;
    	
    	//ESCÁNER TECLADO
    	Scanner sc = new Scanner(System.in);
    	//INTRODUCIR NOMBRE
    	System.out.println("Introduzca su nombre:");
    	nombre = sc.nextLine();
    	//INTRODUCIR EDAD
    	System.out.println("Introduzca su edad:");
    	edad = sc.nextInt();
    	//INTRODUCIR HORAS DE SUEÑO
    	System.out.println("Introduzca su tiempo de sueño (HORAS AL DÍA):");
    	horasDormidas = sc.nextInt();
    	//CÁLCULO DEL SUEÑO A LA SEMANA
    	horasSemana = horasDormidas * 7;
    	//CÁLCULO DE LA EDAD
    	if (edad >= 18) {
    		mayorDeEdad = true;
    	}   else {
				mayorDeEdad = false;
			}
    	if (mayorDeEdad == false) {
    		edadQueFalta = 18 - edad;
    	}
    	
    	System.out.println("-----------------------------------------------------------------------------");
    	
    	//TEXTOS FINALES
    	System.out.println("Bienvenido/a, " + nombre + ".");
       	if (mayorDeEdad == true) {
       		System.out.println("Tiene " + edad + " año/s.");
       	}	else {
       		System.out.println("Tiene " + edad + " años. Le falta " + edadQueFalta + " año/s para la mayoría de edad.");
       	}
    	System.out.println("Duerme unas " + horasSemana + " horas a la semana.");
    }
}