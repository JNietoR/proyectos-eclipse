package POKEDEX;

import java.util.ArrayList;

public class ArrayPokemones {
	private ArrayList<pokemon> pokemones;
	
	public ArrayPokemones() {
		this.pokemones= new ArrayList<pokemon>();
	}
	
	public void añadirPokemon(pokemon poke) {
		this.pokemones.add(poke);
	}
	public String consultar(int index) {
		return this.pokemones.get(index).toString();
	}
	public int consultarID(int index) {
		return this.pokemones.get(index).getNumero_pokedex();
	}
	public String consultarDescripcion(int index) {
		return this.pokemones.get(index).getDescripcion();
	}
	public String consultarTipoPokemon(int index) {
		return this.pokemones.get(index).getTipo();
	}
	public String consultar(pokemon poke) {
		int index= this.pokemones.indexOf(poke);
		return this.pokemones.get(index).toString();
	}
	public int consultarID(pokemon poke) {
		int index= this.pokemones.indexOf(poke);
		return this.pokemones.get(index).getNumero_pokedex();
	}
	public String consultarDescripcion(pokemon poke) {
		int index= this.pokemones.indexOf(poke);
		return this.pokemones.get(index).getDescripcion();
	}
	public String consultarTipo(pokemon poke) {
		int index= this.pokemones.indexOf(poke);
		return this.pokemones.get(index).getTipo();
	}
	public ArrayList<pokemon> consultar() {
		return this.pokemones;
	}
	public ArrayList<Integer> consultarID() {
		ArrayList<Integer> ids= new ArrayList<Integer>();
		for(int i=0;i<this.pokemones.size();i++) {
			ids.add(this.pokemones.get(i).getNumero_pokedex());
		}
		
		return ids;
	}
	public ArrayList<String> consultarDescripcion() {
		ArrayList<String> descripcion= new ArrayList<String>();
		for(int i=0;i<this.pokemones.size();i++) {
			descripcion.add(this.pokemones.get(i).getDescripcion());
		}
		
		return descripcion;
	}
	public ArrayList<String> consultarTipo() {
		ArrayList<String> tipo= new ArrayList<String>();
		for(int i=0;i<this.pokemones.size();i++) {
			tipo.add(this.pokemones.get(i).getDescripcion());
		}
		
		return tipo;
	}
}
