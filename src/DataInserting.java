import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DataInserting {
    public static void main(String args[] ) throws SQLException {
     //DbConnection inserting = new DbConnection();
       // System.out.println("JAVA Working");


        Connection conn =  DBConnectionReBuild.getConnection();;
        Statement stmt = null;

        if(conn == null){
            System.out.println("conn Null");
        }else {
            System.out.println(" conn Not Null");
        }

        stmt = conn.createStatement();
        String sql = "INSERT INTO test_table(id, name, country) " +
                "VALUES(45, 'TestFromRemoteClass', 'testRemoteClassDbConnection');";
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
        System.out.println("INSERTED sucessfully");







    }
}
