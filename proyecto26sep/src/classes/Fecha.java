package classes;

/*
 * Cree una clase Fecha. La clase contendrá 
 * constructores, métodos para manipular las 
 * propiedades y el método toString(). 
 * Además debe tener un método para comprobar 
 * si la fecha es correcta y otros para añadir 
 * y restar un día a la fecha, actualizándola 
 * convenientemente.
 */

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	public Fecha(){
		this.dia=1;
		this.mes=1;
		this.año=1;
	}
	public Fecha(int dia, int mes, int año) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAño(año);
	}
	public int getDia() {
		return dia;
	}
	public boolean setDia(int dia) {
		boolean correcto=true;
		if (this.mes==1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10 || this.mes==12) {
			if(dia<1 || dia>31) {
				correcto=false;
			}else {
				this.dia=dia;
			}
		}else if(mes==2) {
			if(año%4==0) {
				if(dia<1 || dia>29) {
					correcto=false;
				}else {
					this.dia=dia;
				}	
			}else {
				if(dia<1 || dia>28) {
					correcto=false;
				}else {
					this.dia=dia;
				}
			}
		}else {
			if(dia<1 || dia>30) {
				correcto=false;
			}else {
				this.dia=dia;
			} 
		}
		return correcto;
	}
	public int getMes() {
		return mes;
	}
	public boolean setMes(int mes) {
		boolean correcto=true;
		if(mes<1 || mes>12) {
			correcto=false;
		}else {
			this.mes=mes;
		}
		return correcto;
	}
	public int getAño() {
		return año;
	}
	public boolean setAño(int año) {
		boolean correcto=true;
		if(año<1) {
			correcto=false;
		}else {
			this.año=año;
		}
		return correcto;
	}
	
	public String toString() {
		return "La fecha es: "+this.dia+"/"+this.mes+"/"+this.año;
	}
	public boolean compararFecha(Fecha f) {
		boolean correcto=true;
		if(!f.equals(this)) {
			correcto=false;
		}
		return correcto;
	}
	public void sumarDia(int dia) {
		int nuevodia=this.dia+dia;
		if (this.mes==1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 || this.mes==10 || this.mes==12) { //31 dias
			if(nuevodia>31 && mes!=12) {
				this.dia=nuevodia-31;
				this.mes++;
			}else if(nuevodia>31 && mes==12){
				this.dia=nuevodia-31;
				this.mes=1;
				this.año++;
			}else {
				this.dia=nuevodia;
			}
		}else if(mes==2) { //febrero
			if(año%4==0 && nuevodia>29) {//bisiesto
				this.dia=nuevodia-29;
				this.mes++;
			}else if(nuevodia>28) {//no bisiesto
				this.dia=nuevodia-28;
				this.mes++;
			}else {
				this.dia=nuevodia;
			}
		}else { //30 dias
			if(nuevodia>30) {
				this.dia=nuevodia-30;
				this.mes++;
			}
		}
	}
}
