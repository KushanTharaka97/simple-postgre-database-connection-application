import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DataInserting {
    public static void main(String args[] ) throws SQLException {
     //DbConnection inserting = new DbConnection();
       // System.out.println("JAVA Working");
        DBConnectionReBuild.getConnection();

        Connection conn = null;
        Statement stmt = null;

        stmt = conn.createStatement();
        String sql = "INSERT INTO test_table(id, name, country) " +
                "VALUES(444, 'TestFromRemoteClass', 'testRemoteClassDbConnection');";
        stmt.executeUpdate(sql);







    }
}
