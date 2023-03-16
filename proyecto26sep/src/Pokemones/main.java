package Pokemones;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean agregar=false;
		String respuesta="";
		
		
		Pokemon bulbasaur= new Pokemon(1, "Planta Veneno", "menuda piña");
        Pokemon charmander= new Pokemon(4, "Fuego", "hot hot");
        Pokemon squirtle= new Pokemon(7, "Agua", "moja");
        Pokemon caterpie= new Pokemon(10, "Bicho", "evoluciona al muro");

        ArrayPokemones pokearra = new ArrayPokemones();
        
        pokearra.añadirPokemon(bulbasaur);
        pokearra.añadirPokemon(charmander);
        pokearra.añadirPokemon(squirtle);
        pokearra.añadirPokemon(caterpie);

        Ruta ruta1 = new Ruta();

        ruta1.añadirPokemonARuta(bulbasaur);
        ruta1.añadirPokemonARuta(charmander);
        ruta1.añadirPokemonARuta(squirtle);
        ruta1.añadirPokemonARuta(caterpie);
        // Programa agregar pokemon ruta
        do {
        	System.out.println("Añade un nuevo Pokemon a la Ruta (ID, Tipo, Descripcion)");
            Pokemon poke = new Pokemon(sc.nextInt(),sc.nextLine(),sc.nextLine());
            ruta1.añadirPokemonARuta(poke);
            sc.next();
            System.out.println("¿Quieres agregar otro Pokemon a la Ruta? s/n");
            respuesta = sc.next(); 
            if(respuesta.equals("s")) {
                agregar=false;
            }else {
                agregar=true;
                break;
            }
        }while(!agregar);
        
        
        Pokedex pokedexkanto= new Pokedex();
        pokedexkanto.añadirPokePokedex("Bulbasaur", bulbasaur);
        pokedexkanto.añadirPokePokedex("Charmander", charmander);
        pokedexkanto.añadirPokePokedex("Squirtle", squirtle);
        pokedexkanto.añadirPokePokedex("Caterpie", caterpie);
        
       //Programa agregar pokemon pokedex
        do {
        	System.out.println("Añade un nuevo Pokemon a la Pokedex (ID, Tipo, Descripcion)");
            Pokemon poke = new Pokemon(sc.nextInt(),sc.nextLine(),sc.nextLine());
            sc.next();
            System.out.println("Introduce el nombre del Pokemon introducido");
            pokedexkanto.añadirPokePokedex(sc.next(), poke);
            sc.next();
            System.out.println("¿Quieres agregar otro Pokemon? s/n");
            respuesta = sc.next();
            if(respuesta.equals("s")) {
                agregar=false;
            }else {
                agregar=true;
                break;
            }
        }while(!agregar);
        
        System.out.println(pokedexkanto);
        
        Entrenador en1= new Entrenador("Jorge",8);
        en1.cambiarRuta(ruta1);
        String nombreconsulta="";
        System.out.println("Introduce el nombre del pokemon a consultar en tu pokedex");
        nombreconsulta=sc.next();
        System.out.println(en1.consultarPokedexEntrenador(nombreconsulta));
        en1.capturarPokemon();
        System.out.println(en1);
	}
}
