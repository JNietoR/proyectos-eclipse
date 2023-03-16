package PaqueteSuperHeroe;

public class Dimension {
	
	private double alto;
	private double ancho;
	private double profundidad;
	
	public Dimension() {
		this.alto=0;
		this.ancho=0;
		this.profundidad=0;
	}
	public Dimension(double alto, double ancho, double profundidad) {
		if(this.alto>0 || this.ancho>0 || this.profundidad>0) {
			this.alto=alto;
			this.ancho=ancho;
			this.profundidad=profundidad;
		}
		/* Esto seria si no utilizamos los set en el constructor como filtro
		this.setAlto(alto);
		this.setAncho(ancho);
		this.setProfundidad(profundidad);
		*/
	}
	public double getAlto() {
		return alto;
	}
	public boolean setAlto(double alto) {
		boolean correcto=true;
		if(alto<0) {
			correcto=false;
		}else {
			this.alto=alto;
		}
		return correcto;
	}
	public double getAncho() {
		return ancho;
	}
	public boolean setAncho(double ancho) {
		boolean correcto=true;
		if(ancho<0) {
			correcto=false;
		}else {
			this.ancho=ancho;
		}
		return correcto;
	}
	public double getProfundidad() {
		return profundidad;
	}
	public boolean setProfundidad(double profundidad) {
		boolean correcto=true;
		if(profundidad<0) {
			correcto=false;
		}else {
			this.profundidad=profundidad;
		}
		return correcto;
	}
	public String toString() {
		return "alto: "+this.alto+" ancho: "+this.ancho+" profundidad: "+this.profundidad+" volumen: "+this.getVolumen()+"";
	}
	public double getVolumen() {
		return this.alto*this.ancho*this.profundidad;
		
	}
}
