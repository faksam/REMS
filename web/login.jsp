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
        
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/full-slider.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Log In - Real Estate Management</title>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">REM</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="about.jsp">About</a>
                    </li>
                    <li>
                        <a href="services.jsp">Services</a>
                    </li>
                    <li>
                        <a href="contact.jsp">Contact</a>
                    </li>
                </ul>
                <form class="navbar-form navbar-right" >
                    
                    <a type="submit" href="register.jsp" class="btn btn-default">Register</a>
                </form>
                
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
        <header>
            <div style="margin: 0 auto; width:1080px; height:380px">
                <a href="#">
                    <img  width="1080" height="380" src="images/residential-properties-in-bhubaneswar2.jpg" alt=""/>
                </a>
            </div>
        </header>
        <div class="container">
        
            <h1 style="text-align: center;">Log In!</h1>
        <form>
            <p>Username:</p> <input type="text" name="txtUserName" value="faksam" required="required"/>
            <p>Password:</p><input type="text" name="txtPass" value="password" required="required"/>
            <p>Account Type</p>
            <select name="txtAccountType" required="required">
                <option>Manager</option>
                <option>Landlord</option>
                <option>Tenant</option>
            </select>
            <br><br>
            <input type="submit" value="Register" name="btnaddUser" />
            <br><br>
            
            <%
                if(request.getParameter("btnaddUser")!=null){
                    String Username= request.getParameter("txtUserName");
                    String Password= request.getParameter("txtPass");
                    String AccountType= request.getParameter("txtAccountType");
                    
                    boolean found=true;
                    found=myLib.SearchUser(Username,Password,AccountType);
                    %><p><%=found%></p><%
                    if(found)
                    {
                        %> <p><%=Username%></p>
                    <p><%=Password%></p>
                    <p><%=AccountType%></p><%
                    session.setAttribute("Login", Username);
                    response.sendRedirect("homePage.jsp");
                    }
                    else
                    {
                        %> <p>User Not found</p><%
                    }
                }
    %>
        </form>
            <!-- Footer -->
        <footer>
            <hr />
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
            <!-- /.row -->
        </footer>
        </div>
    </body>
</html>
