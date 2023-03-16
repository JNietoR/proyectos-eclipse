package relacionArrays;

public class OperacionesArray {
	private double[] arraysito;
	private double min;
	private double max;
	
public OperacionesArray() {
	this.arraysito=new double[0];
	this.min=0;
	this.max=0;
}
public OperacionesArray(double[] arraysito) {
	this.arraysito=arraysito;
	this.calcularMin();
	this.calcularMax();
}
public double[] getArraysito() {
	return arraysito;
}
public void setArraysito(double[] arraysito) {
	this.arraysito = arraysito;
	this.calcularMin();
	this.calcularMax();
}
public double getMin() {
	return min;
}
public double getMax() {
	return max;
}
public void calcularMin() {
	this.min=this.arraysito[0];
	for(int i=1;this.arraysito.length>i;i++) {
		if (this.min>this.arraysito[i]) {
			this.min=this.arraysito[i];
		}
	}
}
public void calcularMax() {
	this.max=this.arraysito[0];
	for(int i=1;this.arraysito.length>i;i++) {
		if (this.max<this.arraysito[i]) {
			this.max=this.arraysito[i];
		}
	}
}
public void normalizar() {
	for(int i=0;this.arraysito.length>i;i++) {
		this.arraysito[i]=(this.arraysito[i]-this.min)/(this.max-this.min);
	}
	this.calcularMin();
	this.calcularMax();
}
public String toString() {
	String array="";
	for(int i=0;i<this.arraysito.length;i++) {
		array+=this.arraysito[i]+",";
	}
	return array;
}
}
