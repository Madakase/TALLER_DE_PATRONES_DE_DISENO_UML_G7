
public class AprobacionGerencial extends SolicitudCambio{

    public AprobacionGerencial(Producto producto) {
        super(producto);
    }

    @Override
    public void iniciarProceso(String descripcion) {
        if(comprobacion()){
            System.out.println("Gerente: Se aprobó el cambio " + descripcion);
        }else{
            System.out.println("No era necesario la aprobacion del cliente");
        }
    }

    @Override
    public boolean comprobacion() {
        return true;
    }

    /*private Producto cambiodeProducto(){
        return new Producto(this.producto.getNombre()+"-Nº1",this.producto.precio,this.producto.garantia);
    }*/
    
    private void avanzarSiguienteProceso(String descripcion){
        if(this.siguiente != null){
            siguiente.iniciarProceso(descripcion);
        }else{
            System.out.println("Proceso terminado" + "\nProducto enlistado para el cambio");
        }
    }
}