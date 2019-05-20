package iesdonana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDUtil {
    public static Connection conexion(String url, String usuario, String clave) throws SQLException {
        Connection conexion = null;
        conexion = DriverManager.getConnection(url, usuario, clave);
        return conexion;
    }
}
