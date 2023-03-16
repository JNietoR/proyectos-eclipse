package arraylistPackage;

import java.util.Scanner;

public class MainPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayPersonitas personitas= new ArrayPersonitas();
		Scanner sc= new Scanner(System.in);
		boolean continuar=true;
		String respuesta,nombre, apellidos;
		
		do {
			System.out.println("Introduce el nombre de la persona");
			nombre=sc.next();
			System.out.println("Introduce los apellidos de la persona");
			apellidos=sc.next();
			
			Persona persona1= new Persona(nombre, apellidos);
			personitas.añadirPersonas(persona1);
			
			System.out.println("Deseas añadir otra persona");
			respuesta=sc.next();
			if(respuesta.equals("No") || respuesta.equals("no")) {
				continuar=false;
			}
		}while(continuar);
		
		System.out.println("El listado de personas es: "+personitas.mostrarPersonas());
		
		System.out.println("El listado de personas invertido es: "+personitas.invertirPersonas());
		
		
		
	}

}
