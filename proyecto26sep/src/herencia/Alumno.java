package herencia;

public class Alumno extends Persona{
	private int notaMedia;
	
	public Alumno() {
		super();
		this.notaMedia=0;
	}
	
	public Alumno(String DNI, String nombre, int notaMedia) {
		super(DNI,nombre);
		this.notaMedia=notaMedia;
	}

	public int getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	@Override
	public String presentarse() {
		return super.presentarse() + " y mi media es: " + this.notaMedia;
	}
}
