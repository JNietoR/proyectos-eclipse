package actividad10;

public class Circulo extends FiguraGeometrica {
	private double radio;
	
	public Circulo() {
		super();
		this.tipofig="Circulo";
		this.radio=0;
	}
	public Circulo(double radio) {
		super();
		this.tipofig="Circulo";
		this.radio=radio;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
	double area;
	area=Math.PI*Math.pow(this.radio, 2);
	this.area=area;
	return area;
	}
	@Override
	public double calcularPerimetro() {
	double perimetro;
	perimetro=Math.PI*Math.pow(this.radio, 2);
	this.perimetro=perimetro;
	return perimetro;
	}
}
