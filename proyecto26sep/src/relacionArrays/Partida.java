package relacionArrays;

public class Partida {
	private int col;
	private int row;
	private int tablero[][];
	private Jugador jugador1;
	private Jugador jugador2;
	
	public Partida (){
		this.col=7;
		this.row=7;
		this.tablero= new int[7][7];
		this.jugador1= new Jugador();
		this.jugador2= new Jugador();
			
	}
	public Partida (int col, int row, int[][] tablero, Jugador jugador1, Jugador jugador2){
		this.col=7;
		this.row=7;
		this.tablero= new int[7][7];
		this.jugador1= jugador1;
		this.jugador2= jugador2;
			
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int[][] getTablero() {
		return tablero;
	}
	public void setTablero(int[][] tablero) {
		this.tablero = tablero;
	}
	public Jugador getJugador1() {
		return jugador1;
	}
	public void setJugador1(Jugador jugador1) {
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2() {
		return jugador2;
	}
	public void setJugador2(Jugador jugador2) {
		this.jugador2 = jugador2;
	}
	public String toString(){
		return "Tablero de "+this.row+"x"+this.col+" donde juegan "+this.jugador1+" y "+this.jugador2;
	}	
	public void rellenar() {
		for(int i=0;i<this.row;i++) {
			for(int j=0;j<this.col;j++) {
				tablero[i][j]=0;
			}
		}
	}
	public void imprimir() {
		for(int i=0;i<this.row;i++) {
			for(int j=0;j<this.col;j++) {
				System.out.print(tablero[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	public boolean comprobar() {
		boolean correcto=false;
		for (int i=this.row-1;i>=0;i--) {
			if(tablero[i][col]==0 && !correcto) {
				correcto=true;
			}
		}
		return correcto;
	}
	public void meterficha(int col) {
		
	}
	
}
