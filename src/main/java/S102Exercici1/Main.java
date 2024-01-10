package S102Exercici1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Producto> listaProductos = new ArrayList<>();

        Producto producto1 = new Producto("Martillo", 15);
        Producto producto2 = new Producto("Tornavís", 12);
        Producto producto3 = new Producto("Lija", 5.5);

        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);

        Venta nuevaVenta = new Venta(listaProductos, 0);
        //quiero calcular el precio total. Es posible que la lista esté vacía. Entonces lanzo la excepcion
        //y la capturo imprimiendo por pantalla getMessage()

        try{
         System.out.println(nuevaVenta.calcularTotal());
        } catch (VentaVaciaException e) {
            System.out.println(e.getMessage());
        }

        try{
            Scanner input = new Scanner(System.in);
            System.out.println("Elige un producto de la lista. El primer producto empieza por 0");
            int num = input.nextInt();
            System.out.println("El producto seleccionado es " + listaProductos.get(num));
        }catch(IndexOutOfBoundsException e){
            System.out.println("No has introducido un número válido");
        }


    }
}