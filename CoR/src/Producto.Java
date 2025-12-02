
 import java.time.LocalDate;

 public class Producto {
     String nombre;
     int precio;
     LocalDate garantia;

     public Producto(String nombre, int precio, LocalDate garantia) {
         this.nombre = nombre;
         this.precio = precio;
         this.garantia = garantia;
     }

     public String getNombre() {
         return nombre;
     }

     public int getPrecio() {
         return this.precio;
     }

     public LocalDate getGarantia() {
         return this.garantia;
     }
 }