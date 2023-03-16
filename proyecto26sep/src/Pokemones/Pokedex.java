package Pokemones;

import java.util.HashMap;

public class Pokedex {
	private HashMap<String, Pokemon> pokedex;
	
	public Pokedex() {
		this.pokedex=new HashMap<String, Pokemon>();
	}
	public Pokedex(HashMap<String, Pokemon> pokedex) {
		this.pokedex=new HashMap<String, Pokemon>();
	}
	public HashMap<String, Pokemon> getPokedex() {
		return pokedex;
	}
	public void setPokedex(HashMap<String, Pokemon> pokedex) {
		this.pokedex = pokedex;
	}
	public void añadirPokePokedex(String nombre, Pokemon p) {
		this.pokedex.put(nombre,p);
	}
	public Pokemon informacionPokemon(String nombre) {
		return this.pokedex.get(nombre);
	}
	@Override
	public String toString() {
		return "Pokedex Kanto " + pokedex;
	}
	
}
