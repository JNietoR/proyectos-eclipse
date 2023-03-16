package tarjetitas;

public interface iTarjetaDebito {
	public String getId();
	public String getDNITitular();
	public int getSaldo();
	public void setPin( int pin);
	
	public void comprar(int importe, String DNI) throws Exception ;
	public void retirarCajero(int importe,int pin) throws Exception;
}
