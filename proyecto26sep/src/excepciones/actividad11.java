package excepciones;

import java.util.Scanner;

public class actividad11 {
		public static void main (String[]args) {
			Scanner sc= new Scanner(System.in);
			boolean check =false;
			do {
				try {
					System.out.println("Dime el double");
					double n=sc.nextDouble();
					check=true;
				}catch(Exception e) {
					System.out.println("NUMEROS SOLO TONTO");
					e.printStackTrace(); /* mostrar el mensaje de error normal */
					System.out.println(e); /* invoca al toString de la excepcion */
					sc.next();
				}
			}while(!check);
		}
	
	
}
