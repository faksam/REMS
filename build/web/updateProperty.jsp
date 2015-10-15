<%-- 
    Document   : updatePage
    Created on : Oct 9, 2015, 7:42:43 AM
    Author     : Samuel
--%>

<%@page import="java.io.FileWriter"%>
<%@page import="org.jdom2.output.Format"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="BL.myLib"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@page import="org.jdom2.Document"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%
            if((session.getAttribute("Manager")== null))
                if((session.getAttribute("Landlord")== null))
                    response.sendRedirect("login.jsp");
       %>
        
        
    <%@include file='navigation.jsp'%>
    <title>Update Property - Real Estate Management</title>
        
    </head>
    <body>
        
      
        <div class="container">
            <%
            
            String _PropType = request.getParameter("Type");
           
            String _Address = request.getParameter("Address");
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));
            
            String Address = "";
            String Price = "";
            String Description = "";
            String Status = "";
            String Landlord = "";
            String Type = "";

            Element rootElement = xmlDoc.getRootElement();
            Element properties = rootElement.getChild("properties");
            Element _Type = properties.getChild(_PropType+"Properties");
            Element node =null;
            
            List<Element> lstNodes = _Type.getChildren();
                for (int i = 0; i < lstNodes.size(); i++) {
                   node = (Element) lstNodes.get(i);

            Address = node.getChildText("address");
            Price = node.getChildText("price");
            Description = node.getChildText("description");
            Status = node.getChildText("status");
            Landlord = node.getChildText("landlord");
            Type = node.getChildText("type");
            if (Address.equalsIgnoreCase(_Address)) 
            {
                
                break;
            }}
            XMLOutputter outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));				
            System.out.println("Updated succefully!");
        %>
        <div class="form-group">
        <form  method="post">
            <h1>Add Property</h1>
            <hr />
            
            <p>Select New Property Type: </p>
            <select id="propType" class="form-control" name="PropertyType">
                <option value=<%=_PropType%>></option>
                <option value="Vacant Land">Vacant Land</option>
                <option value="Commercial Property">Commercial Property</option>
                <option value="Residential Property">Residential Property</option>
            </select>
            <p>Address: </p><input class="form-control" type="text" name="txtAddress" value="<%=Address%>" />
            <script>
                
                document.getElementById("propType").addEventListener("change", display);
                
                function display() {
                    var v = document.getElementById("propType");
                var propertyType = v.options[v.selectedIndex].text;
                    document.getElementById("prop").style.visibility = "visible";
                    document.getElementById("prop").style.display = "block";
                    if(propertyType=='Vacant Land')
                    {
                        document.getElementById("vac").style.visibility = "visible";
                        document.getElementById("vac").style.display = "block";
                        document.getElementById("com").style.visibility = "hidden";
                        document.getElementById("com").style.display = "none";
                        document.getElementById("res").style.visibility = "hidden";
                        document.getElementById("res").style.display = "none";
                    }
                    if(propertyType=='Commercial Property')
                    {
                        document.getElementById("com").style.visibility = "visible";
                        document.getElementById("com").style.display = "block";
                        document.getElementById("vac").style.visibility = "hidden";
                        document.getElementById("vac").style.display = "none";
                        document.getElementById("res").style.visibility = "hidden";
                        document.getElementById("res").style.display = "none";
                    }
                    if(propertyType=='Residential Property')
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
                <p>Price: </p><input class="form-control" type="text" name="txtPrice" value="<%=Price%>" />
                <p>Description: </p><input class="form-control" type="password" name="txtDescription" value="<%=Description%>" />
                <p>Status: </p><input class="form-control" type="text" name="txtStatus" value="<%=Status%>" />
                <p>Landlord: </p><input class="form-control" type="text" name="txtLandlord" value="<%=Landlord%>" />
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
            <input  class=" btn btn-default" type="submit" value="Update" name="btnAddProperty" />
            </div>
            <%
                if(request.getParameter("btnAddProperty")!=null){
                    boolean found=false;
                    node.detach();
                    String PropertyType = request.getParameter("PropertyType");
                    Address = request.getParameter("txtAddress");
                    Price = request.getParameter("txtPrice");
                    Description = request.getParameter("txtDescription");
                    Status = request.getParameter("txtStatus");
                    Landlord = request.getParameter("txtLandlord");
                    String Rooms = request.getParameter("txtRooms");
                    String Bath = request.getParameter("txtBath");
                    String LivingArea = request.getParameter("txtLivingArea");
                    String ResidentialType = request.getParameter("txtResidential");
                    String Building = request.getParameter("txtBuilding");
                    String CommercialType = request.getParameter("txtCommercial");
                    String Size = request.getParameter("txtSize");
                    
                    if(PropertyType.equals("Vacant Land"))
                    {
                        myLib.AddVacantLandProperty(Address,Price,Description,
                                            Status,Landlord,Size);
                    }
                        
                    if(PropertyType.equals("Commercial Property"))
                    {
                       myLib.AddCommercialProperty(Address,Price,Description,
                                            Status,Landlord,Building,CommercialType);
                    }
                                                
                    if(PropertyType.equals("Residential Property"))
                    {
                        myLib.AddResidentialProperty(Address,Price,Description,
                                             Status,Landlord,Rooms,Bath,
                                             LivingArea,ResidentialType);
                    }
                    
                   
                    response.sendRedirect("searchProperty.jsp");
                 
                }
    %>
        </form>
        </div>
        
        </div>
    </body>
    <%@include file='footer.jsp'%>
</html>
