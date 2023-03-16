package simulacroexameninterfaces;

public interface iLista {
	public int[] getArray();
	public void setArray(int[] array);
	public int getCapacidad();
	public void setCapacidad(int capacidad);
	public boolean isFull();
	public boolean isEmpty();
	public void Push(int elemento);
	public int Pop();
}
