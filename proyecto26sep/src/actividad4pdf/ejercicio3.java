package actividad4pdf;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba un programa que devuelva la sumatoria de un valor leído por teclado (la
			sumatoria de N es la suma de todos los términos desde 1… N).
		 */
		Scanner sc= new Scanner(System.in);
		int num,i,sum=0; //iniciamos las variables, la variable sum a 0 para emepezar la primera vuelta del bucle 
		do {
			System.out.println("Introduce el valor para hacer la sumatoria:");
			num=sc.nextInt();
		}while(num<0); //un filtro para asgurarnos que el numero es mayor que 0
		for(i=0;i<=num;i++){ //dentro de este for iremos aumentanto i en 1 y sumandola a la variable sum hasta que i tenga el mismo valor que el numero introducido por teclado
			sum+=i; // sum+i
			System.out.println("La sumatoria sería: " +sum );
		}
		
	}

}
