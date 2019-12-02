package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectHelper {

    private static Connection conn;
    static {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5433/Business",
                    "postgres",
                    "Milkovskii69"
            );
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws ClassNotFoundException {
        return conn;
    }
}
