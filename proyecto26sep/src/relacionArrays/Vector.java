package relacionArrays;

public class Vector {
	private double[] vector;
	
	public Vector() {
		this.vector= new double[0];
	}
	public Vector(double[] vector) {
		this.vector=vector;
	}
	public double[] getVvector() {
		return vector;
	}
	public void setVvector(double[] vector) {
		this.vector = vector;
	}
	public double[] productoEscalar(double escalar) {
		double[] resultado= new double[this.vector.length];
		for(int i=0;i<this.vector.length;i++){
			resultado[i]=vector[i]*escalar;
		}		
		return resultado;
	}
	public double[] productoVector(double [] vector1) {
		double[] resultado= new double[this.vector.length];
		if(this.vector.length==vector1.length) {
			for(int i=0;i<this.vector.length;i++) {
				resultado[i]=this.vector[i]*vector1[i];
			}
		}
		return resultado;
	}
	public String toString() {
	String array="";
	for(int i=0;i<this.vector.length;i++) {
		array+=this.vector[i]+",";
	}
	return array;
	}
	
}
