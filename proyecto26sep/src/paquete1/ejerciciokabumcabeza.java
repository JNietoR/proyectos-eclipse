package paquete1;

import java.util.Scanner;

public class ejerciciokabumcabeza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Recibe por teclado un numero de segundos y te dice cuantas horas, minutos y segundos es eso.
		 * Operador modulo ej: el modulo de 5 seria 5%
		 */
		Scanner sc = new Scanner(System.in);
		
		final int segundosH = 3600;
		final int segundosM = 60;
		
		int segundos,horas,minutos,rHoras,rMinutos,rSegundos;
		
		System.out.println("Introduce los segundos a convertir");
		segundos = sc.nextInt();
		
		rHoras = segundos/segundosH;
		horas = rHoras;
		
		rMinutos= segundos % segundosH;
		minutos = rMinutos/segundosM;
		
		rSegundos = rMinutos % segundosM;
		segundos = rSegundos;
		
		
		System.out.println("El resultado sería: "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos");
	
	}

}
