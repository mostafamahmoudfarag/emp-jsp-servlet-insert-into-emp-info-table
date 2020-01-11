<%-- 
    Document   : emp_info
    Created on : Sep 18, 2019, 9:53:53 PM
    Author     : mostafa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="EmpInfo" method="post" >
            <center>
            <input type="text" name="id" placeholder="id">  <br>
            <input type="text" name="first_name" placeholder="first_name">
            <br>
            <input type="text" name="last_name" placeholder="last_name">
            <br>
            <input type="text" name="mobile" placeholder="mobile">
            <br>
            <input type="submit" name="add" value="add">  
                        <input type="submit" name="delete" value="delete">  
                                    <input type="submit" name="update" value="update">  
            
            </center>
            
        </form>
        
    </body>
</html>
