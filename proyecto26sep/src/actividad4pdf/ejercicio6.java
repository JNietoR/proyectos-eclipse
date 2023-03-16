package actividad4pdf;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Implemente un programa que calcule los N primeros términos de la serie de
		Fibonacci. El número de términos se leerá por teclado.
		La sucesión de Fibonacci comienza con los números 0 y 1, y a partir de estos, cada
		término es la suma de los dos anteriores:
		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377...
		*/
		Scanner sc= new Scanner(System.in);
		int n,i,sum=0,num1=0,num2=1; //iniciamos las variables num1 y num2 para el inicio de la succesion y la sum como la variable auxiliar para ir calculando los nuvos valores
		
		do {
			System.out.println("Introduce la cantidad de numero de la serie que quieres saber: ");
			n=sc.nextInt();
		}while(n<0); //filtro para evitar que nos meta un valor negativo
		for(i=0;i<n;i++) { //imprime el valor de la variable sum que seria la suma de los numeros 1 y 2 que iran cambiando en cada vuelta
			System.out.println(sum); //ponemos el syso al principio para imprimir antes de los calculos para empezar el bucle imprimiendo el 0 que es el primer valor de la succesion
			sum=num1+num2; //calculamos el siguiente numero de la succesion
			num2=num1; //nuestro num2 se convertira en el numero 1
			num1=sum;  //y el numero 1 se convertira en el valor acumulado, de esta forma a la siguente vuelta tendriamos los dos valores anteriores para calcular el siguiente numero de la sucesion
		}
	}

}
