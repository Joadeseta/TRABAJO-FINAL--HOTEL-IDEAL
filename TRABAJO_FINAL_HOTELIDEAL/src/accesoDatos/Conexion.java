/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author joadz
 */
public class Conexion {
  

    // URL de conexión a la base de datos (debe especificar el host y la base de datos)
    private static final String URL = "jdbc:mariadb://localhost/3307";
    private static final String DB = "hotel_ideal";   //Nombre de la base de datos
    private static final String USUARIO = "root";// Nombre de usuario de la base de datos
    private static final String PASSWORD = " "; // Contraseña de la base de datos

    // Objeto de conexión a la base de datos
    private static Connection connection;

    
    // Constructor privado (se utiliza un patrón Singleton)    
    
    private Conexion() {
        
// El constructor está vacío ya que no se desea crear instancias de esta clase.

    }

    
    /**
     * Método estático para obtener una conexión a la base de datos.
     *
     * @return Objeto Connection que representa la conexión a la base de datos.
     */
    
    
    public static Connection getConexion() {
        if (connection == null) {
            try {
                
                // Carga el controlador JDBC de MariaDB
                
                
                Class.forName("org.mariadb.jdbc.Driver");
                
              // Configura y establece la conexión a la base de datos
              
                connection = DriverManager.getConnection(URL + DB
                        + "?useLegacyDatetimeCode = false&serverTimezone = UTC"
                        + "&user=" + USUARIO + "&password" + PASSWORD);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la DB: " + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers: " + ex.getMessage());
            }
        }
        return connection;  // Devuelve la conexión a la base de datos
    }

} 

