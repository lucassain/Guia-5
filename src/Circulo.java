public class Circulo {
    private double radio=1.0;
    private String color= "rojo";
    private final double  PI= 3.141592;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPI() {
        return PI;
    }

    public  double calcularArea(){
    return Math.pow(radio,2)*PI;
    }
}
