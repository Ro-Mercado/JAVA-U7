

package Entidad;

/**
 *
 * 
 */
public class Mascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private String raza;
    private int edad;

    public Mascota() {
    }

    public Mascota(String nombre, String apodo, String tipo, String raza, int edad) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.raza = raza;
        this.edad = edad;
    }

    public Mascota(String nombre, String apodo, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", raza=" + raza + ", edad=" + edad + '}';
    }
    
    
}
