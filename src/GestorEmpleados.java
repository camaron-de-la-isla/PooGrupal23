import java.util.ArrayList;
import java.util.List;

public class GestorEmpleados {
    private List<Empleado> empleadosList;

    public GestorEmpleados() {
        empleadosList = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado) {
        empleadosList.add(empleado);
    }

    public List<Empleado> obtenerEmpleados() {
        return empleadosList;
    }

    public void removeEmpleado(Empleado empleado) {
        empleadosList.remove(empleado);
    }

    public void actualizarEmpleado(Empleado empleado) {
        for (int i = 0; i < empleadosList.size(); i++) {
            if (empleadosList.get(i).getDni().equals(empleado.getDni())) {
                empleadosList.set(i, empleado);
            }
        }
    }

    public void inicializarEmpleados(GestorEmpleados self) {
        Empleado empleado1 = new Empleado("David", "Garcia", "48146680K", "Calle 1", "123456789", "david@gmail.com", "Cajero", 1500.0, "pass", true);
        Empleado empleado2 = new Empleado("Ana", "García", "87654321D", "Calle 2", "987654321", "anabel@gmail.com", "Cajero", 1000.0, "pass", false);
        self.addEmpleado(empleado1);
        self.addEmpleado(empleado2);
    }

    public boolean comprobarEmpleado(String dni, String password) {
        boolean boolEmpleado = false;
        for (int i = 0; i < empleadosList.size(); i++) {
            if (empleadosList.get(i).getDni().equals(dni) && empleadosList.get(i).getContraseña().equals(password)) {
                boolEmpleado = true;
            }
        }
        return boolEmpleado;
    }

    public Empleado buscarEmpleado(String dni) {
        for (int i = 0; i < empleadosList.size(); i++) {
            if (empleadosList.get(i).getDni().equals(dni)) {
                return empleadosList.get(i);
            }
        }
        return null;
    }
}

