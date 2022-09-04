

package ServicioPelis;

import Entidad.Pelicula;
import java.util.*;

/**
 *
 * 
 */
public class ServPelis {
 ArrayList<Pelicula> pelis = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        Pelicula p = new Pelicula();
        System.out.println("Ingrese el titulo de la película");
        p.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del director");
        p.setDirector(leer.next());
        System.out.println("Ingrese la duración de la película");
        p.setHoras(leer.nextFloat());
       
        return p;
    }

    public void agregarPelicula(Pelicula a) {
        pelis.add(a);
    }
     public void fabricaPelicula() {
        System.out.println("-------Creacion peliculas--------");
        do {
            agregarPelicula(crearPelicula());

            System.out.println("¿Queres crear otra película?");
        } while ("si".equals(leer.next().toLowerCase()));
    }

    public void mostrar() {
        System.out.println("\nPELICULAS EN LA LISTA: ");
        pelis.forEach((aux) -> {
            System.out.println(aux.toString());
        });
       // System.out.println("\nCantidad de peliculas en la lista: " + pelis.size() + "\n");
    }
    public void mostrarPelisMayores1(){
        System.out.println("\n-----Películas con una duración mayor a una hora-----");
        for (Pelicula peli : pelis) {
            if (peli.getHoras()>1) {
                System.out.println(peli.toString());
            }
        }
    }
   public void ordenarAsc(){
    Collections.sort(pelis, new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return new Float(t.getHoras()).compareTo(t1.getHoras()); 
        }
     }
    );}
    public void ordenarDesc(){
    Collections.sort(pelis, new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return new Float(t1.getHoras()).compareTo(t.getHoras()); 
        }
     }
    );}
    public void ordenarTitulo(){
    Collections.sort(pelis, new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo()); 
        }
     }
    );}
    public void ordenarDirector(){
    Collections.sort(pelis, new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector()); 
        }
     }
    );}
}
