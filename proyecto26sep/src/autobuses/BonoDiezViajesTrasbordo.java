package autobuses;

public class BonoDiezViajesTrasbordo extends BonoDiezViajes {
	private int linea,hora,minuto,año,mes,dia,numtransbordos;

	public BonoDiezViajesTrasbordo(int linea, int hora, int minuto, int año, int mes, int dia) {
		super();
		this.linea = -5;
		this.hora = -5;
		this.minuto = -5;
		this.año = -5;
		this.mes = -5;
		this.dia = -5;
		this.numtransbordos=0;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	@Override
	public boolean picarViaje(int dia, int mes, int año, int hora, int minuto, int linea) {
		// TODO Auto-generated method stub
		boolean resultado=false;
		if(this.linea!=linea && this.año==año && this.mes==mes && this.dia==dia && (hora-this.hora<=1) && numtransbordos<1) {
			resultado=true;
			this.numtransbordos++;
		}else {
			resultado=super.picarViaje(dia, mes, año, hora, minuto, linea);
			if(hora-this.hora<=1) {
				this.numtransbordos=0;
			}
			
		}
		if(resultado) {
			this.dia=dia;
			this.mes=mes;
			this.año=año;
			this.minuto=minuto;
			this.hora=hora;
			this.linea=linea;
		}
		return resultado;
	}
	
	
}
