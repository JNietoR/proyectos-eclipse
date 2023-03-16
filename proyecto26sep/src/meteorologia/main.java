package meteorologia;

public class main {

	public static void main(String[] args) {

		tiempo t = new tiempo();
	

		t.añadirValor("Enero", 20);
		t.añadirValor("Febreo", 12);
		t.añadirValor("Marzo", 40);
		t.añadirValor("Abril", 41);
		t.añadirValor("Mayo", 33);
		t.añadirValor("Junio", 63);
		t.añadirValor("Julio", 25);
		t.añadirValor("Agosto", 69);
		t.añadirValor("Diciembre",10);
		t.añadirValor("Septiembre", 240);
		t.añadirValor("Octubre", 15);
		t.añadirValor("Noviembre", 40);
		
		System.out.println(t);
		
		System.out.println(t.masLLuvia());
		System.out.println(t.menosLLuvia());
		System.out.println(t.mediaLLuvia("Febrero","Abril"));
		System.out.println(t.mediaLLuviaanual());
	}

}
