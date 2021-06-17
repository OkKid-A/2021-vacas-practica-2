package src.pelicula;

import src.tienda.*;

public class CatalogoPeliculas {

    private Pelicula[] peliculas;
    private int contPeliculas;

    public CatalogoPeliculas(){
        peliculas = new Pelicula[100];
        contPeliculas = 0;
    }

    public void agregarPelicula(ListadoDeCategorias categorias){
        String nombre = IngresoDatos.getTexto("Ingresa el nombre de la pelicula");
        int ano = IngresoDatos.getEntero("Ingresa el año de su lanzamiento",false);
        System.out.println("\nEscoge su categoria");
        categorias.mostrarCategorias();
        Categoria categoria = categorias.getCategoria(IngresoDatos.getEntero("",false)-1);
        categoria.agregarPelicula();
        peliculas[contPeliculas] = new Pelicula(100000+contPeliculas,nombre,ano,categoria);
        contPeliculas++;
    }

    public void modificarPelicula(int indice,ListadoDeCategorias categorias){
        Pelicula pelicula = peliculas[indice-1];
        int opcion = IngresoDatos.getEntero("Selecciona el dato que deseas modificar\n1.Nombre\n2.Año\n3.Categoria",false);
        System.out.println();
        switch (opcion){
            case 1:
                pelicula.setNombre(IngresoDatos.getTexto("Ingresa el nuevo nombre"));
                break;
            case 2:
                pelicula.setAno(IngresoDatos.getEntero("Ingresa el nuevo año",false));
                break;
            case 3:
                System.out.println("\nSelecciona la nueva categoria");
                categorias.mostrarCategorias();
                pelicula.setCategoria(categorias.getCategoria(IngresoDatos.getEntero("",false)));
                break;
            default:
                System.out.println("No se reconocio esa opcion");
                modificarPelicula(indice,categorias);
                break;
        }
        System.out.println("\nSe guardaron los cambios");
    }

    public void mostrarPeliculas(){
        for (int k = 0;k < contPeliculas;k++){
            System.out.println("\n"+k+1+"."+peliculas[k].getInfo());
        }
    }

    public void eliminarPelicula(){
        System.out.println("\nEscoge la pelicula que deseas eliminar");
        mostrarPeliculas();
        int eliminada = IngresoDatos.getEntero("",false)-1;
        for (int k = eliminada;k < contPeliculas-1;k++){
            peliculas[k-1]=peliculas[k];
        }
        System.out.println("\nLa pelicula ha sido eliminada");
        contPeliculas--;
    }

    public void ordenarPeliculasPorNombre(boolean ascendente){
        for (int k = 0;k < contPeliculas;k++){
            for (int i = k+1;i < contPeliculas;i++){
                if (ascendente) {
                    if (peliculas[k].getNombre().compareTo(peliculas[i].getNombre())>0){
                        Pelicula temp = peliculas[k];
                        peliculas[k] = peliculas[i];
                        peliculas[i] = temp;
                    }
                } else {
                    if (peliculas[k].getNombre().compareTo(peliculas[i].getNombre())<0){
                        Pelicula temp = peliculas[k];
                        peliculas[k] = peliculas[i];
                        peliculas[i] = temp;
                    }
                }
            }
        }    }
}
