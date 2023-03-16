package hundirLaFlota;

public abstract class Casilla {
	protected String id;
	
		protected Casilla(String id) {
			this.id=id;
		}
		public String getId() {
			return this.id;
		}
		public void setId(String id) {
			this.id=id;
		}
	public abstract boolean isTocado();
	//public abstract boolean hundido();
	public abstract int getVida();
}
