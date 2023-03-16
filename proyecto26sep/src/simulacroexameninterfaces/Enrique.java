package simulacroexameninterfaces;

public class Enrique extends Profesor{
	
	protected Enrique(String nombre, int edad, String asignatura) {
		super(nombre, edad, asignatura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String fraseCaracterística() {
		// TODO Auto-generated method stub
		return "Pasate de eso que comes";
	}

	@Override
	public String horaDeLlegada() {
		// TODO Auto-generated method stub
		return "17:30";
	}

	@Override
	public boolean descansito() {
		// TODO Auto-generated method stub
		return false;
	}

}
