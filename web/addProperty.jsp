<%-- 
    Document   : AddProperty
    Created on : Oct 8, 2015, 10:22:49 AM
    Author     : Samuel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="java.io.File"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@page import="org.jdom2.Document"%>
<%@page import="BL.myLib"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            if ((session.getAttribute("Manager") == null))
                if((session.getAttribute("Landlord") == null))
            {
                response.sendRedirect("index.jsp");
            }
        %>
        
        <title>Add Property - Real Estate Management</title>
<%@include file='navigation.jsp'%>
    </head>
    
    <body>

        <div class="container">
            <div class="form-group">
                <form>
                    <h1>Add Property</h1>
                    <hr />

                    <p>Property Type: </p>
                    <select id="propType" class="form-control" required="required" name="PropertyType">
                        <option value=""></option>
                        <option value="Vacant Land">Vacant Land</option>
                        <option value="Commercial Property">Commercial Property</option>
                        <option value="Residential Property">Residential Property</option>
                    </select>

                    <script>

                        document.getElementById("propType").addEventListener("change", display);

                        function display() {
                            var v = document.getElementById("propType");
                            var propertyType = v.options[v.selectedIndex].text;
                            document.getElementById("prop").style.visibility = "visible";
                            document.getElementById("prop").style.display = "block";
                            if (propertyType == 'Vacant Land')
                            {
                                document.getElementById("vac").style.visibility = "visible";
                                document.getElementById("vac").style.display = "block";
                                document.getElementById("com").style.visibility = "hidden";
                                document.getElementById("com").style.display = "none";
                                document.getElementById("res").style.visibility = "hidden";
                                document.getElementById("res").style.display = "none";
                            }
                            if (propertyType == 'Commercial Property')
                            {
                                document.getElementById("com").style.visibility = "visible";
                                document.getElementById("com").style.display = "block";
                                document.getElementById("vac").style.visibility = "hidden";
                                document.getElementById("vac").style.display = "none";
                                document.getElementById("res").style.visibility = "hidden";
                                document.getElementById("res").style.display = "none";
                            }
                            if (propertyType == 'Residential Property')
                            {
                                document.getElementById("res").style.visibility = "visible";
                                document.getElementById("res").style.display = "block";
                                document.getElementById("com").style.visibility = "hidden";
                                document.getElementById("com").style.display = "none";
                                document.getElementById("vac").style.visibility = "hidden";
                                document.getElementById("vac").style.display = "none";
                            }

                            document.getElementById("addUser").style.visibility = "visible";
                            document.getElementById("addUser").style.display = "block";
                        }
                    </script>
                    <div id="prop" style="visibility: hidden; display: none;">
                        <p>Address: </p><input class="form-control" type="text" name="txtAddress" value="" />
                        <p>Price: </p><input class="form-control" type="text" name="txtPrice" value="" />
                        <p>Description: </p><input class="form-control" type="password" name="txtDescription" value="" />
                        <p>Status: </p><input class="form-control" type="text" name="txtStatus" value="" />
                        <%    
                         if((session.getAttribute("Landlord") == null))
                        {
                        try {
                                Document xmlDoc = new Document();
                                SAXBuilder saxBuilder = new SAXBuilder();
                                xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));

                                ArrayList listLandlords = new ArrayList();
                                Element rootElement = xmlDoc.getRootElement();
                                Element landlords = rootElement.getChild("landlords");
                                
                                List<Element> lstNodes = landlords.getChildren();
                                for (int i = 0; i < lstNodes.size(); i++) {
                                    Element node = (Element) lstNodes.get(i);

                                    String Landlord = node.getChildText("name");
                                    listLandlords.add("" + Landlord);
                                }
                                
                                
                        %>
                        <p>Landlord: </p>
                        <select class="form-control" name="txtLandlord">
                        
                        <%                            for (int i = 0; i < listLandlords.size(); i++) {
                        %>
                        <option><%= listLandlords.get(i).toString()%></option>
                        <%
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }else
                         {
                             %>
                        <p>Landlord: </p>
                        <select class="form-control" name="txtLandlord">
                            <option><%=currentUser%></option>
                        <%
                         }
                        %>

                        </select>
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
                    <div id="addUser" style="visibility: hidden; display: none;">
                        <input  class=" btn btn-default" type="submit" value="Save" name="btnAddProperty" />
                    </div>
                </form>
            </div>
            <%
                if (request.getParameter("btnAddProperty") != null) {
                    boolean found = false;
                    String PropertyType = request.getParameter("PropertyType");
                    String Address = request.getParameter("txtAddress");
                    String Price = request.getParameter("txtPrice");
                    String Description = request.getParameter("txtDescription");
                    String Status = request.getParameter("txtStatus");
                    String Landlord = request.getParameter("txtLandlord");
                    String Rooms = request.getParameter("txtRooms");
                    String Bath = request.getParameter("txtBath");
                    String LivingArea = request.getParameter("txtLivingArea");
                    String ResidentialType = request.getParameter("txtResidential");
                    String Building = request.getParameter("txtBuilding");
                    String CommercialType = request.getParameter("txtCommercial");
                    String Size = request.getParameter("txtSize");

                    if (PropertyType.equals("Vacant Land")) {
                        myLib.AddVacantLandProperty(Address, Price, Description,
                                Status, Landlord, Size);
                    }

                    if (PropertyType.equals("Commercial Property")) {
                        myLib.AddCommercialProperty(Address, Price, Description,
                                Status, Landlord, Building, CommercialType);
                    }

                    if (PropertyType.equals("Residential Property")) {
                        myLib.AddResidentialProperty(Address, Price, Description,
                                Status, Landlord, Rooms, Bath,
                                LivingArea, ResidentialType);
                    }

                    response.sendRedirect("searchProperty.jsp");

                }
            %>
        </div>
    </body>
    <%@include file='footer.jsp'%>
</html>
