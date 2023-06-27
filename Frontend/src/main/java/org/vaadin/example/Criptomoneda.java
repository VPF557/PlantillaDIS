package org.vaadin.example;

import com.google.gson.Gson;

public class Criptomoneda
{
    //añadimos id para tener como referencia la posibilidad de que se pida
    private int id;
    private String nombre;
    private double valor;
    private double fluctuacion;
    private String categoria;

    private String popularidad;

    public Criptomoneda(int ind, String nombre, double valor, double fluctuacion, String categoria, String popularidad) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.fluctuacion = fluctuacion;
        this.categoria = categoria;
        this.popularidad = popularidad;
    }

    public Criptomoneda() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return popularidad;
    }

    public void setPopularidad(String popularidad) {
        this.popularidad = popularidad;
    }

    @Override
    public String toString() {
        return "Criptomoneda{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", fluctuacion=" + fluctuacion +
                ", categoria='" + categoria + '\'' +
                ", popularidad='" + popularidad + '\'' +
                '}';
    }

    public String mostrarJson()
    {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
