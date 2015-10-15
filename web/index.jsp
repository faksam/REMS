<%-- 
    Document   : index
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
    <title>Real Estate Management</title>
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
                                <li><a href="addUser.jsp">User</a></li>
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
            <div class="item">
                <!-- Set the second background image using inline CSS below. -->
                <div class="fill" style="background-image:url('images/re-mgmt.jpg');"></div>
                <div class="carousel-caption">
                    <h2>Online Real Estate Manager</h2>
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
                    <h2>Property Manager</h2>
                    <ul>
                        <li>Log In</li>
                        <li>Add new property</li>
                        <li>Search Property</li>
                        <li>Edit property details</li>
                        <li>Add new property owner</li>
                        <li>Search Property owner</li>
                        <li>Edit property owner details</li>
                        <li>Add new tenant</li>
                        <li>Search tenant</li>
                        <li>Edit tenant details</li>
                        <li>Check personal details</li>
                        <li>Edit personal details</li>
                    </ul>
                </div>
                
                <div class="col-md-3">
                    <h2>Property Owner's can:</h2>
                    <ul>
                        <li>Log In</li>
                        <li>Search Property</li>
                        <li>Edit property details</li>
                        <li>Check personal details</li>
                        <li>Edit personal details</li>
                    </ul>
                </div>
                <div class="col-md-3">
                    <h2>Tenant's can:</h2>
                    <ul>
                        <li>Log In</li>
                        <li>Check personal details</li>
                        <li>Edit personal details</li>
                        <li>Search New Property to rent</li>
                        <li></li>
                    </ul>
                </div>
                <div class="col-md-3">
                    <h2>And Lot's more</h2>
                    <ul>
                        <li><a href="services.jsp">Other Service's</a></li>
                        <li><a href="about.jsp">About REMS</a></li>
                        <li><a href="contact.jsp">Contact REMS</a></li>
                        <li><a href="register.jsp">Register</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <hr>

        

    </div>
    
    <script>
    $('.carousel').carousel({
        interval: 5000 //changes the speed
    })
    </script>

</body>
<%@include file='footer.jsp'%>
</html>

