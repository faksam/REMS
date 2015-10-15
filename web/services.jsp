<%-- 
    Document   : services
    Created on : Oct 10, 2015, 11:16:50 PM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
    <%@include file='navigation.jsp'%>
        <title>Services - Real Estate Management</title>
    </head>
    <body>
      
        <div class="container">
            <h1>REMS - Real Estate Management System</h1>
            <p>
                REMS helps its user manage any real estate property.
            </p>
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
    </body>
    <%@include file='footer.jsp'%>
</html>
