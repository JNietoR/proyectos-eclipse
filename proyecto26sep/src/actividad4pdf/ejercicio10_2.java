package actividad4pdf;

import java.util.Scanner;

public class ejercicio10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabraoculta;
        String solucion = "";
        String aux = "";
        char letra;
        int intentos;
        boolean encontrada=false;

        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte una palabra: ");
        palabraoculta = sc.nextLine();
        System.out.println("La palabra insertada es " + palabraoculta);
        intentos=palabraoculta.length();

        do {
            System.out.println("Inserte un letra: ");
            letra = sc.next().charAt(0); //introducimos un valor string y con el .charAt(0) lo convertimos en char al ser un string de 1 sola posición lo que le pedimos
            solucion = ""; //iniciamos la solución vacia
            encontrada=false;
            for (int pos = 0; pos < palabraoculta.length(); pos++) { //hará un bucle hasta que compruebe todas las posiciones de la palabra
            	if(aux!="") { //con este if cubriremos la opción de que la variabe aux este vacia como la primera vez que entremos al bucle que se inicia vacia
            		if(aux.charAt(pos) != '_' && aux!=""){ //si la letra en la solucion no es un gion y tampoco esta vacia, ira añadiendo la letra a la solucion ya que es una letra que hemos encontrado antes
            			solucion+=aux.charAt(pos);
            		}else if(palabraoculta.charAt(pos) == letra) { //si es una letra que no habiamos econtrado la añadira a solución
            			solucion+=letra;
            			encontrada = true; //hemos encontrado una letra
            		}else{ //si no es ninguna de las anteriores 
            			solucion+="_";
            		}
            		if(aux.charAt(pos) == letra){ //si repites una letra que no te reste un intento
            			encontrada = true;
            		}
            	}else { //si la variable aux no esta vacia, repetiriamos el proceso de arriba
            		if(palabraoculta.charAt(pos) == letra) {
            			solucion+=letra;
            			encontrada = true;
            		}else{
            			solucion+="_";
            		}
            	}	
            }
            if(!encontrada){ //si no ha encontrado ninguna letra 
            	intentos--;
            	if(intentos>=1){
            		System.out.println("Te quedan "+intentos+" intentos");
            	}else{
            		System.out.println("Has perdido");
            	}
            }
            aux = solucion; //guardamos la solución antes de la siguiente vuelta del bucle
            System.out.println(solucion);
        } while (!solucion.equals(palabraoculta) && intentos>=1); //mientras la solucion que se esta generando no sea igual a la palabra oculta y tengas mas de 1 intento
        System.out.println("Muy bien jugado");
	}
}


