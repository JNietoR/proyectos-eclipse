package classes;

public class Fechaen {
	private int dia;
	private int mes;
	private int año;
	
	public Fechaen(){
		this.dia=1;
		this.mes=1;
		this.año=1;
	}
	public Fechaen(int dia, int mes, int año) {
		this.dia=dia;
		this.mes=mes;
		this.año=año;
	}
	public int getDia() {
		return dia;
	}
	public boolean setDia(int dia) {
		boolean correcto=true;
		if(this.comprobarFecha(dia, this.mes, this.año)) {
		this.dia = dia;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public int getMes() {
		return mes;
	}
	public boolean setMes(int mes) {
		boolean correcto=true;
		if(this.comprobarFecha(this.dia, mes, this.año)) {
		this.mes = mes;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public boolean comprobarFecha(int dia, int mes, int año){
		boolean correcto=true;
		if(dia <1 || dia>31 || mes<1 || mes>12) {
			correcto=false;
		}else {
			if (dia==31 && (mes==2 | mes==4 | mes==6 | mes==9 | mes==11)) {
				correcto=false;
			}else if(dia==30 && mes==2){
				correcto=false;
			}else if(dia==29 && mes==2 && año%4!=0) {
				correcto=false;
			}
		}
		return correcto;
	}
	public String toString() {
		return this.dia+"/"+this.mes+"/"+this.año;
	}
	public void incrementarFecha() {
		if(this.comprobarFecha(dia+1,mes,año)) {
			this.dia++;
		}else {
			if(this.mes==12) {
				this.dia=1;
				this.mes=1;
				this.año++;
			}else {
				this.dia=1;
				this.mes++;
			}
		}
	}
	public void decrementarFecha() {
		if (this.comprobarFecha(dia, mes, año)) {
			dia--;
		}else {
			if(mes==1) {
				this.dia=31;
				this.mes=12;
				this.año--;
			}else {
				if(this.comprobarFecha(31, mes-1, año)) {
					this.dia=31;
					this.mes--;
				}else if(this.comprobarFecha(30, mes-1, año)) {
					this.dia=30;
					this.mes--;
				}else if(this.comprobarFecha(29, mes-1, año)) {
					this.dia=29;
					this.mes--;
				}else if(this.comprobarFecha(28, mes, año)) {
					this.dia=28;
					this.mes--;
				}
			}
		}
	}
}
