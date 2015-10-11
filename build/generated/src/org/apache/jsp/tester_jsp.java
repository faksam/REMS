package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tester_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method='post' id=''  action=''>\n");
      out.write("            <p>First Name*</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>Last Name*</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>Phone*</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>Email*</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            \n");
      out.write("            <div style=\"text-align: left; padding-left: 20%;\">\n");
      out.write("            <p>  Interested in*</p>\n");
      out.write("            <p> <input type=\"checkbox\" name=\"\" value=\"ON\" />  Property Management</p>\n");
      out.write("            <p> <input type=\"checkbox\" name=\"\" value=\"ON\" />  Purchasing Investment Property</p>\n");
      out.write("            <p> <input type=\"checkbox\" name=\"\" value=\"ON\" />  Selling Investment Property</p>\n");
      out.write("            <p> <input type=\"checkbox\" name=\"\" value=\"ON\" /> Finding a Home to Rent</p>\n");
      out.write("            <p> <input type=\"checkbox\" name=\"\" value=\"ON\" />  I'm a Current Tenant</p>\n");
      out.write("            <p> <input type=\"checkbox\" name=\"\" value=\"ON\" />  Other</p>\n");
      out.write("            </div>\n");
      out.write("            <p>   What is the address of the home for which you seek a property manager?</p>\n");
      out.write("            \n");
      out.write("            <p>   Street Address</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>   Address Line 2</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>    City</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>    State</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>    ZIP Code</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p> What is the address of the home you are thinking of selling?*</p>\n");
      out.write("            <p>  Street Address</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>   Address Line 2</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>    City</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>    State</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>    ZIP Code</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>    What is your reason for selling?*</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>   What is the current status of the property?</p>\n");
      out.write("            <select>\n");
      out.write("                <option value=\"Owner Ocuupied\">Owner Ocuupied</option>\n");
      out.write("                <option value=\"Vacant\">Vacant</option>\n");
      out.write("                <option value=\"Tenant Occupied\">Tenant Occupied</option>\n");
      out.write("                <option value=\"Other\">Other</option>\n");
      out.write("            </select>\n");
      out.write("            <p>   Comments*</p>\n");
      out.write("            <textarea name=\"\" rows=\"10\" cols=\"50\"></textarea>\n");
      out.write("            <p>    Buying Info - Describe briefly what type of property you're \n");
      out.write("                interested in buying, location, price range, timeline, etc*</p>\n");
      out.write("            <textarea name=\"\" rows=\"10\" cols=\"50\"></textarea>\n");
      out.write("            <p>   How did you find us?</p>\n");
      out.write("            <select>\n");
      out.write("                <option value=\"Internet Search\">Internet Search</option>\n");
      out.write("                <option value=\"Referral\">Referral</option>\n");
      out.write("                <option value=\"Blog Reader\">Blog Reader</option>\n");
      out.write("                <option value=\"Phone Book\">Phone Book</option>\n");
      out.write("                <option value=\"Postcard/mailer\">Postcard/mailer</option>\n");
      out.write("                <option value=\"Other\">Other</option>\n");
      out.write("            </select>\n");
      out.write("            <p>Who may we thank for refering you?</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <p>Other: Please Describe</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" value=\"Submit\" name=\"searchUser\" />\n");
      out.write("            <br><br>\n");
      out.write("        </form>\n");
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
