package paquete1;

import java.util.Scanner;

public class intercambiarvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escriba un programa que intercambie le valor de dos variables de tipo entero
		 * leidas por teclado. Imrima en la pantalla los valores de las variables antes y despues del intercambio
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int var1,var2;
		
		System.out.println("Introduce la variable 1");
		
		var1=sc.nextInt();
		
		System.out.println("Introduce la variable 2");
		
		var2=sc.nextInt();
		
		System.out.println("var1 es : "+var1+" y var2 es "+var2+"");
		
		int varcambio=var1;
		var1=var2;
		var2=varcambio;
		
		
		System.out.println("var1 es : "+var1+" y var2 es "+var2+"");
		
		
		
		
		
		
		
		
	}

}
