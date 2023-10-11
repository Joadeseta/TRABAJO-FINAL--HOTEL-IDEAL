package accesoDatos;

import entidades.Huesped;
import entidades.Reserva;
import entidades.TipoHabitacion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TipoHabitacionData {
    
    //Conexión a la base de datos.
    
    private Connection con = null;
    
    
    public TipoHabitacionData() {

        this.con = Conexion.getConexion();
    }
    
    public void agregarTipoHabitacion (TipoHabitacion tiphab){
        
        String sql="INSERT INTO tipodehabitacion (codigo, cantPersonas, cantCamas, "
                + "tipoCamas, precioNoche, Estado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tiphab.getCodigo());
            ps.setInt(2, tiphab.getCapMaxima());
            ps.setInt(3, tiphab.getCantCamas());
            ps.setString(4, tiphab.getTipoCamas());
            ps.setDouble(5, tiphab.getPrecPorNoche());
            ps.setBoolean(6, tiphab.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                tiphab.setIdTipoHabitacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Tipo de habitación registrada exitosamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitación.");
        }
    }
    
    public void actualizarTipoHabitacion (TipoHabitacion tiphab){
        
        String sql = "UPDATE tipodehabitacion SET codigo = ?, cantPersonas = ?, cantCamas = ?, tipoCamas = ?, precioNoche = ? WHERE idTipoHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, tiphab.getCodigo());
            ps.setInt(2, tiphab.getCapMaxima());
            ps.setInt(3, tiphab.getCantCamas());
            ps.setString(4, tiphab.getTipoCamas());
            ps.setDouble(5, tiphab.getPrecPorNoche());
            ps.setInt(6, tiphab.getIdTipoHabitacion());
            int filas = ps.executeUpdate();
            if(filas > 0){
                JOptionPane.showMessageDialog(null, "Tipo de habitación actualizada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla tipo de habitación.");
        }
    }
    
    public void eliminarTipoHabitacion (int id){
        
        String sql = "UPDATE tipodehabitacion SET Estado = 0 WHERE idTipoHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id); 
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actulizado correctamente la lista de tipos de habitaciones.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el tipo de habitación.");
        }
    }
    
    public void activarTipoHabitacion (int id){
        
        String sql = "UPDATE tipodehabitacion SET Estado = 1 WHERE idTipoHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id); 
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actulizado correctamente la lista de tipos de habitaciones.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el tipo de habitación.");
        }
    }
    
    public TipoHabitacion buscarTipoHabitacionActivaPorId (int id){
        
        String sql = "SELECT codigo, cantPersonas, cantCamas, tipoCamas, precioNoche FROM tipodehabitacion WHERE idTipoHabitacion = ? AND Estado = 1";
        TipoHabitacion tphb = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(id);
                tphb.setCodigo(rs.getInt("codigo"));
                tphb.setCapMaxima(rs.getInt("cantPersonas"));
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación activa con ese ID.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return tphb;
    }
    
    public TipoHabitacion buscarTipoHabitacionInactivaPorId (int id){
        
        String sql = "SELECT codigo, cantPersonas, cantCamas, tipoCamas, precioNoche FROM tipodehabitacion WHERE idTipoHabitacion = ? AND Estado = 0";
        TipoHabitacion tphb = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(id);
                tphb.setCodigo(rs.getInt("codigo"));
                tphb.setCapMaxima(rs.getInt("cantPersonas"));
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(false);
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación inactiva con ese ID.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return tphb;
    }
    
    public TipoHabitacion buscarTipoHabitacionPorId (int id){
        
        String sql = "SELECT codigo, cantPersonas, cantCamas, tipoCamas, precioNoche, Estado FROM tipodehabitacion WHERE idTipoHabitacion = ?";
        TipoHabitacion tphb = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(id);
                tphb.setCodigo(rs.getInt("codigo"));
                tphb.setCapMaxima(rs.getInt("cantPersonas"));
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(false);
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación con ese ID.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return tphb;
    }
    
    public List<TipoHabitacion> listarTipoHabitacionActivos() {

        String sql = "SELECT idTipoHabitacion, codigo, cantPersonas, cantCamas, tipoCamas, precioNoche FROM tipodehabitacion WHERE Estado = 1";
        ArrayList<TipoHabitacion> tiphab = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoHabitacion tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                tphb.setCodigo(rs.getInt("codigo"));
                tphb.setCapMaxima(rs.getInt("cantPersonas"));
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(true);
                tiphab.add(tphb);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipos de habitación.");
        }
        return tiphab;
    }
    
    public List<TipoHabitacion> listarTipoHabitacionInactivos() {

        String sql = "SELECT idTipoHabitacion, codigo, cantPersonas, cantCamas, tipoCamas, precioNoche FROM tipodehabitacion WHERE Estado = 0";
        ArrayList<TipoHabitacion> tiphab = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoHabitacion tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                tphb.setCodigo(rs.getInt("codigo"));
                tphb.setCapMaxima(rs.getInt("cantPersonas"));
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(false);
                tiphab.add(tphb);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipos de habitación.");
        }
        return tiphab;
    }
}
