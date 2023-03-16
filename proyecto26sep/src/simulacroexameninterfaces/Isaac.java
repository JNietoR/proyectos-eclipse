package simulacroexameninterfaces;

public class Isaac extends Profesor{
	
	protected Isaac(String nombre, int edad, String asignatura) {
		super(nombre, edad, asignatura);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String fraseCaracterística() {
		// TODO Auto-generated method stub
		return "Vamos a hacer unas consultas";
	}

	@Override
	public String horaDeLlegada() {
		// TODO Auto-generated method stub
		return "15:00";
	}

	@Override
	public boolean descansito() {
		// TODO Auto-generated method stub
		return false;
	}
}
