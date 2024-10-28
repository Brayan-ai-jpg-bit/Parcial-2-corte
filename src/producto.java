abstract  class producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadStock;

    public producto(String nombre, String marca, double precio, int cantidadStock){
        this.cantidadStock = cantidadStock;
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;


    }

    public abstract void
    mostrarDetalles();

    public void reducirStock(int cantidad) {
        if (cantidad <= cantidadStock){
            cantidad -= cantidad;
        }else {
            System.out.println("No hay suficiente stock disponible");
        }
    }

    public int
    getCantidadStock(){
        return cantidadStock;
    }

}
