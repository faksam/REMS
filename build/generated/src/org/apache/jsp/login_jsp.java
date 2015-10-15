package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import BL.myLib;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
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
      out.write("        <title>Log In - Real Estate Management</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        \n");
      out.write("            <h1 style=\"text-align: center;\">Log In!</h1>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <p>Username:</p> <input class=\"form-control\" type=\"text\" name=\"txtUserName\" value=\"faksam\" required=\"required\"/>\n");
      out.write("            <br><br>\n");
      out.write("            <p>Password:</p><input class=\"form-control\" type=\"text\" name=\"txtPass\" value=\"password\" required=\"required\"/>\n");
      out.write("            <br><br>\n");
      out.write("            <p>Account Type</p>\n");
      out.write("            <select class=\"form-control\" name=\"txtAccountType\" required=\"required\">\n");
      out.write("                <option>Manager</option>\n");
      out.write("                <option>Landlord</option>\n");
      out.write("                <option>Tenant</option>\n");
      out.write("            </select>\n");
      out.write("            <br><br>\n");
      out.write("            <input class=\"btn btn-default\" type=\"submit\" value=\"Log In\" name=\"btnUserLogIn\" />\n");
      out.write("            <br><br>\n");
      out.write("            </div>\n");
      out.write("            ");

                if(request.getParameter("btnUserLogIn")!=null){
                    String Name="";
                    String Username= request.getParameter("txtUserName");
                    String Password= request.getParameter("txtPass");
                    String AccountType= request.getParameter("txtAccountType");
                    
                    boolean found=false;
                    Name=myLib.SearchUser(Username,Password,AccountType);
                    if(!Name.equalsIgnoreCase(""))
                    found=true;
                    
      out.write("<p>");
      out.print(found);
      out.write("</p>");

                    if(found)
                    {
                        
      out.write(" <p>");
      out.print(Username);
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(Password);
      out.write("</p>\n");
      out.write("                    <p>");
      out.print(AccountType);
      out.write("</p>");

                    if(AccountType.equals("Manager"))
                    {
                        session.setAttribute("Manager", Name);
                    }
                    else if(AccountType.equals("Landlord"))
                    {
                        session.setAttribute("Landlord", Name);
                    }
                    else if(AccountType.equals("Tenant"))
                    {
                        session.setAttribute("Tenant", Name);
                    }
                    
                    response.sendRedirect("index.jsp");
                    }
                    else
                    {
                        
      out.write(" <p>User Not found</p>");

                    }
                }
    
      out.write("\n");
      out.write("        </form>\n");
      out.write("           ");
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
      out.write("        </div>\n");
      out.write("    </body>\n");
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
