package hundirLaFlota;

import java.util.ArrayList;
import java.util.HashMap;

public class Tablero {
	private HashMap<String,Casilla> tablero;
	
	public Tablero() {
		this.tablero= new HashMap<String,Casilla>();
		String coord="";
		char letra='A';
		int num=1;
		Barco b=new Barco("D",4);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				coord+=""+letra+num;
				if(coord.equals("A2") || coord.equals("B2") || coord.equals("C2") || coord.equals("D2")) {
					tablero.put(coord,b);
				}else {
					tablero.put(coord, new Agua());
				}
				tablero.put(coord, new Agua());
				num++;
			}
			letra++;
			num=1;
		}
	}
	
	public String toString() {
		
		ArrayList<String> arraytablero = new ArrayList<String>(this.tablero.keySet());
		arraytablero.sort(null);
		String salida="";
		for(int i=0;i<arraytablero.size();i++) {
			if(i%9==0 && i!=0) {
				salida+="\n";
			}
			salida+= this.tablero.get(arraytablero.get(i)) +" ";
		}
		return salida;
	}
	public HashMap<String, Casilla> getTablero() {
		return tablero;
	}

	public void setTablero(HashMap<String, Casilla> tablero) {
		this.tablero = tablero;
	}
	
	public boolean tocado(Casilla casilla) {
		
		return casilla.isTocado();
	}
}
