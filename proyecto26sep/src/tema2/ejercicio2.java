package tema2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int año,mes,dia;
		
		System.out.println("Introduce el dia");
		dia = sc.nextInt();
		System.out.println("Introduce el mes");
		mes = sc.nextInt();
		System.out.println("Introduce el año");
		año = sc.nextInt();
		
		if(dia<1 || dia>31) {
			System.out.println("Tus muertos");
		}else {
			if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
				if (dia==31) {
					if(mes==12) {
						año=año+1;
						mes=1;
						dia=1;
					}else {
						mes=mes+1;
						dia=1;
					}
				}else {
					dia=dia+1;
				}
		}else if (mes==2) {
				if (año%4==0) {	
					if (dia==29) {
						mes=mes+1;
						dia=1;
					}else {
						dia=dia+1;
					}
				}else {
					if (dia==28) {
						mes=mes+1;
						dia=1;
					}else {
						dia=dia+1;
					}
				}
		}else {
			if (dia==30) {
				mes=mes+1;
				dia=1;
			}else{
				dia=dia+1;
			}
			}
		System.out.println(""+dia+"/"+mes+"/"+año+"");
		}	
			
			}
	}

