package tarjetitas;

public interface iTarjetaMonedero {
	public String getId();
	public String getDNITitular();
	public int getSaldo();
	public void setPin( int pin);
	
	public void comprar(int importe, String DNI) throws Exception;
}
