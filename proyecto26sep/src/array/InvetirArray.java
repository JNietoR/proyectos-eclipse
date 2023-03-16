package array;

import java.util.Scanner;

public class InvetirArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * recibir un array y devolverlo en orden inverso
		 */
		
		Scanner sc=new Scanner(System.in);
		int elementos;
		do {
			System.out.println("Introduce numero de elementos del array");
			elementos=sc.nextInt();
		}while(elementos<0);
		
		int[] array1= new int[elementos];
		
		for(int i=0;i<array1.length;i++) {
			System.out.println("Introduce un elemento");
			array1[i]=sc.nextInt();
		}
		
		for(int i=array1.length-1;i>=0;i--) {
			System.out.println(array1[i]);
		}
	}

}
