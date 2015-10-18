package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.jdom2.Element;
import java.io.File;
import org.jdom2.input.SAXBuilder;
import org.jdom2.Document;
import BL.myLib;

public final class searchProperty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
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
      out.write("        <title>Search Property - Real Estate Management</title>\n");
      out.write("        <link href=\"css/magicslideshow.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/magicslideshow.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>All Properties</h1>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"panel panel-primary filterable\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\">Property Types</h3>\n");
      out.write("                        <div class=\"pull-right\">\n");
      out.write("                            <button class=\"btn btn-default btn-xs btn-filter\"><span class=\"glyphicon glyphicon-filter\"></span> Filter</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <script>\n");
      out.write("                            $(document).ready(function () {\n");
      out.write("                                $('.filterable .btn-filter').click(function () {\n");
      out.write("                                    var $panel = $(this).parents('.filterable'),\n");
      out.write("                                            $filters = $panel.find('.filters input'),\n");
      out.write("                                            $tbody = $panel.find('.table tbody');\n");
      out.write("                                    if ($filters.prop('disabled') == true) {\n");
      out.write("                                        $filters.prop('disabled', false);\n");
      out.write("                                        $filters.first().focus();\n");
      out.write("                                    } else {\n");
      out.write("                                        $filters.val('').prop('disabled', true);\n");
      out.write("                                        $tbody.find('.no-result').remove();\n");
      out.write("                                        $tbody.find('tr').show();\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("\n");
      out.write("                                $('.filterable .filters input').keyup(function (e) {\n");
      out.write("                                    /* Ignore tab key */\n");
      out.write("                                    var code = e.keyCode || e.which;\n");
      out.write("                                    if (code == '9')\n");
      out.write("                                        return;\n");
      out.write("                                    /* Useful DOM data and selectors */\n");
      out.write("                                    var $input = $(this),\n");
      out.write("                                            inputContent = $input.val().toLowerCase(),\n");
      out.write("                                            $panel = $input.parents('.filterable'),\n");
      out.write("                                            column = $panel.find('.filters th').index($input.parents('th')),\n");
      out.write("                                            $table = $panel.find('.table'),\n");
      out.write("                                            $rows = $table.find('tbody tr');\n");
      out.write("                                    /* Dirtiest filter function ever ;) */\n");
      out.write("                                    var $filteredRows = $rows.filter(function () {\n");
      out.write("                                        var value = $(this).find('td').eq(column).text().toLowerCase();\n");
      out.write("                                        return value.indexOf(inputContent) === -1;\n");
      out.write("                                    });\n");
      out.write("                                    /* Clean previous no-result if exist */\n");
      out.write("                                    $table.find('tbody .no-result').remove();\n");
      out.write("                                    /* Show all rows, hide filtered ones (never do that outside of a demo ! xD) */\n");
      out.write("                                    $rows.show();\n");
      out.write("                                    $filteredRows.hide();\n");
      out.write("                                    /* Prepend no-result row if all rows are filtered */\n");
      out.write("                                    if ($filteredRows.length === $rows.length) {\n");
      out.write("                                        $table.find('tbody').prepend($('<tr class=\"no-result text-center\"><td colspan=\"' + $table.find('.filters th').length + '\">No result found</td></tr>'));\n");
      out.write("                                    }\n");
      out.write("                                });\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr class=\"filters\">\n");
      out.write("                                <th><input type=\"text\" class=\"form-control\" placeholder=\"Image\" disabled></th>\n");
      out.write("                                <th><input type=\"text\" class=\"form-control\" placeholder=\"Address\" ></th>\n");
      out.write("                                <th><input type=\"text\" class=\"form-control\" placeholder=\"Price\" ></th>\n");
      out.write("                                <th><input type=\"text\" class=\"form-control\" placeholder=\"Description\" ></th>\n");
      out.write("                                <th><input type=\"text\" class=\"form-control\" placeholder=\"Status\" ></th>\n");
      out.write("                                <th><input type=\"text\" class=\"form-control\" placeholder=\"Landlord\" ></th>\n");
      out.write("                                <th><input type=\"text\" class=\"form-control\" placeholder=\"Property Type\" ></th>\n");
      out.write("                                ");
 if((session.getAttribute("Manager")!=null)){ 
      out.write("\n");
      out.write("                                 <th><input type=\"text\" class=\"form-control\" placeholder=\"Update/Delete\" disabled></th>\n");
      out.write("\n");
      out.write("                               ");
 }
      out.write("\n");
      out.write("                               \n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
                        
                            try {
                                    Document xmlDoc = new Document();
                                    SAXBuilder saxBuilder = new SAXBuilder();
                                    xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));

                                    Element rootElement = xmlDoc.getRootElement();
                                    Element properties = rootElement.getChild("properties");
                                    Element VacantLands = properties.getChild("vacantlandProperties");
                                    Element Residentials = properties.getChild("residentialProperties");
                                    Element Commercials = properties.getChild("commercialProperties");

                                    List<Element> lstNodes = VacantLands.getChildren();
                                    for (int i = 0; i < lstNodes.size(); i++) {
                                        Element node = (Element) lstNodes.get(i);

                                        String Address = node.getChildText("address");
                                        String Price = node.getChildText("price");
                                        String Description = node.getChildText("description");
                                        String Status = node.getChildText("status");
                                        String Landlord = node.getChildText("landlord");
                                        String Type = node.getChildText("type");

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>No image yet</td>\n");
      out.write("                                <td>");
      out.print(Address);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Price);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Description);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Status);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Landlord);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Type);
      out.write("</td>\n");
      out.write("                                ");
 if((session.getAttribute("Manager")!=null)){ 
      out.write("\n");
      out.write("                                <td>\n");
      out.write("                                    <a onclick='return confirm(\"You want to Update this Property?\")' href=\"updateProperty.jsp?Address=");
      out.print(Address);
      out.write("&Type=");
      out.print(Type);
      out.write("\">\n");
      out.write("                                        Update\n");
      out.write("                                    </a> | \n");
      out.write("                                    <a onclick='return confirm(\"Do you want to Delete this Property?\")' href=\"deleteProperty.jsp?Address=");
      out.print(Address);
      out.write("&Type=");
      out.print(Type);
      out.write("\">\n");
      out.write("                                        Delete\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                            \n");
      out.write("                               ");
 }
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                            ");


                                    }
                                    
                                    List<Element> _nodes = Residentials.getChildren();
                                    for (int i = 0; i < _nodes.size(); i++) {
                                        Element node = (Element) _nodes.get(i);

                                        String Address = node.getChildText("address");
                                        String Price = node.getChildText("price");
                                        String Description = node.getChildText("description");
                                        String Status = node.getChildText("status");
                                        String Landlord = node.getChildText("landlord");
                                        String Type = node.getChildText("type");

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>No image yet</td>\n");
      out.write("                                <td>");
      out.print(Address);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Price);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Description);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Status);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Landlord);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Type);
      out.write("</td>\n");
      out.write("                                ");
 if((session.getAttribute("Manager")!=null)){ 
      out.write("\n");
      out.write("                                 <td>\n");
      out.write("                                    <a onclick='return confirm(\"You want to Update this Property?\")' href=\"updateProperty.jsp?Address=");
      out.print(Address);
      out.write("&Type=");
      out.print(Type);
      out.write("\">\n");
      out.write("                                        Update\n");
      out.write("                                    </a> | \n");
      out.write("                                    <a onclick='return confirm(\"Do you want to Delete this Property?\")' href=\"deleteProperty.jsp?Address=");
      out.print(Address);
      out.write("&Type=");
      out.print(Type);
      out.write("\">\n");
      out.write("                                        Delete\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                               ");
 }
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            ");


                                    }
                                    List<Element> _nodes0 = Commercials.getChildren();
                                    for (int i = 0; i < _nodes0.size(); i++) {
                                        Element node = (Element) _nodes0.get(i);

                                        String Address = node.getChildText("address");
                                        String Price = node.getChildText("price");
                                        String Description = node.getChildText("description");
                                        String Status = node.getChildText("status");
                                        String Landlord = node.getChildText("landlord");
                                        String Type = node.getChildText("type");

                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>No image yet</td>\n");
      out.write("                                <td>");
      out.print(Address);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Price);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Description);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Status);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Landlord);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(Type);
      out.write("</td>\n");
      out.write("                            ");
 if((session.getAttribute("Manager")!=null)){ 
      out.write("\n");
      out.write("                                 <td>\n");
      out.write("                                    <a onclick='return confirm(\"You want to Update this Property?\")' href=\"updateProperty.jsp?Address=");
      out.print(Address);
      out.write("&Type=");
      out.print(Type);
      out.write("\">\n");
      out.write("                                        Update\n");
      out.write("                                    </a> | \n");
      out.write("                                    <a onclick='return confirm(\"Do you want to Delete this Property?\")' href=\"deleteProperty.jsp?Address=");
      out.print(Address);
      out.write("&Type=");
      out.print(Type);
      out.write("\">\n");
      out.write("                                        Delete\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                               ");
 }
      out.write("    \n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                    }
                                    System.out.println("Finished search!");
                                } catch (Exception e) {
                                    // TODO: handle exception
                                }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
