public class Main {
    public static void main(String[] args) {

        // Crear tienda
        Tienda tienda = new Tienda("Mi Tienda Tech");

        // Crear productos
        Producto p1 = new Producto(1, "Teclado Mecánico", 89.99, 15);
        Producto p2 = new Producto(2, "Ratón Inalámbrico", 45.50, 30);
        Producto p3 = new Producto(3, "Monitor 24\"", 199.99, 0);

        // Agregar a la tienda
        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);

        // Mostrar catálogo
        tienda.mostrarCatalogo();

        // Buscar producto y reducir stock
        System.out.println("\n--- Comprando 3 teclados ---");
        Producto encontrado = tienda.buscarPorId(1);
        if (encontrado != null) {
            encontrado.reducirStock(3);
        }

        // Valor total del inventario
        System.out.println("\n💰 Valor total del inventario: "
                + tienda.calcularValorInventario() + " €");
    }
}
