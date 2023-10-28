package accesoDatos;

import entidades.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class habitacionData {

    private Connection con = null;

    public habitacionData() {
        this.con = Conexion.getConexion();
    }

    public void GuardarHabitacion(Habitacion habitacion) {
    String sql = "INSERT INTO habitaciones (idHabitacion, codigo, numero_habitacion, estado) VALUES (?,?,?,?)";
    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, habitacion.getIdHabitacion());  
        ps.setInt(2, habitacion.getCodigo());
        ps.setInt(3, habitacion.getNumeroHabitacion());
        ps.setBoolean(4, habitacion.getEstado());
        ps.executeUpdate();

        ResultSet rs = ps.getGeneratedKeys();

        if (rs.next()) {
            habitacion.setIdHabitacion(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Habitación Agregada Exitosamente.");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar la habitación: " + ex.getMessage());
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
                habitacion.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe la habitacion con número ingresado.");
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la habitacion.");
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
                habitacion.setEstado(rs.getBoolean("estado"));
                listaHabitaciones.add(habitacion);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
        return listaHabitaciones;
    }
}
