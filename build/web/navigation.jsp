<%-- 
    Document   : navigation
    Created on : Oct 14, 2015, 9:33:46 PM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/full-slider.css" rel="stylesheet" type="text/css"/>
        <script src="js/jquery.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Property - Real Estate Management</title>
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
                        <% if ((session.getAttribute("Manager") != null)||(session.getAttribute("Landlord")!=null)) { %>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                                Add 
                                <span class="caret"></span>
                            </a>
                            
                            <ul class="dropdown-menu" role="menu">
                                <% if((session.getAttribute("Manager")!=null)){ %>
                                <li><a href="addUser.jsp">Landlord</a></li>
                                    <% }%>
                                <% if ((session.getAttribute("Landlord") != null)) { %>
                                
                                <% }%>
                                <li><a href="addUser.jsp">Tenant</a></li>
                                <li><a href="addProperty.jsp">Property</a></li>
                            </ul>
                                
                            
                        </li>
                        <% }%>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
                                Search 
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu" role="menu">
                                <% if ((session.getAttribute("Manager") != null)) { %>
                                <li><a href="searchUser.jsp">User</a></li>

                                <% }%>
                                <li><a href="searchProperty.jsp">Property</a></li>
                                
                            </ul>
                        </li>
                        <% if ((session.getAttribute("Landlord") != null)) { %>
                        <li>
                            <a href="landlordProperty.jsp">My Properties</a>
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
                        <%  String currentUser = "";
                            if (session.getAttribute("Manager") != null) {
                                currentUser = "" + session.getAttribute("Manager");
                            }
                            if (session.getAttribute("Landlord") != null) {
                                currentUser = "" + session.getAttribute("Landlord");
                            }
                            if (session.getAttribute("Tenant") != null) {
                                currentUser = "" + session.getAttribute("Tenant");
                            }

                            if ((session.getAttribute("Manager") != null)
                                    || (session.getAttribute("Landlord") != null)
                                    || (session.getAttribute("Tenant") != null)) {%>
                        <li>
                            <a type="submit" href="userDetails.jsp" ><%=currentUser%></a>
                        </li>
                        <li>
                            <a type="submit" href="logOut.jsp" >Log Out</a>
                        </li>
                        <% } else {
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
    </body>
</html>
