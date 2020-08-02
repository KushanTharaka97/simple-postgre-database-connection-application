import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DbConnection {

    public static Connection dbConnection(){

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection
                    ("jdbc:postgresql://localhost:5432/testdb",
                            "new_user",
                            "new_user");

            //c.setAutoCommit(false);
            System.out.println("Opened database sucessfully");

            stmt = conn.createStatement();
            String sql = "INSERT INTO test_table(id, name, country) " +
                    "VALUES(4444, 'TestTwoJavaName', 'testTwoJavaCountrty');";
            stmt.executeUpdate(sql);



        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println(ex.getClass().getName()+"(Class NotFound): "+ex.getMessage());
            System.exit(3);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL Exception Happened: "+e.getMessage());
            System.exit(2);
        }catch (Exception e){
            System.out.println("The error is alike :"+ e);
        }

        System.out.println("Connected Sucessfully");
        return conn;
    }
}
