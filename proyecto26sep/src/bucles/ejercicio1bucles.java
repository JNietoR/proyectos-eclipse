package bucles;

import java.util.Scanner;

public class ejercicio1bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que pida un número al usuario repetidamente hasta 
		 * que el número introducido este entre 1 y 10.
		 */
		Scanner sc=new Scanner(System.in);
		int x;
		
		do {
			System.out.println("Introduce un numero entre 1 y 10");
			x=sc.nextInt();	
		}while(x>10 || x<=0); //En la condicion ponemos la condicion para seguir haciendo el bucle, el caso en que quiero que se vuelva a hacer el bucle
		
		System.out.println("El numero esta entre 1 y 10");
	
	}

}
