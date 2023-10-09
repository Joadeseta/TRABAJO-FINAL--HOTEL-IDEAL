/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;

import java.sql.Connection;

/**
 *
 * public class Habitacion {
    private int id;
    private int numero;
    private int piso;
    private int estado; // 0 para libre, 1 para ocupada
    private TipoHabitacion tipoHabitacion;

    // Constructor
    public Habitacion(int numero, int piso, int estado, TipoHabitacion tipoHabitacion) {
        this.numero = numero;
        this.piso = piso;
        this.estado = estado;
        this.tipoHabitacion = tipoHabitacion;
    }
 * @author Alan
 */
public class habitacionData {
    private int id;
    private int numero;
    private int piso;
    private int estado;
    private String tipoHabitacion;
    
    private Connection con = null;
    
    public habitacionData(){
        this.con=Conexion.getConexion();
    }
    
    public void GuardarHabitacion (){
        
    }
    
    public void ModificarHabitacion(){
        
    }
    
    public void EliminarHabitacion(){
        
    }
    
    public void BuscarporNumero(){
        
    }
    
    public void CambiarEstadoHabitacion(){
        
    }
    
}
