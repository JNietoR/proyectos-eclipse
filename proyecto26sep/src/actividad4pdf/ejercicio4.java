package actividad4pdf;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num,i,sum=1; //inicializamos las variables la sum en 1 ya que al multiplicar no la podemos iniciar en 0
		do {
			System.out.println("Introduce el valor para hacer la sumatoria:");
			num=sc.nextInt();
		}while(num<0);
		for(i=1;i<=num;i++){ //como los anteriores ejercicios ira multiplicando el valor de la i en cada bucle a la variable sum
			sum*=i; // sum*i cada bucle acumulando en la sum el nuevo resultado
			System.out.println("El factorial sería: " +sum );
		}
	}

}
