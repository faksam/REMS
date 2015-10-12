<%-- 
    Document   : index
    Created on : Oct 4, 2015, 10:51:50 PM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Real Estate Management</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
    <!-- Custom CSS -->
    <link href="css/full-slider.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
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

    <!-- Full Page Image Background Carousel Header -->
    <header id="myCarousel" class="carousel slide">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
            <li data-target="#myCarousel" data-slide-to="3"></li>
            <li data-target="#myCarousel" data-slide-to="4"></li>
            <li data-target="#myCarousel" data-slide-to="5"></li>
            <li data-target="#myCarousel" data-slide-to="6"></li>
        </ol>

        <!-- Wrapper for Slides -->
        <div class="carousel-inner">
            <div class="item active">
                <!-- Set the first background image using inline CSS below. -->
                <div class="fill" style="background-image:url('images/re-mgmt.jpg');"></div>
                <div class="carousel-caption">
                    <h2>Online Real Estate Manager</h2>
                </div>
            </div>
            <div class="item">
                <!-- Set the second background image using inline CSS below. -->
                <div class="fill" style="background-image:url('images/belize-residential-properties.jpg');"></div>
                <div class="carousel-caption">
                    <h2>Residential Property (Single Family)</h2>
                </div>
            </div>
            <div class="item">
                <!-- Set the third background image using inline CSS below. -->
                <div class="fill" style="background-image:url('images/residential_forlease.jpg');"></div>
                <div class="carousel-caption">
                    <h2>Residential Property (Condominium)</h2>
                </div>
            </div>
            <div class="item">
                <!-- Set the second background image using inline CSS below. -->
                <div class="fill" style="background-image:url('images/office-building.61165227_std.jpg');"></div>
                <div class="carousel-caption">
                    <h2>Commercial Property (Office Building)</h2>
                </div>
            </div>
            <div class="item">
                <!-- Set the third background image using inline CSS below. -->
                <div class="fill" style="background-image:url('images/Commercial-Property.jpg');"></div>
                <div class="carousel-caption">
                    <h2>Commercial Property (Special Purpose Building)</h2>
                </div>
            </div>
            <div class="item">
                <!-- Set the second background image using inline CSS below. -->
                <div class="fill" style="background-image:url('images/CBXL_02.jpg');"></div>
                <div class="carousel-caption">
                    <h2>Vacant Land</h2>
                </div>
            </div>
            <div class="item">
                <!-- Set the third background image using inline CSS below. -->
                <div class="fill" style="background-image:url('images/CBXL_05.jpg');"></div>
                <div class="carousel-caption">
                    <h2>Vacant Land</h2>
                </div>
            </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
            <span class="icon-prev"></span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
            <span class="icon-next"></span>
        </a>

    </header>

    <!-- Page Content -->
    <div class="container">

        <div class="row">
            <div class="col-lg-12">
                <h1>REMS - Real Estate Management System</h1>
            <p>
                REMS helps its user manage any real estate property.
            </p>
            <p>
                Real estate management is the operation, control, and oversight of 
                real estate as used in its most broad terms. Management indicates 
                a need to be cared for, monitored and accountability given for its 
                useful life and condition. This is much akin to the role of management 
                in any business.</p>
            <p>
                Real estate management is also the management of personal property, 
                equipment, tooling and physical capital assets that are acquired and 
                used to build, repair and maintain end item deliverables. Property 
                management involves the processes, systems and manpower required to 
                manage the life cycle of all acquired property as defined above including 
                acquisition, control, accountability, responsibility, maintenance, utilization and disposition.
            </p></div>
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

        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-12">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
            <!-- /.row -->
        </footer>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Script to Activate the Carousel -->
    <script>
    $('.carousel').carousel({
        interval: 5000 //changes the speed
    })
    </script>

</body>

</html>

