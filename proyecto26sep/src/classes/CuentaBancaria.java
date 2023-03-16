package classes;

public class CuentaBancaria {
	private String titular;
	private double saldo;

	
	public CuentaBancaria() {
		this.titular="";
		this.saldo=0;
	}
	public CuentaBancaria(String titular) {
		this.titular=titular;
		this.saldo=0;
	}
	public CuentaBancaria(String titular, double saldo) {
		this.titular=titular;
		this.saldo=saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public boolean ingresar(double cantidad){
		boolean correcto=true;
		if(cantidad>0) {
		this.saldo+=cantidad;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public boolean retirar(double cantidad){
		boolean correcto=true;
		if(saldo>=cantidad) {
		this.saldo-=cantidad;
		}else {
			correcto=false; 
		}
		return correcto;
	}
	public boolean transferir(double cantidad, CuentaBancaria cuenta) {
		boolean correcto=true;
		if(this.retirar(cantidad)) {
			cuenta.ingresar(cantidad);
			}else {
				correcto=false; 
			}
		return correcto;
	}
	
	public String toString() {
		return "La cuenta tiene un titular " + titular + "y un saldo de" + saldo;
	}
	
}