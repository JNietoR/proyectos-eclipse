package tema2;

import java.util.Scanner;

public class ejercicio3horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * te mete una numero
		 * 0-6 "lolete time"
		 * 6-15: "Adormir como un campeon"
		 * 15: "Monster y pa clase"
		 * 15-21:30: "Isaac porfa para me duele"
		 * 21:30-24: "Autorecreación y autocuidado"
		 */
		Scanner sc = new Scanner(System.in);
		double num;
		System.out.println("introduce un numero");
		num = sc.nextDouble();
		
		if(num<0 || num>=24) {
			System.out.println("Deja de trollear");
		}else {
			if (num>=0 && num<=6) {
				System.out.println("Lolete time");
			}else if(num>6 && num<15) {
				System.out.println("A dormir como un campeon");
			}else if(num==15) {
				System.out.println("Monster y pa clase");
			}else if(num>15 && num<=21.5){
				System.out.println("Isaac porfa para me duele");
			}else {
				System.out.println("Autorecreación y autocuidado");
			}
		}
	}

}
