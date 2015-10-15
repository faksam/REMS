<%-- 
    Document   : addUser
    Created on : Oct 9, 2015, 9:23:00 AM
    Author     : Samuel
--%>

<%@page import="BL.myLib"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            if((session.getAttribute("Manager")== null))
                if((session.getAttribute("Landlord")== null))
                    response.sendRedirect("index.jsp");
       %>
    <%@include file='navigation.jsp'%>
        <title>Add Users - Real Estate Management</title>
    </head>
    <body>
        <div class="container">
            <form>
                <h1 style="text-align: center;">Add User</h1>
                <hr />
                    <div class="form-group">
                        <p>Name: </p><input class="form-control" data-val="true" required="required" type="text" name="txtName" value="" />
                    </div>
                <div class="form-group">
            <p>Username: </p><input class="form-control" data-val="true" required="required"  type="text" name="txtUsername" value="" />
           </div>
            <div class="form-group">
            <p>Password: </p><input class="form-control" data-val="true" required="required"  type="password" name="txtPassword" value="" />
            </div>
            <div class="form-group">
            <p>Account type:</p>
            <select class="form-control" name="AccountType">
                <%    
                         if((session.getAttribute("Landlord") == null))
                        {%>
                <option>Landlord</option>
                <%}%>
                <option>Tenant</option>
            </select>
            <br><br>
            </div>
            <input type="submit" class="btn btn-default" value="Submit" name="btnAddUser" />
            <br><br>
        </form>
            <%
                if(request.getParameter("btnAddUser")!=null){
                    boolean found=false;
                    String Name = request.getParameter("txtName");
                    String Username = request.getParameter("txtUsername");
                    String Password = request.getParameter("txtPassword");
                    String AccountType = request.getParameter("AccountType");
                    
                    myLib.AddUser(Name,Username,Password,AccountType);
                    
                    //boolean found=false;
                    //found=myLib.SearchUser(Username,Password,AccountType);
                   
                    response.sendRedirect("index.jsp");
                 
                }
    %>
        </div>
    </body>
    <%@include file='footer.jsp'%>
</html>
