// Diseñar un programa que pida un número al usuario -por teclado- y a continuación lo muestre. 

package Tema1_Conceptos_Basicos;

import java.util.Scanner;

public class actividad2_Pag23 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Ingrese un número de su eleción: ");
		num=teclado.nextInt();
		
		System.out.println("El número introducido es: " + num);
		
		teclado.close();

	}

}
