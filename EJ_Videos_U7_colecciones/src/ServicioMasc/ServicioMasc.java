

package ServicioMasc;

import Entidad.Mascota;
import Utilidades.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * 
 */
public class ServicioMasc {
    private final Scanner leer ;
    private ArrayList<Mascota> mascota;

    public ServicioMasc() {
        this.leer= new Scanner(System.in);
        this.mascota = new ArrayList<>();
    }

  
    //public void crearMascota()
    @SuppressWarnings("empty-statement")
    public Mascota crearMascota(){
        System.out.print("Ingrese el nombre de la mascota: ");
        String n=leer.nextLine();
        System.out.print("Ingrese el apodo de la mascota: ");
        String ap=leer.nextLine();
        System.out.print("Ingrese la raza de la mascota: ");
        String raza=leer.nextLine();
        //String mascotas=n+" "+ap+" "+raza;
        //mascota.add(mascotas);
        System.out.println("");
        
      // mascota.add(n+" "+ap+" "+raza);
      return new Mascota(n,ap,raza);
    }
    public void agregarMascota(Mascota m){
        mascota.add(m);
    }
    
    public void mostrar(){
        System.out.println("\nMASCOTAS EN LA LISTA: ");
        //FOR EACH:
        /*   for (String aux: mascota) {
            System.out.println(aux);
        }*/
        //EQUIVALENTE A FOR EACH:
       /* mascota.forEach((aux) -> {
            System.out.println(aux);
        });*/
        for (Mascota aux : mascota) {
            System.out.println(aux.toString());
        }
        System.out.println("\nCantidad de mascotas en la lista: "+mascota.size()+"\n");
        
    }
    
    /*CREADOR DE FER CHIOUIS - TODOS VAN A SER CHIQUIS
    * @param cant equivale a una cantida de Fer chiquis a crear y añadir a la lista
    */
    public void fabricaChiquis(int cant){
        for (int i = 0; i < cant; i++) {
            Mascota aux= new Mascota("Fer","Chiqui","beagle");
            mascota.add(aux);
        }
    }
    
    /*CREADOR DE MASCOTAS
    * @param cant equivale a una cantida de Mascotas a crear y añadir a la lista
    */
    public void fabricaMascotas(int cant){
        for (int i = 0; i < cant; i++) {
            //Con este método es suficiente:
           // crearMascota();
           
           //Crear una variable para poder hacerle el .toString
           Mascota mascCreada= crearMascota();
           agregarMascota(mascCreada);
           System.out.println(mascCreada.toString());
        }
        
    }
    // Actualizando por referencia el objeto
    // Por hacer: Try and Catch
   /* public void actualizarMasc(int index){
        Mascota m= mascota.get(index);
        m.setApodo("Roberto");
        
    }*/
    
    //Actualizar creando un new object y "pisandolo" en base al índice
    
    public void actulizarMasc(int index){
        if(index<=(mascota.size()-1)){
        System.out.println("\n-----------Actualización de la lista de Mascotas-----------");
        Mascota m=crearMascota();
        mascota.set(index,m);}
        else{
            System.out.println("FALLO AL ACTUALIZAR.\nEl índice es erróneo - Fuera de rango");
        }
    }
    
    //Eliminar un mascota de acuerdo al índice
    public void eliminarMasc(int index){
        if (index<=(mascota.size()-1)) {
             mascota.remove(index);
        }
        else{
            System.out.println("FALLO AL ELIMINAR(Índice erróneo)");
        }
       
    }
    //Eliminar por Nombre
    public void eliminarNom(String nom){
        for (int i = 0; i < mascota.size(); i++) {
            Mascota m= mascota.get(i);
            if (m.getNombre().equals(nom)) {
                mascota.remove(m);
                
            }
                 
        }
    }
    //Actualizar por nombre
    public void actualizarNom(String nomViejo, String nomNew){
        for (int i = 0; i < mascota.size(); i++) {
            Mascota m= mascota.get(i);
            if (m.getNombre().equals(nomViejo)) {
                m.setNombre(nomNew);
                
            }
                 
        }
    }
    
    public void ordenar(){
        Collections.sort(mascota, Comparador.ordenarNomDescendente);
    }
}
