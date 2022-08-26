package Modelo;

/**
 *
 * @author jvrui
 */
public class PaisArreglo {
    private Pais [] pais;
    private int indice;
    
    public PaisArreglo (int tamano){
        this.pais = new Pais[tamano];
        this.indice = 0;
    }
}
