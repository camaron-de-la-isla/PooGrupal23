public class Main {
    public static void main(String[] args) {
        PasarelaAuthentificacion p = new PasarelaAuthentificacion();
        Object usuarioObjeto = p.autentificar();

        if(usuarioObjeto instanceof Cliente) {
            Cliente cliente = (Cliente) usuarioObjeto;
            InterfazCliente interfazCliente = new InterfazCliente();
            interfazCliente.InterfazCli(cliente);
        }
        else if(usuarioObjeto instanceof Empleado) {
            Empleado empleado = (Empleado) usuarioObjeto;
            InterfazEmpleado interfazEmpleado = new InterfazEmpleado();
            interfazEmpleado.InterfazEmp(empleado);
        }
        else {
            System.out.println("Error");
        }

    }
}