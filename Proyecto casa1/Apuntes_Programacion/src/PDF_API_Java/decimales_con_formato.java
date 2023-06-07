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
		
		double num2 = 156792.6581179;
		double num3 = 15679223.61235879;
		double num4 = 15679.65879;
		double num5 = 1562.658;
		double num6 = 156211792.65879;
		double num7 = 156792123.65;
		int num8 = 1549;
		String nombre = "Alvaro";
		
		System.out.println("");
		System.out.println("");
		System.out.printf("valor 11: %-19.2f %n", num3);
		System.out.printf("valor 12: %-19.2f %n", num2);
		System.out.printf("valor 13: %-19.2f %n", num4);
		System.out.printf("valor 14: %-19.2f %n", num7);
		System.out.printf("valor 15: %-19.2f %n", num6);
		System.out.printf("valor 16: %19.2f %n", num5);
		System.out.printf("valor 17: %19.2f %n", num4);
		System.out.printf("valor 18: %19.2f %n", num2);
		System.out.printf("valor 19: %19.2f %n", num3);
		System.out.printf("valor 20: %19.2f %n", num7);
		
		System.out.println("");
		System.out.println("");
		
		System.out.printf("El usuario %s, con ID %d escribio el número: %f.", nombre, num8, num6);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Esto es una prueba para insertar \"comillas dobles\".");
		
	
	}

}
