public class Celular extends producto implements Vendible {

    private int capacidadBateria;
    private double camaraResolucion;


    public Celular(String nombre, String marca, double precio, int cantidadStock, int capacidadBateria, double camaraResolucion){
        super(nombre, marca, precio, cantidadStock);
        this.camaraResolucion= camaraResolucion;
        this.capacidadBateria= capacidadBateria;
    }

    public void mostrarDetalles(){

        System.out.println(" Celular: " + nombre + ", Marca: " + marca + ", Precio: " + precio + ", Stock: " + cantidadStock + ",Bateria: " + capacidadBateria + "mAh" + "Camara: " + camaraResolucion + "MP");
    }

    public double calcularPrecioVenta(int cantidad, double precio){

        double total = precio * cantidad;
        if (cantidad > 5){
            total *= 1.0;
        }
        return total;
    }
}
