
public class VerificarGarantia extends SolicitudCambio{

    public VerificarGarantia(Producto producto) {
        super(producto);
    }

    @Override
    public void iniciarProceso(String descripcion) {
        if(comprobacion()){
            System.out.println("Proceso activo: "+ descripcion);
            System.out.println("Verificando garantia del producto:...");
            avanzarSiguienteProceso(descripcion);
        }else{
            System.out.println("No apto para devolucion");
        }
    }

    //Aqui estamos viendo si el producto cumple con requerimineto basicos para la devolucion
    @Override
    public boolean comprobacion() {
        //Logica interna del negocio para validar el proceso de garantia
        return true;
    }

    private void avanzarSiguienteProceso(String description){
        if(this.siguiente != null){
            siguiente.iniciarProceso(description);
        } else{
            System.out.println("Proceso terminado.");
            System.out.println("Producto listo para para el cambio");
        }
    }

}