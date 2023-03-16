package relacionArrays;

import java.util.Scanner;

public class Ejercicio1enMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * En un experimento de física se lanzan a la vez desde una determinada altura 5 objetos
		de diferente masa y superficie de rozamiento. Escriba un programa que lea el tiempo en
		segundos en que se produce la llegada al suelo de cada objeto en el orden en el que van
		cayendo. Una vez leídos los 5 números, el programa deberá de imprimir por pantalla la lista
		de tiempos de llegada de los objetos con respecto al primero. Por ejemplo, si los tiempos son
		5, 6, 8, 11 y 15, el programa deberá de devolver la lista de diferencias de tiempos siguiente:
		0, 1, 3, 6, 10.
		
		 *
		 */
		Scanner sc= new Scanner(System.in);
		int segundos[]= new int[5]; //array de los tiempos de llegada
		String array="",arrayDif=""; //variables para imprimir array
		int segDif[]= new int[5]; //array de la diferencia de tiempos entre cada elemento y el primero
		
		for(int i=0;i<segundos.length;i++) { //rellena el array de tiempo de llegada sin dejar introducir un numero de segundos negativo entendemos que se puede meter mas de 1 min en segundos
			do {
				System.out.println("Introduce los segundos del objeto nº "+(i+1)+" en orden de llegada");
				segundos[i]=sc.nextInt();
			}while(segundos[i]<0); // con este do while le pediremos que nos introduzca un numero mientras no sea negativo
		}
		for(int i=0;i<segundos.length;i++) { // calcular la diferencia de cada elemento con el 0 y string para imprimir el array
			segDif[i]=segundos[i]-segundos[0]; //calcula la diferencia de cada elemento con respecto al 0
			array+=segundos[i]+" seg "; //String del array con los tiempos
			arrayDif+=segDif[i]+" seg "; //String con la diferencia de tiempos respecto al primero
		}
		System.out.println(array);
		System.out.println(arrayDif);
	}
}
