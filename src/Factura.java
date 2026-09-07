import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private String idFactura;
    private double montoTotal;
    private LocalDateTime fecha;
    private Cliente cliente;

    public Factura(double montoTotal, Cliente cliente) {
        this.idFactura = UUID.randomUUID().toString();
        this.montoTotal = montoTotal;
        this.fecha = LocalDateTime.now();
        this.cliente = cliente;
    }

    public Factura() {
        this.idFactura = UUID.randomUUID().toString();
        this.fecha = LocalDateTime.now();
    }

    public String getIdFactura() {
        return idFactura;
    }


    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /* El tipo Factura debe contar con un método que calcule el monto final luego de aplicarle
       el descuento que posee el cliente.
     */

    public double calcularMontoFinal (){
        double descuento= montoTotal*(cliente.getPorcentajeDescuento()/100);

        return this.montoTotal=montoTotal-descuento;

    }

}
