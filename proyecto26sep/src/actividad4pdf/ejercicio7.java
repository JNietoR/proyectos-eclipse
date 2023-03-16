package actividad4pdf;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escriba un programa que devuelva si un número introducido por teclado es primo.
			(Un número primo es aquel que solo es divisible por 1 y por él mismo. Piense bien las
			condiciones).
		 */
		Scanner sc=new Scanner(System.in);
		 int num,i;
	     boolean esPrimo = true; 
	     System.out.println("Introduce un numero: ");
	     num = sc.nextInt();
	        for(i=2;i<num && esPrimo;i++) { //iniciamos el bucle empezando en 2 y lo hara hasta que sea menor que el numero introducido asi evitamos el 0,1,2 y el mismo numero 
	            if(num%i==0) { //si el numero dividido por i nos da resto 0 quiere decir que ha encontrado un numero que no es la expension que ha dado divisible
	                esPrimo = false;
	            }
	        }
	        if (esPrimo){ //si primo es verdadero 
	            System.out.println(num+" es primo");
	        }else{ //si primo es false
	            System.out.println(num+" no es primo");
	        }
	}
}

/* Esta fue otra forma de enfocarlo que pense, la cual un numero es primo si es divisible solo por si mismo y 1 por lo que como mucho solo sería divisible por 2 numeros(contador).
	num = sc.nextInt();
for(i=1;i<=num;i++) { //esta vez si incluiriamos desde el 1 al numero incluido
	if(num%i==0) {//cada vez que encuentre un numero que al dividirlo de resto 0 suma un contador
		contador++;
	}	
	}if (contador<=2) { //si solo ha encontrado dos numeros es primo de lo contrario no es primo
		System.out.println(num+" es primo");
	}else{
		System.out.println(num+" no es primo");
		}
}		
} 

*/
