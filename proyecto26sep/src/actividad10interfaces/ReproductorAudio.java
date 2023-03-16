package actividad10interfaces;

public class ReproductorAudio extends ReproductorPortatil implements iReproductorAudio {
	
	private boolean reproduceaudiocds;
	private boolean reproduceaudiomp3;
	private boolean reproduceaudiowma;
	private boolean reproduceaudiovorbis;
	private boolean radio;
	private boolean accesocarpetas;
	private boolean grabacionvoz;
					
				

	
	public ReproductorAudio(String marca, String modelo, String tipoAlmacenamiento) {
		super(marca, modelo, tipoAlmacenamiento);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setReproduceAudioCDs(boolean reproduceaudiocds) {
		// TODO Auto-generated method stub
		this.reproduceaudiocds=reproduceaudiocds;
	}

	@Override
	public boolean isReproduceAudioCDs() {
		// TODO Auto-generated method stub
		return this.reproduceaudiocds;
	}

	@Override
	public void setReproduceMP3(boolean reproduceaudiomp3) {
		// TODO Auto-generated method stub
		this.reproduceaudiomp3=reproduceaudiomp3;
	}

	@Override
	public boolean isReproduceMP3() {
		// TODO Auto-generated method stub
		return this.reproduceaudiomp3;
	}

	@Override
	public void setReproduceWMA(boolean reproduceaudiowma) {
		// TODO Auto-generated method stub
		this.reproduceaudiowma=reproduceaudiowma;
	}

	@Override
	public boolean isReproduceWMA() {
		// TODO Auto-generated method stub
		return this.reproduceaudiowma;
	}

	@Override
	public void setReproduceAudioVorbis(boolean reproduceaudiovorbis) {
		// TODO Auto-generated method stub
		this.reproduceaudiovorbis=reproduceaudiovorbis;
	}

	@Override
	public boolean isReproduceAudioVorbis() {
		// TODO Auto-generated method stub
		return this.reproduceaudiovorbis;
	}

	@Override
	public void setAccesoCarpetas(boolean accesocarpetas) {
		// TODO Auto-generated method stub
		this.accesocarpetas=accesocarpetas;
	}

	@Override
	public boolean isAccesoCarpetas() {
		// TODO Auto-generated method stub
		return this.accesocarpetas;
	}

	@Override
	public void setRadio(boolean radio) {
		// TODO Auto-generated method stub
		this.radio=radio;
	}

	@Override
	public boolean isRadio() {
		// TODO Auto-generated method stub
		return this.radio;
	}

	@Override
	public void setGrabacionVoz(boolean grabacionvoz) {
		// TODO Auto-generated method stub
		this.grabacionvoz=grabacionvoz;
	}

	@Override
	public boolean isGrabacionVoz() {
		// TODO Auto-generated method stub
		return this.grabacionvoz;
	}

	

	
	
}
