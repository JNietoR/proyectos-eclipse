package examenInterfaces;

public class Vector implements iOperable{
	private int[] vector;
	
	public Vector() {
		this.vector= new int[0];
	}
	public Vector(int[] vector) {
		this.vector=vector;
	}
	public int[] getVector() {
		return vector;
	}
	public void setVector(int[] vector) {
		this.vector = vector;
	}
	@Override
	public void sumar(int num) {
		// TODO Auto-generated method stub
		for(int i=0;i<this.vector.length;i++) { //le sumara a cada posicion del vector el numero que le introducimos
			this.vector[i]=this.vector[i]+num;
		}
	}
	@Override
	public void restar(int num) { //restara a cada valor del vector el numero introducido
		// TODO Auto-generated method stub
		for(int i=0;i<this.vector.length;i++) {
			this.vector[i]=this.vector[i]-num;
		}
	}
	@Override
	public void multiplicar(int num) { //multiplicara cada valor del vector por el numero que le hemos introducido
		// TODO Auto-generated method stub
		for(int i=0;i<this.vector.length;i++) {
			this.vector[i]=this.vector[i]*num;
		}
	}
	@Override
	public void dividir(int num) { //divide cada valor del vector por el numero que le introducimos por parametro
		// TODO Auto-generated method stub
		for(int i=0;i<this.vector.length;i++) {
			this.vector[i]=this.vector[i]/num;
		}
	}
}
