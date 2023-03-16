package paquete1;

import java.util.Scanner;

public class años {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Escriba un programa que impirma en la pantalla la edad de una persona 
		 * cuyo año de nacimiento es leido por el teclado. Defina el año actual como una constante.
		 */
	
		Scanner sc = new Scanner(System.in);
		
		final int diasaño = 365;
		final int diasmes = 30;
		final int añoactual = 2022;
		final int mesactual = 9;
		final int diaactual = 28;
		
		int añonacimiento,mesnacimiento,dianacimiento,resultado,edad;
		
		System.out.println("Introduce año nacimiento");
		
		añonacimiento = sc.nextInt();
		
		System.out.println("Introduce mes nacimiento");
		
		mesnacimiento = sc.nextInt();
		
		System.out.println("Introduce dia nacimiento");
		
		dianacimiento = sc.nextInt();
		
		resultado = (añoactual-añonacimiento)*diasaño + (mesactual-mesnacimiento)*diasmes + (diaactual-dianacimiento);
		
		edad = resultado/diasaño;
		System.out.println("Ha vivido durante "+edad+" años.");
	}

}
