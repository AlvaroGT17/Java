/*Escribir un programa en el cual se ingresen cuatro n�meros, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto. */

package Estructura_de_programacion_secuencial;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n1, n2, n3, n4;
		
		System.out.print("Ingrese el valor del 1� n�mero: ");
		n1=teclado.nextInt(); 
		
		System.out.print("Ingrese el valor del 2� n�mero: ");
		n2=teclado.nextInt();
		
		System.out.print("Ingrese el valor del 3� n�mero: ");
		n3=teclado.nextInt();
		
		System.out.print("Ingrese el valor del 4� n�mero: ");
		n4=teclado.nextInt();
		
		System.out.println("La suma del 1� n�mero y el 2� n�mero es: " + (n1+n2));
		System.out.println("El producto del 3� n�mero y el 4� n�mero es: " + (n3*n4));
		
		
		teclado.close();

	}

}
