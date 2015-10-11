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
            <form action="/Home/Contact" method="post"><input name="__RequestVerificationToken" type="hidden" value="zGGs4JKF78S45p7ZrSp4VA_g_qj5mrwQavKcu0zJNJeV_NidJJWWQByQymTzIHj3t_eRAbd9BNOsvhl-5Y2eqDqqmumJXsDraRpwiS86xvlI9Wc9ChFdgGHrgpled55i2nfDZoM5xYXSJKyrN-FoaA2" />    <div class="form-horizontal">
                    <h1>Contact Us</h1>
                    <hr />
                    <div class="form-group">
                        <p class="col-md-2 control-label" for="FromName">Your name</p>
                        <div class="col-md-10">
                            <input class="form-control" data-val="true" data-val-required="The Your name field is required." id="FromName" name="FromName" type="text" value="" />
                            <span class="field-validation-valid" data-valmsg-for="FromName" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <p class="col-md-2 control-label" for="FromEmail">Your email</p>
                        <div class="col-md-10">
                            <input class="form-control" data-val="true" data-val-email="The Your email field is not a valid e-mail address." data-val-required="The Your email field is required." id="FromEmail" name="FromEmail" type="text" value="" />
                            <span class="field-validation-valid" data-valmsg-for="FromEmail" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <p class="col-md-2 control-label" for="Message">Message</p>
                        <div class="col-md-10">
                            <textarea class="form-control" cols="20" data-val="true" data-val-required="The Message field is required." id="Message" name="Message" rows="10">
                            </textarea>
                            <span class="field-validation-valid" data-valmsg-for="Message" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-md-offset-2 col-md-10">
                            <input type="submit" class="btn btn-default" value="Send" />
                        </div>
                    </div>
                </div>
            </form>

        </div>
    </body>
</html>
