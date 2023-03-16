package Pokemones;

public class Pokemon {
	private int numero;
	private String tipo;
	private String descripcion;
	
	public Pokemon() {
		this.tipo="tipo de pokemon";
		this.numero=0;
		this.descripcion="descripcion de pokemon";
	}
	public Pokemon(int numero, String tipo, String descripcion) {
		this.tipo=tipo;
		this.numero=numero;
		this.descripcion=descripcion;
	}
	public Pokemon(int numero, String tipo) {
		this.numero=numero;
		this.tipo=tipo;
		this.descripcion="";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
		return "Pokemon ID: " + numero + " Tipo: " + tipo + " Descripcion:" + descripcion + "";
	}
	
	
}
