package classes;

public class Persona {
	private double peso;
	private double altura;
	private int edad;
	private String sexo;
	private String dni;
	private double imc;
	private String oms;


	public Persona(double peso, double altura, int edad, String sexo) {
		this.setPeso(peso);
		this.setAltura(altura);
		this.setEdad(edad);
		this.sexo=sexo;
		this.imc=this.calculaIMC();
		this.oms=this.clasificacionOMS();
		this.dni=this.generarDNI();
	}
	public double getImc() {
		return imc;
	}
	public String getOms() {
		return oms;
	}
	public String getDni() {
		return dni;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public boolean setPeso(double peso) {
		boolean correcto=true;
		if(this.peso>0) {
			this.peso=peso;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public double getAltura() {
		return altura;
	}
	public boolean setAltura(double altura) {
		boolean correcto=true;
		if(this.altura>0) {
			this.altura=altura;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public int getEdad() {
		return edad;
	}
	public boolean setEdad(int edad) {
		boolean correcto=true;
		if(this.edad>0) {
			this.edad=edad;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public boolean esMayorDeEdad() {
		boolean correcto=true;
		if(this.edad<18) {
			correcto=false;
		}
		return correcto;
	}
	public double calculaIMC() {
		double resultado;
		resultado=this.peso/Math.pow(this.altura, 2);
		return resultado;
	}
	public String clasificacionOMS(){
		String resultado="";
		if(this.imc <=18.5) {
			resultado="Bajo peso";
		}else if(this.imc>18.5&& this.imc<=24.9){
			resultado="Adecuado";
		}else if(this.imc>25&&this.imc<=29.9) {
			resultado="Sobrepeso";
		}else if(this.imc>=30&&this.imc<34.9) {
			resultado="Obesidad grado 1";
		}else if(this.imc>=35&&this.imc<=39.9) {
			resultado="Obesidad grado 2";
		}else {
			resultado="Obesidad grado 3";
		}
		return resultado;
	}
	public boolean comprobarSexo(String sexo) {
		boolean correcto=true;
		if(!sexo.equals(this.sexo)) {
		correcto=false;
		}
		return correcto;
	}
	public String generarDNI() {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		int DNI= (int)((Math.random()*99999999)+00000000);
		String dni = ""+DNI + letras.charAt(DNI%23);
		return dni;	
	}
	public String toString() {
	return "Esta persona de dni "+this.dni+" tiene un peso de "+this.peso+", una altura de "+this.altura+", una edad de"+this.edad+"y su sexo es "+this.sexo+". Su imc es: "+this.imc+" y su clasificación de la OMS es: "+this.oms;
}
	
}
