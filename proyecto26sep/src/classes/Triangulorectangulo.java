package classes;

public class Triangulorectangulo {
	private double catetoa;
	private double catetob;
	private double hipotenusa;
	private double altura;
	private double base;
	private double perimetro;
	private double area;
	
	public Triangulorectangulo() {
		this.catetoa=0;
		this.catetob=0;
		this.hipotenusa=0;
		this.altura=catetoa;
		this.base=catetob;
	}
	public Triangulorectangulo(double catetoa, double catetob, double hipotenusa) {
		if (Math.pow(hipotenusa, 2)==(Math.pow(catetoa, 2)+Math.pow(catetob, 2))) {
		this.catetoa=catetoa;
		this.catetob=catetob;
		this.hipotenusa=hipotenusa;
		}else {
			System.out.println("El triangulo no es rectangulo");
		}
	}
	
	public double getCatetoa () {
		return this.catetoa;
	}
	
	public void setCatetoa (Double catetoa) {
		this.catetoa=catetoa;
	}
	public double getCatetob () {
		return this.catetob;
	}
	
	public void setCatetob (Double catetob) {
		this.catetob=catetob;
	}
	public double getHipotenusa () {
		return this.hipotenusa;
	}
	
	public void setHipotenusa (Double hipotenusa) {
		this.hipotenusa=hipotenusa;
	}
	public double getPerimetro () {
		return this.perimetro;
	}
	public double getArea () {
		return this.area;
	}
	public void calcperimetro() {
		this.perimetro=this.catetoa+this.catetob+this.hipotenusa;
	}
	public void calcarea() {
		this.area=(this.base*this.altura)/2;
	}
	
	public String toString() {
		return "El perimetro de este triangulo es: "+this.perimetro+" y el area es: "+this.area;
	}
	
}

/*
* Diseñe e implemente una clase para representar triángulos 
* rectángulos. Debe añadir las propiedades, métodos y 
* constructores que considere oportunos.
Añada un método para calcular el perímetro y 
otro para el área con los argumentos que considere.	

El Perímetro de un triángulo es igual a la suma de todos sus lados.
area (base*altura)/2

*/