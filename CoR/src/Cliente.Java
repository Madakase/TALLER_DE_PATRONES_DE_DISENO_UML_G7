import java.time.LocalDate;

public class Cliente {

    public static void main(String[] args) {
        Producto product = new Producto("Vaso de ceramica",1200, LocalDate.of(2025, 7, 17));

        SolicitudCambio primerProceso = new VerificarGarantia(product);
        SolicitudCambio segundoProceso = new ComprobarCoberturaGarantia(product);
        SolicitudCambio tercerProceso = new ComprobarExistencia(product);
        SolicitudCambio cuartoProceso = new VerificarPrecio(product);
        SolicitudCambio quintoProceso = new AprobacionGerencial(product);

        primerProceso.setSiguiente(segundoProceso);
        segundoProceso.setSiguiente(tercerProceso);
        tercerProceso.setSiguiente(cuartoProceso);
        cuartoProceso.setSiguiente(quintoProceso);

        primerProceso.iniciarProceso("Cambiar vaso de ceramica roto de p");

    }

}