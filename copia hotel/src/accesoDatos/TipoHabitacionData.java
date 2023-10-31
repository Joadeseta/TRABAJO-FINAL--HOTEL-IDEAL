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
        
        String sql="INSERT INTO tipodehabitacion (idTipoHabitacion, codigo, cantPersonas, cantCamas, "
                + "tipoCamas, precioNoche, Estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, tiphab.getIdTipoHabitacion());
            ps.setInt(2, tiphab.getCodigo());
            ps.setInt(3, tiphab.getCapMaxima());
            ps.setInt(4, tiphab.getCantCamas());
            ps.setString(5, tiphab.getTipoCamas());
            ps.setDouble(6, tiphab.getPrecPorNoche());
            ps.setBoolean(7, tiphab.isEstado());
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
        
        String sql = "UPDATE tipodehabitacion SET codigo = ?, cantPersonas = ?, cantCamas = ?, tipoCamas = ?, precioNoche = ?, Estado = ? WHERE idTipoHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, tiphab.getCodigo());
            ps.setInt(2, tiphab.getCapMaxima());
            ps.setInt(3, tiphab.getCantCamas());
            ps.setString(4, tiphab.getTipoCamas());
            ps.setDouble(5, tiphab.getPrecPorNoche());
            ps.setBoolean(6, tiphab.isEstado());
            ps.setInt(7, tiphab.getIdTipoHabitacion());
            int filas = ps.executeUpdate();
            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Tipo de habitación actualizada exitosamente.");
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
                tphb.setEstado(rs.getBoolean("Estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return tphb;
    } 
    
    public TipoHabitacion buscarTipoHabitacionPorCod (int cod){
        
        String sql = "SELECT idTipoHabitacion, cantPersonas, cantCamas, tipoCamas, precioNoche, Estado FROM tipodehabitacion WHERE codigo = ?";
        TipoHabitacion tphb = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                tphb.setCodigo(cod);
                tphb.setCapMaxima(rs.getInt("cantPersonas"));
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(rs.getBoolean("Estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return tphb;
    } 
    
    public TipoHabitacion buscarTipoHabitacionPorCantPers (int cantPers){
        
        String sql = "SELECT idTipoHabitacion, codigo, cantCamas, tipoCamas, precioNoche, Estado FROM tipodehabitacion WHERE cantPersonas = ?";
        TipoHabitacion tphb = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantPers);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                tphb.setCodigo(rs.getInt("codigo"));
                tphb.setCapMaxima(cantPers);
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(rs.getBoolean("Estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return tphb;
    }
    
    public ArrayList<TipoHabitacion> listarTipoHabitacion() {
        
        ArrayList<TipoHabitacion> tiphab = new ArrayList<>();
        String sql = "SELECT idTipoHabitacion, codigo, cantPersonas, cantCamas, tipoCamas, precioNoche, Estado FROM tipodehabitacion";
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
                tphb.setEstado(rs.getBoolean("Estado"));
                tiphab.add(tphb);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipos de habitación.");
        }
        return tiphab;
    }
    
    public List<TipoHabitacion> listarTipoHabitacionPorID(int idTipoHabitacion) {
        
        ArrayList<TipoHabitacion> tiphab = new ArrayList<>();
        String sql = "SELECT idTipoHabitacion, codigo, cantPersonas, cantCamas, tipoCamas, precioNoche, Estado FROM tipodehabitacion WHERE idTipoHabitacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTipoHabitacion);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoHabitacion tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(idTipoHabitacion);
                tphb.setCodigo(rs.getInt("codigo"));
                tphb.setCapMaxima(rs.getInt("cantPersonas"));
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(rs.getBoolean("Estado"));
                tiphab.add(tphb);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex+"Error al acceder a la tabla de tipos de habitación.");
            System.out.println(ex);
        }
        return tiphab;
    }
    
    public List<TipoHabitacion> listarTipoHabitacionPorCod(int codigo) {
        
        ArrayList<TipoHabitacion> tiphab = new ArrayList<>();
        String sql = "SELECT idTipoHabitacion, codigo, cantPersonas, cantCamas, tipoCamas, precioNoche, Estado FROM tipodehabitacion WHERE codigo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoHabitacion tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                tphb.setCodigo(codigo);
                tphb.setCapMaxima(rs.getInt("cantPersonas"));
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(rs.getBoolean("Estado"));
                tiphab.add(tphb);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipos de habitación.");
            System.out.println(ex);
        }
        return tiphab;
    }
    
    public List<TipoHabitacion> listarTipoHabitacionPorCantPers(int cantPersonas) {
        
        ArrayList<TipoHabitacion> tiphab = new ArrayList<>();
        String sql = "SELECT idTipoHabitacion, codigo, cantPersonas, cantCamas, tipoCamas, precioNoche, Estado FROM tipodehabitacion WHERE cantPersonas = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantPersonas);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TipoHabitacion tphb = new TipoHabitacion();
                tphb.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
                tphb.setCodigo(rs.getInt("codigo"));
                tphb.setCapMaxima(cantPersonas);
                tphb.setCantCamas(rs.getInt("cantCamas"));
                tphb.setTipoCamas(rs.getString("tipoCamas"));
                tphb.setPrecPorNoche(rs.getDouble("precioNoche"));
                tphb.setEstado(rs.getBoolean("Estado"));
                tiphab.add(tphb);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipos de habitación.");
            System.out.println(ex);
        }
        return tiphab;
    }
}
