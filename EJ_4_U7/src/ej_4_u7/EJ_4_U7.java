

package ej_4_u7;

import ServicioPelis.ServPelis;


public class EJ_4_U7 {

    /**
     * @param args the command line arguments
     * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
    tendremos una clase Pelicula con el título, director y duración de la película (en horas).
    Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
    que se pide a continuación:
    En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
    todos sus datos y guardándolos en el objeto Pelicula.
    Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
    crear otra Pelicula o no.
    Después de ese bucle realizaremos las siguientes acciones:

    • Mostrar en pantalla todas las películas.
    • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    pantalla.
    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
    pantalla.
    • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     */
    public static void main(String[] args) {
        ServPelis sp=new ServPelis();
        sp.fabricaPelicula();
        sp.mostrar();
        sp.mostrarPelisMayores1();
        
        System.out.println("\n------Peliculas ordenadas de menor a mayor (de acuerdo a su duración)------");
        sp.ordenarAsc();
        sp.mostrar();
        System.out.println("------Peliculas ordenadas mayor a menor (de acuerdo a su duración)------");
        sp.ordenarDesc();
        sp.mostrar();
        System.out.println("------Peliculas ordenadas por título------");
        sp.ordenarTitulo();
        sp.mostrar();
        System.out.println("------Peliculas ordenadas por director------");
        sp.ordenarDirector();
        sp.mostrar();
        
    }

}
