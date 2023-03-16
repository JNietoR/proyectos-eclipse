package examendado;

public class Jugador { 
	//atributos de la clase
	private String nombre;
	private Dado dadito;
	private int puntuacion;
	
	public Jugador() { // consturctor vacio/por defecto
		this.nombre="";
		this.dadito=new Dado();
		this.puntuacion=0;
	}
	public Jugador(String nombre, Dado dadito) { // constructor por parametros sin la puntuacion para que no pueda darle valor el usuario
		this.nombre=nombre;
		this.dadito=dadito;
		this.puntuacion=0;
	}
	public String getNombre() { //getter para el nombre del jugador
		return nombre;
	}
	public void setNombre(String nombre) { //setter para el nombre del jugador
		this.nombre = nombre;
	}
	public Dado getDadito() { //getter del dado creado
		return dadito;
	}
	public void setDadito(Dado dadito) { //setter del dado
		this.dadito = dadito;
	}
	public int getPuntuacion() { // getter de la puntuacion
		return puntuacion;
	}
	//eliminamos el set puntuacion para que no se pueda modificar, ya que se establece por un metodo
	public void tirar() { //almacenara en la puntuacion el resultado de hacer una tirada del metodo tirada()
		this.puntuacion=this.dadito.tirada();
	}
	
	public String toString() { //metodo toString de la clase para mostrar la iformacion
		return "nombre: "+this.nombre+", dado: "+this.dadito+" y puntuacion "+this.puntuacion;
	}
}
