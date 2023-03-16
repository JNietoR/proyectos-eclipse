package Pokemones;

import java.util.Scanner;

public class Entrenador {
	private String nombre;
	private int num_medallas;
	private Pokedex pokedexentre;
	private Ruta rutaactual;
	
	public Entrenador() {
		this.nombre = "jorge";
		this.num_medallas = 8;
		this.rutaactual= new Ruta();
		this.pokedexentre = new Pokedex();
	}
	
	public Entrenador(String nombre, int num_medallas) {
		this.nombre = nombre;
		this.num_medallas = num_medallas;
		this.pokedexentre = new Pokedex();
		this.rutaactual= new Ruta();
	}
	public Entrenador(String nombre, int num_medallas,Pokedex pokedex) {
		this.nombre = nombre;
		this.num_medallas = num_medallas;
		this.pokedexentre = pokedex;
		this.rutaactual= new Ruta();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNum_medallas() {
		return num_medallas;
	}
	public void setNum_medallas(int num_medallas) {
		this.num_medallas = num_medallas;
	}
	public Pokedex getPokedexentre() {
		return pokedexentre;
	}
	public void setPokedexentre(Pokedex pokedexentre) {
		this.pokedexentre = pokedexentre;
	}
	public Ruta getRutaactual() {
		return rutaactual;
	}
	public Pokemon consultarPokedexEntrenador(String nombre) {
		return this.pokedexentre.informacionPokemon(nombre);
	}
	public void añadirPokedexEntre(String nombre, Pokemon poke) {
		this.pokedexentre.añadirPokePokedex(nombre, poke);
	}
	public void cambiarRuta(Ruta rutaactual) {
		this.rutaactual = rutaactual;
	}
	public void capturarPokemon() {
		String decision="",tipo="",descripcion="";
		ArrayPokemones pokemones=new ArrayPokemones();
		int aux=0,id=0;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<1;i++) {
			aux=(int) (Math.random()*this.rutaactual.size());
			this.rutaactual.consultar(aux);
			pokemones=this.rutaactual.getRuta().get(aux);
			id=pokemones.consultarID(i);
			tipo=pokemones.consultarTipo(i);
			descripcion=pokemones.consultarDescripcion(i);
			}
        System.out.println("Quieres capturar este pokemon o huir");
        decision = sc.next();
        if(decision.equals("Huir")|| decision.equals("huir")) {
            //huir
            Pokemon p=new Pokemon(id,tipo);
            pokedexentre.añadirPokePokedex(" ", p);
            System.out.println("El pokemon ha huido");
        }else if(decision.equals("Capturar")|| decision.equals("capturar")){
        	//captura
			Pokemon p= new Pokemon(id,tipo,descripcion);
			pokedexentre.añadirPokePokedex(" ", p);
			System.out.println("El pokemon ha sido capturado");
        }
	}
	

	@Override
	public String toString() {
		return "Entrenador: " + nombre + ", Medallas: " + num_medallas + " Pokedex: " + pokedexentre;
	}
	
}
