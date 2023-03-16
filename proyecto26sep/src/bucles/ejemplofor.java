package bucles;

import java.util.Scanner;

public class ejemplofor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x;
		int i;
		 for(i=1; i<=10;i++) {
			 for(int j=1;j<=10;j++) {
				 System.out.println(i+"x"+j+"="+(i*j));
			 }
			 
		 }
		System.out.println(i--);	
	}

}
