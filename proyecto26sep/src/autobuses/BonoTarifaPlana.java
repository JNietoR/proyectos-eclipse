package autobuses;

public class BonoTarifaPlana implements iBonoBus{
	private int año,mes,dia;
	
	public BonoTarifaPlana(int año, int mes, int dia) {
		super();
		this.año = año;
		this.mes = mes;
		this.dia = dia;
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
		boolean resultado=false;
		if(año<=this.año) {
			if(año==this.año) {
				if(mes<=this.mes) {
					if(mes==this.mes) {
						if(dia<=this.dia) {
							resultado=true;
						}
					}else {
						resultado=true;
					}
				}
			}else {
				resultado=true;
			}
		}
		return resultado;
		
	}

	
	
	
}
