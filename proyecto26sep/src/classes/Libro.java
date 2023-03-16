package classes;

public class Libro {
	private long isbn;
	private String titulo;
	private String autor;
	private int añoPubl;
	private int nPaginas;
	private boolean prestado;
	
	public Libro() {
		this.isbn=9999999999999l;
		this.titulo="Wise man fear";
		this.autor="Patrick Rothfuss";
		this.añoPubl=2011;
		this.nPaginas=1440;
		this.prestado=false;
	}
	public Libro(long isbn, String titulo, String autor, int añoPubl, int nPaginas) {
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
		this.añoPubl=añoPubl;
		this.nPaginas=nPaginas;
		this.prestado=false;
	}
	public long getIsbn() {
		return isbn;
	}
	public boolean setIsbn(long isbn) {
		boolean correcto=true;
		if(isbn>1000000000000l && isbn<9999999999999l) {
			this.isbn=isbn;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAñoPubl() {
		return añoPubl;
	}
	public void setAñoPubl(int añoPubl) {
		this.añoPubl = añoPubl;
	}
	public int getnPaginas() {
		return nPaginas;
	}
	public boolean setnPaginas(int nPaginas) {
		boolean correcto=true;
		if (nPaginas>0) {
		this.nPaginas = nPaginas;
		}else {
			correcto=false;
		}
		return correcto;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public boolean prestar() {
		boolean correcto=true;
		if(this.prestado) {
			correcto=false;
		}else {
			this.prestado=true;
		}
		return correcto;
	}
	public boolean devolver() {
		boolean correcto=true;
		if(!this.prestado) {
			correcto=false;
		}else {
			this.prestado=false;
		}
		return correcto;
	}
	public boolean comparar(Libro l) {
		return this.nPaginas>l.nPaginas;
	}
	
	public String toString() {
		return "El libro "+titulo+", con ISBN: "+isbn+" y creado por "+autor+" en "+añoPubl+" , tiene "+nPaginas+" páginas y está prestado: "+prestado+".";
	}
}
