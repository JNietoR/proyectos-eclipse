package relacionArrays;

public class mainArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	OperacionesArray
	double arra[]= {7,5,8,7,9};
	OperacionesArray a=new OperacionesArray(arra);
	System.out.println(a);
	a.normalizar();
	System.out.println(a);
	*/
		
	/* Vector
	double [] arra= {7,5,6,8};
	double [] arra2= {1,2,3,4};
	Vector v= new Vector(arra);
	System.out.println(v);
	double[] res= v.productoVector(arra2);
	Vector v2= new Vector(res);
	System.out.println(v2);
	*/
	/*	
		double[][] arra=new double[2][2];
		
		for(int i=0;i<arra.length;i++) {
			for(int j=0;j<arra[i].length;j++) {
				System.out.print(arra[i][j]+" ");
			}
			System.out.println();
		}
		*/
	/* Ejercicio1	
	int [] arra= {5,6,9,12,15};
	Ejercicio1 x= new Ejercicio1(arra);
	Ejercicio1 x2= new Ejercicio1(x.ordenar());
	System.out.println(x2);
	*/
	
	//Ejercicio2	
	/*char[] array= {'r','e','c','o','n','o','c','e','r'};
	Ejercicio3 palabro= new Ejercicio3(array);
	System.out.println(palabro);
	*/
	Partida partida1 = new Partida();
	Jugador jugador1= new Jugador("Jorge", "X");
	Jugador jugador2= new Jugador("Irene", "Y");
	
	partida1.rellenar();
	partida1.imprimir();
	}

		
}
