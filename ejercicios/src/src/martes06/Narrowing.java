package martes06;

public class Narrowing {
	public static void main(String[] args) {
		
		//1. DOUBLE -> INT
		double d1 = 8.78;
		int i1 = (int)d1;
		double a = 0;
		if (d1 > i1) {
			a = d1 - i1;
		}
		System.out.println("1. Double a Int:   " + d1 + " -> " + i1 + "   Se han perdido " + a + " decimales");
		
		//2. LONG -> INT
		long l1 = 3000000000L;
		int i2 = (int)l1;
		System.out.println("2. Long a Int:     " + l1 + " -> " + i2);
		
		//3. INT -> SHORT
		int i3 = 20000;
		short s1 = (short)i3;
		System.out.println("3. Int a Short:    " + i3 + " -> " + s1);
		
		//4. CHAR -> BYTE
		char c1 = 'A';
		byte b2 = (byte)c1;
		System.out.println("4. Char a Byte:    " + c1 + " -> " + b2);
		
		//5. FLOAT -> BYTE
		float f1 = 123.99f;
		byte b3 = (byte)f1;
		float b = 0;
		if (f1 > b3) {
			b = f1 - b3;
		}
		System.out.println("5. Float a Byte:   " + f1 + " -> " + b3 +  "   Se han perdido " + b + " decimales");

		//6. INT -> BYTE
		int i4 = 130;
		byte b1 = (byte) i4;
		System.out.println("6. Int a Byte:     " + i4 + " -> " + b1);
		
		//7. DOUBLE -> SHORT
		double d2 = 40000.5;
		short s2 = (short)d2;
		System.out.println("7. Double a Short: " + d2 + "->" + s2);
		
		//8. NARROWING EN EXPRESIONES
		int c = 5;
		int d = 2;
		//PERDIENDO DECIMALES
		double r1 = (double)(c/d);
		System.out.println("8. Sin decimales:  r1 -> " + r1);
		//RECORDANDO DECIMALES
		double r2 = (double)c/d;
		System.out.println("8. Con decimales:  r2 -> " + r2);
	}
}