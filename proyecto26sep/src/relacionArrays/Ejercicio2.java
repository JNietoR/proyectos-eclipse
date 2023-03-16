package relacionArrays;
/*
 * Escriba un programa que lea desde teclado 6 números correspondientes a la combinación
ganadora de la lotería primitiva. A continuación, el programa leerá otros 6 números
correspondientes a un boleto con el que se participa en dicho sorteo. Finalizada la lectura, el
programa deberá de indicar el número de aciertos del boleto cuyos números hemos
introducido. Ejemplo: si la combinación ganadora es 3 6 4 8 9 23 el boleto 8 6 23 5 9 1 tiene
2 aciertos.
 */
public class Ejercicio2 {
	private int[] boleto;
	
public Ejercicio2() {
	this.boleto= new int[0];
}
public Ejercicio2(int[] boleto) {
	boolean correcto=true;
	if(boleto.length==6) {
		for(int i=0;i<boleto.length;i++) {
			if(boleto[i]<0) {
				correcto=false;
			}else {
				this.boleto=boleto;
			}
		}	
	}else {
		correcto=false;
	}
}
public int[] getBoleto() {
	return boleto;
}
public boolean setBoleto(int[] boleto) {
	boolean correcto=true;
	if(boleto.length==6) {
		for(int i=0;i<boleto.length;i++) {
			if(boleto[i]<0) {
				correcto=false;
			}else {
				this.boleto=boleto;
			}
		}	
	}else {
		correcto=false;
	}
	return correcto;
}

public int aciertos(int[] boleto2) {
	int aciertos=0, i,j;
	if(boleto2.length==6) {
		for(i=0;i<this.boleto.length;i++) {
			for(j=0;j<boleto2.length;j++) {
				if(this.boleto[i]==boleto2[j]) {
					aciertos++;
				}
			}
		}
	}
	return aciertos;
}
}
