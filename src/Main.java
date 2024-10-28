public class Main {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Inspiron", "Dell", 800.0, 10, "Intel i5", 8);
        Celular celular1 = new Celular("Galaxy S21", "Samsung", 700.0, 15, 4000, 108);


        Cliente cliente1 = new Cliente("Carlos Perez", "carlos.perez@example.com");
        Cliente cliente2 = new Cliente("Ana Gomez", "ana.gomez@example.com");


        cliente1.comprarProducto(laptop1, 3);
        cliente1.comprarProducto(celular1, 6);

        cliente2.comprarProducto(celular1, 4);


        System.out.println("\nResumen de compras:");
        cliente1.mostrarCompra();
        cliente2.mostrarCompra();


        System.out.println("\nInventario actualizado:");
        laptop1.mostrarDetalles();
        celular1.mostrarDetalles();
    }
}