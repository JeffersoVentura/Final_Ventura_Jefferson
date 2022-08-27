package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vistas.*;
import Datos.*;
import javax.swing.JOptionPane;

public class ControladorRegistroPasajero {
    private RegistroPasajero vista;
    private PasajeroArreglo modelo;
    
    public ControladorRegistroPasajero(RegistroPasajero vista, PasajeroArreglo modelo){
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnRegistrar.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    
                    Pasajero p = new Pasajero(vista.jCTipoDocumento.getSelectedItem().toString(), 
                            vista.jTNroDocumento.getText(), vista.jTNombre.getText(), 
                            vista.jTApellido.getText(), vista.jTNacimiento.getText());
                    
                    Repositorio.pasajero.agregar(p);
                    
                    System.out.println("Pasajero Agregado");
                    JOptionPane.showMessageDialog(null, "Pasajero AGREGADA");
                    JOptionPane.showMessageDialog(null, p.toString());
                    System.out.println(Repositorio.pasajero.toString());
                }
            }
        );
        
        this.vista.btnCancelar.addActionListener( new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    
                    ControladorEntrada controlador = new ControladorEntrada(new Usuario("admin", "123"), new Entrada());
                    
                    vista.dispose();
                }
            }
        );
        
        
    }
    public void iniciar() {
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}