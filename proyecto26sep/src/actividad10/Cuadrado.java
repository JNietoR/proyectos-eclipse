package actividad10;

public class Cuadrado extends FiguraGeometrica{
private double lado;
	
	public Cuadrado() {
		super();
		this.tipofig="Cuadrado";
		this.lado=0;
	}
	public Cuadrado(double lado) {
		super();
		this.tipofig="Cuadrado";
		this.lado=lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public double calcularArea() {
	double area;
	area=Math.pow(lado, 2);
	this.area=area;
	return area;
	}
	@Override
	public double calcularPerimetro() {
	double perimetro;
	perimetro=4*this.lado;
	this.perimetro=perimetro;
	return perimetro;
	}
}
