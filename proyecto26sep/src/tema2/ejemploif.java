package tema2;

import java.util.Scanner;

public class ejemploif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Introduce un numero:");
		x=sc.nextInt();
		if(x<5){
			System.out.println("menor");
		}else if(x==5){
			System.out.println("igual");
		}else {
			System.out.println("mayor");
		}
		
		

	}

}
