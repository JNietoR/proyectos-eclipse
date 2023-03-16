package simulacroexameninterfaces;

public class Luis extends Profesor{
	protected Luis(String nombre, int edad, String asignatura) {
		super(nombre, edad, asignatura);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String fraseCaracterística() {
		// TODO Auto-generated method stub
		return "Como salio el madrid ayer";
	}

	@Override
	public String horaDeLlegada() {
		// TODO Auto-generated method stub
		return "19:30";
	}

	@Override
	public boolean descansito() {
		// TODO Auto-generated method stub
		return false;
	}
}
