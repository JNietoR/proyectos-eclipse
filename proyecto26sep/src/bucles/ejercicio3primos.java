package bucles;

import java.util.Scanner;

public class ejercicio3primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Introduce un numero y di si es primo
		 */
		Scanner sc = new Scanner(System.in);
		int num,i,contador=0;
		System.out.println("Introduce un numero: ");
		num = sc.nextInt();
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				contador++;
			}	
			}if (contador<=2) {
				System.out.println(num+" es primo");
			}else{
				System.out.println(num+" no es primo");
				}
		}		
}