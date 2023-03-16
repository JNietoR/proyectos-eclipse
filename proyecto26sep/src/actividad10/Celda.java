package actividad10;

public class Celda {
	private char fila;
	private int col;
	
	public Celda(char fila, int col) {
		super();
		this.fila = fila;
		this.col = col;
	}
	public char getFila() {
		return fila;
	}
	public void setFila(char fila) {
		this.fila = fila;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	@Override
	public String toString() {
		return "Celda [fila=" + fila + ", col=" + col + "]";
	}
	
	
}
