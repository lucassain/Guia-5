import java.time.LocalDateTime;

public class Factura {
    private Cliente idCLiente;
    private double montoTotal;
    private LocalDateTime fecha;
    private Cliente cliente;

    public Factura(Cliente idCLiente, double montoTotal, LocalDateTime fecha, Cliente cliente) {
        this.idCLiente = idCLiente.getID();
        this.montoTotal = montoTotal;
        this.fecha = fecha;
        this.cliente = cliente;
    }

}
