package producto;

public class Altavoz extends Producto {
    private
    int potencia;
    String marca;
    String modelo;
    String color;
    public Altavoz(int id, String nombre, double precio, int stock, int potencia, String marca, String modelo, String color) {
        this.setId(id);
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.potencia = potencia;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public Altavoz() {
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
        this.potencia = 0;
        this.marca = "";
        this.modelo = "";
        this.color = "";
    }

    public int getPotencia() {
        return potencia;
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

    public String getNombre() {return nombre; }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
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
        return "Productos.Altavoz [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", precio="
                + precio + "]";
    }
}
