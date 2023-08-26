package Desafio1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Map<Long, Tienda> tiendas = new HashMap();
    ProductoService ps = new ProductoService();


    public Tienda ingresarTienda() {
        int opcion = 0;
        do {
            Tienda tienda = new Tienda();
            System.out.print("Ingrese el id de la tienda: ");
            tienda.setIdTienda(read.nextLong());
            System.out.print("Ingrese los productos: ");
            Map<Long, Producto> productos = ps.introducirProducto();
            tienda.setProductos(productos);
            System.out.print("Ingrese la direccion: ");
            tienda.setDireccion(read.next());
            System.out.print("Ingrese el representante: ");
            tienda.setRepresentanteTienda(read.next());
            tiendas.put(tienda.getIdTienda(), tienda);
            System.out.println(tienda.toString());
            System.out.println("Desea ingresar una nueva tienda? 1.Si | 2.No");
            opcion = read.nextInt();
            return tienda;
        }
        while (opcion == 1);
    }

    public void modificarTienda() {
        System.out.print("Ingrese el id de la tienda que va a modificar: ");
        long id = read.nextLong();
        System.out.println("Ingrese nuevo representante: ");
        if (tiendas.containsKey(id)) {
            Tienda tienda = tiendas.get(id);
            tienda.setRepresentanteTienda(read.next());
            System.out.println("Representante modificado: " + tienda);
        } else {
            System.out.println("Tienda no encontrada.");
        }
    }

    public void eliminarTienda() {
        System.out.print("Ingrese el id de la tienda que va a eliminar: ");
        long id = read.nextLong();
        tiendas.remove(id);
    }

    public void mostrarTiendas() {
        for (Map.Entry<Long, Tienda> entry : tiendas.entrySet()) {
            System.out.println("ID de la tienda: " + entry.getKey() + ", Productos: " + entry.getValue().getProductos() + ", Representante: " + entry.getValue().getRepresentanteTienda() + ", Direccion: " + entry.getValue().getDireccion());
        }
    }

    public void ventaProducto(Map<Long, Producto> producto) {
        System.out.println("Ingrese id del producto que desea comprar");
        Long productoAComprar = read.nextLong();

        //aca quiero recorrer la lista de los productos para acceder al id o al nombre y poder comprar
        //modificando el stock -1. si no hay le avisa al comprador que no hay.
        //no se como hacer para acceder al valor del mapa producto.

        for (Map.Entry<Long, Producto> entry : producto.entrySet()) {
            Producto p = entry.getValue();
            if (p.getId() == productoAComprar) {
                if (p.getStock() > 0) {
                    p.setStock(p.getStock() - 1);
                    System.out.println("Compra exitosa. Stock restante: " + p.getStock());
                } else {
                    System.out.println("Producto agotado.");
                }
            }
        }
    }
}




