package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vistas.*;
import Datos.*;

public class ControladorRegistroPasajero {
    private RegistroPasajero vista;
    private PasajeroArreglo modelo;
    
    public ControladorRegistroPasajero(PasajeroArreglo modelo, RegistroPasajero vista){
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnRegistrar.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    Pasajero p = new Pasajero(vista.jTNroDocumento.getText());
                }
            }
        );
    }
}
