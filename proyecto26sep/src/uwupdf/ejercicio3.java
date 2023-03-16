package uwupdf;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implementa un programa en Java que reciba dos parámetros de tipo entero: distancia y tiempo. 
		 * El programa mostrará por pantalla la aceleración obtenida a partir de estas variables.
		 * La formula de la aceleración es: a= d/t.
		 */
		Scanner sc = new Scanner(System.in);
		int distancia,tiempo;
		double aceleracion;
		System.out.println("Introduce la distancia en metros:");
		distancia = sc.nextInt();
		System.out.println("Introduce el tiempo en segundos:");
		tiempo = sc.nextInt();
		aceleracion = (double) distancia/tiempo;
		System.out.println("La aceleración sería: "+aceleracion+" m/s.");
	}

}
