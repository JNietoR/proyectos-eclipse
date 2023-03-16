package bucles;

import java.util.Scanner;

public class ejercicio4capicuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,numeroFalta,numeroInvertido,numeroRestante;
		//numero introducido por el usuario
		//numeroFalta numero que nos falta por sacar las cifras para invertir
		//numeroInvertido el resultado de ir calculando el numero invertido
		//numeroRestante el numero que nos queda al sacar la ultima cifra
		
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce un numero para saber si es capicuo:");
		numero=sc.nextInt();
		
		numeroFalta=numero; //para entrar con el numero indicado en el bucle como el numero que nos falta en el momento para invertir
		numeroInvertido=0; //resultado del numero que estamos invirtiendo
		numeroRestante=0; //numero que nos queda despues de sacar la cifra para sumarla al invertido anterior para calcular el numero invertido final
		
		while(numeroFalta!=0) { //Va a parar cuando divida un numero de una cifra entre 10 ya que significaria que seria el ultimo numero que nos faltaria
			numeroRestante=numeroFalta%10; //Sacamos la cifra que vamos añadir al numero invertido que estamos calculando
			numeroInvertido=numeroInvertido*10+numeroRestante; //como vamos a ir añadiendo el numero que hemos sacado con el % al que ya tenemos empieza en 0 fuera del bucle para que no empieze siendo un numero de dos cifras
			numeroFalta=numeroFalta/10;//disminuimos en una cifra el numero para que en la siguiente vuelta del bucle continue haciendo la operacion con el numero que nos falta por sacar las cifras e invertirlo
		}
		if(numeroInvertido==numero) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
	}

}