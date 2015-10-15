<%-- 
    Document   : tester
    Created on : Oct 10, 2015, 9:51:40 PM
    Author     : Samuel
--%>

<%@page import="BL.myLib"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
    <%@include file='navigation.jsp'%>
        <title>Register - Real Estate Management</title>
    </head>
    <body>
       
        <div class="container">
        <h1 style="text-align: center;">Register as a real estate manager</h1>
                <hr />
                <div class="form-group">
            <form class="">
            <p>Name*</p><input class="form-control" type="text" name="txtName" value="" />
            <br><br>
            <p>Username*</p><input class="form-control" type="text" name="txtUsername" value="" />
            <br><br>
            <p>Password*</p><input class="form-control" type="password" name="txtPassword" value="" />
            <br><br>
            <p>Confirm Password*</p><input class="form-control" type="password" name="Password" value="" />
            <br><br>
            <p>Phone*</p><input class="form-control" type="text" name="Password" value="" />
            <br><br>
            <p>Email*</p><input class="form-control" type="text" name="Password" value="" />
            <br> <br>          
            <p>   How did you find us?</p>
            <select class="form-control">
                <option value="Internet Search">Internet Search</option>
                <option value="Referral">Referral</option>
                <option value="Blog Reader">Blog Reader</option>
                <option value="Phone Book">Phone Book</option>
                <option value="Postcard/mailer">Postcard/mailer</option>
                <option value="Other">Other</option>
            </select>
            <br><br>
            <p>Who may we thank for refering you?</p><input class="form-control" type="text" name="Password" value="" />
            <br><br>
            <p>Other: Please Describe</p><input class="form-control" type="password" name="text" value="" />
            <br><br>
            <input class="btn btn-default" type="submit" value="Submit" name="btnRegister" />
            <br><br>
        </form>
                    </div>
                <%
                if(request.getParameter("btnRegister")!=null){
                    boolean found=false;
                    String Name = request.getParameter("txtName");
                    String Username = request.getParameter("txtUsername");
                    String Password = request.getParameter("txtPassword");
                    String AccountType = "Manager";
                    
                    myLib.AddUser(Name,Username,Password,AccountType);
                    
                    //boolean found=false;
                    //found=myLib.SearchUser(Username,Password,AccountType);
                   
                    response.sendRedirect("login.jsp");
                 
                }
    %>
        </div>
        
    </body>
    <%@include file='footer.jsp'%>
</html>
