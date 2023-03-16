package uwupdf;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implemente un programa en Java que resuelva la siguiente fórmula para resolver con 
			qué fuerza se atraen dos cuerpos: F=G*((m1*m2)/r^2) G = 6.673e-11
		 */
		Scanner sc = new Scanner(System.in);
		int m1,m2,r;
		double resultado;
		final double g = 6.673e-11;
		
		System.out.println("Introduce la primera masa:");
		m1 = sc.nextInt();
		System.out.println("Introduce la segunda masa:");
		m2 = sc.nextInt();
		System.out.println("Introduce la distancia entre los dos cuerpos:");
		r = sc.nextInt();
		
		resultado = g*((m1*m2)/Math.pow(r, 2));
		
		System.out.println("La fuerza con la que se atraen la masa es: "+resultado+"");
		
	}

}
