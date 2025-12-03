package Strategy_Transporte;

public abstract class Transporte implements Transportable {

	protected int cantidadArticulo;
	protected int espacioDisponible;
	protected String tipo;

	public void almacenarArticulo() {
		throw new UnsupportedOperationException();
	}

}