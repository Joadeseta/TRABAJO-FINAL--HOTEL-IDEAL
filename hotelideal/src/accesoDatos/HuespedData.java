/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import entidades.Huesped;
import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joadz
 */
public class HuespedData {

    private Connection con = null;

    public HuespedData() {
        con = Conexion.getConexion();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
        }
    }

    public void agregarHuesped(Huesped huesped) {
        String sql = "INSERT INTO huesped (nombre, dni, domicilio, correo, celular, estado) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, huesped.getNombre());
            ps.setInt(2, huesped.getDni());
            ps.setString(3, huesped.getDomicilio());
            ps.setString(4, huesped.getCorreo());
            ps.setInt(5, huesped.getCelular());
            ps.setBoolean(6, huesped.isEstado());

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    huesped.setIdHuesped(rs.getInt(1));
                    /*JOptionPane.showMessageDialog(null, "Huesped agregado");*/
                }
            }

            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
    }

    public Huesped obtenerHuespedPorDNIYID(int dni) {
        String sql = "SELECT * FROM huesped WHERE dni = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               
                Huesped huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setEstado(rs.getBoolean("estado"));

                return huesped;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar el huésped por DNI");
        }
        return null; // Si no se encuentra un registro, retorna null
    }

    public void actualizarHuesped(Huesped huespedActualizado) {
        String sql = "UPDATE huesped SET nombre=?, dni=?, domicilio=?, correo=?, celular=?, estado=? WHERE dni=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, huespedActualizado.getNombre());
            ps.setInt(2, huespedActualizado.getDni());
            ps.setString(3, huespedActualizado.getDomicilio());
            ps.setString(4, huespedActualizado.getCorreo());
            ps.setInt(5, huespedActualizado.getCelular());
            ps.setBoolean(6, huespedActualizado.isEstado());
            ps.setInt(7, huespedActualizado.getIdHuesped());

            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Huesped actualizado");
            }

            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
    }

    public void eliminaHuesped(int idHuesped) {
        String sql = "DELETE FROM huesped WHERE idHuesped=?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idHuesped);

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas == 1) {
            System.out.println("aaaaaa");
            /*JOptionPane.showMessageDialog(null, "Huésped eliminado exitosamente.");*/
             System.out.println("aaaaaa");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "No se pudo eliminar al huésped");
    }

    }

    public Huesped buscarHuesped(int idHuesped) {
        String sql = "SELECT dni, nombre, domicilio, correo, celular, estado FROM huesped WHERE idHuesped=?";
        Huesped huesped = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(idHuesped);
                huesped.setDni(rs.getInt("dni"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setEstado(true);
            } else {
                
               /* JOptionPane.showMessageDialog(null, "No existe un huésped con ese ID");*/
               
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
        return huesped;
    }

    public Huesped buscarPorDni(int dni) {
        String sql = "SELECT idHuesped, nombre, domicilio, correo, celular, estado FROM huesped WHERE dni=?";
        Huesped huesped = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(dni);
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setEstado(true);
            } else {
                
               /* JOptionPane.showMessageDialog(null, "No existe un huésped con ese DNI");*/
              
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
        return huesped;
    }

    public ArrayList<Huesped> obtenerTodosLosHuespedes() {
        ArrayList<Huesped> listaHuespedes = new ArrayList<>();
        String sql = "SELECT idHuesped, dni, nombre, domicilio, correo, celular FROM huesped";
        try (PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Huesped huesped = new Huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("dni"));
                huesped.setNombre(rs.getString("nombre"));
                huesped.setDomicilio(rs.getString("domicilio"));
                huesped.setCorreo(rs.getString("correo"));
                huesped.setCelular(rs.getInt("celular"));
                huesped.setEstado(true);
                listaHuespedes.add(huesped);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla huesped");
        }
        return listaHuespedes;
    }

}
/* agregarHuesped(Huesped huesped)
actualizarHuesped(int id, Huesped huespedActualizado)
eliminarHuesped(int id)
buscarHuespedPorId(int id)
buscarHuespedPorDNI(String dni)
obtenerTodosLosHuespedes()*/
