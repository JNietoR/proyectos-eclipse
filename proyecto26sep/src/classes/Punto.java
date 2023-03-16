package classes;

public class Punto {
	protected double x;
	protected double y;
	
	public Punto() {
		this.x=0;
		this.y=0;
	}
	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString(){
	return "("+this.x+","+this.y+")";
	}
	
	public void moverV(double dist) {
		this.y+=dist;
	}
	public void moverH(double dist) {
		this.x+=dist;
	}
}
