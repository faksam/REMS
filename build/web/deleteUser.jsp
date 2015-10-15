<%-- 
    Document   : deleteUser
    Created on : Oct 14, 2015, 11:56:23 PM
    Author     : Samuel
--%>

<%@page import="java.io.FileWriter"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@page import="org.jdom2.Document"%>
<%@page import="java.io.File"%>
<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="BL.myLib"%>
<%@page import="org.jdom2.output.Format"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            
            String Type = request.getParameter("Type");
            String Name = request.getParameter("Name");
            String Username = request.getParameter("Username");
            String Password = "";
            
            String _Type = request.getParameter("Type");
            String _Name = request.getParameter("Name");
            String _Username = "";
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
            System.out.println("Details"+_Name+_Username+_Type+"From Search"+Name+Username+Type);
            
            if (Name.equalsIgnoreCase(_Name)&&Type.equalsIgnoreCase(_Type)&&Username.equalsIgnoreCase(_Username)) 
            {
                node.detach();
                break;
            }}
            XMLOutputter outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));				
            System.out.println("Updated succefully!");
            response.sendRedirect("searchUser.jsp");
        %>
    </body>
</html>
