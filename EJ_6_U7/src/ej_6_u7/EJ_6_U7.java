

package ej_6_u7;

import ServiciosProd.ServProd;
import java.util.Scanner;


public class EJ_6_U7 {

    /**
     * @param args the command line arguments
     * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
    productos que venderemos y el precio que tendrán. Además, se necesita que la
    aplicación cuente con las funciones básicas.
    Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
    eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
    Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in).useDelimiter("\n");
        int op=0;
         ServProd sp=new ServProd();
        do {
        System.out.println("*******************************");
        System.out.println("*            MENÚ             *");
        System.out.println("******************************");
        System.out.println("1.Carga de productos           ");
        System.out.println("2.Introducir un nuevo producto");
        System.out.println("3.Modificar su precio          ");
        System.out.println("4.Eliminar un producto         ");
        System.out.println("5.Ver productos                ");
        System.out.println("6.Ordenar productos alfabeticamente");
        System.out.println("7.Salir");
        System.out.println("*******************************");
            System.out.print("\nIngrese una opcion: ");
            op=leer.nextInt();
        
            switch (op) {
                case 1:
                    sp.fabricaMap();
     
                    break;
                case 2:
                    sp.introducir();
                    break;
               case 3:
                    sp.modificarPrecio();
                    break;
               case 4:
                    sp.eliminarProd();
                    break;
                case 5:
                     sp.mostrar();
                    break;
                case 6:
                    sp.ordenarAlf();
                    break;
                case 7:
                    System.out.println("-----FIN-----");
                    break;
                default:
                    System.out.println("OPCION MAL INGRESADA");    
            }
            System.out.print("\n******Presione enter para continuar*****\n");
            
            String var=leer.next();
        } while (op!=7);
        
  
        
     
      
    
    }

}
