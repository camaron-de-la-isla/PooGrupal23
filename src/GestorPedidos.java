import java.util.ArrayList;

public class GestorPedidos {
    GestorId gestorId = new GestorId();
    private ArrayList<Venta> pedidoList;




    public GestorPedidos() {
        pedidoList = new ArrayList<>();
    }

    public void addPedido(Venta pedido) {
        pedidoList.add(pedido);
    }

    public ArrayList<Venta> obtenerPedidos() {
        return pedidoList;
    }

    public void hacerPedidoTienda(Producto producto, int cantidad) {
        Cliente cliente = new Cliente("PEDIDO EN TIENDA", "PEDIDO EN TIENDA", "PEDIDO EN TIENDA", "PEDIDO EN TIENDA", "PEDIDO EN TIENDA", "PEDIDO EN TIENDA", "PEDIDO EN TIENDA", "PEDIDO EN TIENDA");
        double precioTotal = producto.getPrecio() * cantidad;
        Venta pedido = new Venta(gestorId.getId(), "01/01/2021", cliente, producto, cantidad, precioTotal);
        pedidoList.add(pedido);
    }
    public void eliminarPedido(int id) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == id) {
                pedidoList.remove(i);
            }
        }
    }

    public void eliminarPedido(String nombre) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getNombre().equals(nombre)) {
                pedidoList.remove(i);
            }
        }
    }

    public void eliminarPedido(int id, String nombre) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == id && pedidoList.get(i).getNombre().equals(nombre)) {
                pedidoList.remove(i);
            }
        }
    }

    public void hacerPedido(int id, String fecha,Cliente cliente, Producto producto, int cantidad, double precioTotal) {
        Venta pedido = new Venta(id, fecha, cliente, producto, cantidad, precioTotal);
        pedidoList.add(pedido);
    }

    public void mostrarPedidos() {
        for (int i = 0; i < pedidoList.size(); i++) {
            System.out.println(pedidoList.get(i));
        }
    }

    public void actualizarPedido(Venta pedido) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == pedido.getId()) {
                pedidoList.set(i, pedido);
            }
        }
    }


    public void buscarPedido(String nombre) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getNombre().equals(nombre)) {
                System.out.println(pedidoList.get(i));
            }
        }
    }

    public void buscarPedido(int id) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == id) {
                System.out.println(pedidoList.get(i));
            }
        }
    }

    public boolean existePedido(int id) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    public boolean existePedido(String nombre) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public boolean existePedido(int id, String nombre) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == id && pedidoList.get(i).getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void buscarPedido(int id, String nombre) {
        for (int i = 0; i < pedidoList.size(); i++) {
            if (pedidoList.get(i).getId() == id && pedidoList.get(i).getNombre().equals(nombre)) {
                System.out.println(pedidoList.get(i));
            }
        }
    }

    public void inicializarPedidos(GestorPedidos self) {
        GestorClientes gestorClientes = new GestorClientes();
        GestorProductos gestorProductos = new GestorProductos();
        gestorClientes.inicializarClientes(gestorClientes);
        gestorProductos.inicializarProductos(gestorProductos);
        Venta pedido1 = new Venta(gestorId.assignId() , "01/01/2020", gestorClientes.obtenerClientes().get(0), gestorProductos.obtenerProductos().get(0), 1, 10);
        Venta pedido2 = new Venta(gestorId.assignId(), "02/02/2020", gestorClientes.obtenerClientes().get(1), gestorProductos.obtenerProductos().get(1), 2, 20);
        Venta pedido3 = new Venta(gestorId.assignId(), "03/03/2020", gestorClientes.obtenerClientes().get(0), gestorProductos.obtenerProductos().get(0), 3, 30);
        Venta pedido4 = new Venta(gestorId.assignId(), "04/04/2020", gestorClientes.obtenerClientes().get(1), gestorProductos.obtenerProductos().get(1), 4, 40);
        Venta pedido5 = new Venta(gestorId.assignId(), "05/05/2020", gestorClientes.obtenerClientes().get(1), gestorProductos.obtenerProductos().get(1), 5, 50);
        self.addPedido(pedido1);
        self.addPedido(pedido2);
        self.addPedido(pedido3);
        self.addPedido(pedido4);
        self.addPedido(pedido5);
    }

}
