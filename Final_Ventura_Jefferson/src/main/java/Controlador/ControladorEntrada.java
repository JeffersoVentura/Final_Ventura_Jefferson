package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vistas.*;
import Datos.*;
import javax.swing.JOptionPane;

public class ControladorEntrada {
    private Entrada vista;
    
    public ControladorEntrada (Entrada vista) {
        this.vista = vista;
        
        this.vista.btnRegistro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ControladorRegistroPasajero controlador = new ControladorRegistroPasajero (new RegistroPasajero(), Repositorio.pasajero);
            }
        });
    }
}
