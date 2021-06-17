package src.pelicula;

import java.util.*;

public class Pelicula{

    private int id;
    private String nombre;
    private int ano;
    private Categoria categoria;

    public Pelicula(int id, String nombre, int ano, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.ano = ano;
        this.categoria = categoria;
        categoria.agregarPelicula();
    }

    public String getInfo(){
        return ("Nombre: "+nombre+"\nId: "+id+"\nAño de Lanzamiento: "+ano+"\nCategoria: "+categoria.getNombre());
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAno() {
        return ano;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}