package Modelo;

import java.util.Date;

/**
 *
 * @author jvrui
 */
public class Pasajero {
    private String tipoDocumento;
    private String nroDocumento;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    
    private static int cont = 0;
    private int codigo;

    public Pasajero(String tipoDocumento, String nroDocumento, String nombre, String apellido, String fechaNacimiento) {
        this.codigo = cont;
        cont++;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "tipoDocumento=" + tipoDocumento + ", nroDocumento=" + nroDocumento + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", codigo=" + codigo + '}';
    }
    
}
