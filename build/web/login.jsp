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
                        <% if((session.getAttribute("Manager")!=null) || (session.getAttribute("Landlord")!=null)){ %>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                                Add 
                                <span class="caret"></span>
                            </a>
                            
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="addUser.jsp">User</a></li>
                                <li><a href="addProperty.jsp">Vacant Land</a></li>
                                <li><a href="addProperty.jsp">Residential Property</a></li>
                                <li><a href="addProperty.jsp">Commercial Property</a></li>
                            </ul>
                            
                        </li>
                        <% }%>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                                Search 
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="searchUser.jsp">User</a></li>
                                <li><a href="searchProperty.jsp">Vacant Land</a></li>
                                <li><a href="searchProperty.jsp">Residential Property</a></li>
                                <li><a href="searchProperty.jsp">Commercial Property</a></li>
                            </ul>
                        </li>
                        <% if((session.getAttribute("Manager")!=null)){ %>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                                Update 
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">User</a></li>
                                <li><a href="#">Vacant Land</a></li>
                                <li><a href="#">Residential Property</a></li>
                                <li><a href="#">Commercial Property</a></li>
                            </ul>
                        </li>
                       <% }%>
                        <li>
                            <a href="services.jsp">Services</a>
                        </li>
                        <li>
                            <a href="contact.jsp">Contact</a>
                        </li>
                        <li>
                            <a href="about.jsp">About</a>
                        </li>
                    </ul>
                    
                    <ul class="nav navbar-nav navbar-right">
                        <%  String currentUser="";
                            if(session.getAttribute("Manager") != null)
                                 currentUser=""+session.getAttribute("Manager");
                                if(session.getAttribute("Landlord")!= null)
                                    currentUser=""+session.getAttribute("Landlord");
                                if(session.getAttribute("Tenant") != null)
                                    currentUser=""+session.getAttribute("Tenant");
                                
                            if((session.getAttribute("Manager") != null)
                                 || (session.getAttribute("Landlord")!= null)
                                   || (session.getAttribute("Tenant") != null))
                                    {  %>
                    <li>
                        <a type="submit" href="userDetails.jsp" ><%=currentUser%></a>
                    </li>
                    <li>
                        <a type="submit" href="logOut.jsp" >Log Out</a>
                    </li>
                    <% }  
                            else
                            {
                    %>
                    <li>
                    <a type="submit" href="login.jsp" >Log In </a>
                    </li>
                    <li>
                    <a type="submit" href="register.jsp" >Register</a>
                    </li>
                    
                    <% }  
                            
                    %>
                    </ul>


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
                    if(AccountType.equals("Manager"))
                    {
                        session.setAttribute("Manager", Username);
                    }
                    else if(AccountType.equals("Landlord"))
                    {
                        session.setAttribute("Landlord", Username);
                    }
                    else if(AccountType.equals("Tenant"))
                    {
                        session.setAttribute("Tenant", Username);
                    }
                    
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
