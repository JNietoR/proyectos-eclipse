package arraylistPackage;

import java.util.ArrayList;


public class ArrayPersonitas {
	private ArrayList<Persona> personas;
	
	public ArrayPersonitas() {
		this.personas= new ArrayList<Persona>();
	}
	public void añadirPersonas(Persona gente) {
		this.personas.add(gente);
	}
	public ArrayList<Persona> mostrarPersonas() {
		return this.personas;
	}
	public ArrayList<Persona> invertirPersonas() {
		ArrayList<Persona> invertido = new ArrayList<Persona>();
        for (int i = this.personas.size() - 1; i >= 0; i--) {
            invertido.add(personas.get(i));
        }
        return invertido;
	}
}
