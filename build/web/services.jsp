<%-- 
    Document   : services
    Created on : Oct 10, 2015, 11:16:50 PM
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
        <title>Services - Real Estate Management</title>
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
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">Action</a></li>
                                <li><a href="#">Another action</a></li>
                                <li><a href="#">Something else here</a></li>
                                <li class="divider"></li>
                                <li><a href="#">Separated link</a></li>
                                <li class="divider"></li>
                                <li><a href="#">One more separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-right" >

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
            <h1>REMS - Real Estate Management System</h1>
            <p>
                REMS helps its user manage any real estate property.
            </p>
            <div class="row">
                <div class="col-md-3">
                    <h2>Tenants</h2>
                    <ul>
                        <li>Sample pages using ASP.NET 5 (MVC 6)</li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkId=518007">Gulp</a> and <a href="http://go.microsoft.com/fwlink/?LinkId=518004">Bower</a> for managing client-side resources</li>
                        <li>Theming using <a href="http://go.microsoft.com/fwlink/?LinkID=398939">Bootstrap</a></li>
                    </ul>
                </div>
                <div class="col-md-3">
                    <h2>Property Owner</h2>
                    <ul>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkId=518008">Conceptual overview of ASP.NET 5</a></li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkId=518008">Fundamentals in ASP.NET 5</a></li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=517849">Client-Side Development using npm, Bower and Gulp</a></li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=517850">Develop on different platforms</a></li>
                    </ul>
                </div>
                <div class="col-md-3">
                    <h2>Property Manager</h2>
                    <ul>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=398600">Add Controllers and Views</a></li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=398602">Add Data using EntityFramework</a></li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=398603">Add Authentication using Identity</a></li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=517848">Manage client-side packages using Bower/ Gulp</a></li>
                    </ul>
                </div>
                <div class="col-md-3">
                    <h2>Learn more</h2>
                    <ul>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=517851">Run your app locally</a></li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=517852">Run your app on .NET Core</a></li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=517853">Run commands in your app</a></li>
                        <li><a href="http://go.microsoft.com/fwlink/?LinkID=398609">Publish to Microsoft Azure Web Apps</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>
