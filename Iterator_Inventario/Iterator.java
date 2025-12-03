package Iterator_Inventario;

public interface Iterator {

	boolean hasNext();

	Producto getNext();

	void remove();

}