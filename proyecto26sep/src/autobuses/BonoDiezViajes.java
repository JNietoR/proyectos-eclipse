package autobuses;

public class BonoDiezViajes implements iBonoBus{
	private int numviajes;
	public BonoDiezViajes() {
		this.numviajes=10;
	}
	public int getNumviajes() {
		return numviajes;
	}
	private void setNumviajes(int numviajes) {
		this.numviajes = numviajes;
	}
	@Override
	public boolean picarViaje(int dia, int mes, int año, int hora, int minuto, int linea) {
		// TODO Auto-generated method stub
		boolean resultado=false;
		if(this.numviajes>0) {
			this.numviajes-=1;
			resultado=true;
		}
		return resultado;
	}
	
}
