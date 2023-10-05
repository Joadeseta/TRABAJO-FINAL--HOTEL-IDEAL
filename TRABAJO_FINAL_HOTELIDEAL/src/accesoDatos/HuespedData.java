/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Huesped;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author joadz
 */
public class HuespedData {

    private Connection con = null;

    // Constructor que inicializa la conexión a la base de datos al crear una instancia de AlumnoData.
    public HuespedData() {
        con = Conexion.getConexion();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
        }

    }
public void agregarHuesped(Huesped huesped){
    
}
    /* agregarHuesped(Huesped huesped)
actualizarHuesped(int id, Huesped huespedActualizado)
eliminarHuesped(int id)
buscarHuespedPorId(int id)
buscarHuespedPorDNI(String dni)
obtenerTodosLosHuespedes()*/
    
    
    
}
