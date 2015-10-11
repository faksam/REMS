package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProperty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"style/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"AddUser\" action=\"Submit\">\n");
      out.write("            <p>Property Type: </p>\n");
      out.write("            <select id=\"propType\" name=\"PropertyType\">\n");
      out.write("                <option>Vacant Land</option>\n");
      out.write("                <option>Commercial Property</option>\n");
      out.write("                <option>Residential Property</option>\n");
      out.write("            </select>\n");
      out.write("            \n");
      out.write("            <script>\n");
      out.write("                document.getElementById(\"propType\").addEventListener(\"change\", displayDate);\n");
      out.write("\n");
      out.write("                function displayDate() {\n");
      out.write("                    document.getElementById(\"prop\").style.visibility = \"visible\";\n");
      out.write("                    document.getElementById(\"prop\").style.display = \"block\";\n");
      out.write("                    document.getElementById(\"res\").style.visibility = \"visible\";\n");
      out.write("                    document.getElementById(\"com\").style.visibility = \"visible\";\n");
      out.write("                    document.getElementById(\"vac\").style.visibility = \"visible\";\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("            <div id=\"prop\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                <p>Address: </p><input type=\"text\" name=\"Name\" value=\"\" />\n");
      out.write("                <p>Price: </p><input type=\"text\" name=\"Username\" value=\"\" />\n");
      out.write("                <p>Description: </p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("                <p>Status: </p><input type=\"text\" name=\"Name\" value=\"\" />\n");
      out.write("                <p>Landlord: </p><input type=\"text\" name=\"Username\" value=\"\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"res\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                <p>Rooms: </p><input type=\"text\" name=\"Name\" value=\"\" />\n");
      out.write("                <p>Bath: </p><input type=\"text\" name=\"Username\" value=\"\" />\n");
      out.write("                <p>Living Area: </p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("                <p>Residential Type: </p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"com\" style=\"visibility: hidden; display: none;\"> \n");
      out.write("                <p>Building: </p><input type=\"text\" name=\"Username\" value=\"\" />\n");
      out.write("                <p>Commercial Type: </p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"vac\" style=\"visibility: hidden; display: none;\">\n");
      out.write("                <p>Size:</p><input type=\"password\" name=\"Password\" value=\"\" />\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <br><br>\n");
      out.write("            <input type=\"submit\" value=\"Register\" name=\"addUser\" />\n");
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
