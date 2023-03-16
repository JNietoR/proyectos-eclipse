package mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class veoveo {
	private HashMap<Character, String> veoveo;

	public HashMap<Character, String> getVeoveo() {
		return veoveo;
	}

	public void setVeoveo(HashMap<Character, String> veoveo) {
		this.veoveo = veoveo;
	}

	public veoveo() {
		this.veoveo = new HashMap<Character, String>();

		this.veoveo.put('a', "alicate");
		this.veoveo.put('b', "botafumeiro");
		this.veoveo.put('c', "caracola");
		this.veoveo.put('d', "dados");
		this.veoveo.put('e', "elefante");
		this.veoveo.put('f', "fernando");

	}

	public char letra() {
		ArrayList<Character> letras = new ArrayList<Character>(this.veoveo.keySet());
		return letras.get((int) (Math.random() * letras.size()));
	}

	public void jugar() {
		char letras = letra();
		System.out.println("Empieza por la letra " + letras);
		Scanner sc = new Scanner(System.in);
		String intento = "";
		intento = sc.next();
		while (!intento.equals(this.veoveo.get(letras))) {
			System.out.println("Fail");
			System.out.println("Empiesa x la letra " + letras);
			intento = sc.next();
		}
		System.out.println("SUHHHH");
	}

}
