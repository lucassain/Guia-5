public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor nombreAutor;

    public Libro(String titulo, double precio, int stock, Autor nombreAutor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.nombreAutor = nombreAutor;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(Autor nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    void mostrarLibro (){
        System.out.println("Titulo del libro: "+titulo);
        System.out.println("Precio: $ "+precio);
        System.out.println("Stock: "+stock);
        System.out.println("Nombre del autor: "+nombreAutor);
    }
}
