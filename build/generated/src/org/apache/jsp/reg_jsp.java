package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("   <title>Daddy e-shoes registration form</title>\n");
      out.write("\n");
      out.write("     <style>\n");
      out.write("      *{\n");
      out.write("\n");
      out.write("        padding: 0;\n");
      out.write("        margin: 0;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("      }\n");
      out.write("      body{\n");
      out.write("        background-image: url(https://i.ibb.co/5ntCN07/shoes3.jpg);\n");
      out.write("        background-attachment: fixed;\n");
      out.write("        background-size: cover;\n");
      out.write("        font-family: new time roman;\n");
      out.write("\n");
      out.write("      }\n");
      out.write("      h1{\n");
      out.write("        font-size: 40px;\n");
      out.write("        color: white;\n");
      out.write("        margin-top: 20px;\n");
      out.write("        margin-bottom: 30px;\n");
      out.write("      }\n");
      out.write("       h3{\n");
      out.write("        font-size: 30px;\n");
      out.write("        color: white;\n");
      out.write("        margin-top: 10px;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("      }\n");
      out.write("     \n");
      out.write("      .label{\n");
      out.write("        font-size: 19px;\n");
      out.write("        margin-top: 20px;\n");
      out.write("        font-weight: normal;\n");
      out.write("        \n");
      out.write("\n");
      out.write("      }\n");
      out.write("      .form-control{\n");
      out.write("       background: rgba(0,0,0,0.2);\n");
      out.write("       border: 0px;\n");
      out.write("       border-radius: 0px;\n");
      out.write("       border-bottom: 2px solid white;\n");
      out.write("       font-size: 15px;\n");
      out.write("       color: white;\n");
      out.write("       margin-top: 10px;\n");
      out.write("\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      .btn-info{\n");
      out.write("        margin-right: 200px;\n");
      out.write("        margin-left: 200px;\n");
      out.write("        margin-top: 20px;\n");
      out.write("        width: 180px;\n");
      out.write("        font-size: 19px;\n");
      out.write("        border-radius: 1000px;\n");
      out.write("        color: darkolivegreen;\n");
      out.write("      }\n");
      out.write("      .col-md-6{\n");
      out.write("        background: rgba(0, 0, 0,0.5);\n");
      out.write("        height: 900px;\n");
      out.write("        box-shadow: 1px 1px 60px 10px chocolate;\n");
      out.write("      }\n");
      out.write("      .col-md-3{\n");
      out.write("        color: white;\n");
      out.write("      }\n");
      out.write("     \n");
      out.write("  </style>\n");
      out.write("  </head>\n");
      out.write("        <br>\n");
      out.write("        <p><b></b></p>\n");
      out.write("        <form name=\"frmAddreg\" action=\"regController\" method=\"POST\">\n");
      out.write("              <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("           <div class=\"col-md-3\"></div>\n");
      out.write("          <div class=\"col-md-6\">\n");
      out.write("            <h1 class=\"text-center\">Register form</h1>\n");
      out.write("             <h3 class=\"text-center\">Welcome!</h3>\n");
      out.write("              <label class=\"label col-md-3 control-label\">Username</label>\n");
      out.write("                  <div class=\"col-md-9\">\n");
      out.write("                      <input type=\"text\" class=\"form-control\" name =\"username\" placeholder=\"username\" id=\"username\">\n");
      out.write("                  </div>\n");
      out.write("              <label class=\"label col-md-3 control-label\">Name</label>\n");
      out.write("                  <div class=\"col-md-9\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name =\"name\" placeholder=\"name\" id=\"name\">\n");
      out.write("                  </div>\n");
      out.write("               <label class=\"label col-md-3 control-label\">Password</label>\n");
      out.write("                  <div class=\"col-md-9\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" name =\"password\" placeholder=\"password\" id=\"password\">\n");
      out.write("                    <small> password must be 8 characters</small>\n");
      out.write("                  </div>\n");
      out.write("               <label class=\"label col-md-3 control-label\">Phone number</label>\n");
      out.write("                  <div class=\"col-md-9\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name =\"phonenumber\" placeholder=\"phonenumber\" id=\"phonenumber\">\n");
      out.write("                  </div>\n");
      out.write("              <label class=\"label col-md-3 control-label\">E-mail</label>\n");
      out.write("                  <div class=\"col-md-9\">\n");
      out.write("                    <input type=\"email\" class=\"form-control\" name =\"email\" placeholder=\"email\" id=\"email\">\n");
      out.write("                  </div>   \n");
      out.write("                <label class=\"label col-md-3 control-label\">Address</label>\n");
      out.write("                  <div class=\"col-md-9\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name =\"address\" placeholder=\"address\" id=\"address\">\n");
      out.write("                  </div>  \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                    <fieldset class=\"form-group\">\n");
      out.write("                        <label><input type=\"hidden\" name=\"actionreg\" value=\"insertreg\" /></label>\n");
      out.write("                    </fieldset> \n");
      out.write("                    <input type=\"submit\" class=\"btn-info\" value=\"Submit\" name=\"submit\"/>\n");
      out.write("                    <input type=\"reset\"™ class=\"btn-info\" value=\"Cancel\" name=\"cancel\" />\n");
      out.write("              </div>               \n");
      out.write("            </div>\n");
      out.write("        </div>      \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
