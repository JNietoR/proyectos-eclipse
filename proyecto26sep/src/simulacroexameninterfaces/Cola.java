package simulacroexameninterfaces;

public class Cola implements iLista{
	public int[] array;
	public int capacidad;
	public int top;
	
	public Cola(int capacidad) {
		this.array = new int [capacidad];
		this.capacidad = capacidad;
		this.top=0;
	}
	@Override
	public int[] getArray() {
		return array;
	}
	@Override
	public void setArray(int[] array) {
		this.array = array;
	}
	@Override
	public int getCapacidad() {
		return capacidad;
	}
	@Override
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		
		return this.array[this.capacidad]!=0; //FIFO si el ultimo elemento no es 0 esta llena, ya que no se han sacado todos los elementos que se sacan de arriba a abajo
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.array[0]==0; //LIFO si el primer elemento es 0 quiere decir que se han sacado todos los elementos y esta vacia
	}
	@Override
	public void Push(int elemento) {
		// TODO Auto-generated method stub
//		if(!this.isFull()) {
//			for(int i=0;i<this.capacidad;i++) {
//				if(this.array[i]==0) {
//					this.array[i]=elemento;
//					break;
//				}
//			}
//		}
		if(!this.isFull()) {
			this.array[top]=elemento;
			top++;
		}
	}
	@Override
	public int Pop() {
		int resultado=this.array[0];
		this.array[0]=0;
		for(int i=0;i>this.capacidad-1;i++) {
			this.array[i]=this.array[i+1];
		}
		this.array[capacidad-1]=0;
		return resultado;
	}
}
