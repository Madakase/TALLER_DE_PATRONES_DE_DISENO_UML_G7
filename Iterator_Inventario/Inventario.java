package Iterator_Inventario;
import java.util.*;

public class Inventario implements Iterator {

	private List<Producto> prodLista;

	public boolean hasNext() {
		return false;
	}

	public Inventario(List<Producto> prodLista) {
		this.prodLista = prodLista;
	}

	public Producto getNext() {
		throw new UnsupportedOperationException();	
	}

	public void remove() {
	}

}