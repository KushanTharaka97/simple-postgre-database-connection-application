import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionReBuild {
    public static String dbUrl = "jdbc:postgresql://localhost:5432/testdb";
     public static String dbUsername = "new_user";
    public static String dbPassword = "new_user";

    public static Connection getConnection() throws SQLException
    {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        return conn;
    }
}
