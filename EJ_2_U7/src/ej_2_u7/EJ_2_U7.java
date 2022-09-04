

package ej_2_u7;

import java.util.*;
public class EJ_2_U7 {

    /**
     * @param args the command line arguments
     * Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
    un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
    está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
    ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
    la lista ordenada.
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       //String opcion;
        ArrayList <String> razasPerros = new ArrayList();
        do {
            System.out.println("Ingrese una raza de perro");
            razasPerros.add(leer.nextLine());
            System.out.println("Desea ingresar otra raza de perro?");
           // opcion=leer.nextLine();
        } while ("si".equals(leer.nextLine().toLowerCase()));
       
        
        razasPerros.forEach((razasPerro) -> {
            System.out.println(razasPerro);
        });
        
        System.out.println("\nIngrese una raza a eliminar: ");
        String raza=leer.nextLine();
        Iterator<String> it=razasPerros.iterator();
        int longitud=razasPerros.size();
        while(it.hasNext()){
            if (it.next().equals(raza)) {
                it.remove();
                break;//Elimina el primero que encuentra
            }
           
        }
        //Informa si esta o no la raza
        if (longitud==razasPerros.size()) {
            System.out.println("\nLa raza ingresada NO fue encontrada\n");
        }
        else{
            System.out.println("\nLa raza ingresada fue encontrada\n");
        }
        //Lista ordenada
        Collections.sort(razasPerros);
        /* razasPerros.forEach((razasPerro) -> {
            System.out.println(razasPerro);
        });*/
         //ForEach version corta
        razasPerros.forEach((a)->System.out.println(a));
        
    }

}
