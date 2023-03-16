package actividad4pdf;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implemente un programa que lea una frase por teclado. La salida debe mostrar la
		frase introducida, la frase en orden inverso y el número de vocales que contiene.
		(Puede usar el método length() de los String para obtener la longitud de la cadena).
		 */
		Scanner sc=new Scanner(System.in);
		String frase="", inversa="";
		int iBucle,vocales=0,longitud=0;
		System.out.println("Introduce la frase que quieres transformar:");
		frase=sc.nextLine(); //lee por teclado una variable string
		longitud=frase.length(); //cuenta cuantos caracetres tiene la frase que hemos introducida
		for(iBucle=longitud-1;iBucle>=0;iBucle--) { //empieza el bucle en el numero de caracteres -1 ya que el primer caracter es la posición 0
			char letra=frase.charAt(iBucle); //sacamos la letra con la posición
			inversa+=frase.charAt(iBucle); //vamos acumulando las letras desde la ultima a la primera
				if(letra== 'a' || letra== 'e' || letra== 'i' || letra== 'o' || letra== 'u') { //si es una vocal le suma un contador a vocales
					vocales++;
				}
		}
		System.out.println("Nuestra frase: " +frase);
		System.out.println("La frase inversa es: "+inversa);
		System.out.println("La frase introducida tiene "+vocales+" vocales.");
		
	}

}
