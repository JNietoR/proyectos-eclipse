package mapas;

import java.util.HashMap;
import java.util.Map;

public class ejemplomaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> elmapaelmapa=new HashMap<Character,Integer>();
		
		elmapaelmapa.put('a', 5);
		elmapaelmapa.put('b', 4);
		elmapaelmapa.put('c', 3);
		elmapaelmapa.put('d', 2);
		elmapaelmapa.put('e', 1);
		
		for(Map.Entry elemento:elmapaelmapa.entrySet()) {
			System.out.println(elemento.getKey() + " -> " + elemento.getValue());
		}
		
		System.out.println(elmapaelmapa.size());
		System.out.println(elmapaelmapa.get('b'));
		System.out.println(elmapaelmapa.remove('a'));
		System.out.println(elmapaelmapa.containsValue(4)); //boolean para saber si en el map existe el valor
		System.out.println(elmapaelmapa.containsKey('a')); //booelan para saber si existe la clave 
	}

}
