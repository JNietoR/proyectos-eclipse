package hundirLaFlota;

public class Barco extends Casilla{
	private String id;
	private int tamaño,vida;
	
	public Barco(String id, int tamaño) {
		super(id);
		this.tamaño=tamaño;
		this.vida=tamaño;
	}
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getTamaño() {
		return tamaño;
	}


	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}


	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	@Override
	public boolean isTocado() {
			this.vida--;
		return true;
	}
	
	@Override
	public String toString() {
		return this.id;
	}
	
	public boolean isAlive() {
		boolean vivo=false;
		if(this.vida>0) {
			vivo=true;
		}
		return vivo;
	}
	/*
	@Override
	public boolean hundido() {
		
		return isAlive();
	}
	*/

}
