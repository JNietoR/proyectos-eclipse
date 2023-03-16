package classes;

public class Fraccion {

	private int numerador;
	private int denominador;

	public Fraccion() {
		this.numerador=1;
		this.denominador=1;	
	}
	public Fraccion(int numerador, int denominador) {
		this.numerador=numerador;
		this.denominador=denominador;
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
	
	public Fraccion sumar(Fraccion f) {
		Fraccion resultado=new Fraccion();
		resultado.numerador=(this.numerador*f.denominador)+(f.numerador*this.denominador);
		resultado.denominador=this.denominador*this.denominador;
		return resultado;
	}
	public Fraccion restar(Fraccion f) {
		Fraccion resultado=new Fraccion();
		resultado.numerador=(this.numerador*f.denominador)-(f.numerador*this.denominador);
		resultado.denominador=this.denominador*this.denominador;
		return resultado;
	}
	public Fraccion multiplicar(Fraccion f) {
		Fraccion resultado=new Fraccion();
		resultado.numerador=this.numerador*f.numerador;
		resultado.denominador=this.denominador*f.denominador;
		return resultado;
	}
	public Fraccion dividir(Fraccion f) {
		Fraccion resultado=new Fraccion();
		resultado.numerador=this.numerador*f.denominador;
		resultado.denominador=this.denominador*f.numerador;
		return resultado;
	}
	public Fraccion simplificar() {
		Fraccion resultado=new Fraccion();
		resultado.numerador=this.numerador/mcd(this.numerador,this.denominador);
		resultado.denominador=this.denominador/mcd(this.numerador,this.denominador);
		return resultado;
	}
	
	public int mcd(int a, int b) {
		int aux;
		if (a < b) {
		  aux = a;
		  a = b;
		  b = aux;
		}
		
		while ( b != 0) {
		  a -= b;
		  if (a < b) {
		    aux = a;
		    a = b;
		    b = aux;
		}
		}  
		return a;
	}
	public String toString() {
	return this.numerador+"/"+this.denominador;
	}
	/*
 * Cree una clase Fraccion con metodos para sumar, restar, 
 * multiplicar y dividir fracciones
 */
}
