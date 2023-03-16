package actividad10;

public class TrianguloRectangulo extends FiguraGeometrica{
private double base;
private double altura;
private double hipotenusa;
	
	public TrianguloRectangulo() {
		super();
		this.tipofig="Triangulo Rectangulo";
		this.base=0;
		this.altura=0;
		this.hipotenusa=0;
	}
	public TrianguloRectangulo(double base, double altura) {
		super();
		this.tipofig="Triangulo Rectangulo";
		this.base=base;
		this.altura=altura;
		this.hipotenusa=Math.pow(altura, 2)+Math.pow(base, 2);
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
	public double getHipotenusa() {
		return hipotenusa;
	}
	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}
	@Override
	public double calcularArea() {
	double area;
	area=(this.base*this.altura)/2;
	this.area=area;
	return area;
	}
	@Override
	public double calcularPerimetro() {
	double perimetro;
	perimetro=this.altura+this.base+this.hipotenusa;
	this.perimetro=perimetro;
	return perimetro;
	}
}
