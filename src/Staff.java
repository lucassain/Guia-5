public class Staff extends Persona {
    private double salario;
    private String turno;

    public Staff(int DNI, String nombre, String email, String direccion, double salario, String turno) {
        super(DNI, nombre, email, direccion); // Se pasa DNI a super
        this.salario = salario;
        this.turno = turno;
    }

    public Staff() {
        super();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}