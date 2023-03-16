package actividad10interfaces;

public class ReproductorMultimedia extends ReproductorPortatil implements iReproductorVideo, iReproductorAudio {

	private boolean ReproduceWMV;
	private boolean ReproduceDIVX;
	private boolean ReproduceMPG;
	private boolean ReproduceDVD;
	private boolean ReproduceJPG;
	private double TamanyoDeLaPantalla;
	private boolean Television;

	private boolean reproduceaudiocds;
	private boolean reproduceaudiomp3;
	private boolean reproduceaudiowma;
	private boolean reproduceaudiovorbis;
	private boolean radio;
	private boolean accesocarpetas;
	private boolean grabacionvoz;

	public ReproductorMultimedia(String marca, String modelo, double tamanyoDeLaPantalla) {

		super(marca, modelo);
	}

	public ReproductorMultimedia(String marca, String modelo, String tipoAlmacenamiento) {
		super(marca, modelo, tipoAlmacenamiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setReproduceAudioCDs(boolean reproduceaudiocds) throws Exception{
		// TODO Auto-generated method stub
		if (this.getTipoDeAlmacenamiento().equals(CD)) {
			// TODO Auto-generated method stub
			this.reproduceaudiocds = reproduceaudiocds;
		} else {
			throw new Exception("No reproduce CD");
		}
	}

	@Override
	public boolean isReproduceAudioCDs() {
		// TODO Auto-generated method stub
		return this.reproduceaudiocds;
	}

	@Override
	public void setReproduceMP3(boolean reproduceaudiomp3) throws Exception {
		// TODO Auto-generated method stub
		this.reproduceaudiomp3 = reproduceaudiomp3;
	}

	@Override
	public boolean isReproduceMP3() {
		// TODO Auto-generated method stub
		return this.reproduceaudiomp3;
	}

	@Override
	public void setReproduceWMA(boolean reproduceaudiowma) {
		// TODO Auto-generated method stub
		this.reproduceaudiowma = reproduceaudiowma;
	}

	@Override
	public boolean isReproduceWMA() {
		// TODO Auto-generated method stub
		return this.reproduceaudiowma;
	}

	@Override
	public void setReproduceAudioVorbis(boolean reproduceaudiovorbis) {
		// TODO Auto-generated method stub
		this.reproduceaudiovorbis = reproduceaudiovorbis;
	}

	@Override
	public boolean isReproduceAudioVorbis() {
		// TODO Auto-generated method stub
		return this.reproduceaudiovorbis;
	}

	@Override
	public void setAccesoCarpetas(boolean accesocarpetas) {
		// TODO Auto-generated method stub
		this.accesocarpetas = accesocarpetas;
	}

	@Override
	public boolean isAccesoCarpetas() {
		// TODO Auto-generated method stub
		return this.accesocarpetas;
	}

	@Override
	public void setRadio(boolean radio) {
		// TODO Auto-generated method stub
		this.radio = radio;
	}

	@Override
	public boolean isRadio() {
		// TODO Auto-generated method stub
		return this.radio;
	}

	@Override
	public void setGrabacionVoz(boolean grabacionvoz) {
		// TODO Auto-generated method stub
		this.grabacionvoz = grabacionvoz;
	}

	@Override
	public boolean isGrabacionVoz() {
		// TODO Auto-generated method stub
		return this.grabacionvoz;
	}

	@Override
	public boolean isReproduceWMV() {
		// TODO Auto-generated method stub
		return ReproduceWMV;
	}

	@Override
	public void setReproduceWMV(boolean WMV) {
		// TODO Auto-generated method stub
		ReproduceWMV = WMV;
	}

	@Override
	public boolean isReproduceDIVX() {
		// TODO Auto-generated method stub
		return ReproduceDIVX;
	}

	@Override
	public void setReproduceDIVX(boolean DIVX) {
		// TODO Auto-generated method stub
		ReproduceDIVX = DIVX;
	}

	@Override
	public boolean isReproduceMPG() {
		// TODO Auto-generated method stub
		return ReproduceMPG;
	}

	@Override
	public void setReproduceMPG(boolean MPG) {
		// TODO Auto-generated method stub
		ReproduceMPG = MPG;
	}

	@Override
	public boolean isReproduceDVD() {
		// TODO Auto-generated method stub
		return ReproduceDVD;
	}

	@Override
	public void setReproduceDVD(boolean DVD) {
		// TODO Auto-generated method stub
		ReproduceDVD = DVD;
	}

	@Override
	public boolean isReproduceJPG() {
		// TODO Auto-generated method stub
		return ReproduceJPG;
	}

	@Override
	public void setReproduceJPG(boolean JPG) {
		// TODO Auto-generated method stub
		ReproduceJPG = JPG;
	}

	@Override
	public double getTamanyoDeLaPantalla() {
		// TODO Auto-generated method stub
		return TamanyoDeLaPantalla;
	}

	@Override
	public void setTamanyoDeLaPantalla(double tamanyo) {
		// TODO Auto-generated method stub
		TamanyoDeLaPantalla = tamanyo;
	}

	@Override
	public boolean isTelevision() {
		// TODO Auto-generated method stub
		return Television;
	}

	@Override
	public void setTelevision(boolean television) {
		// TODO Auto-generated method stub
		Television = television;
	}

}
