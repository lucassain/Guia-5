public class Cilindro extends Circulo{
    private double altura=1.0;

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public Cilindro(double altura) {
        this.altura = altura;
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public Cilindro() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen (){
        return super.calcularArea()*altura;
    }

    @Override
    public double calcularArea() {
        double areaBase=super.calcularArea();
        return (2*getPI()*getRadio()*altura)+(2*areaBase);
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.print("Cilindro: subclase de ");
        super.mostrarCaracteristicas();
        System.out.println("Altura= " + altura);
        System.out.println("Volumen= "+calcularVolumen());
    }
}
