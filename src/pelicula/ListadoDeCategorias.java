package src.pelicula;

import src.tienda.*;

public class ListadoDeCategorias {

    private Categoria[] listado;
    private int contCategorias;

    public ListadoDeCategorias(int tamano){
        listado = new Categoria[tamano];
        contCategorias = 0;
    }

    public void agregarCategoria(){
        String nombre = IngresoDatos.getTexto("Ingresa el nombre de la categoria");
        Categoria nueva = new Categoria(nombre);
        listado[contCategorias] = nueva;
        contCategorias++;
    }

    public void mostrarCategorias(){
        System.out.println("\nCategorias:");
        for (int i = 0;i < contCategorias;i++){
            System.out.println((i+1)+"."+listado[i].getNombre());
        }
    }

    public void mostrarPeliculasPorCategoria(){
        System.out.println("\nPelículas por categoría:");
        for (int k = 0;k < contCategorias;k++){
            System.out.println(listado[k].getNombre()+": "+listado[k].getPeliculasDeEsteGenero());
        }
    }

    public Categoria getCategoria(int indice){
        return listado[indice];
    }

    public Categoria[] getListado() {
        return listado;
    }

    public void setListado(Categoria[] listado) {
        this.listado = listado;
    }
}
