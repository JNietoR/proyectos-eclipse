package actividad10interfaces;

public interface iReproductorAudio extends IReproductorPortatil{
	public void setReproduceAudioCDs(boolean reproduceaudiocds) throws Exception;
	public boolean isReproduceAudioCDs();
	public void setReproduceMP3(boolean reproduceaudiomp3) throws Exception;
	public boolean isReproduceMP3();
	public void setReproduceWMA(boolean reproduceaudiowma);
	public boolean isReproduceWMA();
	public void setReproduceAudioVorbis(boolean reproduceaudiovorbis);
	public boolean isReproduceAudioVorbis();
	public void setAccesoCarpetas(boolean accesocarpetas);
	public boolean isAccesoCarpetas();
	public void setRadio(boolean radio);
	public boolean isRadio();
	public void setGrabacionVoz(boolean grabacionvoz);
	public boolean isGrabacionVoz();
	
}
