package leccion38;

import leccion38.model.Database;

import java.sql.SQLException;

public class TestDatabase {

    public static void main(String[] args) {
        System.out.println("Corriendo test de base de datos");
        Database db = new Database();
        try {
            db.conectar();
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
        try {
            db.desconectar();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        try {
            db.guardar();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
