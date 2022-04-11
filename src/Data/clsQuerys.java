
package Data;

import Backend.clsConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author caarlb
 */
public class clsQuerys {
    
    
    
    public clsQuerys() {
    }

    public Boolean fncLogin(String pUsuario, String pPass) {

        boolean Resp = false;  //0 significa que no existe en BD
        try {

            Statement sql = clsConexion.getConexion().createStatement();
            String Query = "SELECT CUI FROM TB_USUARIO WHERE USUARIO = '" + pUsuario + "' AND PASS = '" + pPass + "';";
            System.out.println(Query);
            ResultSet resultado = sql.executeQuery(Query);
            if (resultado != null && resultado.next()) {
                Resp = true;
            }

        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return Resp;
    }
    
    
    
}
