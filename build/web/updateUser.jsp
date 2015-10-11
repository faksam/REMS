<%-- 
    Document   : addPage
    Created on : Oct 9, 2015, 7:41:48 AM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/full-slider.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update User - Real Estate Management</title>
        <script>

        </script>
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
            <form name="addform" action="action">
                <input type="radio" name="items" value="radio button 1" onchange="handleChange1();"/>
                <input type="radio" name="items" value="radio button 2" onchange="handleChange1();"/>
                <input type="radio" name="items" value="radio button 3" onchange="handleChange1();"/>
                <%

                %>
            </form>
        </div>
    </body>
</html>
