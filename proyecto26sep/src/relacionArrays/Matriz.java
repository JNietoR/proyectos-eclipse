package relacionArrays;

public class Matriz {
	private double[][] matriz;
	
public Matriz() {
	this.matriz= new double[0][0];
}
public Matriz(double[][] matriz) {
	this.matriz=matriz;
}
public double[][] getMatriz() {
	return matriz;
}
public void setMatriz(double[][] matriz) {
	this.matriz = matriz;
}
public double[][] productoMatriz(double[][] matriz1){
	double[][] resultado= new double[this.matriz.length][this.matriz.length];
	if(this.matriz.length==matriz1.length) {
		for(int i=0;i<this.matriz.length;i++) {
			for(int j=0;j<this.matriz.length;j++) {
				resultado[i][j]=this.matriz[i][j]*matriz1[i][j];
			}
		}
	}
	return resultado;
}
public String toString() {
	String matriz="";
	for(int i=0;i<this.matriz.length;i++) {
		for(int j=0;j<this.matriz.length;j++) {
		matriz+=this.matriz[i][j]+",";
		}
	}
	return matriz;
}
}
