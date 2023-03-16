package actividad10interfaces;

public class ReproductorPortatil implements IReproductorPortatil{
	private String marca;
	private String modelo;
	private boolean sonido;
	private boolean video;
	private String tipoAlmacenamiento;
	private int capacidadAlmacenamiento;
	private String pantalla;
	private int autonomia;
	private String tipoBateria;
	private double peso;
	private double alto;
	private double ancho;
	private double grosor;
	
	public ReproductorPortatil(String marca, String modelo, boolean sonido, boolean video, String tipoAlmacenamiento,
			int capacidadAlmacenamiento, String pantalla, int autonomia, String tipoBateria, double peso, double alto,
			double ancho, double grosor) {
		this.marca = marca;
		this.modelo = modelo;
		this.sonido = sonido;
		this.video = video;
		this.tipoAlmacenamiento = tipoAlmacenamiento;
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
		this.pantalla = pantalla;
		this.autonomia = autonomia;
		this.tipoBateria = tipoBateria;
		this.peso = peso;
		this.alto = alto;
		this.ancho = ancho;
		this.grosor = grosor;
	}
	public ReproductorPortatil(String marca, String modelo, String tipoAlmacenamiento) {
		this.marca = marca;
		this.modelo = modelo;
		this.tipoAlmacenamiento = tipoAlmacenamiento;
		
	}
	public ReproductorPortatil(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return this.marca;
	}

	@Override
	public void setMarca(String marca) {
		// TODO Auto-generated method stub
		this.marca=marca;
	}

	@Override
	public String getModelo() {
		// TODO Auto-generated method stub
		return this.modelo;
	}

	@Override
	public void setModelo(String modelo) {
		// TODO Auto-generated method stub
		this.modelo=modelo;
	}

	@Override
	public boolean isReproduceSonido() {
		// TODO Auto-generated method stub
		return this.sonido;
	}

	@Override
	public void setReproduceSonido(boolean sonido) {
		// TODO Auto-generated method stub
		this.sonido=sonido;
	}

	@Override
	public boolean isReproduceVideo() {
		// TODO Auto-generated method stub
		return this.video;
	}

	@Override
	public void setReproduceVideo(boolean video) {
		// TODO Auto-generated method stub
		this.video=video;
	}

	@Override
	public String getTipoDeAlmacenamiento() {
		// TODO Auto-generated method stub
		return this.tipoAlmacenamiento;
	}

	@Override
	public void setTipDeoAlmacenamiento(String tipo) throws Exception {
		// TODO Auto-generated method stub
		if(tipo.equals(CD) || tipo.equals(DVD) || tipo.equals(MemoriaFlash) || tipo.equals(Minidisk) || tipo.equals(Ninguna) ) {
			this.tipoAlmacenamiento=tipo;
		}else {
			throw new Exception("Almacenamiento no valido");
		}
		
	}

	@Override
	public int getCapacidadAlmacenamiento() {
		// TODO Auto-generated method stub
		return this.capacidadAlmacenamiento;
	}

	@Override
	public void setCapacidadAlmacenamiento(int capacidad) {
		// TODO Auto-generated method stub
		this.capacidadAlmacenamiento=capacidad;
	}

	@Override
	public String getPantalla() {
		// TODO Auto-generated method stub
		return this.pantalla;
	}

	@Override
	public void setPantalla(String pantalla) throws Exception{
		// TODO Auto-generated method stub
		if(pantalla.equals(Ninguna) || pantalla.equals(Texto) || pantalla.equals(Monocromo) || pantalla.equals(Color) ) {
			this.pantalla=pantalla;
		}else {
			throw new Exception("Pantalla no valida");
		}
	}

	@Override
	public int getAutonomia() {
		// TODO Auto-generated method stub
		return this.autonomia;
	}

	@Override
	public void setAutonomia(int autonomia) {
		// TODO Auto-generated method stub
		this.autonomia=autonomia;
	}

	@Override
	public String getTipoBateria() {
		// TODO Auto-generated method stub
		return this.tipoBateria;
	}

	@Override
	public void setTipoBateria(String tipo) throws Exception {
		// TODO Auto-generated method stub
		if(tipoBateria.equals(Pila) || tipoBateria.equals(LiIon) ) {
			this.tipoBateria=tipo;
		}else {
			throw new Exception("Baterias no valida");
		}
	}

	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return this.peso;
	}

	@Override
	public void setPeso(double peso) {
		// TODO Auto-generated method stub
		this.peso=peso;
	}

	@Override
	public double getAlto() {
		// TODO Auto-generated method stub
		return this.alto;
	}

	@Override
	public void setAlto(double alto) {
		// TODO Auto-generated method stub
		this.alto=alto;
	}

	@Override
	public double getAncho() {
		// TODO Auto-generated method stub
		return this.ancho;
	}

	@Override
	public void setAncho(double ancho) {
		// TODO Auto-generated method stub
		this.ancho=ancho;
	}

	@Override
	public double getGrosor() {
		// TODO Auto-generated method stub
		return this.grosor;
	}

	@Override
	public void setGrosor(double grosor) {
		// TODO Auto-generated method stub
		this.grosor=grosor;
	}
	@Override
	public String toString() {
		return "ReproductorPortatil [marca=" + marca + ", modelo=" + modelo + ", sonido=" + sonido + ", video=" + video
				+ ", tipoAlmacenamiento=" + tipoAlmacenamiento + ", capacidadAlmacenamiento=" + capacidadAlmacenamiento
				+ ", pantalla=" + pantalla + ", autonomia=" + autonomia + ", tipoBateria=" + tipoBateria + ", peso="
				+ peso + ", alto=" + alto + ", ancho=" + ancho + ", grosor=" + grosor + "]";
	}

	
	

}
