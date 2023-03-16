package uwupdf;

import java.util.Scanner;

public class ejercicio9modo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int modo,intentos=3,numero=0,numeroteclado=0;
		boolean encontrado=false;
			System.out.println("Elige modo 1 numero introducido o modo 2 numero aleatorio");
			modo=sc.nextInt();
			if(modo==1) {
				System.out.println("Introduce el numero oculto");
				numero=sc.nextInt();
			}else if(modo==2) {
				System.out.println("Generando numero aleatorio");
				numero = (int)(Math.random()*10); // esta función nos devuelve un número aleatorio entre 0 y 1 (de tipo double) al multiplicarlo por 10 nos dara un numero aleatorio entre 1 y 9
				System.out.println(numero);
			}
		
		
		System.out.println("Dime un número entre 1 y 9");
		numeroteclado=sc.nextInt();
		
			while(intentos>1 && encontrado==false) { //mientras tengas mas de 1 intento
			encontrado=false;
			if(numero==numeroteclado) { //si has acertado
			System.out.println("Vaya máquina lo has adivinado");
			encontrado=true;
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
}
}
