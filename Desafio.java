package Desafio1;

public class Desafio {
    public static void main(String[] args) {
        ProductoService ps = new ProductoService();
        TiendaService ts = new TiendaService();

        ts.ingresarTienda();
        ts.mostrarTiendas();
        /*ts.modificarTienda();
        ts.mostrarTiendas();
        ts.eliminarTienda();
        ts.mostrarTiendas();*/
        ts.ventaProducto(ts.ps.productos);

    }
}
