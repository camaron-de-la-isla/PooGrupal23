package producto;

public class Televisor extends Producto {
    private
    int pulgadas;
    String marca;
    String modelo;
    String color;
    double precio;

    public Televisor(int id, String nombre, double precio, int stock, int pulgadas, String marca, String modelo, String color) {
        this.setId(id);
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public Televisor() {
        this.setId(0);
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
        this.pulgadas = 0;
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.precio = 0.0;

    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Productos.Televisor [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio
                + ", pulgadas=" + pulgadas + "]";
    }
}
