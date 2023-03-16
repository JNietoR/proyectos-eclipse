package examenInterfaces;

public class Perro extends Animal{

	protected Perro(String familia, String especie, String reino) {
		super(familia, especie, reino);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "WOOF WOOF BARK BARK";
	}

	@Override
	public String comer() {
		// TODO Auto-generated method stub
		return "Lo que se te caiga al suelo y no seas rapido en pillar es mio bro";
	}

	@Override
	public boolean reproduccion() {
		// TODO Auto-generated method stub
		return true;
	}

}
