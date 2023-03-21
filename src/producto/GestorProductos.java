package producto;

import java.util.List;
import java.util.ArrayList;

public class GestorProductos {
    GestorId gestorId = new GestorId();
    private List<Producto> productoList;

    public GestorProductos() {
        productoList = new ArrayList<>();
    }

    public void addProducto(Producto producto) {
        productoList.add(producto);
    }

    public List<Producto> obtenerProductos() {
        return productoList;
    }

    public void removeProducto(Producto producto) {
        productoList.remove(producto);
    }

    public void actualizarProducto(Producto producto) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getId() == producto.getId()) {
                productoList.set(i, producto);
            }
        }
    }

    public void buscarProducto(String nombre) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre)) {
                System.out.println(productoList.get(i));
            }
        }
    }

    public void buscarProducto(int id) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getId() == id) {
                System.out.println(productoList.get(i));
            }
        }
    }

    public void inicializarProductos(GestorProductos self) {
        Smartphone galaxyS10 = new Smartphone(gestorId.assignId(),"Galaxy S10", 1128.0, 10, 4, 128, "Android", "Samsung", "Galaxy S10", "Negro");
        Smartphone iphoneX = new Smartphone(gestorId.assignId(), "iPhone X", 999.0, 10, 3, 64, "iOS", "Apple", "iPhone X", "Gris");
        Altavoz jblflip4 = new Altavoz(gestorId.assignId(), "JBL Flip4", 120, 8, 2800, "JBL", "Flip 4", "Negro");
        Altavoz miSpeaker = new Altavoz(gestorId.assignId(),"Mi Speaker", 50, 8, 1000, "Xiaomi", "Mi Speaker", "Blanco");
        Ordenador portatil = new Ordenador(gestorId.assignId(), "Portatil", 1000, 10, 8, 512, "Windows", "Asus", "Portatil", "Gris");
        Ordenador sobremesa = new Ordenador(gestorId.assignId(), "Productos.Ordenador de sobremesa", 1500, 10, 16, 1024, "Windows", "Asus", "Sobremesa", "Negro");
        Televisor miTv = new Televisor(gestorId.assignId(), "miTv", 580, 12, 52, "Xiaomi", "miTv", "Blanco");
        Televisor sony = new Televisor(gestorId.assignId(), "Sony", 1000, 12, 65, "Sony", "Sony", "Negro");
        self.addProducto(galaxyS10);
        self.addProducto(iphoneX);
        self.addProducto(jblflip4);
        self.addProducto(miSpeaker);
        self.addProducto(portatil);
        self.addProducto(sobremesa);
        self.addProducto(miTv);
        self.addProducto(sony);
    }

    public void mostrarProductos() {
        for (int i = 0; i < productoList.size(); i++) {
            System.out.println(productoList.get(i));
        }
    }

    public boolean existeProducto(int id) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean existeProducto(String nombre) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean existeProducto(String nombre, int id){
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre) && productoList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public Producto getProducto(int id) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getId() == id) {
                return productoList.get(i);
            }
        }
        return null;
    }

    public Producto getProducto(String nombre) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre)) {
                return productoList.get(i);
            }
        }
        return null;
    }

    public Producto getProducto(String nombre, int id) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre) && productoList.get(i).getId() == id) {
                return productoList.get(i);
            }
        }
        return null;
    }




}
