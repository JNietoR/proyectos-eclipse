package examendado;

public class Dado { 
	//atributos de la clase
	private int caras;
	private boolean trucado;
	
	public Dado() { //constructor vacio /por defecto
		this.caras=0;
		this.trucado=false;
	}
	public Dado(int caras, boolean trucado) { // constructor por parametros
		if(caras>1) { // filtro para garantizar que tenga al menos 2 caras
			this.caras=caras;
		}
		this.trucado=trucado;
	}
	public int getCaras() { //getter para el #caras
		return caras;
	}
	public boolean setCaras(int caras) { // set #caras en este set haremos un filtro para garantizar que el dado tenga al menos 2 caras
		boolean correcto=true; 
		if(caras<2) {
			correcto=false;
		}else {
			this.caras = caras;
		}
		return correcto;
	}
	public boolean isTrucado() { //getter atributo trucado
		return trucado;
	}
	public void setTrucado(boolean trucado) { //setter atributo trucado
		this.trucado = trucado;
	}
	public String toString() { //metodo toString de la clase
		String estatrucado=""; 
		if(trucado) { // en este if crearemos un string para adaptar el boolean a un String y poder utilizarlo en el toString
			estatrucado="esta trucado";
		}else {
			estatrucado="no esta trucado";
		}
		return "caras: "+this.caras+" y "+estatrucado;
	}
	public int tirada() { //metodo para guardar el resultado de la tirada 
		int resultado;
		if(trucado) {
			int probabilidad=(int)((Math.random()*2)+1); //genera un numero aleatorio con dos posibilidades
			if(probabilidad==1) { // una de estas posiblididades le da el numero maximo de caras al resultado
				resultado=this.caras;
			}else{
				resultado = (int)((Math.random()*this.caras)+1); //la otra genera un numero entre 1 y el maximo posible
			}
		}else {
			resultado = (int)((Math.random()*this.caras)+1); //igual que si el dado no estubiera trucado
		}
		return resultado;	
	}
}
