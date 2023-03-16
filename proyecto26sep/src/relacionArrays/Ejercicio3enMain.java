package relacionArrays;

import java.util.Scanner;

public class Ejercicio3enMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * Escriba un programa que lea desde teclado un vector de caracteres (uno a uno) de
		tamaño fijado por una constante simbólica. Una vez leído, el programa debe indicar si dicho
		vector forma un palíndromo. Un palíndromo es una palabra, frase o número que se lee igual
		de derecha a izquierda que de izquierda a derecha, por ejemplo: “reconocer”.	
	 */
	Scanner sc=new Scanner(System.in);
	int caracteres;
	String stpalabro="", stinvertida="";
	boolean palindromo=false;
	
	do { //pide el numero de caracteres que tendra la palabra guardada en el array, sin poder ser una cantidad negativa
		System.out.println("Cuantos caracteres tiene la palabra que vas a introducir: ");
		caracteres=sc.nextInt();
	}while(caracteres<0);
	char[] palabro= new char[caracteres];
	char[] invertida= new char[caracteres];
	for(int i=0;i<palabro.length;i++) { // rellena el array con los datos introduzidos por teclado
		System.out.println("Introduce el caracter nº "+(i+1));
		palabro[i]=sc.next().charAt(0); //lee por teclado y convierte a caracter para poder guardarlo en el array
	}
	
	for(int i=0;i<palabro.length;i++) { //for para invertir el array, guardando la ultima posicion que sera .length-1 en la posicon indicada por i
		invertida[i]=palabro[palabro.length-1-i];
	}
	
	for(int i=0;i<palabro.length;i++) { //for para convertir los arrays a un String
		stpalabro+=palabro[i];
		stinvertida+=invertida[i];
	}
	if(stpalabro.equals(stinvertida)) { //si el String del array original es igual al String del array invertido quiere decir que es palindromo
		palindromo=true;
		System.out.println("El array es: "+stpalabro+", el array invertido es: "+stinvertida+" y es un palindromo");
	}else {
		System.out.println("El array es: "+stpalabro+", el array invertido es: "+stinvertida+" y no es un palindromo");
	}
	
	
	}

}
