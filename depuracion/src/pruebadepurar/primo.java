package pruebadepurar; //no tenia puesto el paquete
import java.util.Scanner;
public class primo{ //tampoco tenia abierta las llaves de la clase
	
public static void main(String[] args){

	int num=0; //Primero inicializamos la variable antes del try and catch
	boolean resultado = true;
	Scanner S = new Scanner(System.in);

	
	  try{ //he hecho un try and cath para cuando inserte algo que no sea un numero
		  System.out.print("Introduce un número para comprobar si es primo: ");
	        num=S.nextInt();  
	        for(int i=2; i<num/2; i++){ //en el for quitariamos el = ya que si no siempre nos daría que es primo al llegar a dividirse por si mismo, ademas solo necesitamos comprobar hast ala mitad de los numeros 
	    		if(num % i == 0){
	    			resultado = false;
	    		}
	    	}
	    	if (resultado){
	    		System.out.println("El número es primo.");
	    	}
	    	else{
	    		System.out.println("El número NO es primo");
	    	}
	    }
	    catch(Exception e){
	        System.out.println("Por favor, ingrese un dato valido");
	    }

	
}}
