// Clase para esperimentar con printf

package PDF_API_Java;

public class decimales_con_formato {

	public static void main(String[] args) {

		double num = 156792.65879;
		
		System.out.printf("valor 01: %,3.4f %n", num);
		System.out.printf("valor 02: %f %n", num);
		System.out.printf("valor 03: %6.3f %n", num);
		System.out.printf("valor 04: %15.1f %n", num);
		System.out.printf("valor 05: %7.3f %n", num);
		System.out.println("");
		System.out.println("");
		System.out.printf("valor 06: %15.1f %n", num);
		System.out.printf("valor 07: %14.2f %n", num);
		System.out.printf("valor 08: %13.3f %n", num);
		System.out.printf("valor 09: %12.4f %n", num);
		System.out.printf("valor 10: %11.5f %n", num);
		
	}

}
