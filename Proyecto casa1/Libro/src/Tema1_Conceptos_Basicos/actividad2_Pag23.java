// Dise�ar un programa que pida un n�mero al usuario -por teclado- y a continuaci�n lo muestre. 

package Tema1_Conceptos_Basicos;

import java.util.Scanner;

public class actividad2_Pag23 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Ingrese un n�mero de su eleci�n: ");
		num=teclado.nextInt();
		
		System.out.println("El n�mero introducido es: " + num);
		
		teclado.close();

	}

}
