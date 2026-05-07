import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Tienda tienda = new Tienda("Mi Tienda Tech");

        System.out.println("¿Cuántos productos desea agregar?");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("\n-- Producto " + i + " --");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            System.out.print("Stock: ");
            int stock = scanner.nextInt();
            scanner.nextLine();

            Producto p = new Producto(i, nombre, precio, stock);
            tienda.agregarProducto(p);
        }

        tienda.mostrarCatalogo();

        System.out.println("\n💰 Valor total del inventario: "
                + tienda.calcularValorInventario() + " €");

        scanner.close();
    }
}