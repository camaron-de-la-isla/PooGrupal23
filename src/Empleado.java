public class Empleado {
    private
    String nombre;
    String apellidos;
    String dni;
    String direccion;
    String telefono;
    String email;
    String puesto;
    double salario;
    String contraseña;
    boolean privilegios;

    public Empleado(String nombre, String apellidos, String dni, String direccion, String telefono, String email, String puesto, double salario, String contraseña, boolean privilegios) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.puesto = puesto;
        this.salario = salario;
        this.contraseña = contraseña;
        privilegios = false;
    }

    public Empleado() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.direccion = "";
        this.telefono = "";
        this.email = "";
        this.puesto = "";
        this.salario = 0.0;
        this.contraseña = "";
        privilegios = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(boolean privilegios) {
        this.privilegios = privilegios;
    }

    @Override
    public String toString() {
        return "Empleado [apellidos=" + apellidos + ", direccion=" + direccion + ", dni=" + dni + ", email=" + email
                + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + ", telefono=" + telefono + "privilegios=" + privilegios +"]";
    }
}
