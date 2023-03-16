package paquete1;

import java.util.Scanner;

public class conversoreuro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double peseta = 166.386; // Constante pesetas
		
		System.out.println("Por favor introduzca los euros que desea convertir a pesetas");
		Scanner sc = new Scanner(System.in); // Carga la libreria de escaner
		double euro = sc.nextDouble(); // Solicita la cantidad de euros al usuario
		
		System.out.println(euro*peseta); //Muestra pon pantalla al usuario el resultado
		
	}

}
