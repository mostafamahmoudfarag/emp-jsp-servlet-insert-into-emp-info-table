
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmpInfoModel {
    Connection conn;
    PreparedStatement pst;
   public void add(int id,String first_name,String last_name,String mobile)
   {
conn=connect.con();
String insertsql="insert into emp_info values("+id+","+"'"+first_name+"'"+","+"'"+last_name+"'"+","+"'"+mobile+"'"+")";
        try {
           pst= conn.prepareStatement(insertsql);
           pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 
   }
   public void delete(int id)
   {
       conn=connect.con();
String deletesql="delete from emp_info where id="+id+"";
        try {
           pst= conn.prepareStatement(deletesql);
           pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 
   }
   public void update(int id,String f,String l)
   {
              conn=connect.con();
String updatesql="update  emp_info set first_name='"+f+"',last_name='"+l+"'  where id="+id+" ";
        try {
           pst= conn.prepareStatement(updatesql);
           pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
   }
    
    
    
    
}
