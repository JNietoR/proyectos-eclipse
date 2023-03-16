package actividad10interfaces;

public interface IReproductorPortatil {
	public static final String CD="CD";
	public static final String DVD="DVD";
	public static final String MemoriaFlash="Memoria Flash";
	public static final String Minidisk="Minidisk";
	public static final String Ninguna="Ninguna";
	public static final String Texto="Texto";
	public static final String Monocromo="Monocromo";
	public static final String Color="Color";
	public static final String Pila="Pilas";
	public static final String LiIon="Li-Ion";
	
	public String getMarca();
	public void setMarca(String marca);
	public String getModelo();
	public void setModelo(String modelo);
	public boolean isReproduceSonido();
	public void setReproduceSonido(boolean sonido);
	public boolean isReproduceVideo();
	public void setReproduceVideo(boolean video);
	public String getTipoDeAlmacenamiento();
	public void setTipDeoAlmacenamiento(String tipo) throws Exception;
	public int getCapacidadAlmacenamiento();
	public void setCapacidadAlmacenamiento(int capacidad);
	public String getPantalla();
	public void setPantalla(String pantalla) throws Exception;
	public int getAutonomia();
	public void setAutonomia(int autonomia);
	public String getTipoBateria();
	public void setTipoBateria(String tipo) throws Exception;
	public double getPeso();
	public void setPeso(double peso);
	public double getAlto();
	public void setAlto(double alto);
	public double getAncho();
	public void setAncho(double ancho);
	public double getGrosor();
	public void setGrosor(double grosor);
	public String toString();
	
	
	
}
