package actividad10;

public class Caballo extends FiguraAjedrez{
	
	public Caballo(boolean color, Celda casilla) {
		this.figura="Caballo";
		this.color=color;
		this.casilla=casilla;
		
	}
	@Override
	public boolean mover(Celda c) {
		boolean mover=true;
		if(((c.getFila()-this.casilla.getFila()==2 || this.casilla.getFila()-c.getFila()==2) && (c.getCol()-this.casilla.getCol()==1 || this.casilla.getCol()-c.getCol()==1)) || ((c.getFila()-this.casilla.getFila()==1 || this.casilla.getFila()-c.getFila()==1) && (c.getCol()-this.casilla.getCol()==2 || this.casilla.getCol()-c.getCol()==2))) {
			mover=true;
		}
		return mover;
	}

	@Override
	public String toString() {
		return "Soy la figura "+this.figura+ " y estoy en la celda "+this.casilla.toString();
	}

}
