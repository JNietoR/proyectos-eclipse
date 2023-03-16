package hundirLaFlota;

public class Agua extends Casilla{
	private String id;
	
	public Agua() {
		super("A");
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean isTocado() {
		return false;
	}

	@Override
	public String toString() {
		return "A";
	}
	public int getVida() {
		return -1;
	}
	/*
	@Override
	public boolean hundido() {
		// TODO Auto-generated method stub
		return false;
	}
	*/
}
