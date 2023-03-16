package arraylistPackage;

import java.util.ArrayList;

/*
 * Implemente una clase DiscoDuro y una clase Archivo. La clase Archivo tendrá un nombre y un contenido (ambos de tipo String), y su tamaño dependerá del número de caracteres de dicho contenido. El DiscoDuro tendrá una capacidad máxima que va a determinar la cantidad de objetos de tipo Archivo que podrá almacenar.
Utilizando un ArrayList, implemente la funcionalidad del DiscoDuro:
Crear un DiscoDuro con un tamaño inicial dado (constructor).
Guardar archivo, que se debe guardar solo si hay espacio, informando del resultado de la operación al usuario.
Eliminar archivo, si es que está, a partir de su nombre. Se debe informar del resultado de la operación y liberar el espacio que ocupaba el archivo eliminado.
Listar contenido. Debe mostrar el nombre de archivo junto a su tamaño y al final el tamaño de disco ocupado.
Formatear disco, que debe eliminar todos los archivos almacenados.
 */
public class DiscoDuro {
	private ArrayList<Archivo> archivos;
	private int tamaño,ocupado;
	
	public DiscoDuro() {
		this.archivos= new ArrayList<Archivo>();
		this.tamaño=500;
		this.ocupado=0;
	}
	
	public DiscoDuro(ArrayList<Archivo> archivos, int tamaño) {
		this.archivos= archivos;
		this.tamaño=tamaño;
		this.ocupado=this.tamañoActual();
	}

	public ArrayList<Archivo> getArchivos() {
		return archivos;
	}

	public void setArchivos(ArrayList<Archivo> archivos) {
		this.archivos = archivos;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public int getOcupado() {
		return ocupado;
	}

	public void setOcupado(int ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "DiscoDuro [archivos=" + archivos + ", tamaño=" + tamaño + "]";
	}
	/*
	public String guardarArchivo(Archivo fichero) {
		String resultado;
		for(int i=0;i<this.archivos.size();i++) {
			this.ocupado+=this.archivos.get(i).getTamaño();
		}
		if((fichero.getTamaño()+this.ocupado)<this.tamaño) {
			this.archivos.add(fichero);
			resultado="Se ha guardado el archivo "+fichero;
		}else {
			resultado="No se ha podido guardar el archivo por que el disco duro no tenia espacio suficiente";
		}
		return resultado;
	}
	*/
	
	public int tamañoActual() {
		int tamañoActual=0;
		for(int i=0;i<this.archivos.size();i++) {
			tamañoActual+=this.archivos.get(i).getTamaño();
		}
		return tamañoActual;
	}
	public boolean guardarArchivo(Archivo fichero) {
		boolean resultado=true;
		int tamañoActual=this.tamañoActual();
		if(!(tamañoActual+fichero.getTamaño()<this.tamaño)) {
			resultado=false;
		}
		return resultado;
	}
	/*
	public String eliminarArchivo(Archivo fichero) {
		String resultado="";
		int libre;
		this.archivos.removeIf(elemento->(elemento==fichero));
		for(int i=0;i<this.archivos.size();i++) {
			this.ocupado+=this.archivos.get(i).getTamaño();
		}
		libre=this.tamaño-this.ocupado;
		resultado="Se ha eliminado el archivo "+fichero+", el tamaño libre actual es de "+libre;
		return resultado;
	}
	*/
	public boolean eliminar(String nombre) {
		boolean resultado=false;
		ArrayList<String> aux=new ArrayList<String>();
		for(int i=0;i<this.archivos.size();i++) {
			aux.add(this.archivos.get(i).getNombre());
		}
		int index = aux.indexOf(nombre); //si no se encuentra devuelve -1
		if(index>=0){ 
			resultado=true;
			this.archivos.remove(index);
		}
		return resultado;
		
	}
	public String listarContenido(){
		return this.archivos.toString()+" el tamaño ocupado es "+this.ocupado;
	}
	public void formatearDiscoDuro() {
		this.archivos.clear();
		this.ocupado=0;
	}
	
	
	
}
