package relacionArrays;

import java.util.Scanner;

public class Ejercicio2enMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba un programa que lea desde teclado 6 números correspondientes a la combinación
		ganadora de la lotería primitiva. A continuación, el programa leerá otros 6 números
		correspondientes a un boleto con el que se participa en dicho sorteo. Finalizada la lectura, el
		programa deberá de indicar el número de aciertos del boleto cuyos números hemos
		introducido. Ejemplo: si la combinación ganadora es 3 6 4 8 9 23 el boleto 8 6 23 5 9 1 tiene
		2 aciertos.
		 */
		Scanner sc=new Scanner(System.in);
		int[] boleto= new int[6];
		int[] boleto2= new int[6];
		int aciertos=0;
		String arrayb1="",arrayb2="";
		
		for(int i=0;i<boleto.length;i++) { //for para rellenar el array 
			do { //mientras que el numero que nos metan sea menos que 0 o mayor de 99 nos volvera a pedir el numero dentro del boleto
				System.out.println("Introduce el nº "+(i+1)+" del boleto nº 1");
				boleto[i]=sc.nextInt();
			}while(boleto[i]<0 || boleto[i]>99); 
		}
		
		for(int i=0;i<boleto2.length;i++) { //igual que antes pero para el 2º boleto
			do { 
				System.out.println("Introduce el nº "+(i+1)+" del boleto nº 2");
				boleto2[i]=sc.nextInt();
			}while(boleto2[i]<0 || boleto2[i]>99); 
		}
		
		for(int i=0;i<boleto.length;i++) { //for para contar aciertos entre los dos arrays
			for(int j=0;j<boleto2.length;j++) { //compara el valor de la posicion i del boleto1 con cada posicion del boleto2
				if(boleto[i]==boleto2[j]) { //si el valor es el mismo amuenta los aciertos en 1
					aciertos++;
				}
			}
		}
		for(int i=0;i<boleto.length;i++) { //for para rellenar el String de los boletos
			arrayb1+=boleto[i]+" ";
			arrayb2+=boleto2[i]+" ";
		}
		System.out.println("Si la combinación ganadora es "+arrayb1+" el boleto "+arrayb2+" tiene "+aciertos+" aciertos.");
	}

}
