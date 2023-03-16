package examenInterfaces;

public abstract class Animal { //he puesto los atributos protected para no tener que usar los get y set para acceder a las variables
	protected String familia;
	protected String especie;
	protected String reino;
	
	protected Animal(String familia,String especie, String reino) {
		this.familia=familia;
		this.especie=especie;
		this.reino=reino;
	}
	
	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public abstract String sonido();
	public abstract String comer();
	public abstract boolean reproduccion();
}
