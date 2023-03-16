package ejercicio2Interfaces;

public interface TarjetaMonedero {
	public void comprar(double importe, String dni);
	public String getId();
	public String getDniTitular();
	public double getSaldo();
	public void setPin();
	
	
	
}
