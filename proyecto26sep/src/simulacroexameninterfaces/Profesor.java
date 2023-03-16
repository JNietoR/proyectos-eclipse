package simulacroexameninterfaces;

public abstract class Profesor {
	protected String Nombre; // tambien se pueden hacer public y despues en las clase hacer this.getNombre();
	protected int Edad;
	protected String Asignatura;
	
	
	protected Profesor(String nombre, int edad, String asignatura) {
		Nombre = nombre;
		Edad = edad;
		Asignatura = asignatura;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getAsignatura() {
		return Asignatura;
	}
	public void setAsignatura(String asignatura) {
		Asignatura = asignatura;
	}
	
	public abstract String fraseCaracterística();
	public abstract String horaDeLlegada(); 
	public abstract boolean descansito(); 
}
