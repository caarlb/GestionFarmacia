package Data;

import Backend.clsConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

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
            String query = "SELECT CUI FROM TB_USUARIO WHERE USUARIO = '" + pUsuario + "' AND PASS = '" + pPass + "';";
            System.out.println(query);
            ResultSet resultado = sql.executeQuery(query);
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
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return Resp;
    }

    public DefaultTableModel fcnShowProductsList() {
        String[] titulosColumnas = {"Codigo",
            "Nombre",
            "Tipo",
            "Farmaceutica",
            "Presentacion",
            "Stock",
            "Precio",
            "Composicion"};
        String[] datosDeProductos = new String[8];

        DefaultTableModel modeloConDatos = new DefaultTableModel(null, titulosColumnas);

        try {
            Statement sql = clsConexion.getConexion().createStatement();
            String query = "SELECT * FROM TB_PRODUCTO";
            System.out.println(query);
            ResultSet resultado = sql.executeQuery(query);
            while (resultado.next()) {
                datosDeProductos[0] = resultado.getString("COD_PRODUCTO");
                datosDeProductos[1] = resultado.getString("NOMBRE");
                datosDeProductos[2] = resultado.getString("TIPO_MEDICAMENTO");
                datosDeProductos[3] = resultado.getString("FARMACEUTICA");
                datosDeProductos[4] = resultado.getString("PRESENTACION");
                datosDeProductos[5] = resultado.getString("STOCK");
                datosDeProductos[6] = resultado.getString("PRECIO");
                datosDeProductos[7] = resultado.getString("COMPOSICION");
                modeloConDatos.addRow(datosDeProductos);
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return modeloConDatos;
    }

    public String[] fncDetalleProductoParaFactura(int pCodigo) {

        String[] datosDeRespuesta = new String[3];

        try {
            Statement sql = clsConexion.getConexion().createStatement();
            String query = "SELECT NOMBRE, STOCK, PRECIO FROM TB_PRODUCTO WHERE COD_PRODUCTO = " + pCodigo + ";";
            System.out.println(query);
            ResultSet resultado = sql.executeQuery(query);
            if (resultado != null && resultado.next()) {
                datosDeRespuesta[0] = resultado.getString("NOMBRE");
                datosDeRespuesta[1] = resultado.getString("STOCK");
                datosDeRespuesta[2] = resultado.getString("PRECIO");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }
        return datosDeRespuesta;
    }

    public String[] fcnDetalleUnProducto(String indice) {

        String[] detallesDeProducto = new String[8];

        try {
            Statement sql = clsConexion.getConexion().createStatement();
            String query = "SELECT * FROM TB_PRODUCTO WHERE COD_PRODUCTO = " + indice + ";";
            System.out.println(query);
            ResultSet resultado = sql.executeQuery(query);
            if (resultado != null && resultado.next()) {
                detallesDeProducto[0] = resultado.getString("COD_PRODUCTO");
                detallesDeProducto[1] = resultado.getString("NOMBRE");
                detallesDeProducto[2] = resultado.getString("TIPO_MEDICAMENTO");
                detallesDeProducto[3] = resultado.getString("FARMACEUTICA");
                detallesDeProducto[4] = resultado.getString("PRESENTACION");
                detallesDeProducto[5] = resultado.getString("STOCK");
                detallesDeProducto[6] = resultado.getString("PRECIO");
                detallesDeProducto[7] = resultado.getString("COMPOSICION");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return detallesDeProducto;
    }

    public String[] fcnDetalleUnProductoPorNombre(String nombre) {

        String[] detallesDeProducto = new String[8];

        try {
            Statement sql = clsConexion.getConexion().createStatement();
            String query = "SELECT * FROM TB_PRODUCTO WHERE NOMBRE = '" + nombre + "';";
            System.out.println(query);
            ResultSet resultado = sql.executeQuery(query);
            if (resultado != null && resultado.next()) {
                detallesDeProducto[0] = resultado.getString("COD_PRODUCTO");
                detallesDeProducto[1] = resultado.getString("NOMBRE");
                detallesDeProducto[2] = resultado.getString("TIPO_MEDICAMENTO");
                detallesDeProducto[3] = resultado.getString("FARMACEUTICA");
                detallesDeProducto[4] = resultado.getString("PRESENTACION");
                detallesDeProducto[5] = resultado.getString("STOCK");
                detallesDeProducto[6] = resultado.getString("PRECIO");
                detallesDeProducto[7] = resultado.getString("COMPOSICION");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return detallesDeProducto;
    }

    public Boolean fncUpdateProduct(
            String pCodigo,
            String pNombre,
            String pTipo,
            String pFarmaceutica,
            String pPresentacion,
            String pStock,
            String pPrecio,
            String pComposicion) {
        boolean Resp = false;

        try {
            Statement sql = clsConexion.getConexion().createStatement();
            String Query
                    = "UPDATE TB_PRODUCTO SET "
                    + "NOMBRE = '" + pNombre + "',"
                    + "TIPO_MEDICAMENTO = '" + pTipo + "',"
                    + "FARMACEUTICA = '" + pFarmaceutica + "',"
                    + "PRESENTACION = '" + pPresentacion + "',"
                    + "STOCK = " + pStock + ","
                    + "PRECIO = " + pPrecio + ","
                    + "COMPOSICION = '" + pComposicion + "'"
                    + "WHERE COD_PRODUCTO = " + pCodigo + ";";

            sql.executeUpdate(Query);

            System.out.println(Query);
            Resp = true;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return Resp;
    }

    public Boolean fncDeleteProduct(String pCodigo) {
        boolean Resp = false;

        try {
            Statement sql = clsConexion.getConexion().createStatement();
            String Query
                    = "DELETE FROM TB_PRODUCTO "
                    + "WHERE COD_PRODUCTO = " + pCodigo + ";";

            sql.executeUpdate(Query);
            System.out.println(Query);
            Resp = true;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return Resp;
    }

    public String[] fcnDetalleCliente(String nit) {

        String[] detallesCliente = new String[3];

        try {
            Statement sql = clsConexion.getConexion().createStatement();
            String query = "SELECT * FROM TB_CLIENTE WHERE NIT = '" + nit + "';";
            System.out.println(query);
            ResultSet resultado = sql.executeQuery(query);
            if (resultado != null && resultado.next()) {
                detallesCliente[0] = resultado.getString("NIT");
                detallesCliente[1] = resultado.getString("NOMBRE");
                detallesCliente[2] = resultado.getString("DIRECCION");
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return detallesCliente;
    }

    public boolean fncInsertNit(
            String pNit,
            String pNombre,
            String pDireccion) {

        boolean resp = false;

        try {
            Statement sql = clsConexion.getConexion().createStatement();
            String Query = "INSERT INTO TB_CLIENTE (NIT, NOMBRE, DIRECCION) "
                    + "VALUES ('" + pNit + "','" + pNombre + "','" + pDireccion + "');";

            sql.executeUpdate(Query);

            System.out.println(Query);
            resp = true;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.toString());
        }

        return resp;
    }

}
