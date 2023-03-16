package POKEDEX;

public class pokemon {

	private int numero_pokedex;
	private String tipo;
	private String descripcion;
	
	public pokemon(int numero_pokedex, String tipo, String descripcion) {
		super();
		this.numero_pokedex = numero_pokedex;
		this.tipo = tipo;
		this.descripcion = descripcion;
	}
	
	public int getNumero_pokedex() {
		return numero_pokedex;
	}
	public void setNumero_pokedex(int numero_pokedex) {
		this.numero_pokedex = numero_pokedex;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "pokemon [numero_pokedex=" + numero_pokedex + ", tipo=" + tipo + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
