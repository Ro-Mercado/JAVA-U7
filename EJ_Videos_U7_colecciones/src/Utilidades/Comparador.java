

package Utilidades;

import Entidad.Mascota;
import java.util.Comparator;

/**
 *
 * 
 */
public class Comparador {

    public static Comparator<Mascota> ordenarNomDescendente= new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getNombre().compareTo(t.getNombre());
        }
    };
    
    
}
