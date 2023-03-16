package tema2;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba un programa que pida al usuario una hora determinada, que
		denominaremos h1, (pidiendo primero las horas expresadas en formato de 0 a 24
		horas, y a continuación los minutos). Posteriormente se pedirá al usuario otra hora
		h2. El programa deberá indicar si h1 es posterior o anterior a h2. En el caso de ser
		posterior se mostrará por pantalla un mensaje y se indicará cuantas horas y minutos 
		han pasado, en caso de ser anterior se mostrará un mensaje similar y se indicará las
		horas y minutos que faltan.
		 */
		Scanner sc = new Scanner(System.in);
		int h1,h2,min1,min2,minR,horaR,resultadoaux;
		final int minH=60;
		System.out.println("Introduce la primera hora en formado de 0 a 24");
		h1 = sc.nextInt();
		System.out.println("Introduce los minutos de la primera hora");
		min1 = sc.nextInt();
		System.out.println("Introduce la segunda hora en formado de 0 a 24");
		h2 = sc.nextInt();
		System.out.println("Introduce los minutos de la segunda hora");
		min2 = sc.nextInt();
		
		if(h1<0 || h1>=24 || h2<0 || h2<=24 || min1<0 || min1>60 || min2 <0 || min2>60) {
			System.out.println("Retrasado");
		}else {
			if(h1>h2 && min1<min2 && min1<=30) {
				horaR=h1-h2;
				resultadoaux=horaR--;
				minR=minH-(min2-min1);				
				System.out.println("Hay una diferencia de"+resultadoaux+"horas y"+minR+"");
			}else if (h1>h2 && min1>min2) {
				horaR=h1-h2;
				minR=min1-min2;
				System.out.println("Hay una diferencia de"+horaR+" horas y "+minR);
			}else{
				horaR=h2-h1;
				minR=(minH-min1)+min2;
				System.out.println("Han pasado "+horaR+" y "+minR+"");
				
			}
			
			
			
		}
		
		
		
		
	}

}
