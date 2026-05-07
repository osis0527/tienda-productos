import java.util.ArrayList;

public class Tienda {

    private String nombre;
    private ArrayList<Producto> productos;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("✔ Producto \"" + p.getNombre() + "\" agregado a la tienda.");
    }

    public void mostrarCatalogo() {
        System.out.println("\n=============================");
        System.out.println("  CATÁLOGO DE: " + nombre);
        System.out.println("=============================");
        for (Producto p : productos) {
            p.mostrarInfo();
            System.out.println("Disponible: " + (p.estaDisponible() ? "Sí" : "No"));
        }
    }

    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) return p;
        }
        System.out.println("✘ Producto con ID " + id + " no encontrado.");
        return null;
    }

    public double calcularValorInventario() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getStock();
        }
        return total;
    }
}