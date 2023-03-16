package arraylistPackage;

import java.util.ArrayList;

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

public class Ejercicio1ArrayList {

	private ArrayList<Integer> objetos;
	

	public Ejercicio1ArrayList() {
		this.objetos = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getObjetos() {
		return this.objetos;
	}

	public void setObjetos(ArrayList<Integer> objetos) {
		this.objetos = objetos;
	}
	
	public void añadirTiempo(int t) {
		this.objetos.add(t);
	}

	@Override
	public String toString() {
		return this.objetos.toString();
	}
	public ArrayList<Integer> diferencia(){
		ArrayList<Integer> diferencia= new ArrayList<Integer>();
		this.objetos.sort(null);
			for(int i=0;i<this.objetos.size();i++) {
				diferencia.add(this.objetos.get(i)- this.objetos.get(0));
			}
		return diferencia;	
	}
	
	
	
}
