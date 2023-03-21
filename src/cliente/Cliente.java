package cliente;

public class Cliente {
    private
    String nombre;
    String apellidos;
    String dni;
    String direccion;
    String telefono;
    String email;
    String usuario;
    String contraseña;

    public Cliente(String nombre, String apellidos, String dni, String direccion, String telefono, String email, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.direccion = "";
        this.telefono = "";
        this.email = "";
        this.usuario = "";
        this.contraseña = "";
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

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }



    @Override
    public String toString() {
        return "Cliente.Cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", direccion=" + direccion
                + ", telefono=" + telefono + ", email=" + email + "usuario=" + usuario + "]";
    }
}
