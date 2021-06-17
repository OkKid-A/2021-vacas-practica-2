package src.tienda;

import src.clientes.*;
import src.pelicula.CatalogoPeliculas;
import src.pelicula.ListadoDeCategorias;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private ListadoDeCategorias listado = new ListadoDeCategorias(50);
    private CatalogoPeliculas catalogo = new CatalogoPeliculas();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Ordenar Clientes Ascente");
            System.out.println("4) Ordenar Clientes Descendente");
            System.out.println("5) Ingresar nueva categoría");
            System.out.println("6) Ingresar nueva película");
            System.out.println("7) Mostrar películas");
            System.out.println("8) Mostar películas por categoría");
            System.out.println("9) Ordenar Películas Ascendentemente");
            System.out.println("10) Ordenar Películas Descendentemente");
            System.out.println("11) Modificar Película");
            System.out.println("12) Eliminar Película");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

            if (menu == 1 ){
                //ingreso de datos
                tablaClientes.agregarCliente();
            }
            if (menu == 2){
                //mostrar clientes
                tablaClientes.mostrarClientes();
            }
            if (menu == 3){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(true);
                tablaClientes.mostrarClientes();
            }
            if (menu == 4){
                //mostrar clientes
                System.out.println("Desordenado:");
                tablaClientes.mostrarClientes();
                System.out.println("\n\nOrdenado:");
                tablaClientes.ordenarPorNombre(false);
                tablaClientes.mostrarClientes();
            }

            if (menu == 5){
                listado.agregarCategoria();
            }

            if (menu == 6){
                catalogo.agregarPelicula(listado);
            }

            if (menu == 7){
                catalogo.mostrarPeliculas();
            }

            if (menu == 8){
                listado.mostrarPeliculasPorCategoria();
            }

            if (menu == 9){
                System.out.println("Desordenado:");
                catalogo.mostrarPeliculas();
                System.out.println("Ordenado: ");
                catalogo.ordenarPeliculasPorNombre(true);
                catalogo.mostrarPeliculas();
            }

            if (menu == 10){
                System.out.println("Desordenado:");
                catalogo.mostrarPeliculas();
                System.out.println("Ordenado: ");
                catalogo.ordenarPeliculasPorNombre(false);
                catalogo.mostrarPeliculas();
            }

            if (menu == 11){
                System.out.println("Selecciona la pelicula a modificar: ");
                catalogo.mostrarPeliculas();
                catalogo.modificarPelicula(IngresoDatos.getEntero("",false),listado);
            }

            if (menu == 12){
                catalogo.eliminarPelicula();
            }
        }

    }

    
}
