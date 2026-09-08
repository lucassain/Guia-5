public class Persona {
    private final int DNI;
    private String nombre;
    private String email;
    private String direccion;

    // Constructor con DNI obligatorio
    public Persona(int DNI, String nombre, String email, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    // Constructor por defecto
    public Persona() {
        this.DNI = 0;
    }

    public int getDNI() { // ❌ Se eliminó 'static'
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}