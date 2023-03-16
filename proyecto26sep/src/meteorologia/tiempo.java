package meteorologia;

import java.util.ArrayList;
import java.util.HashMap;

public class tiempo {

	private HashMap<String, Double> tiempo;
	private ArrayList<String> claves;

	public HashMap<String, Double> getTiempo() {
		return tiempo;
	}

	public void setTiempo(HashMap<String, Double> tiempo) {
		this.tiempo = tiempo;
	}

	public tiempo() {
		this.tiempo = new HashMap<String, Double>();
		this.claves = new ArrayList<String>();
		this.claves.add("Enero");
		this.claves.add("Febrero");
		this.claves.add("Marzo");
		this.claves.add("Abril");
		this.claves.add("Mayo");
		this.claves.add("Junio");
		this.claves.add("Julio");
		this.claves.add("Agosto");
		this.claves.add("Septiembre");
		this.claves.add("Octubre");
		this.claves.add("Noviembre");
		this.claves.add("Diciembre");

		for (int i = 0; i < this.claves.size(); i++) {
			this.tiempo.put(this.claves.get(i), 0.0);
		}

	}

	public boolean añadirValor(String mes, double valor) {

		boolean error = true;

		if (this.claves.contains(mes)) {
			double suma = 0;
			suma = valor + this.tiempo.get(mes);
			this.tiempo.put(mes, suma);
			error = false;
		}
		return error;
	}

	public double get(String mes) {
		return this.tiempo.get(mes);
	}

	public String masLLuvia() {
		String respuesta = "";
		double lluvia = 0;

		// si no sabemos la claves y las queremos recorrer todas
		// ArrayList<String> claves2 = new ArrayList<String>(this.tiempo.keySet());

		for (int i = 0; i < this.claves.size(); i++) {
			if (this.tiempo.get(claves.get(i)) > lluvia) {
				lluvia = this.tiempo.get(claves.get(i));
				respuesta = this.claves.get(i);
			}
		}
		return respuesta;
	}

	public String menosLLuvia() {
		String respuesta = "";
		double lluvia = this.tiempo.get(claves.get(1));
		;

		// si no sabemos la claves y las queremos recorrer todas
		// ArrayList<String> claves2 = new ArrayList<String>(this.tiempo.keySet());

		for (int i = 0; i < this.claves.size(); i++) {
			if (this.tiempo.get(claves.get(i)) <= lluvia) {
				lluvia = this.tiempo.get(claves.get(i));
				respuesta = this.claves.get(i);
			}
		}
		return respuesta;
	}

	public double mediaLLuvia(String mes1, String mes2) {

		return (this.tiempo.get(mes1) + this.tiempo.get(mes2)) / 2;
	}

	public double mediaLLuviaanual() {
		double media =0;

		for (int i = 0; i < this.claves.size(); i++) {
			media += this.tiempo.get(this.claves.get(i));
		}

		return media/this.claves.size();
	}

	
	
	@Override
	public String toString() {
		return "tiempo [tiempo=" + tiempo + "]";
	}

}
