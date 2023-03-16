package relacionArrays;

import java.util.Scanner;

public class Ejercicio5enMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,m;
		do{ //filtro valores negativos
		System.out.println("valor de la dimension N de la matriz: ");
		n=sc.nextInt();
		System.out.println("valor de la dimension M de la matriz: ");
		m=sc.nextInt();
		if(n<0 || m<0) {
			System.out.println("Por favor introduce un valor para ambas dimensiones mayor que 0");
		}
		}while(n<0 || m<0);
		
		int[][] matriz= new int[n][m]; 
		int contador=1,maxcont=0, moda=0;
		
		for(int i=0;i<n;i++) { //for para rellenar la matriz
			for(int j=0;j<m;j++) {
				System.out.println("Valor para el elemento: "+i+","+j);
				matriz[i][j]= sc.nextInt();
			}
		}
		for(int i=0; i<n;i++) { //for para fila
			for(int j=0; j<m;j++) { // for para cada valor de la fila en la columna
					if(j==m-1) { //Si es la ultima posición de la fila
						if(i!=n-1) { //!ultima fila
							if(matriz[i][j]>matriz[i+1][0]) { //algoritmo burbuja comparando con la siguiente fila
								int aux=matriz[i][j];
								matriz[i][j]=matriz[i+1][0]; //intercambiamos el valor con la posicion 0 de la siguiente fila
								matriz[i+1][0]= aux; //
							}
						}
					}else {
						if(matriz[i][j]>matriz[i][j]) { //si no es la ultima columna ni la ultima fila de la matriz, algoritmo burbuja
							int aux=matriz[i][j];
							matriz[i][j]=matriz[i][j+1];
							matriz[i][j+1]= aux;
						}
					}
				}
			}
		for(int i=0; i<n;i++) { // for para cada fila
			for(int j=0; j<m;j++) { //for para cada columna de la fila
				if(j==m-1) { // si es la ultima columna de la fila
					if(i!=n-1) { //si no es la ultima fila
						if(matriz[i][j]==matriz[i+1][0]) { //si son el mismo numero aumentamos el contador
							contador++;
						}else {
							contador=1; // si son distinto numero reiniciamos contador
						}
					}
				}else {
					if(matriz[i][j]==matriz[i][j+1]) { //si no es la ultima columna ni la ultima fila de la matriz y es el mismo valor, aumentamos contador
						contador++; 
					}else { 
						contador=1; //si no coinciden reiniciamos contador
					}
				}
				if(contador>maxcont) { //si el contador es mas grande que el contador maximo que comienza en 0
					maxcont=contador; //guarda en contador maximo el contador
					moda=matriz[i][j]; //guarda el valor de la matriz con el mayor numero de contadores
				}
			}
		}
		System.out.println("la moda es: "+moda+" y se repite "+maxcont);
	}
}
		


