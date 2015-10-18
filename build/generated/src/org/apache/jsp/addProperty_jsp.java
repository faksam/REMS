package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import org.jdom2.Element;
import java.io.File;
import org.jdom2.input.SAXBuilder;
import org.jdom2.Document;
import BL.myLib;

public final class addProperty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");

            if ((session.getAttribute("Manager") == null))
                if((session.getAttribute("Landlord") == null))
            {
                response.sendRedirect("index.jsp");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <title>Add Property - Real Estate Management</title>\n");
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
      out.write("        <title>Add Property - Real Estate Management</title>\n");
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
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <form>\n");
      out.write("                    <h1>Add Property</h1>\n");
      out.write("                    <hr />\n");
      out.write("\n");
      out.write("                    <p>Property Type: </p>\n");
      out.write("                    <select id=\"propType\" class=\"form-control\" required=\"required\" name=\"PropertyType\">\n");
      out.write("                        <option value=\"\"></option>\n");
      out.write("                        <option value=\"Vacant Land\">Vacant Land</option>\n");
      out.write("                        <option value=\"Commercial Property\">Commercial Property</option>\n");
      out.write("                        <option value=\"Residential Property\">Residential Property</option>\n");
      out.write("                    </select>\n");
      out.write("                    <br><br>\n");
      out.write("                    <script>\n");
      out.write("\n");
      out.write("                        document.getElementById(\"propType\").addEventListener(\"change\", display);\n");
      out.write("\n");
      out.write("                        function display() {\n");
      out.write("                            var v = document.getElementById(\"propType\");\n");
      out.write("                            var propertyType = v.options[v.selectedIndex].text;\n");
      out.write("                            document.getElementById(\"prop\").style.visibility = \"visible\";\n");
      out.write("                            document.getElementById(\"prop\").style.display = \"block\";\n");
      out.write("                            if (propertyType == 'Vacant Land')\n");
      out.write("                            {\n");
      out.write("                                document.getElementById(\"vac\").style.visibility = \"visible\";\n");
      out.write("                                document.getElementById(\"vac\").style.display = \"block\";\n");
      out.write("                                document.getElementById(\"com\").style.visibility = \"hidden\";\n");
      out.write("                                document.getElementById(\"com\").style.display = \"none\";\n");
      out.write("                                document.getElementById(\"res\").style.visibility = \"hidden\";\n");
      out.write("                                document.getElementById(\"res\").style.display = \"none\";\n");
      out.write("                            }\n");
      out.write("                            if (propertyType == 'Commercial Property')\n");
      out.write("                            {\n");
      out.write("                                document.getElementById(\"com\").style.visibility = \"visible\";\n");
      out.write("                                document.getElementById(\"com\").style.display = \"block\";\n");
      out.write("                                document.getElementById(\"vac\").style.visibility = \"hidden\";\n");
      out.write("                                document.getElementById(\"vac\").style.display = \"none\";\n");
      out.write("                                document.getElementById(\"res\").style.visibility = \"hidden\";\n");
      out.write("                                document.getElementById(\"res\").style.display = \"none\";\n");
      out.write("                            }\n");
      out.write("                            if (propertyType == 'Residential Property')\n");
      out.write("                            {\n");
      out.write("                                document.getElementById(\"res\").style.visibility = \"visible\";\n");
      out.write("                                document.getElementById(\"res\").style.display = \"block\";\n");
      out.write("                                document.getElementById(\"com\").style.visibility = \"hidden\";\n");
      out.write("                                document.getElementById(\"com\").style.display = \"none\";\n");
      out.write("                                document.getElementById(\"vac\").style.visibility = \"hidden\";\n");
      out.write("                                document.getElementById(\"vac\").style.display = \"none\";\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            document.getElementById(\"addUser\").style.visibility = \"visible\";\n");
      out.write("                            document.getElementById(\"addUser\").style.display = \"block\";\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("                    <div id=\"prop\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                        <p>Address: </p><input required=\"required\" class=\"form-control\" type=\"text\" name=\"txtAddress\" value=\"\" />\n");
      out.write("                        <br><br>\n");
      out.write("                        <p>Price(USD): </p><input  required=\"required\" class=\"form-control\" type=\"number\" min=\"1\" name=\"txtPrice\" value=\"\" />\n");
      out.write("                        <br><br>\n");
      out.write("                        <p>Description: </p><input required=\"required\" class=\"form-control\" type=\"text\" name=\"txtDescription\" value=\"\" />\n");
      out.write("                        <br><br>\n");
      out.write("                        <p>Status: </p>\n");
      out.write("                        <select class=\"form-control\" required=\"required\" name=\"txtStatus\">\n");
      out.write("                        <option value=\"\"></option>\n");
      out.write("                        <option value=\"Available\">Available</option>\n");
      out.write("                        <option value=\"Sold\">Sold</option>\n");
      out.write("                        <option value=\"Leased\">Leased</option>\n");
      out.write("                        </select><br><br>\n");
      out.write("                        \n");
      out.write("                        ");
    
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
                                
                                
                        
      out.write("\n");
      out.write("                        <p>Landlord: </p>\n");
      out.write("                        <select  required=\"required\" class=\"form-control\" name=\"txtLandlord\">\n");
      out.write("                        \n");
      out.write("                        ");
                            for (int i = 0; i < listLandlords.size(); i++) {
                        
      out.write("\n");
      out.write("                        <option>");
      out.print( listLandlords.get(i).toString());
      out.write("</option>\n");
      out.write("                        ");

                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }else
                         {
                             
      out.write("\n");
      out.write("                        <p>Landlord: </p>\n");
      out.write("                            <option>");
      out.print(currentUser);
      out.write("</option>\n");
      out.write("                        ");

                         }
                        
      out.write("\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <br><br>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"res\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                        <p>No of Rooms: </p><input required=\"required\" class=\"form-control\" type=\"number\" min=\"1\" name=\"txtRooms\" value=\"\" />\n");
      out.write("                        <br><br>\n");
      out.write("                        <p>No of Bath: </p><input required=\"required\" class=\"form-control\" type=\"number\" min=\"1\" name=\"txtBath\" value=\"\" />\n");
      out.write("                        <br><br>\n");
      out.write("                        <p>Living Area(sqr/meter): </p><input required=\"required\" class=\"form-control\" type=\"number\" min=\"1\" name=\"txtLivingArea\" value=\"\" />\n");
      out.write("                        <br><br>\n");
      out.write("                        <p>Residential Type: </p><input required=\"required\" class=\"form-control\" type=\"text\" name=\"txtResidential\" value=\"residential\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"com\" style=\"visibility: hidden; display: none;\"> \n");
      out.write("                        <br><br>\n");
      out.write("                        <p>Building: </p><input required=\"required\" class=\"form-control\" type=\"text\" name=\"txtBuilding\" value=\"\" />\n");
      out.write("                        <br><br>\n");
      out.write("                        <p>Commercial Type: </p><input required=\"required\" class=\"form-control\" type=\"text\" name=\"txtCommercial\" value=\"commercial\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"vac\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                        <br><br>\n");
      out.write("                        <p>Size(sqr/meter):</p><input required=\"required\" class=\"form-control\" type=\"number\" min=\"10\" name=\"txtSize\" value=\"\" />\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("                    <div id=\"addUser\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                        <input  class=\" btn btn-default\" type=\"submit\" value=\"Save\" name=\"btnAddProperty\" />\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            ");

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
            
      out.write("\n");
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
