package uwupdf;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implemente un programa en Java que acepte un número entero por teclado,
		 *  representando un número en centímetros, y muestre por pantalla su descomposición en metros y kilómetros. 
		 *  NOTA: Se debe utilizar el operador módulo.
		 */
		
			Scanner sc = new Scanner(System.in);
			int num1,ncentimetro,nmetro,nkilometro,aux;	
			final int cenM = 100;
			final int cenK = 1000;
			System.out.println("Introduce nº de centimetro:");
			num1 = sc.nextInt();
			
			nkilometro = num1/cenK;
			aux = num1%cenK;
			nmetro = aux/cenM;
			ncentimetro = aux%cenM;
			
			System.out.println("El resultado es: "+nkilometro+" km "+nmetro+" m y "+ncentimetro+"cm.");
			
			
	}

}
