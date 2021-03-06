package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/full-slider.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("    <title>Real Estate Management</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
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
      out.write("                                <li><a href=\"addUser.jsp\">User</a></li>\n");
      out.write("                                    ");
 }
      out.write("\n");
      out.write("                                <li><a href=\"addUser.jsp\">Tenant</a></li>\n");
      out.write("                                <li><a href=\"addProperty.jsp\">Property</a></li>\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
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
      out.write("                    <header id=\"myCarousel\" class=\"carousel slide\">\n");
      out.write("        <!-- Indicators -->\n");
      out.write("        <ol class=\"carousel-indicators\">\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("            <li data-target=\"#myCarousel\" data-slide-to=\"6\"></li>\n");
      out.write("        </ol>\n");
      out.write("\n");
      out.write("        <!-- Wrapper for Slides -->\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("            <div class=\"item active\">\n");
      out.write("                <!-- Set the first background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/belize-residential-properties.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Residential Property (Single Family)</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"item\">\n");
      out.write("                <!-- Set the third background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/residential_forlease.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Residential Property (Condominium)</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <!-- Set the second background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/office-building.61165227_std.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Commercial Property (Office Building)</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <!-- Set the third background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/Commercial-Property.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Commercial Property (Special Purpose Building)</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <!-- Set the second background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/CBXL_02.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Vacant Land</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <!-- Set the third background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/CBXL_05.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Vacant Land</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <!-- Set the second background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/re-mgmt.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Online Real Estate Manager</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Controls -->\n");
      out.write("        <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("            <span class=\"icon-prev\"></span>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("            <span class=\"icon-next\"></span>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <!-- Page Content -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <h1>REMS - Real Estate Management System</h1>\n");
      out.write("            <p>\n");
      out.write("                REMS helps its user manage any real estate property.\n");
      out.write("            </p>\n");
      out.write("            <p>\n");
      out.write("                Real estate management is the operation, control, and oversight of \n");
      out.write("                real estate as used in its most broad terms. Management indicates \n");
      out.write("                a need to be cared for, monitored and accountability given for its \n");
      out.write("                useful life and condition. This is much akin to the role of management \n");
      out.write("                in any business.</p>\n");
      out.write("            <p>\n");
      out.write("                Real estate management is also the management of personal property, \n");
      out.write("                equipment, tooling and physical capital assets that are acquired and \n");
      out.write("                used to build, repair and maintain end item deliverables. Property \n");
      out.write("                management involves the processes, systems and manpower required to \n");
      out.write("                manage the life cycle of all acquired property as defined above including \n");
      out.write("                acquisition, control, accountability, responsibility, maintenance, utilization and disposition.\n");
      out.write("            </p></div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <h2>Property Manager</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Log In</li>\n");
      out.write("                        <li>Add new property</li>\n");
      out.write("                        <li>Search Property</li>\n");
      out.write("                        <li>Edit property details</li>\n");
      out.write("                        <li>Add new property owner</li>\n");
      out.write("                        <li>Search Property owner</li>\n");
      out.write("                        <li>Edit property owner details</li>\n");
      out.write("                        <li>Add new tenant</li>\n");
      out.write("                        <li>Search tenant</li>\n");
      out.write("                        <li>Edit tenant details</li>\n");
      out.write("                        <li>Check personal details</li>\n");
      out.write("                        <li>Edit personal details</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <h2>Property Owner's can:</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Log In</li>\n");
      out.write("                        <li>Search Property</li>\n");
      out.write("                        <li>Edit property details</li>\n");
      out.write("                        <li>Check personal details</li>\n");
      out.write("                        <li>Edit personal details</li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <h2>Tenant's can:</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Log In</li>\n");
      out.write("                        <li>Check personal details</li>\n");
      out.write("                        <li>Edit personal details</li>\n");
      out.write("                        <li>Search New Property to rent</li>\n");
      out.write("                        <li></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <h2>And Lot's more</h2>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"services.jsp\">Other Service's</a></li>\n");
      out.write("                        <li><a href=\"about.jsp\">About REMS</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact REMS</a></li>\n");
      out.write("                        <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("    $('.carousel').carousel({\n");
      out.write("        interval: 5000 //changes the speed\n");
      out.write("    })\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
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
      out.write("\n");
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
