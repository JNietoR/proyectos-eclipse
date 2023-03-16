/**
 * 
 */
package relacionArrays;

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
public class Ejercicio1 {
	private int[] segundos;
	
public Ejercicio1() {
	this.segundos=new int[0];
}
public Ejercicio1(int[] segundos) {
	boolean correcto=true;
	if(segundos.length==5) {
		for(int i=0;i<segundos.length;i++) {
			if(segundos[i]<0 || segundos[i]>60) {
				correcto=false;
			}else {
				this.segundos=segundos;
			}
		}	
	}else {
		correcto=false;
	}
}
public int[] getSegundos() {
	return segundos;
}
public boolean setSegundos(int[] segundos) {
	boolean correcto=true;
	if(segundos.length==5) {
		for(int i=0;i<segundos.length;i++) {
			if(segundos[i]<0 || segundos[i]>60) {
				correcto=false;
			}else {
				this.segundos=segundos;
			}
		}	
	}else {
		correcto=false;
	}
	return correcto;
}
public int[] ordenar() {
	int[] resultado= new int[this.segundos.length];
		for(int i=0;i<segundos.length;i++) {
			resultado[i]=this.segundos[i]-this.segundos[0];	
		}
	return resultado;
}
public String toString() {
	String array="";
	for(int i=0;i<this.segundos.length;i++) {
		array+=this.segundos[i]+",";
	}
	return array;
	}

}
