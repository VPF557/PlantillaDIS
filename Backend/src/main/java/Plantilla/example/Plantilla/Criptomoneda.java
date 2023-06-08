package Plantilla.example.Plantilla;

public class Criptomoneda
{
    private String nombre;
    private double valor;
    private double fluctuacion;
    private String categoria;

    private String Popularidad;

    public Criptomoneda(String nombre, double valor, double fluctuacion, String categoria, String popularidad) {
        this.nombre = nombre;
        this.valor = valor;
        this.fluctuacion = fluctuacion;
        this.categoria = categoria;
        Popularidad = popularidad;
    }

    public Criptomoneda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getFluctuacion() {
        return fluctuacion;
    }

    public void setFluctuacion(double fluctuacion) {
        this.fluctuacion = fluctuacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPopularidad() {
        return Popularidad;
    }

    public void setPopularidad(String popularidad) {
        Popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "Criptomoneda{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", fluctuacion=" + fluctuacion +
                ", categoria='" + categoria + '\'' +
                ", Popularidad='" + Popularidad + '\'' +
                '}';
    }
}
