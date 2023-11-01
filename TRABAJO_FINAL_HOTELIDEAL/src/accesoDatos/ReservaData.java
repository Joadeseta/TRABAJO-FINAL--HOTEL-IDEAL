package accesoDatos;

import entidades.Reserva;
import accesoDatos.HuespedData;
import entidades.Huesped;
import entidades.TipoHabitacion;
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
    private TipoHabitacionData thd = new TipoHabitacionData();
    
    public ReservaData() {

        this.con = Conexion.getConexion();

    }
    
    public void agregarReserva (Reserva resv){
    
        String sql="INSERT INTO reserva (idReserva, idHuesped, codigo, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, resv.getIdReserva());
            ps.setInt(2, resv.getIdHuesped());
            ps.setInt(3, resv.getCodigo());
            ps.setInt(4, resv.getCantPersonas());
            ps.setDate(5, Date.valueOf(resv.getFecha_entrada()));
            ps.setDate(6, Date.valueOf(resv.getFecha_salida()));
            ps.setDouble(7, resv.getImporteTotal());
            ps.setBoolean(8, resv.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                resv.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva registrada exitosamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva.");
            System.out.println(ex);
        }
    }
            
    public void actualizarReserva(Reserva resv) {

        String sql = "UPDATE reserva SET idHuesped = ?, codigo = ?, cantPersonas = ?, Fecha_entrada = ?, Fecha_salida = ?, ImporteTotal = ?, Estado = ? WHERE idReserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, resv.getIdHuesped());
            ps.setInt(2, resv.getCodigo());
            ps.setInt(3, resv.getCantPersonas());
            ps.setDate(4, Date.valueOf(resv.getFecha_entrada()));
            ps.setDate(5, Date.valueOf(resv.getFecha_salida()));
            ps.setDouble(6, resv.getImporteTotal());
            ps.setBoolean(7, resv.isEstado());
            ps.setInt(8, resv.getIdReserva());
            int filas = ps.executeUpdate();
            if(filas == 1){
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
    
    public Reserva buscarReservaPorIdReserva (int id){
        
        String sql = "SELECT idHuesped, codigo, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado FROM reserva WHERE idReserva = ?";
        Reserva resv = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resv = new Reserva();
                resv.setIdReserva(id);
                resv.setIdHuesped(rs.getInt("idHuesped"));
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación activa con ese ID de reserva.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de reserva.");
        }
        return resv;
    }
    
    public Reserva buscarReservaPorIdHuesped (int id){
        
        String sql = "SELECT idReserva, codigo, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado FROM reserva WHERE idHuesped = ?";
        Reserva resv = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resv = new Reserva();
                resv.setIdReserva(rs.getInt("idReserva"));
                resv.setIdHuesped(id);
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación activa con ese ID de reserva.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de reserva.");
        }
        return resv;
    }
    
    public Reserva buscarReservaPorCod (int cod){
        
        String sql = "SELECT idReserva, idHuesped, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado FROM reserva WHERE codigo = ?";
        Reserva resv = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resv = new Reserva();
                resv.setIdReserva(rs.getInt("idReserva"));
                resv.setIdHuesped(rs.getInt("idHuesped"));
                resv.setCodigo(cod);
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación activa con ese ID de reserva.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de reserva.");
        }
        return resv;
    }
    
    public Reserva buscarReservaPorCantPers (int cantPers){
        
        String sql = "SELECT idReserva, idHuesped, codigo, Fecha_entrada, Fecha_salida, ImporteTotal, Estado FROM reserva WHERE cantPersonas = ?";
        Reserva resv = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantPers);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                resv = new Reserva();
                resv.setIdReserva(rs.getInt("idReserva"));
                resv.setIdHuesped(rs.getInt("idHuesped"));
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(cantPers);
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(rs.getBoolean("Estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe tipo de habitación activa con ese ID de reserva.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de tipo de reserva.");
        }
        return resv;
    }
    
    public List<Reserva> listarReservas() {

        String sql = "SELECT idReserva, idHuesped, codigo, cantPersonas, Fecha_entrada, Fecha_salida, ImporteTotal, Estado FROM reserva";
        ArrayList<Reserva> reserva = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva resv = new Reserva();
                resv.setIdReserva(rs.getInt("idReserva"));
                resv.setIdHuesped(rs.getInt("idHuesped"));
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(rs.getBoolean("Estado"));
                reserva.add(resv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de reserva.");
        }
        return reserva;
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
                resv.setIdHuesped(rs.getInt("idHuesped"));
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(true);
                reserva.add(resv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de reserva.");
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
                resv.setIdHuesped(rs.getInt("idHuesped"));
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(false);
                reserva.add(resv);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de reserva.");
        }
        return reserva;
    }
    
    public List<Reserva> listarReservasPorIDReserva(int idReserva) {

        ArrayList<Reserva> reserva = new ArrayList<>();
        String sql = "SELECT * FROM reserva WHERE idReserva = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva resv = new Reserva();
                resv.setIdReserva(idReserva);
                resv.setIdHuesped(rs.getInt("idHuesped"));
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(rs.getBoolean("Estado"));
                reserva.add(resv);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex+"Error al acceder a la tabla de reserva.");
            System.out.println(ex);
        }
        return reserva;
    }
    
    public List<Reserva> listarReservasPorIDHuesped(int idHuesped) {

        ArrayList<Reserva> reserva = new ArrayList<>();
        String sql = "SELECT * FROM reserva WHERE idHuesped = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva resv = new Reserva();
                resv.setIdReserva(rs.getInt("idReserva"));
                resv.setIdHuesped(idHuesped);
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(rs.getBoolean("Estado"));
                reserva.add(resv);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex+"Error al acceder a la tabla de reserva.");
            System.out.println(ex);
        }
        return reserva;
    }
    
    public List<Reserva> listarReservasPorCod(int cod) {

        ArrayList<Reserva> reserva = new ArrayList<>();
        String sql = "SELECT * FROM reserva WHERE codigo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva resv = new Reserva();
                resv.setIdReserva(rs.getInt("idReserva"));
                resv.setIdHuesped(rs.getInt("idHuesped"));
                resv.setCodigo(cod);
                resv.setCantPersonas(rs.getInt("cantPersonas"));
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(rs.getBoolean("Estado"));
                reserva.add(resv);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex+"Error al acceder a la tabla de reserva.");
            System.out.println(ex);
        }
        return reserva;
    }
    
    public List<Reserva> listarReservasPorCantPers(int cantPers) {

        ArrayList<Reserva> reserva = new ArrayList<>();
        String sql = "SELECT * FROM reserva WHERE cantPersonas = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantPers);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva resv = new Reserva();
                resv.setIdReserva(rs.getInt("idReserva"));
                resv.setIdHuesped(rs.getInt("idHuesped"));
                resv.setCodigo(rs.getInt("codigo"));
                resv.setCantPersonas(cantPers);
                resv.setFecha_entrada(rs.getDate("Fecha_entrada").toLocalDate());
                resv.setFecha_salida(rs.getDate("Fecha_salida").toLocalDate());
                resv.setImporteTotal(rs.getDouble("ImporteTotal"));
                resv.setEstado(rs.getBoolean("Estado"));
                reserva.add(resv);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex+"Error al acceder a la tabla de reserva.");
            System.out.println(ex);
        }
        return reserva;
    }
}
