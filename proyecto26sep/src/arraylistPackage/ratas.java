package arraylistPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ratas {
	public static void main(String[] args) {
	
	/*
	Escribir un programa que lea el peso de cada una de las 20 ratas de laboratorio del
	departamento de Biología de la Nutrición. Calcular el peso medio de las ratas e imprimir un
	informe parecido al siguiente:
	hay 2 ratas que pesan 200 gramos
	hay 1 rata que pesa 350 gramos
	 */
	
		ArrayList<Double> peso = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<5; i++) {
            System.out.println("mete rata");
            peso.add(sc.nextDouble());
        }
        peso.sort(null);
        System.out.println(peso);
        for(int i = 0;i <peso.size();i++) {
            int contador=0;
            for(int j=0;j<peso.size();j++) {
                if(peso.get(i).equals(peso.get(j))) {
                contador++;
                }
            }

            System.out.println("Hay " + contador + "ratas que pesan "+ peso.get(i)+ "de este peso");
        }
	
	
	
	
	}
}
