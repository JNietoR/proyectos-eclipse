package actividad10;

public abstract class FiguraAjedrez {
	protected String figura;
	protected boolean color;
	protected Celda casilla;
	
	public String getFigura() {
		return figura;
	}
	public void setFigura(String figura) {
		this.figura = figura;
	}
	public boolean getColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public Celda getCasilla() {
		return casilla;
	}
	public void setCasilla(Celda casilla) {
		this.casilla = casilla;
	}
	
	public String toString() {
		return "Soy la figura "+this.figura+ " y estoy en la celda "+this.casilla.toString();
	}
	public abstract boolean mover(Celda c);
	

}
