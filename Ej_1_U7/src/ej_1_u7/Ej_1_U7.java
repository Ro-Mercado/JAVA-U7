

package ej_1_u7;

import java.util.ArrayList;
import java.util.Scanner;


public class Ej_1_U7 {

    /**
     * @param args the command line arguments
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
    programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
    salir, se mostrará todos los perros guardados en el ArrayList.
     */
    Scanner leer= new Scanner(System.in);
    public static void main(String[] args) {
       //ArrayList<String> razasPerros= new ArrayList();
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
        /*  for (String razasPerro : razasPerros) {
        System.out.println(razasPerro);
        }*/
    }

}
