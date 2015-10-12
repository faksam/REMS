<%-- 
    Document   : AddProperty
    Created on : Oct 8, 2015, 10:22:49 AM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            if((session.getAttribute("Manager")== null) || (session.getAttribute("Landlord")== null) )
                response.sendRedirect("index.jsp");
       %>
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
        
        <form name="AddUser" action="Submit">
            <p>Property Type: </p>
            <select id="propType" name="PropertyType">
                <option>Vacant Land</option>
                <option>Commercial Property</option>
                <option>Residential Property</option>
            </select>
            
            <script>
                document.getElementById("propType").addEventListener("change", displayDate);

                function displayDate() {
                    document.getElementById("prop").style.visibility = "visible";
                    document.getElementById("prop").style.display = "block";
                    document.getElementById("res").style.visibility = "visible";
                    document.getElementById("com").style.visibility = "visible";
                    document.getElementById("vac").style.visibility = "visible";
                }
            </script>
            <div id="prop" style="visibility: hidden; display: none;">
                <p>Address: </p><input type="text" name="Name" value="" />
                <p>Price: </p><input type="text" name="Username" value="" />
                <p>Description: </p><input type="password" name="Password" value="" />
                <p>Status: </p><input type="text" name="Name" value="" />
                <p>Landlord: </p><input type="text" name="Username" value="" />
            </div>
            
            <div id="res" style="visibility: hidden; display: none;">
                <p>Rooms: </p><input type="text" name="Name" value="" />
                <p>Bath: </p><input type="text" name="Username" value="" />
                <p>Living Area: </p><input type="password" name="Password" value="" />
                <p>Residential Type: </p><input type="password" name="Password" value="" />
            </div>
            
            <div id="com" style="visibility: hidden; display: none;"> 
                <p>Building: </p><input type="text" name="Username" value="" />
                <p>Commercial Type: </p><input type="password" name="Password" value="" />
            </div>
            
            <div id="vac" style="visibility: hidden; display: none;">
                <p>Size:</p><input type="password" name="Password" value="" />
            </div>
            
            <br><br>
            <input type="submit" value="Register" name="addUser" />
        </form>
        </div>
    </body>
</html>
