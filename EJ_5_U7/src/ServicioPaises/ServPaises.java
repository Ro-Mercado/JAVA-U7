

package ServicioPaises;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * 
 */
public class ServPaises {
HashSet<String> paises=new HashSet<>();
Scanner leer=new Scanner (System.in).useDelimiter("\n");
TreeSet<String> pais;

public void crearPais(){
    System.out.print("\nIngrese un país:");
    String p=leer.next();
    paises.add(p);
}
public void fabricaPaises(){
    System.out.println("-----Ingreso de países-----");
    String op="si";
    while("si".equals(op.toLowerCase())){
        crearPais();
        System.out.println("\n¿Desea ingresar otro país?");
        op=leer.next();
    }
 
}
public void mostrar(){
    System.out.println("\n-----Muestra de datos-----");
    
    for (String aux : paises) {
        System.out.println(aux);
    }
}
    public void ordenarAlf(){
       System.out.println("-----Ordenamiento de países alfabéticamente-----");
       pais=new TreeSet<>(paises);
       
    }
    public void mostrarTree(){
        for (String aux : pais) {
            System.out.println(aux);
        }
    }
    
    public void eliminar(){
        System.out.println("-----Eliminanción de país-----");
       // boolean band=false;
        System.out.print("Ingrese un país a eliminar: ");
        String p=leer.next();
        
        Iterator<String> it=pais.iterator();
        
        int longitud=pais.size();
        
        while(it.hasNext()){
            if (it.next().equals(p)) {
                System.out.println("\n....Eliminando país....");
                it.remove();
            }
        }
        //Informa si esta o no 
        if (longitud==pais.size()) {
            System.out.println("\nEl país ingresado NO fue encontrado\n");
        }
        else{
            System.out.println("\nEl país ingresada fue encontrado\n");
        }
        
       
        
    }
}
