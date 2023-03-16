package tarjetitas;

public class Tarjeta implements iTarjetaMonedero, iTarjetaDebito{

	private int pin,saldo;
	private String id,DNITitular;
	
	public Tarjeta(int pin, int saldo, String id, String dNITitular) {
		this.pin = pin;
		this.saldo = saldo;
		this.id = id;
		DNITitular = dNITitular;
	}
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		// TODO Auto-generated method stub

	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDNITitular() {
		return DNITitular;
	}
	public void setDNITitular(String dNITitular) {
		DNITitular = dNITitular;
	}
	@Override
	public void retirarCajero(int importe, int pin) throws Exception {
		// TODO Auto-generated method stub
		if(this.pin==pin) {
			if(this.saldo>=importe) {
				this.saldo-=importe;
			}else {
				throw new Exception("Saldo insufciciente");
			}
		}else {
			throw new Exception("Pin no coincide");
		}
		
	}
	@Override
	public void comprar(int importe, String DNI) throws Exception {
		// TODO Auto-generated method stub
		if(this.DNITitular.equals(DNI)) {
			if(this.saldo>=importe) {
				this.saldo-=importe;
			}else {
				throw new Exception("Saldo insufciciente");
			}
		}else {
			throw new Exception("DNI no coincide");
		}
	}
	
	

}
