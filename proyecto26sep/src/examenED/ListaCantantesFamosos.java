package examenED;

import java.util.ArrayList;

public class ListaCantantesFamosos {
	private ArrayList<CantanteFamoso> listacantantes;
	
	public ListaCantantesFamosos () {
		this.listacantantes= new ArrayList<CantanteFamoso>();
	}
	
	public ArrayList<CantanteFamoso> getListacantantes() {
		return listacantantes;
	}

	public void setListacantantes(ArrayList<CantanteFamoso> listacantantes) {
		this.listacantantes = listacantantes;
	}

	public void añadirCantante(CantanteFamoso cantante) {
		this.listacantantes.add(cantante);
	}
	public String cantantesGenero(String genero) {
		String resultado="";
		for(int i=0;i<this.listacantantes.size();i++) {
			if(this.listacantantes.get(i).getGeneroMusical().equals(genero)) {
				resultado+=this.listacantantes.get(i).getNombre()+", ";
			}
		}
		return resultado;
	}
	public String cantanteMasVentas() {
		String resultado="";
		int ventas=0;
		for (int i = 0; i < this.listacantantes.size(); i++) {
			if (this.listacantantes.get(i).getVentas() > ventas) {
				ventas = this.listacantantes.get(i).getVentas();
				resultado = this.listacantantes.get(i).getNombre();
			}
	}
		return "El cantante con mas ventas es: "+resultado;
}
	public void eliminarCantante(CantanteFamoso cantante) {
		this.listacantantes.remove(cantante);
	}

	public String imprimirCantantes() {
		return "Cantante: " + listacantantes;
	}
	
}
