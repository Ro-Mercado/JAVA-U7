

package ej_videos_u7_colecciones;

import ServicioMasc.ServicioMasc;
import Utilidades.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class EJ_Videos_U7_colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arrays
        String[] nom= new String[5];
        for (int i = 0; i < nom.length; i++) {
            nom[i]="Chiquito"+(i+1);
        }
        for (String elem : nom) {
            System.out.println(elem);
        }
        
        //Colecciones - Collections
        ArrayList<String> nomAL= new ArrayList<>(); //Puedo omitir el <> en new ArrayList()
        System.out.println(nomAL.size());
        nomAL.add("Chiqui 1");  
        nomAL.add("Chiqui 2");  
        nomAL.add("Chiqui 3");  
        System.out.println(nomAL.size());
        
        
        //USANDO EL SERVICIO 
        ServicioMasc sm=new ServicioMasc();
        /*sm.crearMascota();
        sm.crearMascota();
        sm.mostrar();*/
        
        
        //USANDO EL SERVICIO CON LA ENTIDAD MASCOTA
        Scanner leer=new Scanner (System.in);
        System.out.println("\nCREANDO MASCOTAS FER CHIQUIS");
        System.out.print("Ingrese la cantidad de Fer Chiquis a crear:");
        sm.fabricaChiquis(leer.nextInt());
        sm.mostrar();
        System.out.println("\nCREANDO 2 MASCOTAS NUEVAS");
        sm.fabricaMascotas(2);
        sm.mostrar();
        //Actualizacion de la lista mascotas mediante un índice válido:
        
        sm.actulizarMasc(2);
        System.out.println("Lista actualizada: ");
        sm.mostrar();
        //eliminar mascota en la posicion dada
        System.out.println("-----ELIMINANDO MASCOTA EN LA PRIMER POSICIÓN----");
        sm.eliminarMasc(0);
        System.out.println("Lista actualizada: ");
        sm.mostrar();
        //Eliminar por nombre 
        System.out.println("----ELIMINANDO MASCOTA POR NOMBRE: LOLA----");
        sm.eliminarNom("Lola");
        sm.mostrar();
        
        //Usando clase comparadores para ordenar (DEFINIDO EN EL SERVICIO PARA PODER USAR LA LISTA)
           // Collections.sort(sm, Comparador.ordenarNomDescendente);
        System.out.println("----ORDENAR POR NOMBRE----");
        sm.ordenar();
        sm.mostrar();
       
        
    }

}
