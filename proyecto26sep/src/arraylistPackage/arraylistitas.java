package arraylistPackage;

import java.util.ArrayList;

public class arraylistitas {
	public static void main(String[] args) {
		//declaracion de arraylist,
		//se utilizan clases no variables por ejemplo int usara Integer
		// double usara la clase Double, etc

		ArrayList<String> arrayString=new ArrayList<String>(); 
		ArrayList<Double> arrayDoubles=new ArrayList<Double>();
		ArrayList<String> arrayString2=new ArrayList<String>();
		
		arrayString.add("Hola"); //agregar elemento al arraylist arraitisito creado antes
		arrayString.add("Adios");
		arrayString2.addAll(arrayString);
		//arrayString.remove(1); //elimina el elemento 1 del arrayString, 
		//tambien se le puede introducir un valor 
		//por ejemplo hola buscaria en el array y lo eliminaria la primera vez que lo encuentre
		arrayString.removeIf(elemento->(elemento=="Hola"));//eliminara todos los Hola del arraylist
		arrayString.removeIf(palabra->(palabra.charAt(0)=='A')); //elimina todos los elementos que comienzen por A
		arrayString.sort(null); //ordena el array
		//arrayString.clear();//vacia el array
		arrayString.contains("Hola"); //true o false si existe en el array
		arrayString.set(1, "Modificado"); //cambiara la posicion 1 y le cambiara el valor del elemento por el valor Modificado
		System.out.println(arrayString.indexOf("Hola")); //devuelve la posicion del elemento en el array
		for(int i=0;i<arrayString.size();i++) { //
			System.out.println(arrayString.get(i)); //imprimira el elemento i del arrayString
		}
		
	}
	
}
