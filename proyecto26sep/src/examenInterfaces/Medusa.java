package examenInterfaces;

public class Medusa extends Animal{

	protected Medusa(String familia, String especie, String reino) {
		super(familia, especie, reino);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "No hace sonidos te juzga";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Langostinos Pescanova, llevalo a casa!";
	}

	@Override
	public boolean reproduccion() {
		// TODO Auto-generated method stub
		return false;
	}

}
