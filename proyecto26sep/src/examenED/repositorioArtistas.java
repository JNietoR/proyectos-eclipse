package examenED;

import java.util.ArrayList;
import java.util.HashMap;

public class repositorioArtistas {
	private HashMap<String,ArrayList<String>> repositorio;
	
	public repositorioArtistas() {
		this.repositorio=new HashMap<String,ArrayList<String>>();
	}
	public void añadirCantante(String nombre, ArrayList<String> canciones) {
		this.repositorio.put(nombre, canciones);
	}
	public void añadirCancion(String nombre, String cancion) {
		this.repositorio.get(nombre).add(cancion);
	}
	public ArrayList<String> consultarCanciones(String nombre){
		return this.repositorio.get(nombre);
		
		/* Tambien podríamos hacer un nuevo ArrayList para el resultado y devolverlo
		 * 
		 ArrayList<String> resultado = new ArrayList<String>();
	        for (int i=0;i<this.repositorio.size();i++) {
	            resultado=this.repositorio.get(nombre);
	        }

	        return resultado;
	        */
	}
	@Override
	public String toString() {
		return "repositorioArtistas [repositorio=" + repositorio + "]";
	}
	
}
