<%-- 
    Document   : userDetails
    Created on : Oct 11, 2015, 7:03:26 PM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%
            if((session.getAttribute("login")== null))
                response.sendRedirect("login.jsp");
       %>
       
       
    <%@include file='navigation.jsp'%>
        <title>JSP Page</title>
    </head>
    <body>
      
        <div class="container">
            <form name="AddUser" action="Submit">
                <h1 style="text-align: center;">Update User</h1>
                <hr />
                    <div class="form-group">
                        <p>Name: </p><input class="form-control" data-val="true" required="required" type="text" name="Name" value="" />
                    </div>
                <div class="form-group">
            <p>Username: </p><input class="form-control" data-val="true" required="required"  type="text" name="Username" value="" />
           </div>
            <div class="form-group">
            <p>Password: </p><input class="form-control" data-val="true" required="required"  type="password" name="Password" value="" />
            </div>
            <div class="form-group">
            <p>Account type:</p>
            <select class="dropdown" name="AccountType">
                <option>Manager</option>
                <option>Landlord</option>
                <option>Tenant</option>
            </select>
            <br><br>
            </div>
            <input type="submit" class="btn btn-default" value="Submit" name="addUser" />
            <br><br>
        </form>
        </div>
        
    </body>
    <%@include file='footer.jsp'%>
</html>
