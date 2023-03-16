package actividad4pdf;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba un programa similar al anterior que muestre los números en orden inverso.
		 */
		Scanner sc=new Scanner(System.in);
		int n,i;
		do {
		System.out.println("Introduce el numero en el que quieres parar de mostrar: ");
		n=sc.nextInt();
		}while(n<0); //seguira en el bucle mientras el valor que le demos sea menor que 0
		for(i=0;i<=n;i++) { //con esta forma i empieza en 0 y la vamos incrementando en 1 hasta que el valor de i se iguale al valor introducido por teclado
			System.out.println(n-i);
		
			// for(i=n;i>=0;i--); esta seria otra forma de usar el for, le dariamos a i el valor introducido por teclado y disminuiriamos en 1 el valor de i
			// System.out.println(i);	
		}
	}

}
