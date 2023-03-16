package Pokemones;

import java.util.ArrayList;

public class Ruta {
	private ArrayList<ArrayPokemones> ruta;
	
	public Ruta() {
		this.ruta=new ArrayList<ArrayPokemones>();
	}

	public ArrayList<ArrayPokemones> getRuta() {
		return ruta;
	}

	public void setRuta(ArrayList<ArrayPokemones> ruta) {
		this.ruta = ruta;
	}
	public int size() {
		return ruta.size();
	}
	public String consultar(int index) {
		return this.ruta.get(index).toString();
	}

	public void añadirPokemonARuta(Pokemon p) {
		ArrayPokemones aux= new ArrayPokemones();
		aux.añadirPokemon(p);
		this.ruta.add(aux);
		
	}
	
	public String toString() {
        return " Ruta " + ruta + "";
    }
}
