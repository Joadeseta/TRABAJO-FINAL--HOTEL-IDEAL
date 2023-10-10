/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_final_hotelideal;

import accesoDatos.HuespedData;
import entidades.Huesped;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author joadz
 */
public class TRABAJO_FINAL_HOTELIDEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear una instancia de HuespedData
        HuespedData huespedes = new HuespedData();
     
        /*// Crear un nuevo huésped
        Huesped nuevoHuesped1 = new Huesped("Nombre", 12345678, "Dirección", "correo@example.com", 123456789,true);
        
        // Agregar el nuevo huésped a la base de datos
        huespedData.agregarHuesped(nuevoHuesped1);

        // Actualizar un huésped existente 
        Huesped huespedActualizado = new Huesped(1, "NuevoNombre", 98765432, "Casanello nº2222", "marcosacuña@hotmail.com", 987654321, true);
        
        huespedData.actualizarHuesped(huespedActualizado);

        // Eliminar un huésped por su id 
        int idAEliminar = 2;
        huespedData.eliminaHuesped(idAEliminar);

        // Buscar un huésped por su id 
        int idABuscar = 3;
        Huesped huéspedEncontrado = huespedData.buscarHuesped(idABuscar);
        if (huéspedEncontrado != null) {
            System.out.println("Huésped encontrado: " + huéspedEncontrado);
        } else {
            System.out.println("Huésped no encontrado.");
        }

        // Buscar un huésped por su DNI 
        int dniABuscar = 12345678;
        Huesped huéspedPorDNI = huespedData.buscarPorDni(dniABuscar);
        if (huéspedPorDNI != null) {
            System.out.println("Huésped encontrado por DNI: " + huéspedPorDNI);
        } else {
            System.out.println("Huésped no encontrado por DNI.");
        }
         */
        // Obtener todos los huéspedes
        
        ArrayList<Huesped> todosLosHuespedes = huespedes.obtenerTodosLosHuespedes();
        for (Huesped huesped : todosLosHuespedes) {
            System.out.println(huesped);
        }
    }
}
