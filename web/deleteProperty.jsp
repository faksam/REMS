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
            
            String Type = request.getParameter("Type");
            String Name = request.getParameter("Name");
            String Username = "";
            String Password = "";
            
            String _Type = request.getParameter("Type");
            String _Name = request.getParameter("Name");
            String _Username = request.getParameter("Userame");
            String _Password = "";
            
            Document xmlDoc = new Document();
            SAXBuilder saxBuilder = new SAXBuilder();
            xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));
            
            

            Element rootElement = xmlDoc.getRootElement();
            Element _types = rootElement.getChild(Type.toLowerCase()+"s");
            //Element _type = _types.getChild(Type);
            Element node =null;
            
            List<Element> lstNodes = _types.getChildren();
                for (int i = 0; i < lstNodes.size(); i++) {
                   node = (Element) lstNodes.get(i);
            _Name = node.getChildText("name");
            _Username = node.getChildText("username");
            _Password = node.getChildText("password");
            _Type = node.getChildText("type");
            
            if (Name.equalsIgnoreCase(_Name) && Type.equalsIgnoreCase(_Type)) 
            {
                node.detach();
                break;
            }}
            XMLOutputter outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));				
            System.out.println("Updated succefully!");
        %>
        </div>
    </body>
</html>
