package actividad4pdf;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba un programa que muestre los números de 0 a N, donde N es un valor leído de
		   teclado.
		 */
	
	Scanner sc=new Scanner(System.in);
	int n,i;
		do { //le pedimos el valor donde parara el bucle 
		System.out.println("Introduce el numero en el que quieres parar de mostrar: ");
		n=sc.nextInt();
		}while(n<0); //hasta que el numero sea positivo es decir, como minimo 1
			for(i=0;i<=n;i++) { //cada vuelta del bucle imprimira el valor de i, que se ira incrementando en 1 mientras que la i sea <= numero que introducimos en el do
				System.out.println(i);	
			}
		
	
	
	}

}
