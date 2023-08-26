package Desafio1;

public class Producto {

    private long id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
    }

    public Producto(long id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " +
                "id: " + id +
                ", nombre: " + nombre + '\'' +
                ", precio: " + precio +
                ", stock: " + stock;
    }
}
