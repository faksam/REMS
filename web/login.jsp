<%-- 
    Document   : login
    Created on : Oct 8, 2015, 10:22:01 AM
    Author     : Samuel
--%>

<%@page import="BL.myLib"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        
    <%@include file='navigation.jsp'%>
        <title>Log In - Real Estate Management</title>
    </head>
    <body>
        
        <div class="container">
        
            <h1 style="text-align: center;">Log In!</h1>
        <form>
            <div class="form-group">
            <p>Username:</p> <input class="form-control" type="text" name="txtUserName" value="faksam" required="required"/>
            <br><br>
            <p>Password:</p><input class="form-control" type="text" name="txtPass" value="password" required="required"/>
            <br><br>
            <p>Account Type</p>
            <select class="form-control" name="txtAccountType" required="required">
                <option>Manager</option>
                <option>Landlord</option>
                <option>Tenant</option>
            </select>
            <br><br>
            <input class="btn btn-default" type="submit" value="Log In" name="btnUserLogIn" />
            <br><br>
            </div>
            <%
                if(request.getParameter("btnUserLogIn")!=null){
                    String Name="";
                    String Username= request.getParameter("txtUserName");
                    String Password= request.getParameter("txtPass");
                    String AccountType= request.getParameter("txtAccountType");
                    
                    boolean found=false;
                    Name=myLib.SearchUser(Username,Password,AccountType);
                    if(!Name.equalsIgnoreCase(""))
                    found=true;
                    %><p><%=found%></p><%
                    if(found)
                    {
                        %> <p><%=Username%></p>
                    <p><%=Password%></p>
                    <p><%=AccountType%></p><%
                    if(AccountType.equals("Manager"))
                    {
                        session.setAttribute("Manager", Name);
                    }
                    else if(AccountType.equals("Landlord"))
                    {
                        session.setAttribute("Landlord", Name);
                    }
                    else if(AccountType.equals("Tenant"))
                    {
                        session.setAttribute("Tenant", Name);
                    }
                    
                    response.sendRedirect("index.jsp");
                    }
                    else
                    {
                        %> <p>User Not found</p><%
                    }
                }
    %>
        </form>
           <%@include file='footer.jsp'%>
        </div>
    </body>
</html>
