package actividad10;

public abstract class FiguraGeometrica {
	protected double perimetro;
	protected double area;
	protected String tipofig;
	public abstract double calcularArea();		
	public abstract double calcularPerimetro();
	public boolean compararArea(FiguraGeometrica objeto) {
		boolean correcto=false;
		if (this.calcularArea()>objeto.calcularArea()) {
			correcto=true;
		}
		return correcto;
	}
	public String toString() {
		return "Soy un "+this.tipofig+" con area: "+this.area+" y perimetro: "+this.perimetro;
	}
}
