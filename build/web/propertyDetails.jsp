<%-- 
    Document   : propertyDetails
    Created on : Oct 12, 2015, 12:41:08 AM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            if((session.getAttribute("login")== null))
                response.sendRedirect("login.jsp");
       %>
       
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/myStyle.css" rel="stylesheet" type="text/css"/>
        <link href="css/full-slider.css" rel="stylesheet" type="text/css"/>
         <script src="js/jquery.js" type="text/javascript"></script>
         <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
         
        <div class="container">
        
        <form name="AddUser" action="Submit">
            <div class="form-group">
            <p>Property Type: </p>
            <select id="propType" class="form-control" name="PropertyType">
                <option>Vacant Land</option>
                <option>Commercial Property</option>
                <option>Residential Property</option>
            </select>
            
            <script>
                document.getElementById("propType").addEventListener("change", display);

                function display() {
                    document.getElementById("prop").style.visibility = "visible";
                    document.getElementById("prop").style.display = "block";
                    document.getElementById("res").style.visibility = "visible";
                    document.getElementById("com").style.visibility = "visible";
                    document.getElementById("vac").style.visibility = "visible";
                    document.getElementById("addUser").style.visibility = "visible";
                }
            </script>
            <div id="prop" style="visibility: hidden; display: none;">
                <p>Address: </p><input class="form-control" type="text" name="txtAddress" value="" />
                <p>Price: </p><input class="form-control" type="text" name="txtPrice" value="" />
                <p>Description: </p><input class="form-control" type="password" name="txtDescription" value="" />
                <p>Status: </p><input class="form-control" type="text" name="txtStatus" value="" />
                <p>Landlord: </p><input class="form-control" type="text" name="txtLandlord" value="" />
            </div>
            
            <div id="res" style="visibility: hidden; display: none;">
                <p>Rooms: </p><input class="form-control" type="text" name="txtRooms" value="" />
                <p>Bath: </p><input class="form-control" type="text" name="txtBath" value="" />
                <p>Living Area: </p><input class="form-control" type="password" name="txtLivingArea" value="" />
                <p>Residential Type: </p><input class="form-control" type="password" name="txtResidential" value="" />
            </div>
            
            <div id="com" style="visibility: hidden; display: none;"> 
                <p>Building: </p><input class="form-control" type="text" name="txtBuilding" value="" />
                <p>Commercial Type: </p><input class="form-control" type="password" name="txtCommercial" value="" />
            </div>
            
            <div id="vac" style="visibility: hidden; display: none;">
                <p>Size:</p><input class="form-control" type="password" name="txtSize" value="" />
            </div>
            
            <br><br>
            <input id="addUser" class="btn-default" type="submit" value="Register" name="btnAddUser" />
            </div>
        </form>
        </div>            
           <%@include file='footer.jsp'%>         
    </body>
</html>
