package Modelo;

/**
 *
 * @author jvrui
 */
public class Vuelo {
    private String codigo;
    private String fecha;
    private String hora;
    private int puertaEmbarque;
    private boolean activo;
    
    private Asiento[] asientos;
    private int numAsientos;

    public Vuelo(String codigo, String fecha, String hora, int puertaEmbarque, boolean activo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.puertaEmbarque = puertaEmbarque;
        this.activo = activo;
    }
    
    private void generarAsientos (int numAsientos){
        this.asientos = new Asiento[numAsientos];
        for (int i = 0; i <  numAsientos; i++){
            this.asientos[i] = new Asiento(i+1);
        }
    }
    
    public Asiento[] asientosdisponibles (){
        Asiento[] resultado = new Asiento[getCantidadAsientosDisponibles()];
        int indice = 0;
        for (int i = 0; i < numAsientos; i++){
            resultado[indice] = this.asientos[i];
            indice++;
        }
        return resultado;
    }
    
    private int getCantidadAsientosDisponibles(){
        int resultado = 0;
        for (int i = 0; i < numAsientos; i++){
            if (this.asientos[i].getEstado() == null){
                resultado++;
            }
        }
        return resultado;
    }
    
    
}