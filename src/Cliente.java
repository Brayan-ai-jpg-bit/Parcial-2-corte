import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private String correo;
    private List<producto> productosComprados;
    private List<Double> costos;


    public Cliente(String nombre, String correo){

        this.correo=correo;
        this.nombre=nombre;
        this.productosComprados= new ArrayList<>();
        this.costos = new ArrayList<>();
    }

    public void comprarProducto(producto Producto, int cantidad){
        if (Producto.getCantidadStock() >= cantidad){
            Producto.reducirStock(cantidad);

            productosComprados.add(Producto);

            if (Producto instanceof  vendible) {
                double costo = ((vendible) Producto).calcularPrecioVenta(cantidad);

                costos.add(costo);

                System.out.println("Compra Realizada: " + cantidad + "Unidades de " + Producto.nombre + " a $" + costo);

            }
        }else {
            System.out.println("Stock insuficiente para " + Producto.nombre);
        }
    }

    public void mostrarCompra(){

        System.out.println("Cliente: " + nombre + ", Correo: " + correo);
        double totalcompra = 0;
        for (int i = 0; i < productosComprados.size(); i++){
            productosComprados.get(i).mostrarDetalles();

            System.out.println("Costo: $" + costos.get(i));
            totalcompra += costos.get(i);
        }

        System.out.println("Costo total de compra: $" + totalcompra);

    }

}
