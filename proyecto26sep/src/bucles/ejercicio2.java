package bucles;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Realizar un programa que lea una serie de números y obtenga su media. Un
		número negativo indicará el fin de datos.*/
		Scanner sc = new Scanner(System.in);
		int x,sum=0,cont=0;
		double media;
		do {
			System.err.println("Introduce un número, si es negativo para el bucle ");
			x=sc.nextInt();
			if(x>0) {
				sum+=x;
				cont++;
			}		
		}while(x>=0);
		media=(double)sum/cont;
		System.out.println("La media es"+media);
	}

}
