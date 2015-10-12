<%-- 
    Document   : Contact
    Created on : Oct 10, 2015, 7:33:00 PM
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
        <title>Contact - Real Estate Management</title>
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
            <form action="/Home/Contact" method="post"><input name="__RequestVerificationToken" type="hidden" value="zGGs4JKF78S45p7ZrSp4VA_g_qj5mrwQavKcu0zJNJeV_NidJJWWQByQymTzIHj3t_eRAbd9BNOsvhl-5Y2eqDqqmumJXsDraRpwiS86xvlI9Wc9ChFdgGHrgpled55i2nfDZoM5xYXSJKyrN-FoaA2" />    <div class="form-horizontal">
                    <h1>Contact Us</h1>
                    <hr />
                    <div class="form-group">
                        <p>Your name</p>
                        <div class="col-md-10">
                            <input class="form-control" data-val="true" data-val-required="The Your name field is required." id="FromName" name="FromName" type="text" value="" />
                            <span class="field-validation-valid" data-valmsg-for="FromName" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <p>Your email</p>
                        <div class="col-md-10">
                            <input class="form-control" data-val="true" data-val-email="The Your email field is not a valid e-mail address." data-val-required="The Your email field is required." id="FromEmail" name="FromEmail" type="text" value="" />
                            <span class="field-validation-valid" data-valmsg-for="FromEmail" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <p>Message</p>
                        <div class="col-md-10">
                            <textarea class="form-control" cols="20" data-val="true" data-val-required="The Message field is required." id="Message" name="Message" rows="10">
                            </textarea>
                            <span class="field-validation-valid" data-valmsg-for="Message" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div>
                            <input type="submit" class="btn btn-default" value="Send" />
                        </div>
                    </div>
                </div>
            </form>

        </div>
    </body>
</html>
