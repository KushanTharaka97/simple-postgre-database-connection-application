import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DbConnection {

    public static void dbConnection(){

        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection
                    ("jdbc:postgresql://localhost:5432/testdb/test_table",
                            "new_user",
                            "new_user");

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.err.println(ex.getClass().getName()+"(Class NotFound): "+ex.getMessage());
            System.exit(0);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("SQL Exception Happened: "+e.getMessage());
            System.exit(0);
        }

        System.out.println("Connected Sucessfully");
    }
}
