package arraylistPackage;
/*
Implemente una clase DiscoDuro y una clase Archivo. La clase Archivo tendrá un nombre y un contenido 
(ambos de tipo String), y su tamaño dependerá del número de caracteres de dicho contenido. 
El DiscoDuro tendrá una capacidad máxima que va a determinar la cantidad de objetos 
de tipo Archivo que podrá almacenar.
Utilizando un ArrayList, implemente la funcionalidad del DiscoDuro:
Crear un DiscoDuro con un tamaño inicial dado (constructor).
Guardar archivo, que se debe guardar solo si hay espacio, informando del resultado 
de la operación al usuario.
Eliminar archivo, si es que está, a partir de su nombre. 
Se debe informar del resultado de la operación y liberar el espacio que ocupaba el archivo eliminado.
Listar contenido. Debe mostrar el nombre de archivo junto a su tamaño 
y al final el tamaño de disco ocupado.
Formatear disco, que debe eliminar todos los archivos almacenados.
 */
public class Archivo {
	private String nombre, contenido;
	private int tamaño;
	
	public Archivo(String nombre, String contenido) {
		this.nombre=nombre;
		this.contenido=contenido;
		this.tamaño=contenido.length();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + ", contenido=" + contenido + ", tamaño=" + tamaño + "]";
	}
	
	
	
}
