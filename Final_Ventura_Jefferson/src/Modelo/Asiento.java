package Modelo;

/**
 *
 * @author jvrui
 */
public class Asiento {
    private int nroasiento;
    private char fila;
    private String estado;

    public Asiento(int nroasiento) {
        this.nroasiento = nroasiento;
        this.fila = fila;
        this.estado = "LIBRE";
    }

    public int getNroasiento() {
        return nroasiento;
    }

    public void setNroasiento(int nroasiento) {
        this.nroasiento = nroasiento;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }
    
    public String getEstado() {
        return estado;
    }
    
}