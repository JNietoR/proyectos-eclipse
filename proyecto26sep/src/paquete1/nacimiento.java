package paquete1;

import java.util.Scanner;

public class nacimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Un programa que lea desde teclado su fecha de nacimiento y la fecha de hoy e impirma en 
		 * la pantalla el numero de dias que lleva viviendo. Una fecha puede venir representada por 
		 * tres enteros correspondientes al año, mes y dia.
		 * Considere que todos los años tienen 365 dias y que todos los meses delaño tienen 30 dias.
		 * 
		 * Escriba un programa que impirma en la pantalla la edad de una persona 
		 * cuyo año de nacimiento es leido por el teclado. Defina el año actual como una constante.
		 */
	
		Scanner sc = new Scanner(System.in);
		
		final int diasaño = 365;
		final int diasmes = 30;
		
		int añonacimiento,mesnacimiento,dianacimiento,añoactual,mesactual,diaactual,resultado;
		
		System.out.println("Introduce año actual");
		
		añoactual = sc.nextInt();
		
		System.out.println("Introduce mes actual");
		
		mesactual = sc.nextInt();
		
		System.out.println("Introduce dia actual");
		
		diaactual = sc.nextInt();
		
		System.out.println("Introduce año nacimiento");
		
		añonacimiento = sc.nextInt();
		
		System.out.println("Introduce mes nacimiento");
		
		mesnacimiento = sc.nextInt();
		
		System.out.println("Introduce dia nacimiento");
		
		dianacimiento = sc.nextInt();
		
		resultado = (añoactual-añonacimiento)*diasaño + (mesactual-mesnacimiento)*diasmes + (diaactual-dianacimiento);
		
		System.out.println("Ha vivido durante "+resultado+" días.");
		
		
		
		
		
		
		
			
	
	
	}

}
