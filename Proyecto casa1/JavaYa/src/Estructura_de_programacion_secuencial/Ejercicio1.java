/*Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.*/

package Estructura_de_programacion_secuencial;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int sumando1 = 5;
		int sumando2 = 7;
		
		System.out.println("La suma de " + sumando1 + " + " + sumando2 + " es isgual a: " + (sumando1+sumando2));
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Introduzca el primer sumando: ");
		int sumteclado1 = teclado.nextInt();
		System.out.print("Introduzca el segundo sumando: ");
		int sumteclado2 = teclado.nextInt();
		
		System.out.println("La suma de " + sumteclado1 + " + " + sumteclado2 + " es isgual a: " + (sumteclado1+sumteclado2));
		
		teclado.close();
	}

}
