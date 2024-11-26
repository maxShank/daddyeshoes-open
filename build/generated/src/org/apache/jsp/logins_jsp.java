package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logins_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("    \n");
      out.write("        <title>Daddy e-shoes</title>\n");
      out.write("    <style>\n");
      out.write("      *{\n");
      out.write("\n");
      out.write("        padding: 0;\n");
      out.write("        margin: 0;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("      }\n");
      out.write("      body{\n");
      out.write("        background-image: url(https://i.ibb.co/rc59YVn/shoes21.jpg);\n");
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
      out.write("\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <br>\n");
      out.write("        <div class=\"container col-md-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"card-body\"> \n");
      out.write("                    <form name=\"frmPageLogin\" action=\"regController\" method=\"POST\">\n");
      out.write("                        <h1 class=\"text-center\">Daddy's e-shoes</h1>\n");
      out.write("                        <h4 class=\"text-center\">\"masculine with style\"</h4>\n");
      out.write("                        <br></br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                  <div class=\"col-log-7\">\n");
      out.write("                    <input type=\"username\" name=\"username\" placeholder=\"Username\" class=\"form-control my-2 p-3\">\n");
      out.write("                  </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <div class=\"col-log-7\">\n");
      out.write("                    <input type=\"password\" name=\"password\" placeholder=\"Password\" class=\"form-control my-2 p-3\">\n");
      out.write("                  </div>\n");
      out.write("              </div><input type=\"hidden\" name=\"actionreg\" value=\"loginreg\">\n");
      out.write("                        <input type=\"submit\" class=\"btn1\" value=\"submit\" name=\"submit\">\n");
      out.write("                  \n");
      out.write("                  <fieldset class=\"form-group\">\n");
      out.write("                        <label>You are new  user?<a href=\"reg.jsp\" >Create a new account</a></label>         \n");
      out.write("                    </fieldset>\n");
      out.write("              \n");
      out.write("            </form>\n");
      out.write("          </div>    \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("                \n");
      out.write("                 \n");
      out.write("                    ");

                        String username=(String)session.getAttribute("username");
        
                        //redirect user to home page if already logged in
                        if(username!=null){
                           response.sendRedirect("main.jsp");
                    }
 
                        String status=request.getParameter("status");
                        
                        
                        if(status!=null){
                            if(status.equals("false")){
                                out.print("Incorrect login details!");           
                     }
                         else{
                             out.print("Some error occurred!");
                     }
                    }
                    
      out.write("\n");
      out.write("                </div>               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js\" integrity=\"sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
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
