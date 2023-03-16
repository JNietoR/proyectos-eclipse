package PaqueteSuperHeroe;

public class Figura {
	private String codigo;
	private double precio;
	private SuperHeroe superheroefigura;
	private Dimension dimensionfigura;
	
	public Figura() {
		this.codigo="";
		this.precio=0;
		this.superheroefigura=new SuperHeroe();
		this.dimensionfigura=new Dimension();
	}
	public Figura(String codigo, double precio, SuperHeroe superheroefigura, Dimension dimensionfigura) {
		if(precio>0) {
			this.precio=precio;
		}
		this.codigo=codigo;
		this.superheroefigura=superheroefigura;
		this.dimensionfigura=dimensionfigura;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public boolean setPrecio(double precio) {
		boolean correcto=true;
		if(precio<0) {
			correcto=false;
		}else {
			this.precio=precio;
		}
		return correcto;
	}
	public SuperHeroe getSuperheroefigura() {
		return superheroefigura;
	}
	public void setSuperheroefigura(SuperHeroe superheroefigura) {
		this.superheroefigura = superheroefigura;
	}
	public Dimension getDimensionfigura() {
		return dimensionfigura;
	}
	public void setDimensionfigura(Dimension dimensionfigura) {
		this.dimensionfigura = dimensionfigura;
	}
	public String toString() {
		return "Este heroe "+this.superheroefigura+" con dimensiones "+this.dimensionfigura+" y codigo "+this.codigo+" y precio "+this.precio;
	}

	public void subirPrecio(double cantidad) {
		if(cantidad>0) {
			this.precio+=cantidad;
		}
	}
}
