package herencia;

public class Persona {
	protected String nombre;
	protected String DNI;
	
	public Persona() {
		this.nombre=" ";
		this.DNI=" ";
	}
	public Persona(String DNI, String nombre) {
		this.nombre=nombre;
		this.DNI=DNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	public String presentarse() {
		return "hola me llamo " + this.nombre;
	}
	public String despedirse() {
		return "adiós me llamo " + this.nombre;
	}
}
