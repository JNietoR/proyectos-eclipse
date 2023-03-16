package actividad10;

public class Reina extends FiguraAjedrez{
	public Reina(boolean color, Celda casilla) {
		this.figura="Reina";
		this.color=color;
		this.casilla=casilla;
		
	}
	@Override
	public boolean mover(Celda c) {
		boolean mover=false;
		if(c.getCol()==this.casilla.getCol() || c.getFila()==this.casilla.getFila() || c.getFila()-this.casilla.getFila()==c.getCol()-this.casilla.getCol()) {
			mover=true;
		}
		return mover;
	}

	@Override
	public String toString() {
		return "Soy la figura "+this.figura+ " y estoy en la celda "+this.casilla.toString();
	}
}
