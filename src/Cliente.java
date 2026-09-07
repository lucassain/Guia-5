import java.util.UUID;

public class Cliente {
    private String ID;
    private String nombre;
    private String email;
    private double porcentajeDescuento;

    public Cliente(String nombre, String email, double porcentajeDescuento) {
        this.ID = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.email = email;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Cliente() {
        this.ID = UUID.randomUUID().toString();
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

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
