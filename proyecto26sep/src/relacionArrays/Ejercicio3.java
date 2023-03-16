package relacionArrays;
/*
 * Escriba un programa que lea desde teclado un vector de caracteres (uno a uno) de
tamaño fijado por una constante simbólica. Una vez leído, el programa debe indicar si dicho
vector forma un palíndromo. Un palíndromo es una palabra, frase o número que se lee igual
de derecha a izquierda que de izquierda a derecha, por ejemplo: “reconocer”.
 */
public class Ejercicio3 {
	public char[] palabra;
	public boolean palindromo;
	
public Ejercicio3() {
	this.palabra= new char[0];
	this.palindromo=true;
}
public Ejercicio3(char[] palabra) {
		this.palabra=palabra;
		this.esPalindromo();
}
public boolean isPalindromo() {
	return palindromo;
}
public char[] getPalabra() {
	return palabra;
}
public void setPalabra(char[] palabra) {
		this.palabra = palabra;
}
public String toString() {
	String palindromo="";
	String palabra="";
	if(this.palindromo) {
		palindromo="es palindromo";
	}else {
		palindromo="no es palindromo";
	}
	for(int i=0;i<this.palabra.length;i++) {
		palabra+=this.palabra[i];
	}
	return "La palabra "+palabra+" "+palindromo;	
}

public void esPalindromo() {
	char[] invertido=new char[this.palabra.length];
	for(int i=0;i<this.palabra.length;i++) {
		invertido[i]=this.palabra[this.palabra.length-1-i];
		}
	if(this.palabra==invertido) {
		this.palindromo=true;
	}else {
		this.palindromo=false;
	}
}
	
}
