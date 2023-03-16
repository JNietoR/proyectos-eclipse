package actividad4pdf;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	Implementar el juego del ahorcado. El juego debe solicitar una frase al comienzo y
			mostrará la frase oculta tras cada jugada. Conforme se vayan acertando letras se irán
			descubriendo los caracteres en la frase oculta. Cada vez que el jugador falle, se
			descontará un intento. El juego termina cuando se hayan descubierto todos los
			caracteres o se hayan acabado los intentos.
		 */
		
		//inicializamos las variables que vamos a usar
		String palabraoculta;
        String solucion = "";
        boolean encontrada=false;
        char letra;
        int intentos;
       

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte una palabra: ");
        palabraoculta = sc.nextLine(); //pedimos al usuario la palabara con la que va jugar
        System.out.println("La palabra insertada es " + palabraoculta);
        intentos=palabraoculta.length(); //le damos valor a la variable intentos con la cantidad de caracteres que tiene la palabara oculta con la funcion.length
        for(int i=0;i<palabraoculta.length();i++){ //creamos una palabra con tantos guiones como letras tiene, que funcionara como nuestra solucion en progreso.
            solucion+="_";
        }
        do {
            System.out.println("Inserte un letra: ");
            letra = sc.next().charAt(0);
            encontrada=false; //reiniciamos la variable encontrada al inicio de cada vuelta del bucle
            for (int pos = 0; pos < palabraoculta.length(); pos++) {
                if(pos==0 && palabraoculta.charAt(pos) == letra) { //si la letra de la posicion "pos" es igual a la letra y esta en la posicion 0, agregara la letra encontrada antes de la palabra que ya estamos formando.
                    solucion=letra+solucion.substring(1); 
                    encontrada=true; //decimos que ha encontrado una letra
                }else if (palabraoculta.charAt(pos) == letra) { //si no es la posicion 0 quiere decir que tiene algo delante y detras por tanto, añadimos primero la parte de delante de la palabra despues la letra y por ultimo lo que quedaria despues de nuestra letra encontrada
                    solucion=solucion.substring(0, pos)+letra+solucion.substring(pos+1);
                    encontrada=true;
                }
            }
            if (encontrada==false) { //si despues de hacer todo el bucle for no ha encontrado una letra, resta un intento
            	intentos--;
            	if(intentos>=1) { // si los intentos son mayores que 1 le muestra los intentos restantes, en caso contrario sale del bucle
            		System.out.println("Te quedan: "+intentos+" intentos.");
            	}else {
            		System.out.println("Has perdido");
            		break;
            	}
            }
            
            System.out.println(solucion);
        } while (!solucion.equals(palabraoculta));     //estara haciendo el bucle mientras la solucion que estamos formando no sea igual a la palabra oculta que nos dio al principio el usuario
            System.out.println("Muy bien jugado");    
}
}