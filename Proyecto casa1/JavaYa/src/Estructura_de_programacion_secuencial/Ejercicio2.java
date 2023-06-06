/* Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro) */

package Estructura_de_programacion_secuencial;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		
		int lado;
		int perimetro;
		
		System.out.print("Ingrese el tama�o del lado del cuadrado a calcular: ");
		lado = teclado.nextInt();
		
		perimetro=lado*4;
		
		System.out.print("El perimetro de dicho cuadrado es: " + perimetro);
		
		teclado.close();
	}

}
