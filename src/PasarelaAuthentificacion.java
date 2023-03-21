import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasarelaAuthentificacion {
    public static Object autentificar(){
        int sel1, sel2;
        String user, pass;
        boolean bool1, bool2, bool3, bool4, bool5;
        Scanner sc = new Scanner(System.in);
        GestorClientes gestorClientes = new GestorClientes();
        GestorEmpleados gestorEmpleados = new GestorEmpleados();
        gestorEmpleados.inicializarEmpleados(gestorEmpleados);
        gestorClientes.inicializarClientes(gestorClientes);

        bool2 = false;
        while (bool2 == false) {
            System.out.println("Tienda");
            System.out.println("======");
            System.out.println("\n\n\n");
            System.out.println("1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Entrar como invitado");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            sel1 = sc.nextInt();
            sc.nextLine();
            switch (sel1) {
                case 1:
                    System.out.println("Iniciar sesión");
                    System.out.println("==============");
                    System.out.println("\n\n\n");
                    System.out.println("Usuario: ");
                    user = sc.nextLine();
                    System.out.println("Contraseña: ");
                    pass = sc.nextLine();

                    if(user.equals("") || pass.equals("")) {

                        System.out.println("Debes introducir un usuario y una contraseña\n\n\n");
                    }

                    String dniPattern = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
                    Pattern pattern = Pattern.compile(dniPattern);
                    Matcher matcher = pattern.matcher(user);

                    if (matcher.matches()) {
                        bool3 = true;
                    }
                    else {
                        bool3 = false;
                    }
                    if(bool3 == false) {
                        bool1 = gestorClientes.comprobarCliente(user, pass);
                        if (bool1 == true) {
                            bool2 = true;
                            return gestorClientes.obtenerCliente(user);
                        } else {
                            System.out.println("Inicio de sesión incorrecto\n\n\n");
                        }
                        break;
                    }
                    else {
                        bool4 = gestorEmpleados.comprobarEmpleado(user, pass);
                        if (bool4 == true) {
                            System.out.println("Inicio de sesión correcto\n\n\n");
                            return gestorEmpleados.buscarEmpleado(user);
                        } else {
                            System.out.println("empleados");
                            System.out.println("Inicio de sesión incorrecto\n\n\n");
                        }
                        break;
                    }
                case 2:
                    System.out.println("Registrarse");
                    System.out.println("===========");
                    System.out.println("\n\n\n");
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
                    System.out.println("Usuario");
                    String usuario = sc.nextLine();
                    System.out.println("Contraseña: ");
                    String contraseña = sc.nextLine();
                    Cliente cliente = new Cliente(nombre, apellidos, dni, direccion, telefono, email, usuario, contraseña);
                    gestorClientes.addCliente(cliente);
                    System.out.println("Registro completado\n\n\n");
                    break;

                case 3:
                    bool5 = true;
                    Cliente invitado = new Cliente("Invitado", "Invitado", "00000000A", "Invitado", "000000000", "Invitado", "Invitado", "Invitado");
                    return invitado;

                case 4:
                    // Salir
                    break;

            }
        }
        return null;
    }
}