package Modelo;

/**
 *
 * @author jvrui
 */
public class PasajeroArreglo {
    private Pasajero [] Pasajero;
    private int indice;
    
    public PasajeroArreglo (int tamano){
        this.Pasajero = new Pasajero [tamano];
        this.indice = 0;
    }
    
    public void agregar(Pasajero pasajeros){
        this.Pasajero[this.indice] = pasajeros;
        this.indice++;
    }
    
    public void eliminar (int x){
        int numero = 0;
        if (x >= 0){
            for (int i = x; i < Pasajero.length - 1; i++){
                Pasajero[i] = Pasajero [i+1];
                Pasajero[i+1] = null;
                numero = i;
            }
        }
        else{
            System.out.println("Posición invalida.");
        }
        indice--;
    }
    
    public Pasajero[] devolverArreglo (){
        return this.Pasajero;
    }
    
}