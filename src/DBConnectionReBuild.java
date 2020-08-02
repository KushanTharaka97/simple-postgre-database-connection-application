import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionReBuild {
    private static String dbUrl = "jdbc:postgresql://localhost:5432/testdb";
    private static String dbUsername = "new_user";
    private static String dbPassword = "new_user";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    }
}
