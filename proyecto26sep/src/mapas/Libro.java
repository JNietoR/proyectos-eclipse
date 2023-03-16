package mapas;

import java.util.HashMap;

public class Libro {
	private HashMap<Integer,String> libro;
	
	public Libro() {
		this.libro=new HashMap<Integer,String>();
	}

	public HashMap<Integer, String> getLibro() {
		return libro;
	}

	public void setLibro(HashMap<Integer, String> libro) {
		this.libro = libro;
	}
	public void añadir(int numpag, String cont) {
		if(this.libro.containsKey(numpag)) {
			this.libro.replace(numpag, cont);
		}else {
			this.libro.put(numpag, cont);
		}
	}
	public void eliminar(int numpag) {
		this.libro.remove(numpag);
	}
	public void reemplazar(int numpag, String cont) {
		this.libro.replace(numpag, cont);
		
		/*
		this.eliminar(numpag);
		this.añadir(numpag, cont);
		*/
	}
	public String verPagina(int numpag) {
		return this.libro.get(numpag);
	}
	
}
