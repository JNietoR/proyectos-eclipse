package actividad4pdf;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implemente un programa que pida números hasta que se introduzca uno negativo.
			Mostrar entonces la media de los valores introducidos.
		 */
		Scanner sc = new Scanner(System.in);
		int x,sum=0,cont=0; //iniciamos las variables la variable acumulativa sum a 0, y el contador hara de dividendo siendo la cantidad de numeros que hemos introducido
		double media;
		do {
			System.err.println("Introduce un número, si es negativo para el bucle ");
			x=sc.nextInt();
			if(x>0) { //un filtro para evitar que entre con un numero negativo
				sum+=x; //suma cada vuelta el valor que tiene x al valor acumulado de sumar x con la vuelta anterior
				cont++;
			}		
		}while(x>=0); //si el valor introducido ha sido negativo no entraria al if llegaria al while y saldria del bucle, haciendo despues la media
		media=(double)sum/cont;
		System.out.println("La media es"+media);
	}

}
