package Pokemones;

import java.util.ArrayList;

public class ArrayPokemones {
	private ArrayList<Pokemon> pokemones;
	
	public ArrayPokemones() {
		this.pokemones= new ArrayList<Pokemon>();
	}
	
	public void añadirPokemon(Pokemon poke) {
		this.pokemones.add(poke);
	}

	public ArrayList<Pokemon> getPokemones() {
		return pokemones;
	}

	public void setPokemones(ArrayList<Pokemon> pokemones) {
		this.pokemones = pokemones;
	}
	public String consultar(int index) {
		return this.pokemones.get(index).toString();
	}
	public int consultarID(int index) {
		return this.pokemones.get(index).getNumero();
	}
	public String consultarDescripcion(int index) {
		return this.pokemones.get(index).getDescripcion();
	}
	public String consultarTipo(int index) {
		return this.pokemones.get(index).getTipo();
	}
	public String consultar(Pokemon poke) {
		int index= this.pokemones.indexOf(poke);
		return this.pokemones.get(index).toString();
	}
	public int consultarID(Pokemon poke) {
		int index= this.pokemones.indexOf(poke);
		return this.pokemones.get(index).getNumero();
	}
	public String consultarDescripcion(Pokemon poke) {
		int index= this.pokemones.indexOf(poke);
		return this.pokemones.get(index).getDescripcion();
	}
	public String consultarTipo(Pokemon poke) {
		int index= this.pokemones.indexOf(poke);
		return this.pokemones.get(index).getTipo();
	}
	public ArrayList<Pokemon> consultar() {
		return this.pokemones;
	}
	public ArrayList<Integer> consultarID() {
		ArrayList<Integer> ids= new ArrayList<Integer>();
		for(int i=0;i<this.pokemones.size();i++) {
			ids.add(this.pokemones.get(i).getNumero());
		}
		return ids;
	}
	public ArrayList<String> consultarDescripcion() {
		ArrayList<String> descripciones= new ArrayList<String>();
		for(int i=0;i<this.pokemones.size();i++) {
			descripciones.add(this.pokemones.get(i).getDescripcion());
		}
		return descripciones;
	}
	public ArrayList<String> consultarTipo() {
		ArrayList<String> tipos= new ArrayList<String>();
		for(int i=0;i<this.pokemones.size();i++) {
			tipos.add(this.pokemones.get(i).getTipo());
		}
		return tipos;
	}

	@Override
	public String toString() {
		return "[" + pokemones + "]";
	}
	
}
