
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class EmpInfo extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     int id=Integer.parseInt(request.getParameter("id"));
     String firstname=request.getParameter("first_name");
     String lastname=request.getParameter("last_name");
     String mobile=request.getParameter("mobile");
 
         EmpInfoModel e=new EmpInfoModel();
     if(request.getParameter("add")!=null)
     {
         e.add(id, firstname, lastname, mobile);
     }      
     if(request.getParameter("delete")!=null)
     {
         e.delete(id);
     }
     if(request.getParameter("update")!=null)
     {
         e.update(id,firstname,lastname);
     }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
}
