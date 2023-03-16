package relacionArrays;

import java.util.Scanner;

public class Ejercicio6enMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int f,c;
		int[][] tablero= new int[4][4];
		boolean ganador=false;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				tablero[i][j]=0;
			}
		}
		while(!ganador) {
			do {
				System.out.println("Jugador 1. Introduce la fila de la ficha: ");
				f=sc.nextInt();
				System.out.println("Jugador 1. Introduce la columna de la ficha: ");
				c=sc.nextInt();
				if(tablero[f][c]==0) {
					tablero[f][c]=1;
				}
				if((tablero[0][0]==1 && tablero[0][1]==1 && tablero[0][2]==1 && tablero[0][3]==1) || (tablero[0][0]==1 && tablero[1][0]==1 && tablero[2][0]==1 && tablero[3][0]==1) || (tablero[3][0]==1 && tablero[3][1]==1 && tablero[3][2]==1 && tablero[3][3]==1) || (tablero[0][3]==1 && tablero[1][3]==1 && tablero[2][3]==1 && tablero[3][3]==1) || (tablero[0][0]==1 && tablero[1][1]==1 && tablero[2][2]==1 && tablero[3][3]==1) || (tablero[0][3]==1 && tablero[1][2]==1 && tablero[2][1]==1 && tablero[3][0]==1) ) {
					ganador=true;
					System.out.println("El ganador es el Jugador 1");
				}
			}while(tablero[f][c]==0 && !ganador);
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					System.out.print(tablero[i][j]+" ");
				}
				System.out.println(" ");
			}
			if(!ganador) {
				do {
					System.out.println("Jugador 2. Introduce la fila de la ficha: ");
					f=sc.nextInt();
					System.out.println("Jugador 2. Introduce la columna de la ficha: ");
					c=sc.nextInt();
					if(tablero[f][c]==0) {
						tablero[f][c]=2;
					}
					if((tablero[0][0]==2 && tablero[0][1]==2 && tablero[0][2]==2 && tablero[0][3]==2) || (tablero[0][0]==2 && tablero[1][0]==2 && tablero[2][0]==2 && tablero[3][0]==2) || (tablero[3][0]==2 && tablero[3][1]==2 && tablero[3][2]==2 && tablero[3][3]==2) || (tablero[0][3]==2 && tablero[1][3]==2 && tablero[2][3]==2 && tablero[3][3]==2) || (tablero[0][0]==2 && tablero[1][1]==2 && tablero[2][2]==2 && tablero[3][3]==2) || (tablero[0][3]==2 && tablero[1][2]==2 && tablero[2][1]==2 && tablero[3][0]==2) ) {
						ganador=true;
						System.out.println("El ganador es el Jugador 2");
					}
					for(int i=0;i<4;i++) {
						for(int j=0;j<4;j++) {
							System.out.print(tablero[i][j]+" ");
						}
						System.out.println(" ");
					}
				}while(tablero[f][c]==0 && !ganador);
			}
		
		}
				

		
		
	}
	
}
