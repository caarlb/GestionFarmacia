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

        boolean Resp = false;  //false significa que no existe en BD
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

    public Boolean fncInsertProduct(String pNombre,
            String pTipo,
            String pFarmaceutica,
            String pPresentacion,
            String pComposicion,
            String pStock,
            String pPrecio) {
        boolean Resp = false;

        try {
            Statement sql = clsConexion.getConexion().createStatement();
            String Query = "INSERT INTO TB_PRODUCTO "
                    + "(NOMBRE, TIPO_MEDICAMENTO, FARMACEUTICA, PRESENTACION, COMPOSICION, STOCK, PRECIO) "
                    + "VALUES ('" + pNombre
                    + "', '" + pTipo
                    + "', '" + pFarmaceutica
                    + "', '" + pPresentacion
                    + "', '" + pComposicion
                    + "'," + pStock
                    + ", " + pPrecio
                    + ");";

            sql.executeUpdate(Query);

            System.out.println(Query);
            Resp = true;
            /*ResultSet resultado = sql.executeQuery(Query);
            if (resultado != null && resultado.next()) {
                Resp = true;
            }*/
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return Resp;
    }

}
