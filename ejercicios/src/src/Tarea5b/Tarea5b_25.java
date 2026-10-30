package Tarea5b;
import java.util.Scanner;

public class Tarea5b_25 {
	public static void main(String[] args) {
		//VARIABLES
		String dulce;
		String comida = "";
		String bebida;
		String bebe ="";
		String pitufoCon = "";
		double precio = 0;

		//EJERCICIO
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué ha tomado para comer? (palmera, donut o pitufo):");
		dulce = sc.nextLine();
		switch (dulce.toLowerCase()) {
			case "palmera":
				precio += 1.40;
				comida = "Palmera: 1,40€";
				break;
			case "donut":
				precio += 1.00;
				comida = "Donut: 1€";
				break;
			case "pitufo":
				System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla):");
				pitufoCon = sc.nextLine();
				switch (pitufoCon.toLowerCase()) {
					case "aceite":
						precio += 1.20;
						comida = "Pitufo con aceite: 1,20€";
						break;
					case "tortilla":
						precio += 1.80;
						comida = "Pitufo con tortilla: 1,80€";
						break;
					default:
						System.out.println("Error. Comida no disponible.");
						sc.close();
						return;
				}
				break;
			default:
				System.out.println("Error. Comida no disponible");
				sc.close();
				return;
		}
		System.out.println("¿Qué ha tomado de beber? (zumo o café):");
		bebida = sc.nextLine();
		bebida = bebida.toLowerCase().replace("é", "e");
		switch (bebida.toLowerCase()) {
			case "zumo":
				precio += 1.50;
				bebe = "Zumo: 1,50€";
				break;
			case "cafe":
				precio += 1.20;
				bebe = "Café: 1,20€";
				break;
			default:
				System.out.println("Error. Bebida no disponible.");
				sc.close();
				return;
		}
		
		System.out.println("---------------------------------------------");
		
		System.out.println(comida);
		System.out.println(bebe);
		System.out.printf("Total desayuno: %.2f€", precio);
		sc.close();
	}
}