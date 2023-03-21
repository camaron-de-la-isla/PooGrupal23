package empleado;

import cliente.Cliente;
import producto.*;

import java.util.Scanner;

public class InterfazEmpleado {

    public static void InterfazEmp(Empleado empleadoAuth) {
        GestorId gestorId = new GestorId();
        int sel1;
        Scanner sc = new Scanner(System.in);
        GestorClientes gestorClientes = new GestorClientes();
        GestorEmpleados gestorEmpleados = new GestorEmpleados();
        GestorProductos gestorProductos = new GestorProductos();
        GestorPedidos gestorPedidos = new GestorPedidos();
        gestorClientes.inicializarClientes(gestorClientes);
        gestorEmpleados.inicializarEmpleados(gestorEmpleados);
        gestorProductos.inicializarProductos(gestorProductos);
        gestorPedidos.inicializarPedidos(gestorPedidos);

        boolean bool1 = true;
        while (bool1 == true) {
            System.out.println("Tienda");
            System.out.println("======");
            System.out.println("\n\n\n");
            System.out.println("1. Gestionar clientes");
            System.out.println("2. Gestionar empleados");
            System.out.println("3. Gestionar productos");
            System.out.println("4. Gestionar stock");
            System.out.println("5. Gestionar pedidos");
            System.out.println("6. Hacer pedido");
            System.out.print("Introduce una opción: ");
            sel1 = sc.nextInt();


            switch (sel1) {
                case 1:
                    System.out.println("Gestionar clientes");
                    System.out.println("==================");
                    System.out.println("\n\n\n");
                    System.out.println("1. Añadir cliente");
                    System.out.println("2. Eliminar cliente");
                    System.out.println("3. Modificar cliente");
                    System.out.println("4. Mostrar clientes");
                    System.out.println("5. Volver");
                    System.out.print("Introduce una opción: ");
                    sel1 = sc.nextInt();
                    sc.nextLine();

                    boolean bool2 = true;
                    while (bool2 == true) {
                        switch (sel1) {
                            case 1:
                                System.out.println("Añadir cliente");
                                System.out.println("==============");
                                System.out.println("\n\n\n");
                                System.out.println("Nombre: ");
                                String nombreNuevo = sc.nextLine();
                                System.out.println("Apellidos: ");
                                String apellidosNuevo = sc.nextLine();
                                System.out.println("DNI: ");
                                String dniNuevo = sc.nextLine();
                                System.out.println("Dirección: ");
                                String direccionNuevo = sc.nextLine();
                                System.out.println("Teléfono: ");
                                String telefonoNuevo = sc.nextLine();
                                System.out.println("Email: ");
                                String emailNuevo = sc.nextLine();
                                System.out.println("Usuario: ");
                                String usuarioNuevo = sc.nextLine();
                                System.out.println("Contraseña: ");
                                String contraseñaNuevo = sc.nextLine();
                                Cliente clienteNuevo = new Cliente(nombreNuevo, apellidosNuevo, dniNuevo, direccionNuevo, telefonoNuevo, emailNuevo, usuarioNuevo, contraseñaNuevo);
                                gestorClientes.addCliente(clienteNuevo);
                                System.out.println("Cliente.Cliente añadido correctamente\n\n\n");
                                break;
                            case 2:
                                System.out.println("Eliminar cliente");
                                System.out.println("================");
                                System.out.println("\n\n\n");
                                System.out.println("Usuario: ");
                                String userEliminar = sc.nextLine();
                                if (gestorClientes.existeUsuario(userEliminar) == false) {
                                    System.out.println("El cliente no existe\n\n\n");
                                } else if (gestorClientes.existeUsuario(userEliminar) == true) {
                                    Cliente clienteEliminar = gestorClientes.obtenerCliente(userEliminar);
                                    gestorClientes.removeCliente(clienteEliminar);
                                    System.out.println("Cliente.Cliente eliminado correctamente\n\n\n");

                                }
                                bool2 = false;
                                break;

                            case 3:
                                System.out.println("Modificar cliente");
                                System.out.println("=================");
                                System.out.println("\n\n\n");
                                System.out.println("DNI: ");
                                String dniModificar = sc.nextLine();
                                Cliente clienteModificar = gestorClientes.obtenerCliente(dniModificar);
                                System.out.println("Datos del cliente a modificar: ");
                                System.out.println("Nombre: " + clienteModificar.getNombre());
                                System.out.println("Apellidos: " + clienteModificar.getApellidos());
                                System.out.println("DNI: " + clienteModificar.getDni());
                                System.out.println("Dirección: " + clienteModificar.getDireccion());
                                System.out.println("Teléfono: " + clienteModificar.getTelefono());
                                System.out.println("Email: " + clienteModificar.getEmail());
                                System.out.println("Usuario: " + clienteModificar.getUsuario());
                                System.out.println("Contraseña: " + clienteModificar.getContraseña());
                                System.out.println("¿Desea modificar los datos del cliente? (S/N)");
                                String respuesta = sc.nextLine();
                                if (respuesta.equals("S")) {
                                    System.out.println("Nombre: ");
                                    String nombre = sc.nextLine();
                                    System.out.println("Apellidos: ");
                                    String apellidos = sc.nextLine();
                                    System.out.println("DNI: ");
                                    String dni = sc.nextLine();
                                    System.out.println("Dirección: ");
                                    String direccion = sc.nextLine();
                                    System.out.println("Teléfono: ");
                                    String telefono = sc.nextLine();
                                    System.out.println("Email: ");
                                    String email = sc.nextLine();
                                    System.out.println("Usuario: ");
                                    String usuario = sc.nextLine();
                                    System.out.println("Contraseña: ");
                                    String contraseña = sc.nextLine();
                                    Cliente cliente = new Cliente(nombre, apellidos, dni, direccion, telefono, email, usuario, contraseña);
                                    gestorClientes.removeCliente(clienteModificar);
                                    gestorClientes.addCliente(cliente);
                                    System.out.println("Cliente.Cliente modificado correctamente\n\n\n");
                                } else {
                                    System.out.println("Operación cancelada\n\n\n");
                                }
                                break;
                            case 4:
                                System.out.println("Mostrar clientes");
                                System.out.println("================");
                                System.out.println("\n\n\n");
                                gestorClientes.obtenerClientes();
                                break;
                            case 5:
                                System.out.println("Volver");
                                System.out.println("======");
                                bool2 = false;
                                System.out.println("\n\n\n");
                                break;

                        }
                    }
                    break;

                case 2:
                    boolean bool3 = true;
                    while (bool3 == true) {
                        System.out.println("Gestionar empleados");
                        System.out.println("===================");
                        if (empleadoAuth.getPrivilegios() == true) {
                            System.out.println("\n\n\n");
                            System.out.println("1. Añadir empleado");
                            System.out.println("2. Eliminar empleado");
                            System.out.println("3. Modificar empleado");
                            System.out.println("4. Mostrar empleados");
                            System.out.println("5. Volver");
                            System.out.print("Introduce una opción: ");
                            int sel2 = sc.nextInt();


                            switch (sel2) {
                                case 1:
                                    System.out.println("Añadir empleado");
                                    System.out.println("===============");
                                    System.out.println("\n\n\n");
                                    System.out.println("Nombre: ");
                                    String nombreNuevo2 = sc.nextLine();
                                    System.out.println("Apellidos: ");
                                    String apellidosNuevo2 = sc.nextLine();
                                    System.out.println("DNI: ");
                                    String dniNuevo2 = sc.nextLine();
                                    System.out.println("Dirección: ");
                                    String direccionNuevo2 = sc.nextLine();
                                    System.out.println("Teléfono: ");
                                    String telefonoNuevo2 = sc.nextLine();
                                    System.out.println("Email: ");
                                    String emailNuevo2 = sc.nextLine();
                                    System.out.println("Puesto: ");
                                    String puestoNuevo2 = sc.nextLine();
                                    System.out.println("Salario: ");
                                    double salarioNuevo2 = sc.nextDouble();
                                    System.out.println("Contraseña: ");
                                    String contraseñaNuevo2 = sc.nextLine();
                                    System.out.println("¿Tiene privilegios? (S/N)");
                                    String privilegiosNuevo2 = sc.nextLine();
                                    boolean privilegiosNuevoBoolean = false;
                                    if (privilegiosNuevo2.equals("S")) {
                                        privilegiosNuevoBoolean = true;
                                    }
                                    Empleado empleadoNuevo = new Empleado(nombreNuevo2, apellidosNuevo2, dniNuevo2, direccionNuevo2, telefonoNuevo2, emailNuevo2, puestoNuevo2, salarioNuevo2, contraseñaNuevo2, privilegiosNuevoBoolean);
                                    gestorEmpleados.addEmpleado(empleadoNuevo);
                                    System.out.println("Empleado.Empleado añadido correctamente\n\n\n");
                                    break;
                                case 2:
                                    System.out.println("Eliminar empleado");
                                    System.out.println("=================");
                                    System.out.println("\n\n\n");
                                    System.out.println("DNI: ");
                                    String dniEliminar = sc.nextLine();
                                    Empleado empleadoEliminar = gestorEmpleados.buscarEmpleado(dniEliminar);
                                    gestorEmpleados.removeEmpleado(empleadoEliminar);
                                    System.out.println("Empleado.Empleado eliminado correctamente\n\n\n");
                                    break;
                                case 3:
                                    System.out.println("Modificar empleado");
                                    System.out.println("==================");
                                    System.out.println("\n\n\n");
                                    System.out.println("DNI: ");
                                    String dniModificar2 = sc.nextLine();
                                    Empleado empleadoModificar = gestorEmpleados.buscarEmpleado(dniModificar2);
                                    System.out.println("Datos del empleado a modificar: ");
                                    System.out.println("Nombre: " + empleadoModificar.getNombre());
                                    System.out.println("Apellidos: " + empleadoModificar.getApellidos());
                                    System.out.println("DNI: " + empleadoModificar.getDni());
                                    System.out.println("Dirección: " + empleadoModificar.getDireccion());
                                    System.out.println("Teléfono: " + empleadoModificar.getTelefono());
                                    System.out.println("Email: " + empleadoModificar.getEmail());
                                    System.out.println("Contraseña: " + empleadoModificar.getContraseña());
                                    System.out.println("¿Desea modificar los datos del empleado? (S/N)");
                                    String respuesta2 = sc.nextLine();
                                    if (respuesta2.equals("S")) {
                                        System.out.println("Nombre: ");
                                        String nombre = sc.nextLine();
                                        System.out.println("Apellidos: ");
                                        String apellidos = sc.nextLine();
                                        System.out.println("DNI: ");
                                        String dni = sc.nextLine();
                                        System.out.println("Dirección: ");
                                        String direccion = sc.nextLine();
                                        System.out.println("Teléfono: ");
                                        String telefono = sc.nextLine();
                                        System.out.println("Email: ");
                                        String email = sc.nextLine();
                                        System.out.println("Puesto: ");
                                        String puesto = sc.nextLine();
                                        System.out.println("Salario: ");
                                        double salario = sc.nextDouble();
                                        System.out.println("Contraseña: ");
                                        String contraseña = sc.nextLine();
                                        System.out.println("¿Tiene privilegios? (S/N)");
                                        String privilegios = sc.nextLine();
                                        boolean privilegiosBoolean = false;
                                        if (privilegios.equals("S")) {
                                            privilegiosBoolean = true;
                                        }
                                        Empleado empleado2 = new Empleado(nombre, apellidos, dni, direccion, telefono, email, puesto, salario, contraseña, privilegiosBoolean);
                                        gestorEmpleados.removeEmpleado(empleadoModificar);
                                        gestorEmpleados.addEmpleado(empleado2);
                                        System.out.println("Empleado.Empleado modificado correctamente\n\n\n");
                                    } else {
                                        System.out.println("Operación cancelada\n\n\n");
                                    }
                                    break;

                                case 4:
                                    System.out.println("Mostrar empleados");
                                    System.out.println("================");
                                    System.out.println("\n\n\n");
                                    break;

                                case 5:
                                    System.out.println("Volver");
                                    System.out.println("======");
                                    bool3 = false;
                                    System.out.println("\n\n\n");
                                    break;


                            }
                        }
                    }

                    break;

                case 3:
                    boolean bool4 = true;
                    while (bool4) {
                        System.out.println("Gestionar Productos");
                        System.out.println("===================");
                        System.out.println("\n\n\n");
                        System.out.println("1. Añadir producto");
                        System.out.println("2. Eliminar producto");
                        System.out.println("3. Modificar producto");
                        System.out.println("4. Mostrar productos");
                        System.out.println("5. Volver");
                        System.out.println("Elige una opción: ");
                        int opcion3 = sc.nextInt();


                        switch (opcion3) {
                            case 1:
                                System.out.println("Añadir producto");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                System.out.println("Que tipo de producto quieres añadir? ");
                                System.out.println("1. Productos.Altavoz");
                                System.out.println("2. Productos.Ordenador");
                                System.out.println("3. Productos.Smartphone");
                                System.out.println("4. Productos.Televisor");
                                System.out.println("Elige una opción: ");
                                int opcion31 = sc.nextInt();
                                boolean bool5 = true;
                                while (bool5) {
                                    switch (opcion31) {
                                        case 1:
                                            System.out.println("Añadir altavoz");
                                            System.out.println("==============");
                                            System.out.println("\n\n\n");
                                            System.out.println("Nombre: ");
                                            String nombreAltavoz = sc.nextLine();
                                            System.out.println("Precio: ");
                                            double precioAltavoz = sc.nextDouble();
                                            System.out.println("Stock: ");
                                            int stockAltavoz = sc.nextInt();
                                            System.out.println("Potencia: ");
                                            int potenciaAltavoz = sc.nextInt();
                                            System.out.println("Marca: ");
                                            String marcaAltavoz = sc.nextLine();
                                            System.out.println("Modelo: ");
                                            String modeloAltavoz = sc.nextLine();
                                            System.out.println("Color: ");
                                            String colorAltavoz = sc.nextLine();
                                            Altavoz altavoz = new Altavoz(gestorId.assignId(), nombreAltavoz, precioAltavoz, stockAltavoz, potenciaAltavoz, marcaAltavoz, modeloAltavoz, colorAltavoz);
                                            gestorProductos.addProducto(altavoz);
                                            System.out.println("Productos.Altavoz añadido correctamente\n\n\n");
                                            break;
                                        case 2:
                                            System.out.println("Añadir ordenador");
                                            System.out.println("===============");
                                            System.out.println("\n\n\n");
                                            System.out.println("Nombre: ");
                                            String nombreOrdenador = sc.nextLine();
                                            System.out.println("Precio: ");
                                            double precioOrdenador = sc.nextDouble();
                                            System.out.println("Stock: ");
                                            int stockOrdenador = sc.nextInt();
                                            System.out.println("RAM: ");
                                            int ramOrdenador = sc.nextInt();
                                            System.out.println("Marca: ");
                                            System.out.println("Almacenamiento: ");
                                            int almacenamientoOrdenador = sc.nextInt();
                                            System.out.println("Sistemas operativos: ");
                                            String sistemasOperativosOrdenador = sc.nextLine();
                                            System.out.println("Marca: ");
                                            String marcaOrdenador = sc.nextLine();
                                            System.out.println("Modelo: ");
                                            String modeloOrdenador = sc.nextLine();
                                            System.out.println("Color: ");
                                            String colorOrdenador = sc.nextLine();
                                            Ordenador ordenador = new Ordenador(gestorId.assignId(), nombreOrdenador, precioOrdenador, stockOrdenador, ramOrdenador, almacenamientoOrdenador, sistemasOperativosOrdenador, marcaOrdenador, modeloOrdenador, colorOrdenador);
                                            gestorProductos.addProducto(ordenador);
                                            System.out.println("Productos.Ordenador añadido correctamente\n\n\n");
                                            break;

                                        case 3:
                                            System.out.println("Añadir smartphone");
                                            System.out.println("=================");
                                            System.out.println("\n\n\n");
                                            System.out.println("Nombre: ");
                                            String nombreSmartphone = sc.nextLine();
                                            System.out.println("Precio: ");
                                            double precioSmartphone = sc.nextDouble();
                                            System.out.println("Stock: ");
                                            int stockSmartphone = sc.nextInt();
                                            System.out.println("RAM: ");
                                            int ramSmartphone = sc.nextInt();
                                            System.out.println("Almacenamiento: ");
                                            int almacenamientoSmartphone = sc.nextInt();
                                            System.out.println("Sistema operativo: ");
                                            String sistemaOperativoSmarthpone = sc.nextLine();
                                            System.out.println("Marca: ");
                                            String marcaSmartphone = sc.nextLine();
                                            System.out.println("Modelo: ");
                                            String modeloSmartphone = sc.nextLine();
                                            System.out.println("Color: ");
                                            String colorSmartphone = sc.nextLine();
                                            Smartphone smartphone = new Smartphone(gestorId.assignId(), nombreSmartphone, precioSmartphone, stockSmartphone, ramSmartphone, almacenamientoSmartphone, sistemaOperativoSmarthpone, marcaSmartphone, modeloSmartphone, colorSmartphone);
                                            gestorProductos.addProducto(smartphone);
                                            System.out.println("Productos.Smartphone añadido correctamente\n\n\n");
                                            break;

                                        case 4:
                                            System.out.println("Añadir televisor");
                                            System.out.println("================");
                                            System.out.println("\n\n\n");
                                            System.out.println("Nombre: ");
                                            String nombreTelevisor = sc.nextLine();
                                            System.out.println("Precio: ");
                                            double precioTelevisor = sc.nextDouble();
                                            System.out.println("Stock: ");
                                            int stockTelevisor = sc.nextInt();
                                            System.out.println("Pulgadas: ");
                                            int pulgadasTelevisor = sc.nextInt();
                                            System.out.println("Marca: ");
                                            String marcaTelevisor = sc.nextLine();
                                            System.out.println("Modelo: ");
                                            String modeloTelevisor = sc.nextLine();
                                            System.out.println("Color: ");
                                            String colorTelevisor = sc.nextLine();
                                            Televisor televisor = new Televisor(gestorId.assignId(), nombreTelevisor, precioTelevisor, stockTelevisor, pulgadasTelevisor, marcaTelevisor, modeloTelevisor, colorTelevisor);
                                            gestorProductos.addProducto(televisor);
                                            System.out.println("Productos.Televisor añadido correctamente\n\n\n");
                                            break;


                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                }
                                break;

                            case 2:
                                System.out.println("Eliminar producto");
                                System.out.println("=================");
                                System.out.println("\n\n\n");
                                System.out.println("Que tipo de producto quieres eliminar? ");
                                System.out.println("1. Productos.Altavoz");
                                System.out.println("2. Productos.Ordenador");
                                System.out.println("3. Productos.Smartphone");
                                System.out.println("4. Productos.Televisor");
                                System.out.println("Elige una opción: ");
                                int opcion32 = sc.nextInt();

                                boolean bool6 = true;
                                while (bool6) {
                                    switch (opcion32) {
                                        case 1:
                                            System.out.println("Eliminar altavoz");
                                            System.out.println("==============");
                                            System.out.println("\n\n\n");
                                            System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                            System.out.println("Nombre: ");
                                            String nombreAltavozEliminar = sc.nextLine();
                                            System.out.println("ID: ");
                                            int idAltavozEliminar = sc.nextInt();
                                            if (nombreAltavozEliminar.equals("") && idAltavozEliminar == 0) {
                                                System.out.println("No has introducido ningún dato");
                                                break;
                                            } else if (nombreAltavozEliminar.equals("") && idAltavozEliminar != 0) {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getId() == idAltavozEliminar) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Altavoz eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el altavoz");
                                                        break;
                                                    }
                                                }
                                            } else if (!nombreAltavozEliminar.equals("") && idAltavozEliminar == 0) {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreAltavozEliminar)) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Altavoz eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el altavoz");
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreAltavozEliminar) && gestorProductos.obtenerProductos().get(i).getId() == idAltavozEliminar) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Altavoz eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el altavoz");
                                                        break;
                                                    }
                                                }

                                            }
                                            break;
                                        case 2:
                                            System.out.println("Eliminar ordenador");
                                            System.out.println("===============");
                                            System.out.println("\n\n\n");
                                            System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                            System.out.println("Nombre: ");
                                            String nombreEliminar = sc.nextLine();
                                            System.out.println("ID: ");
                                            int idEliminar = sc.nextInt();
                                            if (nombreEliminar.equals("") && idEliminar == 0) {
                                                System.out.println("No has introducido ningún dato");
                                                break;
                                            } else if (nombreEliminar.equals("") && idEliminar != 0) {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getId() == idEliminar) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Ordenador eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el ordenador");
                                                        break;
                                                    }
                                                }
                                            } else if (!nombreEliminar.equals("") && idEliminar == 0) {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreEliminar)) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Ordenador eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el ordenador");
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreEliminar) && gestorProductos.obtenerProductos().get(i).getId() == idEliminar) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Ordenador eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el ordenador");
                                                        break;
                                                    }
                                                }

                                            }
                                            break;


                                        case 3:
                                            System.out.println("Eliminar smartphone");
                                            System.out.println("===============");
                                            System.out.println("\n\n\n");
                                            System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                            System.out.println("Nombre: ");
                                            String nombreEliminar2 = sc.nextLine();
                                            System.out.println("ID: ");
                                            int idEliminar2 = sc.nextInt();
                                            if (nombreEliminar2.equals("") && idEliminar2 == 0) {
                                                System.out.println("No has introducido ningún dato");
                                                break;
                                            } else if (nombreEliminar2.equals("") && idEliminar2 != 0) {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getId() == idEliminar2) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Smartphone eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el smartphone");
                                                        break;
                                                    }
                                                }
                                            } else if (!nombreEliminar2.equals("") && idEliminar2 == 0) {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreEliminar2)) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Smartphone eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el smartphone");
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreEliminar2) && gestorProductos.obtenerProductos().get(i).getId() == idEliminar2) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Smartphone eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el smartphone");
                                                        break;
                                                    }
                                                }

                                            }
                                            break;

                                        case 4:
                                            System.out.println("Eliminar televisor");
                                            System.out.println("===============");
                                            System.out.println("\n\n\n");
                                            System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                            System.out.println("Nombre: ");
                                            String nombreEliminar3 = sc.nextLine();
                                            System.out.println("ID: ");
                                            int idEliminar3 = sc.nextInt();
                                            if (nombreEliminar3.equals("") && idEliminar3 == 0) {
                                                System.out.println("No has introducido ningún dato");
                                                break;
                                            } else if (nombreEliminar3.equals("") && idEliminar3 != 0) {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getId() == idEliminar3) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Televisor eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el televisor");
                                                        break;
                                                    }
                                                }
                                            } else if (!nombreEliminar3.equals("") && idEliminar3 == 0) {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreEliminar3)) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Televisor eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el televisor");
                                                        break;
                                                    }
                                                }
                                            } else {
                                                for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                                    if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreEliminar3) && gestorProductos.obtenerProductos().get(i).getId() == idEliminar3) {
                                                        gestorProductos.obtenerProductos().remove(i);
                                                        System.out.println("Productos.Televisor eliminado correctamente");
                                                        break;
                                                    } else {
                                                        System.out.println("No se ha encontrado el televisor");
                                                        break;
                                                    }
                                                }

                                            }
                                            break;

                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }
                                }
                                break;


                            case 3:
                                System.out.println("Modificar producto");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                System.out.println("Nombre: ");
                                String nombreModificar = sc.nextLine();
                                System.out.println("ID: ");
                                int idModificar = sc.nextInt();
                                if (nombreModificar.equals("") && idModificar == 0) {
                                    System.out.println("No has introducido ningún dato");
                                    break;
                                } else if (nombreModificar.equals("") && idModificar != 0) {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getId() == idModificar) {
                                            System.out.println("Introduce el nuevo nombre: ");
                                            String nuevoNombre = sc.nextLine();
                                            gestorProductos.obtenerProductos().get(i).setNombre(nuevoNombre);
                                            System.out.println("Productos.Producto modificado correctamente");
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                } else if (!nombreModificar.equals("") && idModificar == 0) {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreModificar)) {
                                            System.out.println("Introduce el nuevo ID: ");
                                            int nuevoId = sc.nextInt();
                                            gestorProductos.obtenerProductos().get(i).setId(nuevoId);
                                            System.out.println("Productos.Producto modificado correctamente");
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                } else {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreModificar) && gestorProductos.obtenerProductos().get(i).getId() == idModificar) {
                                            System.out.println("Introduce el nuevo nombre: ");
                                            String nuevoNombre = sc.nextLine();
                                            gestorProductos.obtenerProductos().get(i).setNombre(nuevoNombre);
                                            System.out.println("Introduce el nuevo ID: ");
                                            int nuevoId = sc.nextInt();
                                            gestorProductos.obtenerProductos().get(i).setId(nuevoId);
                                            System.out.println("Productos.Producto modificado correctamente");
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("Mostrar productos");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                System.out.println("Nombre: ");
                                String nombreMostrar = sc.nextLine();
                                System.out.println("ID: ");
                                int idMostrar = sc.nextInt();
                                if (nombreMostrar.equals("") && idMostrar == 0) {
                                    System.out.println("No has introducido ningún dato");
                                    break;
                                } else if (nombreMostrar.equals("") && idMostrar != 0) {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getId() == idMostrar) {
                                            System.out.println(gestorProductos.obtenerProductos().get(i));
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                } else if (!nombreMostrar.equals("") && idMostrar == 0) {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreMostrar)) {
                                            System.out.println(gestorProductos.obtenerProductos().get(i));
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                } else {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreMostrar) && gestorProductos.obtenerProductos().get(i).getId() == idMostrar) {
                                            System.out.println(gestorProductos.obtenerProductos().get(i));
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 5:
                                System.out.println("Voler");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                break;

                            default:
                                System.out.println("Opción incorrecta");
                                break;
                        }
                    }

                    break;

                case 4:
                    System.out.println("Gestionar Stock");
                    System.out.println("===============");
                    System.out.println("\n\n\n");
                    System.out.println("1. Modificar stock");
                    System.out.println("2. Mostrar stock");
                    System.out.println("3. Volver");
                    System.out.println("Elige una opción: ");
                    int opcionGestionarStock = sc.nextInt();

                    boolean bool7 = true;
                    while (bool7 == true) {
                        switch (opcionGestionarStock) {
                            case 1:
                                System.out.println("Modificar stock");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                System.out.println("Nombre: ");
                                String nombreModificarStock = sc.nextLine();
                                System.out.println("ID: ");
                                int idModificarStock = sc.nextInt();
                                if (nombreModificarStock.equals("") && idModificarStock == 0) {
                                    System.out.println("No has introducido ningún dato");
                                    break;
                                } else if (nombreModificarStock.equals("") && idModificarStock != 0) {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getId() == idModificarStock) {
                                            System.out.println("Introduce el nuevo stock: ");
                                            int nuevoStock = sc.nextInt();
                                            gestorProductos.obtenerProductos().get(i).setStock(nuevoStock);
                                            System.out.println("Stock modificado correctamente");
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                } else if (!nombreModificarStock.equals("") && idModificarStock == 0) {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreModificarStock)) {
                                            System.out.println("Introduce el nuevo stock: ");
                                            int nuevoStock = sc.nextInt();
                                            gestorProductos.obtenerProductos().get(i).setStock(nuevoStock);
                                            System.out.println("Stock modificado correctamente");
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                } else {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreModificarStock) && gestorProductos.obtenerProductos().get(i).getId() == idModificarStock) {
                                            System.out.println("Introduce el nuevo stock: ");
                                            int nuevoStock = sc.nextInt();
                                            gestorProductos.obtenerProductos().get(i).setStock(nuevoStock);
                                            System.out.println("Stock modificado correctamente");
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                System.out.println("Mostrar stock");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                System.out.println("Nombre: ");
                                String nombreMostrarStock = sc.nextLine();
                                System.out.println("ID: ");
                                int idMostrarStock = sc.nextInt();
                                if (nombreMostrarStock.equals("") && idMostrarStock == 0) {
                                    System.out.println("No has introducido ningún dato");
                                    break;
                                } else if (nombreMostrarStock.equals("") && idMostrarStock != 0) {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getId() == idMostrarStock) {
                                            System.out.println(gestorProductos.obtenerProductos().get(i));
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                } else if (!nombreMostrarStock.equals("") && idMostrarStock == 0) {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreMostrarStock)) {
                                            System.out.println(gestorProductos.obtenerProductos().get(i));
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                } else {
                                    for (int i = 0; i < gestorProductos.obtenerProductos().size(); i++) {
                                        if (gestorProductos.obtenerProductos().get(i).getNombre().equals(nombreMostrarStock) && gestorProductos.obtenerProductos().get(i).getId() == idMostrarStock) {
                                            System.out.println(gestorProductos.obtenerProductos().get(i));
                                            break;
                                        } else {
                                            System.out.println("No se ha encontrado el producto");
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Volver");
                                System.out.println("===============");
                                bool7 = false;
                                System.out.println("\n\n\n");
                                break;

                            default:
                                System.out.println("Opción incorrecta");
                                break;


                        }
                    }

                    break;

                case 5:
                    System.out.println("Gestionar Pedidos");
                    System.out.println("===============");
                    System.out.println("\n\n\n");
                    System.out.println("1. Mostrar pedidos");
                    System.out.println("2. Eliminar pedido");
                    System.out.println("3. Mostrar todos los pedidos");
                    System.out.println("4. Volver");
                    System.out.println("Elige una opción: ");
                    int opcionGestionarPedidos = sc.nextInt();
                    boolean bool8 = true;
                    while (bool8 == true) {
                        switch (opcionGestionarPedidos) {
                            case 1:
                                System.out.println("Mostrar pedidos");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                System.out.println("Nombre: ");
                                String nombreMostrarPedido = sc.nextLine();
                                System.out.println("ID: ");
                                int idMostrarPedido = sc.nextInt();
                                if (nombreMostrarPedido.equals("") && idMostrarPedido == 0) {
                                    System.out.println("No has introducido ningún dato");
                                    break;
                                } else if (nombreMostrarPedido.equals("") && idMostrarPedido != 0) {
                                    gestorPedidos.buscarPedido(idMostrarPedido);
                                    break;
                                } else if (!nombreMostrarPedido.equals("") && idMostrarPedido == 0) {
                                    gestorPedidos.buscarPedido(nombreMostrarPedido);
                                    break;
                                } else {
                                    gestorPedidos.buscarPedido(idMostrarPedido, nombreMostrarPedido);
                                    break;
                                }
                            case 2:
                                System.out.println("Eliminar pedido");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                                System.out.println("Nombre: ");
                                String nombreEliminarPedido = sc.nextLine();
                                System.out.println("ID: ");
                                int idEliminarPedido = sc.nextInt();
                                if (nombreEliminarPedido.equals("") && idEliminarPedido == 0) {
                                    System.out.println("No has introducido ningún dato");
                                    break;
                                } else if (nombreEliminarPedido.equals("") && idEliminarPedido != 0) {
                                    gestorPedidos.eliminarPedido(idEliminarPedido);
                                    break;
                                } else if (!nombreEliminarPedido.equals("") && idEliminarPedido == 0) {
                                    gestorPedidos.eliminarPedido(nombreEliminarPedido);
                                    break;
                                } else {
                                    gestorPedidos.eliminarPedido(idEliminarPedido, nombreEliminarPedido);
                                    break;
                                }
                            case 3:
                                System.out.println("Mostrar todos los pedidos");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                gestorPedidos.mostrarPedidos();
                                break;

                            case 5:
                                System.out.println("Volver");
                                System.out.println("===============");
                                System.out.println("\n\n\n");
                                bool8 = false;
                                break;

                            default:
                                System.out.println("Opción incorrecta");
                                break;

                        }
                    }
                    break;
                case 6:
                    Producto productoPedido = new Producto();
                    System.out.println("Hacer pedido");
                    System.out.println("===============");
                    System.out.println("\n\n\n");
                    boolean bool9 = true;
                    while(bool9 == true) {
                        System.out.println("Introduce uno o los dos datos. Si no sabes el nombre, dejalo en blanco y solo introduce el ID. Si no sabes el ID, introduce 0 y solo introduce el nombre ");
                        System.out.println("Nombre: ");
                        String nombreProducto = sc.nextLine();
                        System.out.println("ID: ");
                        int idProducto = sc.nextInt();
                        if (nombreProducto.equals("") && idProducto == 0) {
                            System.out.println("No has introducido ningún dato");
                            break;
                        } else if (nombreProducto.equals("") && idProducto != 0) {
                            boolean boolProducto = gestorProductos.existeProducto(idProducto);
                            if (boolProducto == true) {
                                productoPedido = gestorProductos.getProducto(idProducto);
                            } else {
                                System.out.println("No existe el producto");
                            }
                        } else if (!nombreProducto.equals("") && idProducto == 0) {
                            boolean boolProducto = gestorProductos.existeProducto(nombreProducto);
                            if (boolProducto) {
                                productoPedido = gestorProductos.getProducto(nombreProducto);
                            } else {
                                System.out.println("No existe el producto");
                            }
                        } else {
                            boolean boolProducto = gestorProductos.existeProducto(nombreProducto, idProducto);
                            if (boolProducto == true) {
                                productoPedido = gestorProductos.getProducto(nombreProducto, idProducto);
                            } else {
                                System.out.println("No existe el producto");
                            }
                        }

                        System.out.println("Introduce la cantidad: ");
                        int cantidad = sc.nextInt();
                        if (cantidad <= 0) {
                            System.out.println("La cantidad debe ser mayor que 0");
                        }
                        gestorPedidos.hacerPedidoTienda(productoPedido, cantidad);

                        System.out.println("¿Quieres hacer otro pedido? (S/N)");
                        String respuesta = sc.nextLine();
                        if (respuesta.equals("S") || respuesta.equals("s")) {
                            bool9 = true;
                        } else {
                            bool9 = false;
                        }


                    }
            }
            break;
        }
    }
}
