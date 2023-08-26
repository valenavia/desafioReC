package Desafio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Tienda {

    private long idTienda;
    private Map<Long, Producto> productos;
    private String direccion;
    private String representanteTienda;

    public Tienda() {
    }

    public Tienda(long idTienda, Map<Long, Producto> productos, String direccion, String representanteTienda) {
        this.idTienda = idTienda;
        this.productos = productos;
        this.direccion = direccion;
        this.representanteTienda = representanteTienda;
    }

    public long getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(long idTienda) {
        this.idTienda = idTienda;
    }

    public Map<Long, Producto> getProductos() {
        return productos;
    }

    public void setProductos(Map<Long, Producto> productos) {
        this.productos = productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentanteTienda() {
        return representanteTienda;
    }

    public void setRepresentanteTienda(String representanteTienda) {
        this.representanteTienda = representanteTienda;
    }

    @Override
    public String toString() {
        return "Tienda: " +
                "ID: " + idTienda +
                ", productos: " + productos +
                ", dirección: " + direccion + '\'' +
                ", representante: " + representanteTienda;
    }

    public void setProductos(Long key, Producto value) {
    }
}
