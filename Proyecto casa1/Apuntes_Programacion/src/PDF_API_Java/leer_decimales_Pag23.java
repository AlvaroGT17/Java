package PDF_API_Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class leer_decimales_Pag23 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float numdec;
		
		
		try {
			
		System.out.print("Introduce un numero decimal: ");
		numdec = teclado.nextFloat();
		teclado.nextLine();
		System.out.print("El número introducido es: " + numdec);
		
		} catch (InputMismatchException ex){
			
			System.out.print(" ERROR!!!. no se ha introducido ningún numero.");
			teclado.nextLine();
		};
		
		teclado.close();
	}

}
