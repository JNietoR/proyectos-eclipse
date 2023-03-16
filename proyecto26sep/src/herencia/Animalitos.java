package herencia;

public abstract class Animalitos {
	private String tipo;
	private String familia;
	private String reino;
	
	public abstract String sonido();
	
	public String metabolizar() {
		return "metabolizando estoy";
	}
}
