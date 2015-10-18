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
                node.detach();
                break;
            }}
            XMLOutputter outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));				
            System.out.println("Updated succefully!");
            response.sendRedirect("searchProperty.jsp");
        %>
        </div>
    </body>
</html>
