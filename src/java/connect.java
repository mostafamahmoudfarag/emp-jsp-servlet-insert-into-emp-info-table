
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class connect {
    static Connection c;
    public static Connection con()
    {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            
           c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
           
        } catch (Exception e) {
        System.out.println("erro in "+e.getMessage() );
        }
        return c;

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static void main(String args[])
//    {
//        connect.con();
//    }
    
}
