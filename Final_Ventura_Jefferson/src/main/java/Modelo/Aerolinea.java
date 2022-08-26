package Modelo;

/**
 *
 * @author jvrui
 */
public class Aerolinea {
    private String nombre;
    private String RUC;

    public Aerolinea(String nombre, String RUC) {
        this.nombre = nombre;
        this.RUC = RUC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    @Override
    public String toString() {
        return "Aerolinea{" + "nombre=" + nombre + ", RUC=" + RUC + '}';
    }
    
    
    
}
