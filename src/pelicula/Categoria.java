package src.pelicula;

public class Categoria {

    private String nombre;
    private int peliculasDeEsteGenero;

    public Categoria(String nombre){
        this.nombre = nombre;
        peliculasDeEsteGenero = 0;
    }

    public void agregarPelicula(){
        peliculasDeEsteGenero++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeliculasDeEsteGenero() {
        return peliculasDeEsteGenero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeliculasDeEsteGenero(int peliculasDeEsteGenero) {
        this.peliculasDeEsteGenero = peliculasDeEsteGenero;
    }
}
