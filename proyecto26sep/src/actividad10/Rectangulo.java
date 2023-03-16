package actividad10;

public class Rectangulo extends FiguraGeometrica{
	private double base;
	private double altura;
	
	public Rectangulo() {
		super();
		this.tipofig="Rectangulo";
		this.base=0;
		this.altura=0;
	}
	public Rectangulo(double base, double altura) {
		super();
		this.tipofig="Rectangulo";
		this.base=base;
		this.altura=altura;
	}
		public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public double calcularArea() {
	double area;
	area=this.base*this.altura;
	this.area=area;
	return area;
	}
	@Override
	public double calcularPerimetro() {
	double perimetro;
	perimetro=2*this.base+2*this.altura;
	this.perimetro=perimetro;
	return perimetro;
	}
}
