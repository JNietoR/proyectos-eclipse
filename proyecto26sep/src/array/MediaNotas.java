package array;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Mete 10 notas por teclado y calcula la media y muestra las notas por pantalla
		 */
			Scanner sc=new Scanner(System.in);
			double sumatoria=0,nota;
			double [] notas= new double[10];
			
			for(int i=0; i<notas.length;i++) {
				do {
					System.out.println("Introduce uno nota");
					nota=sc.nextDouble();
				}while(nota<0);
				notas[i]=nota;
			}
			
			for(int i=0; i<notas.length;i++) {
				sumatoria+=notas[i];
			}
			
			for(int i=0; i<notas.length;i++) {
				System.out.println(notas[i]);
			}
			System.out.println("La media es: "+sumatoria/notas.length);
	}

}
