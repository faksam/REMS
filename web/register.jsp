<%-- 
    Document   : tester
    Created on : Oct 10, 2015, 9:51:40 PM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/full-slider.css" rel="stylesheet" type="text/css"/>
        <title>Register - Real Estate Management</title>
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
                    <a type="submit" href="login.jsp" class="btn btn-default">Log In</a>
                    
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
        
        <form method='post' id=''  action=''>
            <p>First Name*</p><input type="password" name="Password" value="" />
            <p>Last Name*</p><input type="password" name="Password" value="" />
            <p>Phone*</p><input type="password" name="Password" value="" />
            <p>Email*</p><input type="password" name="Password" value="" />
            
            <div style="text-align: left; padding-left: 20%;">
            <p>  Interested in*</p>
            <p> <input type="checkbox" name="" value="ON" />  Property Management</p>
            <p> <input type="checkbox" name="" value="ON" />  Purchasing Investment Property</p>
            <p> <input type="checkbox" name="" value="ON" />  Selling Investment Property</p>
            <p> <input type="checkbox" name="" value="ON" /> Finding a Home to Rent</p>
            <p> <input type="checkbox" name="" value="ON" />  I'm a Current Tenant</p>
            <p> <input type="checkbox" name="" value="ON" />  Other</p>
            </div>
            <p>   What is the address of the home for which you seek a property manager?</p>
            
            <p>   Street Address</p><input type="password" name="Password" value="" />
            <p>   Address Line 2</p><input type="password" name="Password" value="" />
            <p>    City</p><input type="password" name="Password" value="" />
            <p>    State</p><input type="password" name="Password" value="" />
            <p>    ZIP Code</p><input type="password" name="Password" value="" />
            <p> What is the address of the home you are thinking of selling?*</p>
            <p>  Street Address</p><input type="password" name="Password" value="" />
            <p>   Address Line 2</p><input type="password" name="Password" value="" />
            <p>    City</p><input type="password" name="Password" value="" />
            <p>    State</p><input type="password" name="Password" value="" />
            <p>    ZIP Code</p><input type="password" name="Password" value="" />
            <p>    What is your reason for selling?*</p><input type="password" name="Password" value="" />
            <p>   What is the current status of the property?</p>
            <select>
                <option value="Owner Ocuupied">Owner Ocuupied</option>
                <option value="Vacant">Vacant</option>
                <option value="Tenant Occupied">Tenant Occupied</option>
                <option value="Other">Other</option>
            </select>
            <p>   Comments*</p>
            <textarea name="" rows="10" cols="50"></textarea>
            <p>    Buying Info - Describe briefly what type of property you're 
                interested in buying, location, price range, timeline, etc*</p>
            <textarea name="" rows="10" cols="50"></textarea>
            <p>   How did you find us?</p>
            <select>
                <option value="Internet Search">Internet Search</option>
                <option value="Referral">Referral</option>
                <option value="Blog Reader">Blog Reader</option>
                <option value="Phone Book">Phone Book</option>
                <option value="Postcard/mailer">Postcard/mailer</option>
                <option value="Other">Other</option>
            </select>
            <p>Who may we thank for refering you?</p><input type="password" name="Password" value="" />
            <p>Other: Please Describe</p><input type="password" name="Password" value="" />
            <br><br>
            <input type="submit" value="Submit" name="searchUser" />
            <br><br>
        </form>
        </div>
    </body>
</html>
