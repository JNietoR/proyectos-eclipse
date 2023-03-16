package interfaces;

public class Disco implements iPublicacion, iPrestable, iConsultable{

	private int codigo;
	private String autor;
	private String titulo;
	private int anio;
	private boolean prestado;
	private boolean consultado;
	
	public Disco(int codigo, String autor, String titulo, int anio) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.anio = anio;
		this.prestado = false;
		this.consultado = false;
	}
	@Override
	public int getCodigo() {
		// TODO Auto-generated method stub
		return this.codigo;
	}

	@Override
	public void setCodigo(int codigo) {
		// TODO Auto-generated method stub
		this.codigo=codigo;
	}

	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
		return this.autor;
	}

	@Override
	public void setAutor(String autor) {
		// TODO Auto-generated method stub
		this.autor=autor;
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return this.titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		// TODO Auto-generated method stub
		this.titulo=titulo;
	}

	@Override
	public int getAnio() {
		// TODO Auto-generated method stub
		return this.anio;
	}

	@Override
	public void setAnio(int anio) {
		// TODO Auto-generated method stub
		this.anio=anio;
	}

	@Override
	public boolean isPrestado() {
		// TODO Auto-generated method stub
		return this.prestado;
	}

	@Override
	public void isPrestado(boolean prestado) {
		// TODO Auto-generated method stub
		this.prestado=prestado;
	}
	public void prestar() {
		// TODO Auto-generated method stub
		if(!this.prestado) {
			this.prestado=true;
		}
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		if(this.prestado) {
			this.prestado=false;
		}
	}
	@Override
	public void retirar() {
		// TODO Auto-generated method stub
		if(!this.prestado && !this.consultado) {
			this.consultado=true;
		}
	}
	@Override
	public boolean isConsultando() {
		// TODO Auto-generated method stub
		if(this.prestado || this.consultado) {
			this.consultado=false;
		}
		return false;
	}
}
