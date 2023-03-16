package actividad10;

public class Torre extends FiguraAjedrez {
	
	public Torre(boolean color, Celda casilla) {
		this.figura="Torre";
		this.color=color;
		this.casilla=casilla;
		
	}

	@Override
	public boolean mover(Celda c) {
		boolean mover=false;
		if(this.casilla.getCol()==c.getCol() || this.casilla.getFila()==c.getFila()) {
			mover=true;
			this.casilla=c;
		}
		return mover;
	}

	@Override
	public String toString() {
		return "Soy la figura "+this.figura+ " y estoy en la celda "+this.casilla.toString();
	}
	
}
