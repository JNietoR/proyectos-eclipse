package examenInterfaces;

public class Fraccion implements iOperable{
	private int numerador;
	private int denominador;
	
	public Fraccion() {
		this.numerador = 1;
		this.denominador = 2;
	}
	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	@Override
	public void sumar(int num) { // le sumamos al numerador el numero multiplicado por el denominador de la fraccion
		// TODO Auto-generated method stub
		this.numerador=this.numerador+(num*this.denominador);
		this.denominador*=1;
	}
	@Override
	public void restar(int num) { //le sumamos al numerador el numero multiplicado por el denominador de la fraccion
		// TODO Auto-generated method stub
		this.numerador=this.numerador-(num*this.denominador);
		this.denominador*=1;
	}
	@Override
	public void multiplicar(int num) { // Al multipliar multiplicamos el numerador por el numerador del entero y el denominador de la misma forma
		// TODO Auto-generated method stub
		this.numerador*=num;
		this.denominador*=1;
	}
	@Override
	public void dividir(int num) { //se multiplica el numerador de la fraccion por el denominador del entero que es 1 y el denominador de la fraccion por el numerador del entero que es el num
		// TODO Auto-generated method stub
		this.numerador*=1;
		this.denominador*=num;
	}
	
	
	
}
