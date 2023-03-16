package classes;

public class CuentaBancariae {
	private String titular;
	private double saldo;
	
	public CuentaBancariae() {
		this.titular="";
		this.saldo=0;
	}
	public CuentaBancariae(String titular, double saldo) {
		this.titular=titular;
		this.saldo=saldo;
	}
	public CuentaBancariae(String titular) {
		this.titular=titular;
		this.saldo=0;
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
	
	public boolean ingresar(double dinero) {
		boolean correcto=true;
		if(dinero>0) {
			this.saldo+=dinero; // this.saldo=this.saldo+dinero;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public boolean retirar(double dinero) {
		boolean correcto=true;
		if(dinero>this.saldo) {
			correcto=false;
		}else {
			this.saldo-=dinero;
		}
		return correcto;
	}
	public boolean transferir(double dinero, CuentaBancariae cuenta) {
		boolean correcto=true;
		if(this.retirar(dinero)) {
			cuenta.ingresar(dinero);
		}else {
			correcto=false;
		}
		return correcto;
	}
	
}
