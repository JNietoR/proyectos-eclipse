package classes;

public class Punto3D extends Punto {
	private double z;
	
	public Punto3D(){
		super();
		this.z=0;
		
	}
	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z=z;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Punto tridimensional con coordenadas ("+this.x+","+this.y+","+this.z+")";
	}
	/*
	@Overrride
	public String toString() {
		return super.toString() + ","+this.z+")";
	}
	*/
	public void moverP (double dist) {
		this.z+=dist;
	}
	

}
