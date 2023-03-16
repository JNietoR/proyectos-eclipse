package POKEDEX;

import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pokemon pokemon1= new pokemon(12, "fuego", "rata que le gusta los quesos");
		pokemon pokemon2= new pokemon(13, "fuego", "quema ");
		pokemon pokemon3= new pokemon(14, "agua", "moja");
		pokemon pokemon4= new pokemon(15, "hielo", "granada a las 7 de la mañana");
		pokemon pokemon5= new pokemon(16, "siniestro", "mi cara al despertar");
		
		
		ArrayPokemones arra= new ArrayPokemones();
		arra.añadirPokemon(pokemon1);
		arra.añadirPokemon(pokemon2);
		arra.añadirPokemon(pokemon3);
		arra.añadirPokemon(pokemon4);
		arra.añadirPokemon(pokemon5);
		
		System.out.println(arra.consultarTipo());
		ArrayList<pokemon> pokemon = new ArrayList<pokemon>();
		pokemon.addAll(Arrays.asList(pokemon1,pokemon2,pokemon3,pokemon4,pokemon5)); // mete todos los objetos dentro
		
	}

}
