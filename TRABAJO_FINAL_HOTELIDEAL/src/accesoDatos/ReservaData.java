package accesoDatos;

import entidades.Reserva;
import accesoDatos.HuespedData;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
        String sql="INSERT INTO reserva (idHuesped, codigo, cantPersonas, "
                + "Fecha_entrada, Fecha_salida, ImporteTotal, Estado) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?)";
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

        String sql = "UPDATE reserva SET cantPersonas = ?, Fecha_entrada = ?, "
                + "Fecha_salida = ? WHERE idHuesped = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, resv.getCantPersonas());
            ps.setDate(2, Date.valueOf(resv.getFecha_entrada()));
            ps.setDate(3, Date.valueOf(resv.getFecha_salida()));
            ps.setDouble(4, resv.getImporteTotal());
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
        String sql = "UPDATE reserva SET estado=0 WHERE idReserva=?";
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
        String sql = "UPDATE reserva SET estado=1 WHERE idReserva=?";
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
    
}
