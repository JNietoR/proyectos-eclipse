package paquete1;

import java.util.Scanner;

public class utilizacionparentesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Recibe por parametro 3 digitos y a resolver una ecuacion de segundo grado.
		 * Raiz cuadrada Math.sqrt() -> Raiz cuadrada Math.pow(b,2)-> exponentes
		 */
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,c,resultado1,resultado2; // No esta optimizado en memoria ya que a,b y c son enteros(int)
		
		System.out.println("Introduce variable a");
		a = sc.nextDouble();
		System.out.println("Introduce variable b");
		b = sc.nextDouble();
		System.out.println("Introduce variable c");
		c = sc.nextDouble();
		resultado1 = (-b+(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a); 
		resultado2 = (-b-(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/(2*a);
		System.out.println("Primer resultado es "+resultado1+" y el segundo resultado es "+resultado2+"");
		
	}

}
