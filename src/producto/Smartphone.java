package producto;

public class Smartphone extends
        Producto {

    private int ram;
    private int almacenamiento;
    private String sistemaOperativo;

    private String marca;
    private String modelo;
    private String color;

    public Smartphone(int id, String nombre, double precio, int stock, int ram, int almacenamiento, String sistemaOperativo, String marca, String modelo, String color) {
        this.setId(id);
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Smartphone() {
        this.setId(0);
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
        this.ram = 0;
        this.almacenamiento = 0;
        this.sistemaOperativo = "";
        this.marca = "";
        this.modelo = "";
        this.color = "";
    }

    public int getRam() {
        return ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
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

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
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

    @Override
    public String toString() {
        return "Productos.Smartphone [ram=" + ram + ", almacenamiento=" + almacenamiento + ", sistemaOperativo=" + sistemaOperativo + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
    }

}
