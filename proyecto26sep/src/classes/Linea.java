package classes;
/*
Define una clase Linea que tendrá dos atributos de la clase Punto: los dos puntos por los que pasa la línea 
en un espacio de dos dimensiones.
La clase dispondrá de los siguientes métodos:
Constructor por defecto: inicializa ambos puntos a (0,0).
Constructores con parámetros:
Línea(x, y): Línea de (0,0) a (x,y)
Línea(x1, y1, x2, y2): Línea de (x1, y1) a (x2, y2)
Línea(Punto, Punto): Dos objetos de la clase Punto que representan el origen y final de la línea.
Métodos de acceso a las propiedades.
Métodos para mover la línea a la derecha, izquierda, arriba o abajo una distancia indicada.
Método toString() redefinido para que muestre la información como: [<origen>, <final>]: Distancia: <distancia>
 */
public class Linea {
	private Punto puntoi;
	private Punto puntof;
	
	public Linea() {
		this.puntoi= new Punto();
		this.puntof= new Punto();
	}
	public Linea(double x, double y) {
		this.puntoi=new Punto(0,0);
		this.puntof=new Punto(x, y);
	}
	public Linea(double x1, double x2, double y1, double y2) {
		this.puntoi=new Punto(x1,y1);
		this.puntof=new Punto(x2,y2);
	}
	public Linea(Punto puntoi, Punto puntof) {
		this.puntoi=puntoi;
		this.puntof=puntof;
	}
	public Punto getPuntoi() {
		return puntoi;
	}
	public void setPuntoi(Punto puntoi) {
		this.puntoi = puntoi;
	}
	public Punto getPuntof() {
		return puntof;
	}
	public void setPuntof(Punto puntof) {
		this.puntof = puntof;
	}
	public void moverV(double dist) {
		this.puntoi.moverV(dist);
		this.puntof.moverV(dist);
	}
	public void moverH(double dist) {
		this.puntoi.moverH(dist);
		this.puntof.moverH(dist);
	}
	public String toString(){
		return "origen: "+this.puntoi+" y final: "+this.puntof;
	}
}
