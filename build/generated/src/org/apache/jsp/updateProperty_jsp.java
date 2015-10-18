package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.FileWriter;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import java.io.File;
import java.util.List;
import org.jdom2.Element;
import BL.myLib;
import org.jdom2.input.SAXBuilder;
import org.jdom2.Document;

public final class updateProperty_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navigation.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       ");

            if((session.getAttribute("Manager")== null))
                if((session.getAttribute("Landlord")== null))
                    response.sendRedirect("login.jsp");
       
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/full-slider.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.jsp\">REM</a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        ");
 if ((session.getAttribute("Manager") != null)||(session.getAttribute("Landlord")!=null)) { 
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">\n");
      out.write("                                Add \n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            \n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                ");
 if((session.getAttribute("Manager")!=null)){ 
      out.write("\n");
      out.write("                                <li><a href=\"addUser.jsp\">Landlord</a></li>\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                                ");
 if ((session.getAttribute("Landlord") != null)) { 
      out.write("\n");
      out.write("                                \n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                                <li><a href=\"addUser.jsp\">Tenant</a></li>\n");
      out.write("                                <li><a href=\"addProperty.jsp\">Property</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                                \n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">\n");
      out.write("                                Search \n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                ");
 if ((session.getAttribute("Manager") != null)) { 
      out.write("\n");
      out.write("                                <li><a href=\"searchUser.jsp\">User</a></li>\n");
      out.write("\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                                <li><a href=\"searchProperty.jsp\">Property</a></li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 if ((session.getAttribute("Landlord") != null)) { 
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"landlordProperty.jsp\">My Properties</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"services.jsp\">Services</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"contact.jsp\">Contact</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"about.jsp\">About</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        ");
  String currentUser = "";
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
                                    || (session.getAttribute("Tenant") != null)) {
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a type=\"submit\" href=\"userDetails.jsp\" >");
      out.print(currentUser);
      out.write("</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a type=\"submit\" href=\"logOut.jsp\" >Log Out</a>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 } else {
                        
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a type=\"submit\" href=\"login.jsp\" >Log In </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a type=\"submit\" href=\"register.jsp\" >Register</a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        ");
 }

                        
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("        </nav>\n");
      out.write("        <header>\n");
      out.write("            <div style=\"margin: 0 auto; width:1080px; height:380px\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img  width=\"1080\" height=\"380\" src=\"images/residential-properties-in-bhubaneswar2.jpg\" alt=\"\"/>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <title>Update Property - Real Estate Management</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");

            
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
        
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("        <form  method=\"post\">\n");
      out.write("            <h1>Update Property</h1>\n");
      out.write("            <hr />\n");
      out.write("            \n");
      out.write("            <br><br>\n");
      out.write("                        <p>Property Type: </p>\n");
      out.write("            <select required=\"required\" id=\"propType\" class=\"form-control\" name=\"PropertyType\">\n");
      out.write("                <option value=");
      out.print(_PropType);
      out.write('>');
      out.print(_PropType);
      out.write("</option>\n");
      out.write("                <option value=\"Vacant Land\">Vacant Land</option>\n");
      out.write("                <option value=\"Commercial Property\">Commercial Property</option>\n");
      out.write("                <option value=\"Residential Property\">Residential Property</option>\n");
      out.write("            </select>\n");
      out.write("            <br><br>\n");
      out.write("                        <p>Address: </p><input class=\"form-control\" type=\"text\" name=\"txtAddress\" value=\"");
      out.print(Address);
      out.write("\" />\n");
      out.write("            <script>\n");
      out.write("                \n");
      out.write("                document.getElementById(\"propType\").addEventListener(\"change\", display);\n");
      out.write("                \n");
      out.write("                function display() {\n");
      out.write("                    var v = document.getElementById(\"propType\");\n");
      out.write("                var propertyType = v.options[v.selectedIndex].text;\n");
      out.write("                    document.getElementById(\"prop\").style.visibility = \"visible\";\n");
      out.write("                    document.getElementById(\"prop\").style.display = \"block\";\n");
      out.write("                    if(propertyType=='vacantland')\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"vac\").style.visibility = \"visible\";\n");
      out.write("                        document.getElementById(\"vac\").style.display = \"block\";\n");
      out.write("                        document.getElementById(\"com\").style.visibility = \"hidden\";\n");
      out.write("                        document.getElementById(\"com\").style.display = \"none\";\n");
      out.write("                        document.getElementById(\"res\").style.visibility = \"hidden\";\n");
      out.write("                        document.getElementById(\"res\").style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                    if(propertyType=='commercial')\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"com\").style.visibility = \"visible\";\n");
      out.write("                        document.getElementById(\"com\").style.display = \"block\";\n");
      out.write("                        document.getElementById(\"vac\").style.visibility = \"hidden\";\n");
      out.write("                        document.getElementById(\"vac\").style.display = \"none\";\n");
      out.write("                        document.getElementById(\"res\").style.visibility = \"hidden\";\n");
      out.write("                        document.getElementById(\"res\").style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                    if(propertyType=='residential')\n");
      out.write("                    {\n");
      out.write("                        document.getElementById(\"res\").style.visibility = \"visible\";\n");
      out.write("                        document.getElementById(\"res\").style.display = \"block\";\n");
      out.write("                        document.getElementById(\"com\").style.visibility = \"hidden\";\n");
      out.write("                        document.getElementById(\"com\").style.display = \"none\";\n");
      out.write("                        document.getElementById(\"vac\").style.visibility = \"hidden\";\n");
      out.write("                        document.getElementById(\"vac\").style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                                        \n");
      out.write("                    document.getElementById(\"addUser\").style.visibility = \"visible\";\n");
      out.write("                    document.getElementById(\"addUser\").style.display = \"block\";\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("            <div id=\"prop\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                <br><br>\n");
      out.write("                        <p>Price(USD): </p><input class=\"form-control\" type=\"number\" min=\"1\" name=\"txtPrice\" value=\"");
      out.print(Price);
      out.write("\" />\n");
      out.write("                <br><br>\n");
      out.write("                        <p>Description: </p><input class=\"form-control\" type=\"text\" name=\"txtDescription\" value=\"");
      out.print(Description);
      out.write("\" />\n");
      out.write("                <br><br>\n");
      out.write("                        <p>Status: </p>\n");
      out.write("                        <select class=\"form-control\" required=\"required\" name=\"txtStatus\">\n");
      out.write("                        <option value=\"");
      out.print(Status);
      out.write('"');
      out.write('>');
      out.print(Status);
      out.write("</option>\n");
      out.write("                        <option value=\"Available\">Available</option>\n");
      out.write("                        <option value=\"Sold\">Sold</option>\n");
      out.write("                        <option value=\"Leased\">Leased</option>\n");
      out.write("                        </select><br><br>\n");
      out.write("                <p>Landlord: </p><input class=\"form-control\" type=\"text\" name=\"txtLandlord\" value=\"");
      out.print(Landlord);
      out.write("\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"res\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                <br><br>\n");
      out.write("                        <p>No of Rooms: </p><input class=\"form-control\" type=\"number\" min=\"1\" name=\"txtRooms\" value=\"\" />\n");
      out.write("                <br><br>\n");
      out.write("                        <p>No of Bath: </p><input class=\"form-control\" type=\"number\" min=\"1\" name=\"txtBath\" value=\"\" />\n");
      out.write("                <br><br>\n");
      out.write("                        <p>Living Area(sqr/meter): </p><input class=\"form-control\" type=\"number\" min=\"1\" name=\"txtLivingArea\" value=\"\" />\n");
      out.write("                <br><br>\n");
      out.write("                        <p>Residential Type: </p><input class=\"form-control\" type=\"text\" name=\"txtResidential\" value=\"\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"com\" style=\"visibility: hidden; display: none;\"> \n");
      out.write("                <br><br>\n");
      out.write("                        <p>Building: </p><input class=\"form-control\" type=\"text\" name=\"txtBuilding\" value=\"\" />\n");
      out.write("                <br><br>\n");
      out.write("                        <p>Commercial Type: </p><input class=\"form-control\" type=\"text\" name=\"txtCommercial\" value=\"\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"vac\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                <br><br>\n");
      out.write("                        <p>Size(sqr/meter):</p><input class=\"form-control\" type=\"number\" min=\"1\" name=\"txtSize\" value=\"\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br><br>\n");
      out.write("            <div id=\"addUser\" style=\"visibility: hidden; display: none;\">\n");
      out.write("            <input  class=\" btn btn-default\" type=\"submit\" value=\"Update\" name=\"btnAddProperty\" />\n");
      out.write("            </div>\n");
      out.write("            ");

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
    
      out.write("\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <footer style=\"text-align: center;\">\n");
      out.write("            <hr />\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <p>Copyright &copy; Your Website 2015</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </footer>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
