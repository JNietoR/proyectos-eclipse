package ejercicio3ArrayList;

import java.util.ArrayList;

public class ArrayEjer3 {
	private ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
	
	public ArrayEjer3() {
		this.array=new ArrayList<ArrayList<Integer>>();
	}

	public ArrayList<ArrayList<Integer>> getArray() {
		return array;
	}

	public void setArray(ArrayList<ArrayList<Integer>> array) {
		this.array = array;
	}
	
	public void añadiraleatorio() {
		int aleatorio;
		ArrayList<Integer> aux= new ArrayList<Integer>();
		for(int i=0;i<3;i++) {
			aleatorio=(int) (Math.random()*9+1);
			aux.add(aleatorio);
		}
		this.array.add(aux);
	}
	public String buscar() {
        String resultado;
        int minimo = 9,maximo = 0,valor=0,maxI=0,maxJ=0,minI=0,minJ=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            	valor=this.array.get(i).get(j);
            	 if (valor > maximo) {
                     maximo = valor;
                     maxI = i;
                     maxJ = j;
                 }else {
                	 minimo = valor;
                     minI = i;
                     minJ = j;
                 }
            }
        }
        resultado = "Max Value: " + maximo + " at (" + maxI + "," + maxJ + ")"+" Min Value: " + minimo + " at (" + minI + "," + minJ + ")";
        return resultado;
    }
	
	public String toString() {
        return " {" + array + ",}";
    }
	
	/*
     * Esto es un trabajo colaborativo entre Jorge, Irene, Manu y ALVARO  terminado a las 2 de la mañana 🙂 https://files.fm/u/ctahensg3
     */
	
}
