package relacionArrays;

public class Jugador {
	private String nombre;
	private String ficha;
	
	public Jugador() {
		this.nombre="";
		this.ficha="";
	}
	public Jugador(String nombre, String ficha){
		this.nombre=nombre;
		this.ficha=ficha;
	}	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFicha() {
		return ficha;
	}
	public void setFicha(String ficha) {
		this.ficha = ficha;
	}
	public String toString() {
		return "Jugador con nombre: "+this.nombre+" y ficha: "+this.ficha;
	}
}
