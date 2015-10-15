<%-- 
    Document   : addPage
    Created on : Oct 9, 2015, 7:41:48 AM
    Author     : Samuel
--%>

<%@page import="java.io.FileWriter"%>
<%@page import="org.jdom2.output.Format"%>
<%@page import="org.jdom2.output.XMLOutputter"%>
<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="java.io.File"%>
<%@page import="BL.myLib"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@page import="org.jdom2.Document"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <%
            if((session.getAttribute("Manager")== null))
                response.sendRedirect("login.jsp");
       %>
        
       
    <%@include file='navigation.jsp'%>
       <title>Update User - Real Estate Management</title>
        <script>

        </script>
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
                break;
            }}
            XMLOutputter outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));				
            System.out.println("Updated succefully!");
        %>
        
        <div class="container">
            <form method="post">
                <h1 style="text-align: center;">Update User</h1>
                <hr />
                    <div class="form-group">
                        <p>Name: </p><input class="form-control" data-val="true" required="required" type="text" name="txtName" value="<%=_Name%>" />
                    </div>
                <div class="form-group">
            <p>Username: </p><input class="form-control" data-val="true" required="required"  type="text" name="txtUsername" value="<%=_Username%>" />
           </div>
            <div class="form-group">
            <p>Password: </p><input class="form-control" data-val="true" required="required"  type="password" name="txtPassword" value="<%=_Password%>" />
            </div>
            <div class="form-group">
            <p>Account type:</p>
            <select class="dropdown" name="txtType">
                <option><%=_Type%></option>
                <option>Manager</option>
                <option>Landlord</option>
                <option>Tenant</option>
            </select>
            <br><br>
            </div>
            <input type="submit" class="btn btn-default" value="Update" name="btnUpdateUser" />
            <br><br>
        </form>
        </div>
        <%
                if(request.getParameter("btnUpdateUser")!=null){
                    boolean found=false;
                    node.detach();
                    _Type = request.getParameter("txtType");
                    _Username = request.getParameter("txtUsername");
                    _Password = request.getParameter("txtPassword");
                    _Name = request.getParameter("txtName");
                    
                    myLib.AddUser(_Name,_Username,_Password,_Type);
                        
                    response.sendRedirect("searchUser.jsp");
                 
                }
                outFile = new XMLOutputter();
            outFile.setFormat(Format.getPrettyFormat());
            outFile.output(xmlDoc, new FileWriter(myLib.getxmlFile()));				
            System.out.println("Updated succefully!");
    %>
    </body>
    <%@include file='footer.jsp'%>
</html>
