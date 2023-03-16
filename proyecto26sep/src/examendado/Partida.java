package examendado;

public class Partida {
	//atributos de la clase Partida
	private Jugador jugador1;
	private Jugador jugador2;
	private Jugador ganador;
	private int rondas;
	
	public Partida() { // constructor vacio/por defecto
		this.jugador1=new Jugador(); //clases vacias ya que es el contructor por defecto/vacio
		this.jugador2=new Jugador();
		this.ganador=new Jugador();
		this.rondas=0;
	}
	public Partida(Jugador jugador1, Jugador jugador2, int rondas) { // construcor por parametros exceptuando el ganador que no esta decidido
		this.jugador1=jugador1;
		this.jugador2=jugador2;
		if(rondas>=1) { // filtro para que al menos haya una ronda
			this.rondas=rondas;
		}
		this.ganador=new Jugador(); // el ganador empieza siendo un jugador vacio
	}
	public Jugador getJugador1() { //getter del jugador1
		return jugador1;
	}
	public void setJugador1(Jugador jugador1) { //setter del jugador1
		this.jugador1 = jugador1;
	}
	public Jugador getJugador2() { //getter del jugador 2
		return jugador2;
	}
	public void setJugador2(Jugador jugador2) { //setter del jugador 2
		this.jugador2 = jugador2;
	}
	public Jugador getGanador() { //getter del ganador
		return ganador;
	}
	//eliminamos el metodo setganador para que no se pueda modificar, ya que se establece por un metodo
	public int getRondas() { //getter del atrubuto rondas
		return rondas;
	}
	public boolean setRondas(int rondas) { //setter con filtro para rondas
		boolean correcto=true;
		if(rondas<1) { //filtro para garantizar que tenemos al menos 1 ronda
			correcto=false;
		}else {
			this.rondas = rondas;
		}
		return correcto;
	}
	public String toString() { //metodo toString de la clase
		return "Jugador 1: "+this.jugador1+" Jugador 2: "+this.jugador2+" en un total de: "+this.rondas+" el Ganador es: "+this.ganador+" con una puntuacion de "+this.ganador.getPuntuacion();
	}
	
	public void jugar() { 
		int sumatoriaj1=0,sumatoriaj2=0; //variables donde acumularemos la sumatoria de cada jugador inicializadas en 0 para que la sumatoria empieze 
		
		for(int i=0;i<=this.rondas;i++) { //tirara un dado hasta llegar al numero maximo de rondas e ira sumando el resultado a la variable sumatoria de cada jugador
			this.jugador1.tirar();
			sumatoriaj1+=this.jugador1.getPuntuacion();
			this.jugador2.tirar();
			sumatoriaj2+=this.jugador1.getPuntuacion();
		}
		
		if(sumatoriaj1>sumatoriaj2) { //filtro para elegir el ganador, que sera el jugador con mayor puntuación
			this.ganador=this.jugador1;
		}else {
			this.ganador=this.jugador2;
		}
	}
	
}
