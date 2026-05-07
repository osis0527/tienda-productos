public class Producto {

    // Atributos
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos
    public void mostrarInfo() {
        System.out.println("────────────────────────────");
        System.out.println("ID:     " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Stock:  " + stock + " unidades");
    }

    public boolean estaDisponible() {
        return stock > 0;
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("✔ Stock actualizado. Quedan: " + stock + " unidades.");
        } else {
            System.out.println("✘ No hay suficiente stock.");
        }
    }

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }
}
