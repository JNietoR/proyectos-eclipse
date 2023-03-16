package actividad10interfaces;

public class ReproductorVideo extends ReproductorPortatil implements iReproductorVideo{

	private boolean ReproduceWMV;
	private boolean ReproduceDIVX;
	private boolean ReproduceMPG;
	private boolean ReproduceDVD;
	private boolean ReproduceJPG;
	private double  TamanyoDeLaPantalla;
	private boolean Television;
	
	public ReproductorVideo(String marca, String modelo, double tamanyoDeLaPantalla) {
		
		super(marca, modelo);
		TamanyoDeLaPantalla = tamanyoDeLaPantalla;
	}

	public boolean isReproduceWMV() {
		return ReproduceWMV;
	}

	public void setReproduceWMV(boolean reproduceWMV) {
		ReproduceWMV = reproduceWMV;
	}

	public boolean isReproduceDIVX() {
		return ReproduceDIVX;
	}

	public void setReproduceDIVX(boolean reproduceDIVX) {
		ReproduceDIVX = reproduceDIVX;
	}

	public boolean isReproduceMPG() {
		return ReproduceMPG;
	}

	public void setReproduceMPG(boolean reproduceMPG) {
		ReproduceMPG = reproduceMPG;
	}

	public boolean isReproduceDVD() {
		return ReproduceDVD;
	}

	public void setReproduceDVD(boolean reproduceDVD) {
		ReproduceDVD = reproduceDVD;
	}

	public boolean isReproduceJPG() {
		return ReproduceJPG;
	}

	public void setReproduceJPG(boolean reproduceJPG) {
		ReproduceJPG = reproduceJPG;
	}

	public double getTamanyoDeLaPantalla() {
		return TamanyoDeLaPantalla;
	}

	public void setTamanyoDeLaPantalla(double tamanyoDeLaPantalla) {
		TamanyoDeLaPantalla = tamanyoDeLaPantalla;
	}

	public boolean isTelevision() {
		return Television;
	}

	public void setTelevision(boolean television) {
		Television = television;
	}


	
}
