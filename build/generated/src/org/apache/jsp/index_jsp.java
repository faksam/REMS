package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Real Estate Management</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"css/myStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/full-slider.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">REM</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"about.jsp\">About</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"services.jsp\">Services</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"contact.jsp\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"navbar-form navbar-right\" >\n");
      out.write("                    <a type=\"submit\" href=\"login.jsp\" class=\"btn btn-default\">Log In</a>\n");
      out.write("                    \n");
      out.write("                    <a type=\"submit\" href=\"register.jsp\" class=\"btn btn-default\">Register</a>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Full Page Image Background Carousel Header -->\n");
      out.write("    <header id=\"myCarousel\" class=\"carousel slide\">\n");
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
      out.write("                <div class=\"fill\" style=\"background-image:url('images/re-mgmt.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Online Real Estate Manager</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"item\">\n");
      out.write("                <!-- Set the second background image using inline CSS below. -->\n");
      out.write("                <div class=\"fill\" style=\"background-image:url('images/belize-residential-properties.jpg');\"></div>\n");
      out.write("                <div class=\"carousel-caption\">\n");
      out.write("                    <h2>Residential Property (Single Family)</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
      out.write("\n");
      out.write("    <!-- Page Content -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <h1>Full Slider by Start Bootstrap</h1>\n");
      out.write("                <p>The background images for the slider are set directly in the HTML using inline CSS. The rest of the styles for this template are contained within the <code>full-slider.css</code>file.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <p>Copyright &copy; Your Website 2014</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.row -->\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Script to Activate the Carousel -->\n");
      out.write("    <script>\n");
      out.write("    $('.carousel').carousel({\n");
      out.write("        interval: 5000 //changes the speed\n");
      out.write("    })\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
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
