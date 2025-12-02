public abstract class SolicitudCambio implements Solicitud{
    protected Solicitud siguiente;
    protected Producto producto;

    public SolicitudCambio(Producto producto) {
        this.producto = producto;
    }

    @Override
    public void setSiguiente(Solicitud siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public abstract void iniciarProceso(String descripcion);

    @Override
    public abstract boolean comprobacion();

}