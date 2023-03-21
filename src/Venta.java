public class Venta {
    private
    int id;
    String fecha;
    Cliente cliente;
    Producto producto;
    int cantidad;
    double precioTotal;

    public Venta(int id, String fecha, Cliente cliente, Producto producto, int cantidad, double precioTotal) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    public Venta() {
        this.id = 0;
        this.fecha = "";
        this.cliente = new Cliente();
        this.producto = new Producto();
        this.cantidad = 0;
        this.precioTotal = 0.0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return producto.getNombre();
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Venta [cantidad=" + cantidad + ", cliente=" + cliente + ", fecha=" + fecha + ", id=" + id + ", producto="
                + producto + ", precioTotal=" + precioTotal + "]";
    }
}
