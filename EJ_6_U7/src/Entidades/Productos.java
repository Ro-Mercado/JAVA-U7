

package Entidades;

/**
 *
 * 
 */
public class Productos {
    String nomProd;
    Float precio;

    public Productos() {
    }

    public Productos(String nomProd, Float precio) {
        this.nomProd = nomProd;
        this.precio = precio;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
  

    @Override
    public String toString() {
        return "Productos{" + "nomProd=" + nomProd + ", precio=" + precio + '}';
    }
    
}
