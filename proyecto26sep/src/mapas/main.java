package mapas;

import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> mapa = new HashMap<Character,Integer>();
		mapa.put('a' , 5);
		mapa.put('b' , 4);
	
		mapa.put('c' , 3);
		mapa.put('d' , 2);
		mapa.put('e' , 1);
		
		
		for(Map.Entry elemento:mapa.entrySet()) {
			System.out.println(elemento.getKey()+ " ----> " + elemento.getValue());
		}
		System.out.println(mapa.size());
		System.out.println(mapa.get('b'));
		System.out.println(mapa.remove('c'));
		System.out.println(mapa.get('c'));
		System.out.println(mapa.containsValue(3));
		
	}

}
