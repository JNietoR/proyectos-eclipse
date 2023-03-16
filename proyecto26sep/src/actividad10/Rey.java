package actividad10;

public class Rey extends FiguraAjedrez{
	public Rey(boolean color, Celda casilla) {
		this.figura="Rey";
		this.color=color;
		this.casilla=casilla;
		
	}
	@Override
	public boolean mover(Celda c) {
		boolean mover=false;
		if((c.getFila()-this.casilla.getFila())<=1 && (c.getCol()-this.casilla.getCol())<=1) {
			mover=true;
		}
		return mover;
	}

	@Override
	public String toString() {
		return "Soy la figura "+this.figura+ " y estoy en la celda "+this.casilla.toString();
	}
}
