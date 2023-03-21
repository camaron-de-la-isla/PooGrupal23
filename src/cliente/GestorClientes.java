package cliente;

import java.util.ArrayList;
import java.util.List;
public class GestorClientes {
    private static List<Cliente> clienteList;
    public GestorClientes() {
        clienteList = new ArrayList<>();
    }

    public void addCliente(Cliente cliente) {
        clienteList.add(cliente);
    }

    public List<Cliente> obtenerClientes() {
        return clienteList;
    }

    public static void removeCliente(Cliente cliente) {
        clienteList.remove(cliente);
    }



    public void actualizarCliente(Cliente cliente) {
        for (int i = 0; i < clienteList.size(); i++) {
            if (clienteList.get(i).getDni().equals(cliente.getDni())) {
                clienteList.set(i, cliente);
            }
        }
    }

    public void inicializarClientes(GestorClientes self) {
        Cliente cliente1 = new Cliente("Juan", "Pérez", "12345678A", "Calle 1", "123456789", "juan@gmail.com", "juan", "1234");
        Cliente cliente2 = new Cliente("Ana", "García", "87654321B", "Calle 2", "987654321", "ana@gmail.com", "ana", "4321");
        self.addCliente(cliente1);
        self.addCliente(cliente2);
    }

    public Cliente obtenerCliente(String user) {
        for (int i = 0; i < clienteList.size(); i++) {
            if (clienteList.get(i).getUsuario().equals(user)) {
                return clienteList.get(i);
            }
        }
        return null;
    }
    public boolean comprobarCliente(String usuario, String contraseña) {
        for (int i = 0; i < clienteList.size(); i++) {
            if (clienteList.get(i).getUsuario().equals(usuario) && clienteList.get(i).getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    public boolean existeUsuario(String usuario) {
        for (int i = 0; i < clienteList.size(); i++) {
            if (clienteList.get(i).getUsuario().equals(usuario)) {
                return true;
            }
        }
        return false;
    }

}
