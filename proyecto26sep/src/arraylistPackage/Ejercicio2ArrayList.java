package arraylistPackage;

import java.util.ArrayList;

public class Ejercicio2ArrayList {

	private ArrayList<Integer> boleto;
	public Ejercicio2ArrayList() {
		this.boleto=new ArrayList<Integer>();
	}
	public ArrayList<Integer> getBoleto(){
		return this.boleto;
	}
	public void setBoleto(ArrayList<Integer> boleto) {
		this.boleto=boleto;
	}
	public void añadirNumero(int numero) {
		this.boleto.add(numero);
	}
	public String toString() {
		return this.boleto.toString();
	}
	public int comparar(Ejercicio2ArrayList boletocomparar) {
		int aciertos=0;
		for (int i=0;i<this.boleto.size();i++) {
			if(this.boleto.get(i).equals(boletocomparar.getBoleto().get(i))) {
				aciertos++;
			}
		}
		return aciertos;
	}
}
