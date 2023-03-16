package tema2;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * usuario introduce por teclado un double que es una temperatura
		 * si es mayor de 38 Me quemo, ay ay ay
		 * si es menor de 38 Tamo gucci
		 * si es menor de 7 Se me hiela la genitalia
		 */
	Scanner sc= new Scanner(System.in);
	double x;
	System.out.println();
	x = sc.nextDouble();
	
	if (x>=38) {
		System.out.println("Me quemo ay ay ay");
	}else if (x<38 && x<7) {
		System.out.println("Tamo gucci");
	}else { // No poner nunca nada detras del else
		System.out.println("Se me hiela la genitalia");
	}
	}

}
