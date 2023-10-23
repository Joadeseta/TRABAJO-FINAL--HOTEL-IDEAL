/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;

import entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * 

   
 * @author Alan
 */
public class habitacionData {

    private int id;
    private int numero;
    private int piso;
    private int estado;
    private String tipoHabitacion;

    private Connection con = null;

    public habitacionData() {
        this.con = Conexion.getConexion();
    }

    public void GuardarHabitacion(Habitacion habitacion) throws SQLException {
        String sql = "INSERT INTO habitaciones (codigo, numero_habitacion, estado)" + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, habitacion.getCodigo());
            ps.setInt(2, habitacion.getNumeroHabitacion());
            ps.setBoolean(3, habitacion.getEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                habitacion.setIdHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Habitacion Agregada Exitosamente.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }
    }

    public void ModificarHabitacion(Habitacion habitacion) {
        String sql = "UPDATE habitaciones Set numero_habitacion = ?Set estado WHERE idHabitacion=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, habitacion.getNumeroHabitacion());
            ps.setBoolean(2, habitacion.getEstado());
            ps.setInt(3, habitacion.getIdHabitacion());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "habitacion Modificada Exitosamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla .");
        }
    }

    public void EliminarHabitacion(int idHabitacion) {
        String sql = "UPDATE habitaciones Set estado = 0 WHERE idHabitacion =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Habitacion inhabilitada Exitosamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder.");
        }
    }

    public Habitacion BuscarporNumeroHabitacion(int numeroHabitacion) {
        String sql = "SELECT idHabitacion, codigo, estado FROM habitaciones WHERE numero_habitacion = ?";
        Habitacion habitacion = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numeroHabitacion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setNumeroHabitacion(numeroHabitacion);
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setCodigo(rs.getInt("codigo"));
                habitacion.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe la habitacion con el ID ingresado.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla habitacion.");
        }
        return habitacion;
    }

    public void CambiarEstadoHabitacion(int idHabitacion) {
        String sql = "UPDATE Habitaciones SET estado = 1 WHERE idHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Activada Exitosamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla.");
        }
    }

    public void DesactivarEstadoHabitacion(int idHabitacion) {
        String sql = "UPDATE Habitaciones SET estado = 0 WHERE idHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHabitacion);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Activada Exitosamente.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla.");
        }
    }

    public Habitacion BuscarporEstado(boolean estado) {
        String sql = "SELECT idHabitacion, codigo, numeroHabitacion FROM habitaciones WHERE estado = ?";
        Habitacion habitacion = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                habitacion = new Habitacion();
                habitacion.setEstado(estado);
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setCodigo(rs.getInt("codigo"));
                habitacion.setNumeroHabitacion(rs.getInt("numero de habitacion"));

            } else {
                JOptionPane.showMessageDialog(null, "No se encuetra.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de estado.");
        }
        return habitacion;
    }

    public ArrayList<Habitacion> obtenerTodasLasHabitaciones() {
        ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
        String sql = "SELECT idHabitacion, codigo, numero_habitacion, estado FROM habitaciones";
        try (PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idHabitacion"));
                habitacion.setCodigo(rs.getInt("codigo"));
                habitacion.setNumeroHabitacion(rs.getInt("numero_habitacion"));                
                habitacion.setEstado(true);
                listaHabitaciones.add(habitacion);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
        return listaHabitaciones;
    }

}
