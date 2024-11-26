package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Daddy'Shoes Homepage</title>\n");
      out.write("           <style>\n");
      out.write("      *{\n");
      out.write("\n");
      out.write("        padding: 0;\n");
      out.write("        margin: 0;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("      }\n");
      out.write("      body{\n");
      out.write("        background-image: url(shoes.jpg);\n");
      out.write("        background-attachment: fixed;\n");
      out.write("        background-size: cover;\n");
      out.write("\n");
      out.write("      }\n");
      out.write("      .row{\n");
      out.write("        background: transparent;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        box-shadow: 12px 12px 22px 12px chocolate;\n");
      out.write("        color: whitesmoke;\n");
      out.write("      }\n");
      out.write("     \n");
      out.write("      img{\n");
      out.write("        border-top-left-radius: 8px;\n");
      out.write("        border-bottom-left-radius: 8px;\n");
      out.write("\n");
      out.write("      }\n");
      out.write("      .btn1{\n");
      out.write("        border: none;\n");
      out.write("        outline: none;\n");
      out.write("        height: 50px;\n");
      out.write("        width: 100%;\n");
      out.write("        background-color: black;\n");
      out.write("        color: white;\n");
      out.write("        border-radius: 4px;\n");
      out.write("        font-weight: bold;\n");
      out.write("      }\n");
      out.write("      .btn1:hover{\n");
      out.write("        background: chocolate;\n");
      out.write("        border: 1px solid;\n");
      out.write("        color: black;\n");
      out.write("         }\n");
      out.write("\n");
      out.write("     \n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("            <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-md navbar-dark\" style=\"background-color: darkgoldenrod\">\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"userhome.jsp\" class=\"navbar-brand\">Homepage</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"item.jsp\" class=\"navbar-brand\">Shoes</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"cart.jsp\" class=\"navbar-brand\">Cart</a>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"login.jsp\" class=\"navbar-brand\">Login</a>\n");
      out.write("                </div>\n");
      out.write("        </header>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <b><h1 align=\"middle\" style=\"color:red\" >Welcome to Daddy'Shoes!</h1></b>\n");
      out.write("        <p align=\"middle\" style=\"color:red\">Here at Daddy'Shoes we only have the best of shoes mainly focusing on male sport shoes that suitable even for old people to use and run</p>\n");
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
