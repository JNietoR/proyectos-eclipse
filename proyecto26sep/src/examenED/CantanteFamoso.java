package examenED;

public class CantanteFamoso {
	private String nombre,generoMusical;
	private int ventas;
	
	public CantanteFamoso() {
		this.nombre="Chester";
		this.generoMusical="Metal";
		this.ventas=1000000;
	}
	public CantanteFamoso(String nombre, String genero, int ventas) {
		this.nombre=nombre;
		this.generoMusical=genero;
		this.ventas=ventas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGeneroMusical() {
		return generoMusical;
	}
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}
	public int getVentas() {
		return ventas;
	}
	public void setVentas(int ventas) {
		this.ventas = ventas;
	}
	@Override
	public String toString() {
		return "nombre: " + nombre + ", genero: " + generoMusical + ", ventas: " + ventas + " M de discos";
	}
	
	
	
}
