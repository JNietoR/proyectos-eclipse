package classes;

public class Cubata {
	private String alcohol;
	private String refresco;
	private int hielo;
	private double precio;
	private int capacidad;
	private int cantidad;
	
	
	
	
	public Cubata() {
		this.alcohol="Ron";
		this.refresco="Cola";
		this.hielo=2;
		this.precio=7;
		this.capacidad=500;
		this.cantidad=capacidad;
	}
	public Cubata(String alcohol, String refresco, int hielo, double precio, int capacidad) {
		this.alcohol=alcohol;
		this.refresco=refresco;
		this.hielo=hielo;
		this.precio=precio;
		this.capacidad=capacidad;
		this.cantidad=capacidad;
	}
	
	public String getAlcohol() {
		return this.alcohol;
	}
	public void setAlcohol(String alcohol) {
		this.alcohol=alcohol;
	}
	public String getRefresco() {
		return this.refresco;
	}
	public void setRefresco(String refresco) {
		this.refresco=refresco;
	}
	public int getHielo() {
		return this.hielo;
	}
	public void setHielo(int hielo) {
		if(hielo>=0) {
			this.hielo=hielo;
		}else {
			System.out.println("No se ha actualizado los hielos");
		}
	}
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		if(precio>=0) {
			this.precio=precio;
		}else {
			System.out.println("No se ha modificado el precio");
		}
	}
	public int getCantidad() {
		return this.cantidad;
	}
	public void setCantidad(int cantidad) {
		if (cantidad<500 && cantidad>0) {
		this.cantidad=cantidad;
		}else {
			System.out.println("No se ha modificado la cantidad");
		}
	}
	public int getCapacidad() {
		return this.capacidad;
	}
	public void setCapacidad(int capacidad) {
		if (capacidad<500 && capacidad>0) {
		this.capacidad=capacidad;
		}else {
			System.out.println("No se ha modificado la capacidad");
		}
	}
	
	public void llenar() {
		this.cantidad=this.capacidad;
	}
	public void beber(int trago) {
		if(this.cantidad<trago) {
			this.cantidad=0;
		}else {
		this.cantidad-=trago;
		}
	}
	public void hidalgo() {
		this.cantidad=0;
	}
	public void aguarse() {
		if (this.hielo>0) {
		this.hielo--;
		this.cantidad+=50;
		if (this.cantidad>this.capacidad) {
			this.cantidad=this.capacidad;
		}
		}
	}
	public String toString() {
		return "Has pedido un cubata con " + this.alcohol + " con " + this.refresco + " y con una capacidad de " + this.capacidad + " y una cantidad de " + this.hielo +" hielos";
	}
	
}

/*
 * atributos que tendra nuestra clase cubata enteros hielo, alcohol String, string refresco, double precio,
 *  capacidad int, cantidad int
 *  metodos que tendremos llenar cantidad=capacidad, beber recibe cantidad, hidalgo beber del tiron, aguarse se derrite un hielo disminuye un hielo y aumenta cantidad.
 */