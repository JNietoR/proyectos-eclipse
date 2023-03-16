package actividad10interfaces;

public interface iReproductorVideo extends IReproductorPortatil{

	public boolean isReproduceWMV();
	public void setReproduceWMV(boolean WMV);
	
	public boolean isReproduceDIVX();
	public void setReproduceDIVX(boolean DIVX);
	
	public boolean isReproduceMPG();
	public void setReproduceMPG(boolean MPG);
	
	public boolean isReproduceDVD();
	public void setReproduceDVD(boolean DVD);
	
	public boolean isReproduceJPG();
	public void setReproduceJPG(boolean JPG);
	
	public double getTamanyoDeLaPantalla();
	public void setTamanyoDeLaPantalla(double tamanyo);
	
	public boolean isTelevision();
	public void setTelevision(boolean Television);
	
}
