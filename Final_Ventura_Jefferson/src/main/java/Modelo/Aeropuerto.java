package Modelo;

/**
 *
 * @author jvrui
 */
public class Aeropuerto {
    private String nombre;
    private String direccion;
    private boolean estado;
    
    private static int cont = 0;
    private int codigo;

    public Aeropuerto(String nombre, String direccion, boolean estado) {
        this.codigo = cont;
        cont++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" + "nombre=" + nombre + ", direccion=" + direccion + ", estado=" + estado + ", codigo=" + codigo + '}';
    }
    
      
    
}
