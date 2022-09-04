

package ServiciosProd;


import java.util.*;

/**
 *
 * 
 */
public class ServProd {
    HashMap<String,Float> mapProd=new HashMap<>();

    Scanner leer=new Scanner (System.in).useDelimiter("\n");
    
    public void crearProd(){
        System.out.print("\nIngrese el nombre del producto: ");
        String nom=leer.next();
        System.out.print("\nIngrese el precio del producto: ");
        Float p=leer.nextFloat();
        mapProd.put(nom, p);
    }
    
    public void fabricaMap(){
        System.out.println("\n-----INGRESO DE PRODUCTOS-----");
        String op="si";
        while(op.equalsIgnoreCase("si")){
            crearProd();
            System.out.println("\n¿Desea añadir un nuevo producto?");
            op=leer.next();
        }
    }
    
    public void mostrar(){
        System.out.println("\n-----MUESTRA PRODUCTOS------");
        for (Map.Entry<String,Float> entry: mapProd.entrySet()) {
            System.out.println("Producto: "+entry.getKey()+" Precio: "+entry.getValue());
        }
    }
    public void introducir(){
        System.out.println("\n-------AGREGAR UN NUEVO PRODUCTO-------");
        crearProd();
    }
    public void modificarPrecio(){
        System.out.println("\n------MODIFICAR EL PRECIO DE UN PRODUCTO------");
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String prod=leer.next();
        boolean b=false;
     for (Map.Entry<String,Float> entry: mapProd.entrySet()) {
            if (prod.equalsIgnoreCase(entry.getKey())) {
                System.out.print("Ingrese el nuevo precio del producto: ");
                entry.setValue(leer.nextFloat());
                b=true;
            }
        }
        if (b==false) {
            System.out.println("No se encontro el producto ingresado.");
        }
       
    }
    public void eliminarProd(){
        System.out.println("\n------ELIMINAR UN  PRODUCTO------");
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String prod=leer.next();
        if(mapProd.containsKey(prod)){
            mapProd.remove(prod);
        }else{
            System.out.println("No se encontró el producto");
        }
      
        
    }
    public void ordenarAlf(){
        TreeMap<String,Float> prodTree=new TreeMap<>(mapProd);
        for (Map.Entry<String,Float> entry: prodTree.entrySet()) {
            System.out.println("Producto: "+entry.getKey()+" Precio: "+entry.getValue());
        }
        //Para ordenar directamnte operar con un TreeMap
      
    }
}
