package S102Exercici1;

import java.util.ArrayList;

public class Venta {
   private ArrayList <Producto> listaProductos;
   private double precioTotal;

   public Venta(ArrayList <Producto> listaProductos, double precioTotal){
      this.precioTotal = precioTotal;
      this.listaProductos = listaProductos;
   }

   public double getPrecioTotal() {
      return precioTotal;
   }

   public ArrayList<Producto> getListaProductos() {
      return listaProductos;
   }

   public void setPrecioTotal(double precioTotal) {
      this.precioTotal = precioTotal;
   }

   public void setListaProductos(ArrayList<Producto> listaProductos) {
      this.listaProductos = listaProductos;
   }

   @Override
   public String toString() {
      return "El precio total de la venta es de " + precioTotal + "euros."
              + "La lista de productos es " + listaProductos;
   }
   public double calcularTotal() throws VentaVaciaException{

      if(listaProductos.size() <= 0){
         throw new VentaVaciaException("Para hacer una venta primero tienes que añadir un producto");
      }else{
         for(Producto producto : listaProductos){
            precioTotal = precioTotal + producto.getPrecio();
         }
      }
      return precioTotal;
   }
   public void agregarProducto(Producto nuevoProducto){
      listaProductos.add(nuevoProducto);
      
   }
}
