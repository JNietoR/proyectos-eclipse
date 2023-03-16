package examenInterfaces;

public class Pato extends Animal{

	protected Pato(String familia, String especie, String reino) {
		super(familia, especie, reino);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "QUACK QUACK MF";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Na de locos este pan";
	}

	@Override
	public boolean reproduccion() {
		// TODO Auto-generated method stub
		return true;
	}

	

}
