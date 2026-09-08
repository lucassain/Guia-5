public class Estudiante extends Persona {
    private int añoIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(int DNI, String nombre, String email, String direccion, int añoIngreso, double cuotaMensual, String carrera) {
        super(DNI, nombre, email, direccion); // Se pasa DNI a super
        this.añoIngreso = añoIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public Estudiante() {
        super();
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}