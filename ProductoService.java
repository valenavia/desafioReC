package Desafio1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Map<Long, Producto> productos = new HashMap();

    public Map<Long, Producto> introducirProducto(){
        int opcion = 0;
        do {
            Producto producto = new Producto();
            System.out.print("Ingrese el id del producto: ");
            producto.setId(read.nextLong());
            System.out.print("Ingrese nombre del producto: ");
            producto.setNombre(read.next());
            System.out.print("Ingrese precio: ");
            producto.setPrecio(read.nextDouble());
            System.out.println("Ingrese la cantidad: ");
            producto.setStock(read.nextInt());
            productos.put(producto.getId(),producto);
            System.out.println(producto.toString());
            System.out.println("Desea ingresar un nuevo producto? 1.Si | 2.No");
            opcion = read.nextInt();
        } while (opcion == 1);
        return productos;
    }

    public void modificarPrecio(){
        System.out.print("Ingrese el id del producto que va a modificar: ");
        long id = read.nextLong();
        System.out.println("Ingrese nuevo precio: ");
        if (productos.containsKey(id)) {
            Producto producto = productos.get(id);
            producto.setPrecio(read.nextDouble());
            System.out.println("Producto modificado: " + producto);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el id del producto que va a eliminar: ");
        long id = read.nextLong();
        productos.remove(id);
    }

    public void mostrarProductos(){
        for(Map.Entry<Long, Producto> entry: productos.entrySet()){
            System.out.println("Nombre: " + entry.getKey() + " Precio $" + entry.getValue());
        }
    }
}
