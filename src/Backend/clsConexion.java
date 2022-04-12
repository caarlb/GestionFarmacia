
package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author caarlb
 */
public class clsConexion {
    
    public static Connection getConexion() {
        String Cadena = "jdbc:sqlserver://localhost:1433;databaseName=BD_FARMACIA;user=sa;password=Umg$19;loginTimeout=30";
        try {
            Connection con = DriverManager.getConnection(Cadena);
            return con;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
            return null;
        } finally {
        }

    }
    
}
