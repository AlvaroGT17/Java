/*Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto. */

package Estructura_de_programacion_secuencial;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n1, n2, n3, n4;
		
		System.out.print("Ingrese el valor del 1º número: ");
		n1=teclado.nextInt(); 
		
		System.out.print("Ingrese el valor del 2º número: ");
		n2=teclado.nextInt();
		
		System.out.print("Ingrese el valor del 3º número: ");
		n3=teclado.nextInt();
		
		System.out.print("Ingrese el valor del 4º número: ");
		n4=teclado.nextInt();
		
		System.out.println("La suma del 1º número y el 2º número es: " + (n1+n2));
		System.out.println("El producto del 3º número y el 4º número es: " + (n3*n4));
		
		
		teclado.close();

	}

}
