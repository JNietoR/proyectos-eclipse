package mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class meteoSat {
	private HashMap<String, Integer> stats;
	
	public meteoSat() {
		this.stats=new HashMap<String, Integer>();
	}
	public meteoSat(HashMap<String,Integer> mapa) {
		this.stats=mapa;
	}
	public HashMap<String, Integer> getStats() {
		return stats;
	}
	public void setStats(HashMap<String, Integer> stats) {
		this.stats = stats;
	}
	
	public void añadirMes(String mes, int lluvia) {
		this.stats.put(mes, lluvia);
	}
	public void añadirCantidadMes(String mes, int lluvia) {
		int aux;
		aux=this.lecturaMes(mes);
		this.stats.put(mes, (aux+lluvia));
	}
	public int lecturaMes(String mes) {
		return this.stats.get(mes);
	}
	public String mesMasLLuvioso() {
		String maslluvioso="";
		ArrayList<String> meses=new ArrayList<String>();
		ArrayList<Integer> lluvia=new ArrayList<Integer>();
		ArrayList<Integer> lluviaordenado=new ArrayList<Integer>();
		meses=(ArrayList<String>) this.stats.keySet();
		lluvia=(ArrayList<Integer>) this.stats.values();
		lluvia.sort(null);
		lluviaordenado=lluvia;
		lluvia=(ArrayList<Integer>) this.stats.values();
		
		for(int i=0;i<this.stats.size();i++) {
			if(lluviaordenado.get(0)==lluvia.get(i)) {
				maslluvioso=meses.get(i);
			}
		}
		return maslluvioso;
	}
	
	public String mesMenosLluvioso() {
		String menoslluvioso="";
		ArrayList<String> meses=new ArrayList<String>();
		ArrayList<Integer> lluvia=new ArrayList<Integer>();
		ArrayList<Integer> lluviaordenado=new ArrayList<Integer>();
		meses=(ArrayList<String>) this.stats.keySet();
		lluvia=(ArrayList<Integer>) this.stats.values();
		lluvia.sort(null);
		lluviaordenado=lluvia;
		lluvia=(ArrayList<Integer>) this.stats.values();
		
		for(int i=0;i<this.stats.size();i++) {
			if(lluviaordenado.get(11)==lluvia.get(i)) {
				menoslluvioso=meses.get(i);
			}
		}
		return menoslluvioso;
	}
	public double mediaDosMeses(String mes1, String mes2) {
		double media=0;
			media= (this.lecturaMes(mes1)+this.lecturaMes(mes2))/2;
		return media;
	}
	public double lluviaMediaAnual() {
		double media=0,suma=0;
		ArrayList<Integer> lluvia=new ArrayList<Integer>();
		for(int i=0;i<this.stats.size();i++) {
			suma+=lluvia.get(i);
		}
		media=suma/12;
		return media;
	}
	
	public void imprimir() {
		for(Map.Entry elemento:this.stats.entrySet()) {
			System.out.println(elemento.getKey() + " -> " + elemento.getValue());
		}
	}
	
	
	

}
