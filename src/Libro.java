public class Libro {
    private String titulo;
    private double precic;
    private int stock;
    private Autor nombreAutor;

    public Libro(String titulo, double precic, int stock, Autor nombreAutor) {
        this.titulo = titulo;
        this.precic = precic;
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

    public double getPrecic() {
        return precic;
    }

    public void setPrecic(double precic) {
        this.precic = precic;
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
}
