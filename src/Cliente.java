import java.util.UUID;

public class Cliente {
    private String ID;
    private String nombre;
    private String email;
    private float porcentajeDescuento;

    public Cliente(String ID, String nombre, String email, float porcentajeDescuento) {
        this.ID = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.email = email;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Cliente() {
    }

    public String getID() {
        return ID;
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

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
