package martes06;

public class Uno {
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		System.out.println("We are Charlie Kirk");
		for (int i=0; i<=100; i++) {
			if ((i%2)==0) {
				System.out.println(i+" par");
			}		else {
						System.out.println(i+" impar");
				}
		}
		System.out.println("---------------------------------");
		int j=100;
		while(j>=0) {
			if ((j%2)==1) {
				System.out.println(j+" impar");
			}
			j--;
		}
		j=100;
		while(j>=0) {
			if ((j%2)==0) {
				System.out.println(j+" par");
			}
			j--;
		}
	}
}