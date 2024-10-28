public class Laptop extends producto implements Vendible{
    private String procesador;
    private int memoriaRam;

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, int memoriaRam) {
        super (nombre, marca, precio, cantidadStock);
        this.memoriaRam=memoriaRam;
        this.procesador=procesador;

    }

    public void mostrarDetalles() {

        System.out.println(" Laptop: " + nombre + ", Marca: " + marca + ", Precio: " + precio + ", Stock: " + cantidadStock + ", Procesador: " + precio + ", Memoria RAM: " + memoriaRam + "GB");
    }
    }

    public double calcularPrecioVenta(int cantidad, double precio) {
    double total = precio * cantidad;
    if (cantidad > 5) {
        total *= 1.0;

    }
    return total;
    }

