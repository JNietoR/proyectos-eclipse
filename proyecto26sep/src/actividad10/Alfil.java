package actividad10;

public class Alfil extends FiguraAjedrez {
	
	public Alfil(boolean color, Celda casilla) {
		this.figura="Alfil";
		this.color=color;
		this.casilla=casilla;
		
	}
	@Override
	public boolean mover(Celda c) {
		boolean mover=false;
		if(c.getFila()-this.casilla.getFila()==c.getCol()-this.casilla.getCol() || this.casilla.getFila()-c.getFila()==this.casilla.getCol()-c.getCol()) {
			mover=true;
			}
		return mover;
	}

	@Override
	public String toString() {
		return "Soy la figura "+this.figura+ " y estoy en la celda "+this.casilla.toString();
	}
	

}
