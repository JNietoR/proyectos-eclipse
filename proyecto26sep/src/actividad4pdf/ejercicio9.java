package actividad4pdf;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implementa un juego para adivinar un número entre 1-9 con un máximo de tres
			intentos. El número puede ser generado aleatoriamente o pedirlo por teclado.
			Después se irán pidiendo números indicando “mayor” o “menor” según sea mayor o
			menor con respecto a N. El proceso termina cuando el usuario acierta el número o
			consume los tres intentos.
		 */
		Scanner sc = new Scanner(System.in);
		int numero = (int)(Math.random()*10); // esta función nos devuelve un número aleatorio entre 0 y 1 (de tipo double) al multiplicarlo por 10 nos dara un numero aleatorio entre 1 y 9
		int intentos=3;
		System.out.println("Vamos a jugar a un juego, adivina que numero entre 1 y 9 estoy pensando, tienes 3 intentos");
		System.out.println("Dime un número entre 1 y 9");
		int numeroteclado=sc.nextInt();
		
			while(intentos>1) { //mientras tengas mas de 1 intento
			if(numero==numeroteclado) { //si has acertado
			System.out.println("Vaya máquina lo has adivinado");
			}else { //si no has acertado
				if(numeroteclado>numero) { //si es mayor te lo volvera a pedir indicandote que es mayor
					System.out.println(numeroteclado+ " es mas grande que el numero que estoy pensando");
					intentos--;
					System.out.println("Dime un número entre 1 y 9");
					numeroteclado=sc.nextInt();
				}else { //la situación contraria al if
					System.out.println(numeroteclado+ " es mas pequeño que el numero que estoy pensando");
					intentos--;
					System.out.println("Dime un número entre 1 y 9");
					numeroteclado=sc.nextInt();
				}
			}
		}
		System.out.println("Mejor suerte la próxima vez has gastado tus tres intentos");
	}

}
