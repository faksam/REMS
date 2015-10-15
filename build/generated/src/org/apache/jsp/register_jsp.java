package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import BL.myLib;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/full-slider.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("         <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Register - Real Estate Management</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
 if((session.getAttribute("Manager")!=null) || (session.getAttribute("Landlord")!=null)){ 
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">\n");
      out.write("                                Add \n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            \n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <li><a href=\"addUser.jsp\">User</a></li>\n");
      out.write("                                <li><a href=\"addProperty.jsp\">Vacant Land</a></li>\n");
      out.write("                                <li><a href=\"addProperty.jsp\">Residential Property</a></li>\n");
      out.write("                                <li><a href=\"addProperty.jsp\">Commercial Property</a></li>\n");
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
      out.write("                                <li><a href=\"searchUser.jsp\">User</a></li>\n");
      out.write("                                <li><a href=\"searchProperty.jsp\">Vacant Land</a></li>\n");
      out.write("                                <li><a href=\"searchProperty.jsp\">Residential Property</a></li>\n");
      out.write("                                <li><a href=\"searchProperty.jsp\">Commercial Property</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        ");
 if((session.getAttribute("Manager")!=null)){ 
      out.write("\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">\n");
      out.write("                                Update \n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                <li><a href=\"#\">User</a></li>\n");
      out.write("                                <li><a href=\"#\">Vacant Land</a></li>\n");
      out.write("                                <li><a href=\"#\">Residential Property</a></li>\n");
      out.write("                                <li><a href=\"#\">Commercial Property</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                       ");
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
      out.write("                    \n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        ");
  String currentUser="";
                            if(session.getAttribute("Manager") != null)
                                 currentUser=""+session.getAttribute("Manager");
                                if(session.getAttribute("Landlord")!= null)
                                    currentUser=""+session.getAttribute("Landlord");
                                if(session.getAttribute("Tenant") != null)
                                    currentUser=""+session.getAttribute("Tenant");
                                
                            if((session.getAttribute("Manager") != null)
                                 || (session.getAttribute("Landlord")!= null)
                                   || (session.getAttribute("Tenant") != null))
                                    {  
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a type=\"submit\" href=\"userDetails.jsp\" >");
      out.print(currentUser);
      out.write("</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a type=\"submit\" href=\"logOut.jsp\" >Log Out</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
 }  
                            else
                            {
                    
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                    <a type=\"submit\" href=\"login.jsp\" >Log In </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                    <a type=\"submit\" href=\"register.jsp\" >Register</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    ");
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
      out.write("        <div class=\"container\">\n");
      out.write("        <h1 style=\"text-align: center;\">Register as a real estate manager</h1>\n");
      out.write("                <hr />\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("            <form class=\"\">\n");
      out.write("            <p>Name*</p><input class=\"form-control\" type=\"text\" name=\"txtName\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <p>Username*</p><input class=\"form-control\" type=\"text\" name=\"txtUsername\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <p>Password*</p><input class=\"form-control\" type=\"password\" name=\"txtPassword\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <p>Confirm Password*</p><input class=\"form-control\" type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <p>Phone*</p><input class=\"form-control\" type=\"text\" name=\"Password\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <p>Email*</p><input class=\"form-control\" type=\"text\" name=\"Password\" value=\"\" />\n");
      out.write("            <br> <br>          \n");
      out.write("            <p>   How did you find us?</p>\n");
      out.write("            <select class=\"form-control\">\n");
      out.write("                <option value=\"Internet Search\">Internet Search</option>\n");
      out.write("                <option value=\"Referral\">Referral</option>\n");
      out.write("                <option value=\"Blog Reader\">Blog Reader</option>\n");
      out.write("                <option value=\"Phone Book\">Phone Book</option>\n");
      out.write("                <option value=\"Postcard/mailer\">Postcard/mailer</option>\n");
      out.write("                <option value=\"Other\">Other</option>\n");
      out.write("            </select>\n");
      out.write("            <br><br>\n");
      out.write("            <p>Who may we thank for refering you?</p><input class=\"form-control\" type=\"text\" name=\"Password\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <p>Other: Please Describe</p><input class=\"form-control\" type=\"password\" name=\"text\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <input class=\"btn btn-default\" type=\"submit\" value=\"Submit\" name=\"btnRegister\" />\n");
      out.write("            <br><br>\n");
      out.write("        </form>\n");
      out.write("                    </div>\n");
      out.write("                ");

                if(request.getParameter("btnRegister")!=null){
                    boolean found=false;
                    String Name = request.getParameter("txtName");
                    String Username = request.getParameter("txtUsername");
                    String Password = request.getParameter("txtPassword");
                    String AccountType = "Manager";
                    
                    myLib.AddUser(Name,Username,Password,AccountType);
                    
                    //boolean found=false;
                    //found=myLib.SearchUser(Username,Password,AccountType);
                   
                    response.sendRedirect("index.jsp");
                 
                }
    
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
