package paquete1;

import java.util.Scanner;

public class calculadorasegundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Te calcule los segundos al introducirle una hora minutos y segundos
		 */
		
		Scanner sc = new Scanner(System.in);
		
		final int segundoshora = 3600;
		final int segundosminuto = 60;
		
		System.out.println("Por favor introduzca horas, minutos y segundos que desea convertir a segundos");
		
		System.out.println("Por favor introduzca las horas");
		
		int horas = sc.nextInt();
		
		System.out.println("Por favor introduzca los minutos");
		
		int minutos = sc.nextInt();
		
		System.out.println("Por favor introduzca los segundos");
			
		int segundos = sc.nextInt();
		
		int resultado = (horas*segundoshora)+(minutos*segundosminuto)+(segundos);
		
		System.out.println("Los segundos que contendria esta hora serian: "+ resultado +"");

		
	}

}
