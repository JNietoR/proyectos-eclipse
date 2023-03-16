package actividad10;

public class MainAjedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celda c= new Celda('A',1);
		Celda c2= new Celda('B',1);
		Torre t=new Torre(true, c);
		System.out.println(t);
		
	}

}
