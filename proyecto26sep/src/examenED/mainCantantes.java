package examenED;

import java.util.Scanner;

public class mainCantantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean continuar=true;
		Scanner sc=new Scanner(System.in);
		String nombre,genero,respuesta;
		int ventas;
		CantanteFamoso c1=new CantanteFamoso();
		ListaCantantesFamosos lista= new ListaCantantesFamosos();
		do {
			System.out.println("Introduce el nombre del cantante:");
			nombre=sc.next();
			System.out.println("Introduce el genero del cantante:");
			genero=sc.next();
			System.out.println("Introduce las ventas del cantante:");
			ventas=sc.nextInt();
			c1=new CantanteFamoso(nombre, genero, ventas);
			System.out.println("Deseas crear otro cantante: Y/N");
			respuesta=sc.next();
			if(respuesta.equals("Y")) {
				continuar=true;
			}else if(respuesta.equals("N")) {
				continuar=false;
			}
			lista.añadirCantante(c1);
		}while(continuar);
	}

}
