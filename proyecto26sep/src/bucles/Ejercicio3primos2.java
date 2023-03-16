		package bucles;

		import java.util.Scanner;

		public class Ejercicio3primos2 {

		    public static void main(String[] args) {
		        // TODO Auto-generated method stub
		        /*
		         * Introduce un numero y di si es primo
		         */
		        Scanner sc = new Scanner(System.in);
		        int num,i;
		        boolean esPrimo = true;
		        System.out.println("Introduce un numero: ");
		        num = sc.nextInt();
		        for(i=2;i<num && esPrimo;i++) {
		            if(num%i==0) {
		                esPrimo = false;
		            }
		        }
		        if (esPrimo){
		            System.out.println(num+" es primo");
		        }else{
		            System.out.println(num+" no es primo");
		        }
		}
	}

