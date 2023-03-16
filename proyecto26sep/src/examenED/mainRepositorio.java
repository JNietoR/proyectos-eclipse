package examenED;

import java.util.ArrayList;

public class mainRepositorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		repositorioArtistas r1=new repositorioArtistas();
		ArrayList<String> canciones= new ArrayList<String>();
		canciones.add("Numb");
		r1.añadirCantante("Chester", canciones);
		//System.out.println(r1);
		r1.añadirCancion("Chester", "Faint");
		//System.out.println(r1);
		r1.consultarCanciones("Chester");
		System.out.println(r1.consultarCanciones("Chester"));
	}

}
