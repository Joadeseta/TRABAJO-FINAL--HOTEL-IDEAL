package accesoDatos;

import entidades.Reserva;
import accesoDatos.HuespedData;
import entidades.Huesped;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ReservaData {
    
    private Connection con = null;
    private HuespedData hd = new HuespedData();
    
    public ReservaData() {

        this.con = Conexion.getConexion();

    }
    
    public void agregarReserva (Reserva resv){
    
        String sql="INSERT INTO reserva (idHuesped, codigo, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, resv.getHuesped().getIdHuesped());
            ps.setInt(2, resv.getCodigo());
            ps.setInt(3, resv.getCantPersonas());
            ps.setDate(4, Date.valueOf(resv.getFecha_entrada()));
            ps.setDate(5, Date.valueOf(resv.getFecha_salida()));
            ps.setDouble(6, resv.getImporteTotal());
            ps.setBoolean(7, resv.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                resv.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva registrada exitosamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
        }
    }
            
    public void actualizarReserva(Reserva resv) {

        String sql = "UPDATE reserva SET cantPersonas = ?, Fecha_entrada = ?, Fecha_salida = ?, ImporteTotal = ? WHERE idReserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(2, resv.getCantPersonas());
            ps.setDate(3, Date.valueOf(resv.getFecha_entrada()));
            ps.setDate(4, Date.valueOf(resv.getFecha_salida()));
            ps.setDouble(5, resv.getImporteTotal());
            int filas = ps.executeUpdate();
            if(filas>0){
                JOptionPane.showMessageDialog(null, "Reserva actualizada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
        }
    }
    
    public void eliminarReserva (int id){
        
        String sql = "UPDATE reserva SET estado = 0 WHERE idReserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id); 
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actulizado correctamente la lista de reservas.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la reserva.");
        }
    }
    
    public void activarReserva (int id){
        
        String sql = "UPDATE reserva SET estado = 1 WHERE idReserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actulizado correctamente la lista de reservas.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo activar la reserva.");
        }
    }
    
    public Reserva buscarReservaActivaPorId (int id){
        
        String sql = "SELECT idHuesped, codigo, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado FROM tipodehabitacion WHERE idReserva = ? AND Estado = 1";
        Reserva resv = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resv = new Reserva();
                resv.setIdReserva(id);
                Huesped hpd = hd.buscarHuesped(rs.getInt("idHuesped"));
                resv.setHuesped(hpd);
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación activa con ese ID.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return resv;
    }
    
    public Reserva buscarReservaInactivaPorId (int id){
        
        String sql = "SELECT idHuesped, codigo, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado FROM tipodehabitacion WHERE idReserva = ? AND Estado = 0";
        Reserva resv = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resv = new Reserva();
                resv.setIdReserva(id);
                Huesped hpd = hd.buscarHuesped(rs.getInt("idHuesped"));
                resv.setHuesped(hpd);
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(false);
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación activa con ese ID.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return resv;
    }
    
    public Reserva buscarReservaActivaPorFecha (int id){
        
        String sql = "SELECT idReserva, idHuesped, codigo, cantPersonas, Fecha_salida, ImporteTotal, Estado FROM tipodehabitacion WHERE Fecha_entrada = ? AND Estado = 1";
        Reserva resv = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resv = new Reserva();
                resv.setIdReserva(id);
                Huesped hpd = hd.buscarHuesped(rs.getInt("idHuesped"));
                resv.setHuesped(hpd);
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación activa con ese ID.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return resv;
    }
    
    public Reserva buscarReservaInactivaPorFecha (int id){
        
        String sql = "SELECT idReserva, idHuesped, codigo, cantPersonas, Fecha_salida, ImporteTotal, Estado FROM tipodehabitacion WHERE Fecha_entrada = ? AND Estado = 0";
        Reserva resv = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resv = new Reserva();
                resv.setIdReserva(id);
                Huesped hpd = hd.buscarHuesped(rs.getInt("idHuesped"));
                resv.setHuesped(hpd);
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(false);
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación activa con ese ID.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de habitación.");
        }
        return resv;
    }
    
    public List<Reserva> listarReservasActivas() {

        String sql = "SELECT idReserva, idHuesped, codigo, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado FROM reserva WHERE Estado = 1";
        ArrayList<Reserva> reserva = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva resv = new Reserva();
                resv.setIdReserva(rs.getInt("idReserva"));
                Huesped hpd = hd.buscarHuesped(rs.getInt("idHuesped"));
                resv.setHuesped(hpd);
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(true);
                reserva.add(resv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipos de habitación.");
        }
        return reserva;
    }
    
    public List<Reserva> listarReservasInactivas() {

        String sql = "SELECT idReserva, idHuesped, codigo, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado FROM reserva WHERE Estado = 0";
        ArrayList<Reserva> reserva = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva resv = new Reserva();
                resv.setIdReserva(rs.getInt("idReserva"));
                Huesped hpd = hd.buscarHuesped(rs.getInt("idHuesped"));
                resv.setHuesped(hpd);
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(false);
                reserva.add(resv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipos de habitación.");
        }
        return reserva;
    }
}
