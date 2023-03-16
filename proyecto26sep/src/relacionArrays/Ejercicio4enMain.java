package relacionArrays;

import java.util.Scanner;

public class Ejercicio4enMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	Escribir un programa que lea el peso de cada una de las 20 ratas de laboratorio del
	departamento de Biología de la Nutrición. Calcular el peso medio de las ratas e imprimir un
	informe parecido al siguiente:
	hay 2 ratas que pesan 200 gramos
	hay 1 rata que pesa 350 gramos
	 */
	Scanner sc=new Scanner(System.in);
	double[] pesoratas= new double[5];
	double sumapesos=0,mediapesos;
	String stpesoratas="";
	int contador=0;
	for(int i=0;i<pesoratas.length;i++) { //for para rellenar el array del peso de las 20 ratas
		do {
			System.out.println("Introduce el peso de la rata nº "+(i+1));
			pesoratas[i]=sc.nextDouble();
		}while(pesoratas[i]<0);
	}
	for(int i=0;i<pesoratas.length-1;i++) { // con este for ordenaremos el array, length -1 por que en la ultima posicion quedara el mayor peso 
		for(int j=i+1;j<pesoratas.length;j++) { //con este for comprobaremos el valor de cada posición con el resto
			if(pesoratas[i]>pesoratas[j]) { //si la i es mas grande que la j, invertiremos sus lugares
				double auxiliar=pesoratas[i]; //almacenamos el lugar de la cantidad mayor
				pesoratas[i]=pesoratas[j]; //la posicion que estamos comparando ganara el valor de la cantidad mas pequeña
				pesoratas[j]=auxiliar; //en la posicion siguiente se guardara el valor mas grande
			}
		}	
	}
	for(int i=0;i<pesoratas.length;i++) {
		stpesoratas+=pesoratas[i]+" gr ";
		sumapesos+=pesoratas[i];
	}
	for(int i=0;i<pesoratas.length;i++) {
		for(int j=0;j<pesoratas.length;j++) {
			if(pesoratas[i]==pesoratas[j]) {
				contador++;
			}
		}
		System.out.println("hay "+contador+" ratas que pesan "+pesoratas[i]+" gramos");
		contador=0;
	}
	mediapesos=sumapesos/pesoratas.length;
	System.out.println("peso medio: "+mediapesos+" gramos");
	System.out.println("Array de pesos ordenado: "+stpesoratas);
	}
}
