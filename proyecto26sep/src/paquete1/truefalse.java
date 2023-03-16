package paquete1;

import java.util.Scanner;

public class truefalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa en java que reciba por teclado un número de tres cifras 
		 * y un numero de una cifra. El programa devolvera true en caso de que 
		 * el numero de un digito aparezca dentro del numero de tres digitos.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int trescifras,unacifra,decena,centena,unidad,aux;
		boolean x = true;
		System.out.println("Introduce un numero uno de tres cifras");
		trescifras = sc.nextInt();
		System.out.println("Introduce un numero de 1 cifra");
		unacifra = sc.nextInt();
		
		unidad=trescifras%10;
		aux=trescifras/10;
		decena=aux%10;
		centena=aux/10;
				
		x = unidad == unacifra || decena == unacifra || centena == unacifra;
		System.out.println("Una de las tres cifras es la introducida");
		System.out.println(x);
		
		x = unidad == unacifra;
		System.out.println("Es el mismo número de unidades:");
		System.out.println(x);
		x = decena == unacifra;
		System.out.println("Es el mismo número de decenas:");
		System.out.println(x);
		x = centena == unacifra;
		System.out.println("Es el mismo número de centenas:");
		System.out.println(x);
		
		
		
	}

}
